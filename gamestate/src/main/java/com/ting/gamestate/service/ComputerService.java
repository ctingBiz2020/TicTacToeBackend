package com.ting.gamestate.service;

import com.ting.gamestate.model.Moves;
import com.ting.gamestate.model.Record;
import org.springframework.stereotype.Service;

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
    List<int[]> list1 = Arrays.asList(input.getPlayerOne());
    List<int[]> list2 = Arrays.asList(input.getPlayerTwo());

    if(checkList(list1) > checkList(list2))
      result = 1;
    else if(checkList(list1) < checkList(list2))
      result = 2;
    else if(checkList(list1) == checkList(list2))
      result = 3;
    else
      result = 0;

    return result;
  }

  public int checkList(List data){
    int value = 0;
    if(data.containsAll(Arrays.asList(1, 2, 3)))
      value = 1;
    else if (data.containsAll(Arrays.asList(4, 5, 6)))
      value = 1;
    else if (data.containsAll(Arrays.asList(7, 8, 9)))
      value = 1;
    else if (data.containsAll(Arrays.asList(1, 4, 7)))
      value = 1;
    else if (data.containsAll(Arrays.asList(2, 5, 8)))
      value = 1;
    else if (data.containsAll(Arrays.asList(3, 6,9 )))
      value = 1;
    else if (data.containsAll(Arrays.asList(1, 5, 9)))
      value = 1;
    else if (data.containsAll(Arrays.asList(3, 5, 7)))
      value = 1;
    else
      value = 0;

    return  value;
  }
}
