package task;

import java.util.Random;

public class Field {
    final int size = 8;
    Cell[][] field = new Cell[size][size];
    Random random = new Random();
    public Field() {
        fillCells();
        placeFigures();

    }
    public void placeFigures(){
        for (int i = 0; i < size; i++) {
            Cell cell = new Cell();
            int place = random.nextInt(size);
            field[i][place] = cell;
        }
    }
    public void fillCells(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell(j);
                this.field[i][j] = cell;
            }
        }
    }
    public void print(){
        for (Cell[] row: field) {
            for (Cell cell : row) {
                System.out.print(cell.cell);
            }
            System.out.println();
        }
    }
}

