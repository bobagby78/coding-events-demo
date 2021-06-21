package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("eventCategories")
public class EventCategoryController {

    private EventCategoryRepository eventCategoryRepository;
        //.findAll(), .save()

    @GetMapping()
    public String displayAllEvents(Model model){
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());

        return "eventCategories/index";
    }

    @GetMapping("create")
    public String renderCreateCategoryForm(Model model){
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());

        return "eventCategories/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm(@ModelAttribute @Valid EventCategory newEventCategory,
                                                 Errors errors, Model model){
        model.addAttribute("title", "Create Category");

        return "redirect:";
    }


}
