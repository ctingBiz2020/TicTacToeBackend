package com.ting.gamestate.controller;

import com.ting.gamestate.service.ComputerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Computer {

    @Autowired
    ComputerService computerService;

    //receive the placement of the move and the available space
    //respond with the placement of AI move
    @PostMapping("/game")
    public int computerMove(int placement, int [] available){
        int aiPlacement = computerService.generateComputerPlacement(placement, available);
        return aiPlacement;
    }
}
