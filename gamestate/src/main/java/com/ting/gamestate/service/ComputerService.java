package com.ting.gamestate.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

@Service
public class ComputerService {


    public int generateComputerPlacement(int placement, int[] available) {
        int aiPlacement;

        Random rand = new Random();

        aiPlacement = rand.nextInt(9);
        //check if space is available
        for(int i = 0; i < available.length; i++){
            if(aiPlacement != available[i]){
                
            }
        }

        if(!contains){
            do{

            }while(contains);
        }

        return aiPlacement;
    }
}
