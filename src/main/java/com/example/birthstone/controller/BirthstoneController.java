package com.example.birthstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.birthstone.service.BirthStoneService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BirthstoneController {

    private final BirthStoneService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/birthstone")
    public String getStone(@RequestParam("month") String month, Model model) {
    	 System.out.println("입력된 month 값: " + month);
        var result = service.getStoneByMonth(month);
        if (result.isPresent()) {
            model.addAttribute("stone", result.get());
        } else {
            model.addAttribute("error", "해당 월의 탄생석 정보가 없습니다.");
        }
        return "result";
    }
}
