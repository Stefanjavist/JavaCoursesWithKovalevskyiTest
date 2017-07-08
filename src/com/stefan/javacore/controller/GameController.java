package com.stefan.javacore.controller;


import com.stefan.javacore.model.Figure;
import com.stefan.javacore.model.Player;

public class GameController {

    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 2;
    private Player[] players = new Player[]{new Player(new Figure.X, "Max"),
            new Player(new Figure.O, "Stefan")};
    private String GameName;

    public String getGameName() {
    return GameName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public boolean move(int x, int y){
        assert x >= 0;
        assert y >= 0;
        if (checkCoordinate(x) && checkCoordinate(y)){
            return true;
        }
        //todo logic of move
        return false;
    }

    private boolean checkCoordinate(final int coordinate){
            return (coordinate < MIN_COORDINATE && coordinate > MAX_COORDINATE);
    }

//    public  currentPlayr(){
//
//    }
}
