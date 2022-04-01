package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.EmailRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    EmailRepository er = new EmailRepository();

    @GetMapping("/oneEmail")
public String oneEmail(Model model){
    model.addAttribute("Email", er.fetchSingleEmail());
    return "htmlpage";
    }

    @GetMapping("/allEmails")
    public String getAllEmails(Model model){
        model.addAttribute("Emails", er.fetchAllEmails());
        return "allMails";
    }


}

