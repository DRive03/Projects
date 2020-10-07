package Lab3;
//Daniel Alejandro Rivera Estrada
//id80699287

public abstract class ChessPiece {

    public String pieceName="Bishop";
    public String color;
    public String column;
    public int row;

    public ChessPiece(String colr, String colu, int ro)
    {
        this.color=colr;
        this.column=colu;
        this.row=ro;
    }

public abstract void verifyMovement(String col, int ro);

}
