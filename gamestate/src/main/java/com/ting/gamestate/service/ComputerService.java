package com.ting.gamestate.service;

import com.ting.gamestate.model.Moves;
import com.ting.gamestate.model.Record;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ComputerService {

  public String generateComputerPlacement(Moves input) {
    int aiPlacement;
    String cell = "";
    boolean found = false;
    //false - cell is marked
    //true - cell is not marked

    Random rand = new Random();

    aiPlacement = rand.nextInt(9);
    //check if space is available
    do {
      for (int i = 0; i < input.getAvailable().length; i++) {
        if (aiPlacement == input.getAvailable()[i]) {
          found = true;
          break;
        }
      }
      if (!found) {
        aiPlacement = rand.nextInt(9);
      }
    } while (!found);

    switch (aiPlacement){
      case 1:
        cell = "cell_one";
        break;
      case 2:
        cell = "cell_two";
        break;
      case 3:
        cell = "cell_three";
        break;
      case 4:
        cell = "cell_four";
        break;
      case 5:
        cell = "cell_five";
        break;
      case 6:
        cell = "cell_six";
        break;
      case 7:
        cell = "cell_seven";
        break;
      case 8:
        cell = "cell_eight";
        break;
      case 9:
        cell = "cell_nine";
        break;
      default:
        cell = "unknown";
        break;
    }

    return cell;
  }

  public int validatingWinCondition(Record input) {
    int result = 0;
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();

    for(int i = 0; i < input.getPlayerOne().length; i++){
      list1.add(input.getPlayerOne()[i]);
    }

    for(int j = 0; j < input.getPlayerTwo().length; j++){
      list2.add(input.getPlayerTwo()[j]);
    }

    if(checkList(list1) > checkList(list2))
      return result = 1;
    if(checkList(list1) < checkList(list2))
      return result = 2;
    if(input.getPlayerOne().length + input.getPlayerTwo().length == 9)
      return result = 3;

    return result;
  }

  public int checkList(List data){
    int value = 0;
    System.out.println();
    if(data.containsAll(Arrays.asList(1, 2, 3)))
      value = 1;
    if(data.containsAll(Arrays.asList(4, 5, 6)))
      value = 1;
    if(data.containsAll(Arrays.asList(7, 8, 9)))
      value = 1;
    if(data.containsAll(Arrays.asList(1, 4, 7)))
      value = 1;
    if(data.containsAll(Arrays.asList(2, 5, 8)))
      value = 1;
    if(data.containsAll(Arrays.asList(3, 6, 9)))
      value = 1;
    if(data.containsAll(Arrays.asList(1, 5, 9)))
      value = 1;
    if(data.containsAll(Arrays.asList(3, 5, 7)))
      value = 1;
    return value;
  }
}
