package com.example.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String homePage() {
        StringBuilder erg = new StringBuilder();
        try {
            File file = new File("backend/src/main/resources/public/index.html");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                erg.append(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return erg.toString();
    }
}

