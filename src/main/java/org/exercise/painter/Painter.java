package org.exercise.painter;

public class Painter {
    final String nome, colore;

    public Painter(String name, String color){
        nome = name;
        colore = color;
    }

    public String getName(){
        return nome;
    }

    public String getColor(){
        return colore;
    }
}
