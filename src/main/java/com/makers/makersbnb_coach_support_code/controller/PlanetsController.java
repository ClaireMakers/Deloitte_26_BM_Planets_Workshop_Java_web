package com.makers.makersbnb_coach_support_code.controller;

import com.makers.makersbnb_coach_support_code.model.Planet;
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
        Planet mars = new Planet("The planet Mars is half the size of the Earth", 21344);

        marsInfoTemplate.addObject("marsDescription", mars.getDescription());
        marsInfoTemplate.addObject("marsCircumference", mars.getCircumference());
        return marsInfoTemplate;
    }
}

//@RestController -> to build servers that respond with purely data in JSON format or similar


