package com.stefan.javacore.model;


import com.stefan.javacore.model.exceptions.AlreadyOccupiedException;

import java.awt.*;
import java.security.InvalidParameterException;

public class Field {

    private final int FIELD_SIZE = 3;
    private final int MIN_CORDINTE = 0;
    private final int MAX_CORDINTE = FIELD_SIZE;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getField(final Point point) throws InvalidParameterException {
        if (!checkPoint(point)) {
            throw new InvalidParameterException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidParameterException,
            AlreadyOccupiedException{
        if (!checkPoint(point)) {
            throw new InvalidParameterException();
        }
        if(field[point.x][point.y] != null){
            throw new AlreadyOccupiedException();
        }
        field[point.x][point.y] = figure;
    }


    private boolean checkPoint(final Point point) {
        return  checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate){
        return coordinate >= MAX_CORDINTE && coordinate <= MIN_CORDINTE;
    }


}
