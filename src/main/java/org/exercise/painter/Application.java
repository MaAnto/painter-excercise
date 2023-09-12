package org.exercise.painter;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ColorList listaColori=new ColorList();

    System.out.println("Di che colore vuoi che dipinga?");

    String color = in.next();
    for(int i=0;i<listaColori.getLenght();i++){
      if(color.equalsIgnoreCase(listaColori.getNome(i))){
        Painter pittore = new Painter("Giotto", color);

        System.out.println(pittore.getName() + " sta dipingendo di colore " + pittore.getColor());
        return;
      }
    }
    System.out.println("Questo colore non lo conosco");
  }
}