package com.ting.gamestate.service;

import com.ting.gamestate.model.Moves;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ComputerService {

    public int generateComputerPlacement(Moves input) {
        int aiPlacement;
        boolean found = false;
        //false - cell is marked
        //true - cell is not marked

        Random rand = new Random();

        aiPlacement = rand.nextInt(9);
        //check if space is available
        do{
            for(int i = 0; i < input.getAvailable().length; i++){
                if(aiPlacement == input.getAvailable()[i]){
                    found = true;
                    break;
                }
            }
            if(found == false){
                aiPlacement = rand.nextInt(9);
            }
        }while(found == false);

        return aiPlacement;
    }
}
