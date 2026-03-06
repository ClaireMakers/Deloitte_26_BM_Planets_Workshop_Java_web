package com.makers.makersbnb_coach_support_code.controller;

import com.makers.makersbnb_coach_support_code.model.Planet;
import com.makers.makersbnb_coach_support_code.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//Server-side rendering - we are responding with whole templates
@Controller
public class PlanetsController {

    @Autowired
    PlanetRepository planetRepository;

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

    @GetMapping("/venus")
    public ModelAndView getVenusInfo() {
//        Planet venus = new Planet("Venus is the hottest planet in our solar system", 38025);
//        planetRepository.save(venus);

        Planet venus = planetRepository.findByName("Venus");

        System.out.println(venus.getDescription());

        ModelAndView venusInfoTemplate = new ModelAndView("/VenusInfo");
        venusInfoTemplate.addObject("venus", venus);

        return venusInfoTemplate;
    }
}

//@RestController -> to build servers that respond with purely data in JSON format or similar


