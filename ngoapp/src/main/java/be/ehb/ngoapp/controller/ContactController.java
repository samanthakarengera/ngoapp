package be.ehb.ngoapp.controller;

import be.ehb.ngoapp.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    private final MailService mailService;

    public ContactController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/contact/send")
    public String sendMail(
            @RequestParam String email,
            @RequestParam String subject,
            @RequestParam String message
    ) {
        mailService.sendMail(email, subject, message);
        return "redirect:/contact?success";
    }
}