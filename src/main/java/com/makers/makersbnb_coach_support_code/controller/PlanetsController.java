package com.makers.makersbnb_coach_support_code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//Server-side rendering - we are responding with whole templates
@Controller
public class PlanetsController {
    // tell Spring Boot this method handles the 'GET "/"' request
    @GetMapping("/")
    public ModelAndView planetsList() {
        return new ModelAndView("/PlanetsList");
    }

    @GetMapping("/mars")
    public ModelAndView getMarsInfo() {
        ModelAndView marsInfoTemplate = new ModelAndView("/MarsInfo");
        String marsDescription = "The planet Mars is half the size of the Earth";

        marsInfoTemplate.addObject("marsDescription", marsDescription);
        return marsInfoTemplate;
    }
}

//@RestController -> to build servers that respond with purely data in JSON format or similar


