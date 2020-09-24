package com.ting.gamestate.model;

import java.util.Arrays;

public class Moves {

    int placement;
    int [] available;

    public int getPlacement() {
        return placement;
    }

    public int[] getAvailable() {
        return available;
    }

    public void setPlacement(int placement) {
        this.placement = placement;
    }

    public void setAvailable(int[] available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Moves{" +
                "placement=" + placement +
                ", available=" + Arrays.toString(available) +
                '}';
    }

    public Moves(int placement, int[] available) {
        this.placement = placement;
        this.available = available;
    }
}
