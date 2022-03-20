package com.codegym.controller;

import com.codegym.model.IDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryController {
    @Autowired
    IDictionary dictionary;

    @GetMapping("/dictionary")
    public String showForm() {
        return "dictionary";
    }

    @PostMapping("/dictionary")
    public ModelAndView search(@RequestParam String keyword) {
        ModelAndView modelAndView = new ModelAndView("dictionary");
        String result = dictionary.search(keyword);
        if (result == null) {
            result = "Doesnt exist";
        } else {
            modelAndView.addObject("result", result);
        }
        return modelAndView;
    }
}
