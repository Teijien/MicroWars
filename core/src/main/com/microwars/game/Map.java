package com.microwars.game;

public interface Map {
    void moveUnit(ICell origin, ICell destination);

    boolean unitHere(int col, int row);

    Unit[][] getMap();

    Unit getUnit(int col, int row);

    void setUnit(Unit unit, int col, int row);

    void deleteUnit(int col, int row);
}
