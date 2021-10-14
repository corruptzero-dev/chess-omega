package task;


import java.util.Random;

public class Cell {
    String cell;
    boolean isEmpty;

    Alfil alfil = new Alfil();
    Knight knight = new Knight();
    Queen queen = new Queen();
    Rook rook = new Rook();
    Figure cellFigure;
    Figure[] types = {alfil,knight,queen,rook};
    int i = 0;
    Random random = new Random();
    public Cell() {
        switch (i){
            case 0:
                cell = alfil.symbol1;
            case 1:
                cell = knight.symbol1;
            case 2:
                cell = queen.symbol1;
            case 3:
                cell = rook.symbol1;
            case 4:
                cell = alfil.symbol2;
            case 5:
                cell = knight.symbol2;
            case 6:
                cell = queen.symbol2;
            case 7:
                cell = rook.symbol2;
            default:
                break;
        }
    }

    public Cell(int idx) {
        if (cellFigure == null){
            if (idx%2 == 1){
                this.cell = "□";
            } else {
                this.cell = "■";
            }
        } else {
            this.cell = cellFigure.symbol;
        }

    }

}
