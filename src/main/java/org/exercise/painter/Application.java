package org.exercise.painter;

import java.util.Scanner;
public class Application {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String color= in.next();
    Painter giotto= new Painter("Giotto", color);
    System.out.println(giotto.getName() + " sta dipingendo di colore " + giotto.getColor());
  }
}
