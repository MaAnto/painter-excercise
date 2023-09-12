package org.exercise.painter;

import java.util.Scanner;
public class Application {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

    System.out.println("Di che colore vuoi che dipinga?");
    String color= in.next();

    Painter pittore= new Painter("Giotto", color);

    System.out.println(pittore.getName() + " sta dipingendo di colore " + pittore.getColor());
  }
}
