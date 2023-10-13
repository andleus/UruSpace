package com.spaceurraca.urraca.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/")
public class UruControllerViews {

    @GetMapping("/")
    public String showIndex() {
        return "index.html"; // This will look for "index.html" in "resources/static"
    }

    @GetMapping("/col")
    public String showWelcomePage() {
        return "collection.html"; // This will look for "welcome.html" in "resources/static"
    }



}
