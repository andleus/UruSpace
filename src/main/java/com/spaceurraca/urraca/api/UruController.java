package com.spaceurraca.urraca.api;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UruController {

    // @Autowired
    // private ElementRepository repo;

    @GetMapping("/")
    public String showIndex() {
        return "index.html"; // This will look for "index.html" in "resources/static"
    }

    @GetMapping("/col")
    public String showWelcomePage() {
        return "collection.html"; // This will look for "welcome.html" in "resources/static"
    }


    // @GetMapping
    // public List<Element> getAllEntities(){
    //     return repo.findAll();
    // }


    // @GetMapping("/{id}")
    // public Element getEntityById(@PathVariable String id){
    //     return repo.findById(id).orElse(null);
    // }

    // @PostMapping
    // public Element createEntity(@RequestBody Element entity){
    //     return repo.save(entity);
    // }

    // @PutMapping("/{id}")
    // public Element updateEntity(@PathVariable String id, @RequestBody Element updatedEntity){
    //     updatedEntity.setId(id);
    //     return repo.save(updatedEntity);
    // }

    // @DeleteMapping("/{id}")
    // public void deleteEntity(@PathVariable String id){
    //     repo.deleteById(id);
    // }

}
