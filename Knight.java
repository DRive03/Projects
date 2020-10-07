package Lab3;

//Daniel Alejandro Rivera Estrada
//id80699287

import java.util.Scanner;

public class Knight extends ChessPiece {

    public Knight(String colr, String colu, int ro)
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
    ////////////////////////////////////////////////////////////

    public void verifyMovement(String col, int ro)
    {
        Scanner k=new Scanner(System.in);
        if( ( (this.column.compareToIgnoreCase(col)==2) && (ro-this.row==1) )  //2 to the right and 1 up
                ^( (this.column.compareToIgnoreCase(col)==2) && (ro-this.row==-1) )  //2 right and 1 down
                ^( (this.column.compareToIgnoreCase(col)==-2) && (ro-this.row==1 ) )  //2 left and 1 up
                ^( (this.column.compareToIgnoreCase(col)==-2) && (ro-this.row==-1 ) ) //2 left and 1 down
                ^( (this.column.compareToIgnoreCase(col)==1) && (ro-this.row==2 ) )   //1 right and 2 up
                ^( (this.column.compareToIgnoreCase(col)==1) && (ro-this.row==-2 ) )  //1 right and 2 down
                ^( (this.column.compareToIgnoreCase(col)==-1) && (ro-this.row==2 ) )  //1 left and 2 up
                ^( (this.column.compareToIgnoreCase(col)==-1) && (ro-this.row==-2 ) )//1 left and 2 down
        )
        {
            System.out.println("Knight can move from: "+this.column+", "+this.row+" to: "+col+", "+ro);
        }else{
            System.out.println("Movement not Possible for Knight.\n ");
        }

    }
}
