package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventCategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eventCategories")
public class EventCategoryController {

    private EventCategoryRepository eventCategoryRepository;
        //.findAll(), .save()

    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());

        return "eventCategories/index";
        // TODO create a categoris index.html template.
    }

}
