package com.spaceurraca.urraca.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/")
public class UruController {

    @Autowired
    private MyElementRepository repo;

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/myElements")
    public List<MyElement> getAllElements(){
        return repo.findAll();
    }

    @PostMapping("/upFile")
    public ResponseEntity uploadMagpie(   @RequestPart("name") String name,
                                        @RequestPart("image") MultipartFile image   ){

        try{
            String filename = image.getOriginalFilename();

            File file = new File(   System.getProperty("user.dir") + uploadPath + File.separator + filename);
            System.out.println(file);
            image.transferTo(file);

            MyElement element = new MyElement(name, filename);
            repo.save(element);

            return ResponseEntity.ok("Upload successful, fly little magpie");

        }catch(Exception e){
    //             e.printStackTrace();
            return ResponseEntity.status(500).body("ERROR UPLOADING THE IMAGE");
        }

    }

    @DeleteMapping("/delete/{id}")
    public void deleteEntity(@PathVariable String id){
        repo.deleteById(id);
    }


    // @GetMapping("/{id}")
    // public Element getEntityById(@PathVariable String id){
    //     return repo.findById(id).orElse(null);
    // }


    // @PutMapping("/{id}")
    // public Element updateEntity(@PathVariable String id, @RequestBody Element updatedEntity){
    //     updatedEntity.setId(id);
    //     return repo.save(updatedEntity);
    // }



}
