package Lab3;
//Daniel Alejandro Rivera Estrada
//id80699287

public class Queen extends ChessPiece {
    public Queen(String colr, String colu, int ro)
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

    //////////////////////////////////////////////////////////////////////

    public void verifyMovement(String col, int ro)
    {
        if( (this.column.compareToIgnoreCase(col)==0)               //either it moves vertically(x coordinate stays the same)
                /*XOR*/      ^ (ro-this.row==0)//or it moves horizontally (y coordinate stays the same)
                /*XOR*/      ^ ((this.column.compareToIgnoreCase(col))+(ro-this.row)==0) ) //or it moves in diagonal (x-NewX)+(Y-NewY)
        {
            System.out.println("Queen can move from: "+this.column+", "+this.row+" to: "+col+", "+ro);
        }else{
            System.out.println("Movement not Possible for Queen.\n ");
        }

    }
}

