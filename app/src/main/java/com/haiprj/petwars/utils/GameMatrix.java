package com.haiprj.petwars.utils;

public class GameMatrix {

    private int col;
    private int row;

    private int[][] matrix;

    public GameMatrix(int col, int row) {
        this.col = col;
        this.row = row;
        this.matrix = new int[this.col][this.row];
    }

    public GameMatrix() {
        this.col = 0;
        this.row = 0;
        this.matrix = new int[0][0];
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
        this.matrix = new int[this.col][this.row];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
        this.matrix = new int[this.col][this.row];
    }

    public int[][] getMatrix() {
        return matrix;
    }

}
