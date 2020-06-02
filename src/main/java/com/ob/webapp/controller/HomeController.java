package com.ob.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String start(@RequestParam(name="name", required=false, defaultValue="pirsquare") String name, Model model) {
        model.addAttribute("name", name);
        return "consumer";
    }

    @GetMapping("/news/{news}")
    public String consumeNewsFeeds(@PathVariable("news") String news, Model model) {
        //restTemplate.exchange("theurl"); pass url here
        //pass template in model
        model.addAttribute("news", news);
        //return com
        return "newsfeed";
    }
}
