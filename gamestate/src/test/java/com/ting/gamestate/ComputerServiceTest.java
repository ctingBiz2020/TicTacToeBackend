package com.ting.gamestate;

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
    public void readHappyPath() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void testForNotSamePlacement () throws Exception{
        int [] available = {1, 2, 3, 4, 5, 6, 7, 8};
        ComputerService test1 = new ComputerService();
        int result = test1.generateComputerPlacement(0, available);
        assertNotEquals(result, 0);
    }

}
