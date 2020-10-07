package Lab3;
//Daniel Alejandro Rivera Estrada
//id80699287

public class ChessBoard {
    public final int maxRow=8, minRow=1;// this will be constants. The minimum row and the maximum row

    public boolean withinChessboard(String column,int row)
    {
        boolean sw=false,exit=false;

            ChessBoard.ColumnLetter l= ChessBoard.ColumnLetter.valueOf(column.toUpperCase());//converts String to ColumnLetter for the enum
            switch(l)
            {
                case A:
                    if(row<=maxRow && row>=minRow) //if the row is within the parameters then is valid
                    {
                        System.out.println("Location is valid   ");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;
                case B:
                    if(row<=maxRow && row>=minRow)
                    {
                        System.out.println("Location is valid  ");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;

                case C:
                    if(row<=maxRow && row>=minRow)
                    {
                        System.out.println("Location is valid ");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;

                case D:
                    if(row<=maxRow && row>=minRow)
                    {
                        System.out.println("Location is valid...");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;

                case E:
                    if(row<=maxRow && row>=minRow)
                    {
                        System.out.println("Location is valid");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;

                case F:
                    if(row<=maxRow && row>=minRow)
                    {
                        System.out.println("Location is valid..");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;

                case G:
                    if(row<=maxRow && row>=minRow)
                    {
                        System.out.println("Location is valid.");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;

                case H:
                    if(row<=maxRow && row>=minRow)
                    {
                        System.out.println("Location is valid,");
                        sw=true;
                        exit=true;
                    }else{
                        System.out.println("Location not valid");
                    }
                    break;

                default:
                    System.out.println("That location is not within the board");
            }
            if(sw==false) {// if the location was not valid it will ask the user for another location
                return false;
                } else {
                    return true;// if user doesn't want to input another location the method will end
                }


        }


    public enum ColumnLetter//enum for the columns
    {
        A,B,C,D,E,F,G,H
    }

}

