package com.ting.gamestate;

import com.ting.gamestate.model.Moves;
import com.ting.gamestate.service.ComputerService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class ComputerServiceTest {

    @InjectMocks
    private ComputerService service;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testForNotSamePlacement (){
        int [] available = {1, 2, 3, 4, 5, 6, 7, 8};
        Moves input = new Moves(0, available);
        ComputerService test1 = new ComputerService();
        int result = test1.generateComputerPlacement(input);
        assertNotEquals(result, 0);
    }

    @Test
    public void testForSecondPlacement () {
        int [] available = {3, 4, 5, 6, 7, 8};
        Moves input = new Moves(2, available);
        ComputerService test2 = new ComputerService();
        int result = test2.generateComputerPlacement(input);
        assertNotEquals(result, 0);
        assertNotEquals(result, 2);
    }

    @Test
    public void testForThirdPlacement () {
        int [] available = {5, 6, 7, 8};
        Moves input = new Moves(4, available);
        ComputerService test2 = new ComputerService();
        int result = test2.generateComputerPlacement(input);
        assertNotEquals(result, 0);
        assertNotEquals(result, 2);
        assertNotEquals(result, 4);
    }

    @Test
    public void testForFourthPlacement () {
        int [] available = {7, 8};
        Moves input = new Moves(6, available);
        ComputerService test2 = new ComputerService();
        int result = test2.generateComputerPlacement(input);
        assertNotEquals(result, 0);
        assertNotEquals(result, 2);
        assertNotEquals(result, 4);
        assertNotEquals(result, 6);
    }

    @Test
    public void testForHorizontalWinOne() {
        //checks markers in cell 1,2,3

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
