package be.ehb.ngoapp.controller;

import be.ehb.ngoapp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
                "evenementen",
                eventRepository.findAll());

        return "index";
    }
}