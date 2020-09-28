package com.ting.gamestate.model;

import java.util.Arrays;

public class Record {
  int [] playerOne;
  int [] playerTwo;

  public int[] getPlayerOne() {
    return playerOne;
  }

  public void setPlayerOne(int[] playerOne) {
    this.playerOne = playerOne;
  }

  public int[] getPlayerTwo() {
    return playerTwo;
  }

  public void setPlayerTwo(int[] playerTwo) {
    this.playerTwo = playerTwo;
  }

  @Override
  public String toString() {
    return "Record{" +
      "playerOne=" + Arrays.toString(playerOne) +
      ", playerTwo=" + Arrays.toString(playerTwo) +
      '}';
  }

  public Record(int[] playerOne, int[] playerTwo) {
    this.playerOne = playerOne;
    this.playerTwo = playerTwo;
  }
}
