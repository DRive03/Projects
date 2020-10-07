package Lab3;

//Daniel Alejandro Rivera Estrada
//id80699287

public class King extends ChessPiece{

    public King(String colr, String colu, int ro)
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

    /////////////////////////////////////////////

    public void verifyMovement(String col, int ro)//brings the new location coordinates
    {
        if( (this.column.compareToIgnoreCase(col)<=1) && (this.column.compareToIgnoreCase(col)>=-1)  //if the coordinate from x is different
                && (ro-this.row==0) )                                    //by 1 and on Y it is not different
        {
            System.out.println("King can move from: "+this.column+", "+this.row+" to: "+col+", "+ro);
        }else if( (this.column.compareToIgnoreCase(col)==0)       //if the coordinate from x is not different and the coordinate
                && (ro-this.row<=1)  &&       // from y is different by 1
                (ro-this.row>=-1) )
        {
            System.out.println("King can move from: "+this.column+", "+this.row+" to: "+col+", "+ro);
        }else{
            System.out.println("Movement not Possible for King.\n ");
        }

    }
}

