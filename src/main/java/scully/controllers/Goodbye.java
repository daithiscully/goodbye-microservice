package scully.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/goodbye")
public class Goodbye {


    @RequestMapping(method = RequestMethod.GET)
    public String getGreeting() {
        return "Bye Now";
    }

}