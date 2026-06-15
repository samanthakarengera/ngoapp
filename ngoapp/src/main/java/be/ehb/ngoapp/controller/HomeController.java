package be.ehb.ngoapp.controller;

import be.ehb.ngoapp.repository.EventRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final EventRepository repo;

    public HomeController(EventRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("events", repo.findTop10ByOrderByTijdstipDesc());
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}