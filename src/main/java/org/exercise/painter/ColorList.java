package org.exercise.painter;

public class ColorList {

    private final String[] nome= {"bianco", "nero", "rosso", "verde", "giallo", "blu", "azzurro", "marrone", "viola", "rosa", "arancione", "grigio"};

    public String getNome(int n){
        return nome[n];
    }

    public int getLenght(){
        return nome.length;
    }
}
