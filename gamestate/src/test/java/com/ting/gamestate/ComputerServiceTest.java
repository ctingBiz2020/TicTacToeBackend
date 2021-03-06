package com.ting.gamestate;

import com.ting.gamestate.model.Moves;
import com.ting.gamestate.model.Record;
import com.ting.gamestate.service.ComputerService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class ComputerServiceTest {

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testForNotSamePlacement() {
    int[] available = {2, 3, 4, 5, 6, 7, 8, 9};
    Moves input = new Moves(1, available);
    ComputerService test1 = new ComputerService();
    String result = test1.generateComputerPlacement(input);
    assertNotEquals(result, "cell_one");
  }

  @Test
  public void testForSecondPlacement() {
    int[] available = {4, 5, 6, 7, 8, 9};
    Moves input = new Moves(3, available);
    ComputerService test2 = new ComputerService();
    String result = test2.generateComputerPlacement(input);
    assertNotEquals(result, "cell_one");
    assertNotEquals(result, "cell_two");
    assertNotEquals(result, "cell_three");
  }

  @Test
  public void testForThirdPlacement() {
    int[] available = {6, 7, 8, 9};
    Moves input = new Moves(5, available);
    ComputerService test2 = new ComputerService();
    String result = test2.generateComputerPlacement(input);
    assertNotEquals(result, "cell_one");
    assertNotEquals(result, "cell_two");
    assertNotEquals(result, "cell_three");
    assertNotEquals(result, "cell_four");
    assertNotEquals(result, "cell_five");
  }

  @Test
  public void testForFourthPlacement() {
    int[] available = {8, 9};
    Moves input = new Moves(7, available);
    ComputerService test2 = new ComputerService();
    String result = test2.generateComputerPlacement(input);
    assertNotEquals(result, "cell_one");
    assertNotEquals(result, "cell_two");
    assertNotEquals(result, "cell_three");
    assertNotEquals(result, "cell_four");
    assertNotEquals(result, "cell_five");
    assertNotEquals(result, "cell_six");
    assertNotEquals(result, "cell_seven");
  }

  @Test
  public void testForValueInTheList(){
    int [] player1 = {1, 2, 3};
    List<Integer> list1 = new ArrayList<>();

    for(int i = 0; i < player1.length; i++){
      list1.add(player1[i]);
    }

    ComputerService mock = new ComputerService();
    int result = mock.checkList(list1);
    assertEquals(1, result);
  }


  @Test
  public void testForHorizontalWinOne() {
    //checks markers in cell 1,2,3
    int[] player1 = {1, 2, 3};
    int[] player2 = {5, 9};
    Record test1 = new Record(player1, player2);
    ComputerService mock = new ComputerService();
    int result = mock.validatingWinCondition(test1);
    assertEquals(1, result);

    Record test2 = new Record(player2, player1);
    ComputerService mock2 = new ComputerService();
    result = mock2.validatingWinCondition(test2);
    assertEquals(2, result);
  }

  @Test
  public void testForHorizontalWinTwo() {
    //checks markers in cell 4,5,6
  }

  @Test
  public void testForHorizontalWinThree() {
    //checks markers in cell 7,8,9
  }

  @Test
  public void testForVerticalWinOne() {
    //checks markers in cell 1,4,7
  }

  @Test
  public void testForVerticalWinTwo() {
    //checks markers in cell 2,5,8
  }

  @Test
  public void testForVerticalWinThree() {
    //checks markers in cell 3,6,9
  }
}
