package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.writeToDb;
import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/success")
    public String getFreeMoney(WebRequest dataFromForm) {

        String email = dataFromForm.getParameter("email");
        ValidateEmailService validateEmailService = new ValidateEmailService();
        writeToDb db = new writeToDb();

        if (validateEmailService.isEmailValid(email)) {
            System.out.println(dataFromForm.getParameter("email"));
            writeToDb.insertEmailToDB(email);
            return "success";
        } else if (!validateEmailService.isEmailValid(email)){
            System.out.println("Invalid email");
            return "error";
        }
        return "redirect:/";

    }
    @GetMapping("/success")
    public String getMoney() {
        return "success";
    }

    @GetMapping("/error")
    public String error(){
        return error();
    }

}





