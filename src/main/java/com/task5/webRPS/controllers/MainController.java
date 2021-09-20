package com.task5.webRPS.controllers;

import com.task5.webRPS.repo.GamesRepository;
import com.task5.webRPS.repo.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    GamesRepository gamesRepository;
    @Autowired
    MoveRepository moveRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("moves", moveRepository.findAllByActiveTrue());
        model.addAttribute("games", gamesRepository.findAll());
        model.addAttribute("title", "Start page");
        return "home";
    }
}
