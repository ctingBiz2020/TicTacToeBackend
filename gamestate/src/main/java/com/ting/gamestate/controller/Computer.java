package com.ting.gamestate.controller;

import com.ting.gamestate.model.Moves;
import com.ting.gamestate.model.Record;
import com.ting.gamestate.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("computer/*")
public class Computer {

    ComputerService computerService;

    @Autowired
    public Computer(ComputerService computerService) {
        super();
        this.computerService = computerService;
    }

    //receive the placement of the move and the available space
    //respond with the placement of AI move
    @PostMapping("/game")
    @ResponseStatus(HttpStatus.OK)
    public String computerMove(@RequestBody Moves input){
        System.out.println("AI MOVED");
        String aiPlacement = computerService.generateComputerPlacement(input);
        return aiPlacement;
    }

    @PostMapping("/win")
    @ResponseStatus(HttpStatus.OK)
    public int computerMove(@RequestBody Record input){
        System.out.println("Validating...");
        System.out.println("input contains " + input.toString());
        int win = computerService.validatingWinCondition(input);
        return win;
    }
}
