package com.example.birthstone.controller;

import com.example.birthstone.service.BirthStoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        var result = service.getStoneByMonth(month);
        if (result.isPresent()) {
            model.addAttribute("stone", result.get());
        } else {
            model.addAttribute("error", "해당 월의 탄생석 정보가 없습니다.");
        }
        return "index";
    }
}
