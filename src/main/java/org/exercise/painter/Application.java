package org.exercise.painter;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ColorList listaColori=new ColorList();
    System.out.println("Di che colore vuoi che dipinga?");

    String color = in.next();
    if(controlloColori(color, listaColori)){
      Painter pittore = new Painter("Giotto", color);

      System.out.println(pittore.getName() + " sta dipingendo di colore " + pittore.getColor());
    }else {
      System.out.println("Questo colore non lo conosco"); //colore non riconosciuto
    }

    in.close();
  }

  public static boolean controlloColori(String input, ColorList listaColori){
    for(int i=0;i<listaColori.getLenght();i++){
      if(input.equalsIgnoreCase(listaColori.getNome(i))){ //controllare che il colore inserito sia un colore esistente
        return true;
      }
    }
    return false;
  }
}