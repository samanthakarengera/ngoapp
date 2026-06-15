package be.ehb.ngoapp.controller;

import be.ehb.ngoapp.model.Event;
import be.ehb.ngoapp.repository.EventRepository;
import be.ehb.ngoapp.repository.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventController {

    private final EventRepository eventRepo;
    private final LocationRepository locationRepo;

    public EventController(EventRepository eventRepo, LocationRepository locationRepo) {
        this.eventRepo = eventRepo;
        this.locationRepo = locationRepo;
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("locations", locationRepo.findAll());
        return "new";
    }

    @PostMapping("/new")
    public String save(@ModelAttribute Event event) {
        eventRepo.save(event);
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("event", eventRepo.findById(id).orElse(null));
        return "details";
    }
}