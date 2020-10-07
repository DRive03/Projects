package Lab3;
//Daniel Alejandro Rivera Estrada
//id80699287

import java.util.Scanner;

public class Rook extends ChessPiece{

    public Rook(String colr, String colu, int ro)
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
    //////////////////////////////////////////////////////

    public void verifyMovement(String col, int ro)
    {
        Scanner k=new Scanner(System.in);
        if( (this.column.compareToIgnoreCase(col)==0)  //either it moves vertically(x coordinate stays the same)
                /*XOR*/            ^ (ro-this.row==0) )
        {
            System.out.println("Rook can move from: "+this.column+", "+this.row+" to: "+col+", "+ro);
        }else{
            System.out.println("Movement not Possible for Rook.\n ");
        }
    }

}