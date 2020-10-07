package Lab3;
//Daniel Alejandro Rivera Estrada
//id80699287

import java.util.Scanner;

public class Pawn extends ChessPiece {

    public Pawn(String colr, String colu, int ro)
    {
        super(colr,colu,ro);
    }

    /////////////////////////////////////////////////////////Getters and Setters
    public String getPieceName() {
        return pieceName;
    }

    /////////////Color
    public String getColor() {
        return color;
    }

    ////////////Column
    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    ///////////row
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

////////////////////////////////////////////////

    public void verifyMovement(String col, int ro)
    {
        Scanner k=new Scanner(System.in);
        if( (col.compareToIgnoreCase(this.column)==0)        //the coordinate from x has to be the same to avoid sideways movement
                && (ro-this.row==0)    // and the highest difference in y can only be of 1.
                || (ro-this.row==1) )
        {
            System.out.println("Pawn can move from: "+this.column+", "+this.row+" to: "+col+", "+ro);
        }else{
            System.out.println("Movement not Possible for Pawn.\n ");
        }
    }

}

