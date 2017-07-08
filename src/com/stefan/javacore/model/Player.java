package com.stefan.javacore.model;


public class Player {

private Figure[] figure;
private String name;

    public Player(final Figure[] figure, final String name) {
        this.figure = figure;
        this.name = name;
    }


    public Figure[] getFigure() {
        return figure;
    }

    public String getName() {
        return name;
    }
}
