package Lab3;
//Daniel Alejandro Rivera Estrada
//id80699287


import java.util.Scanner;

public class MainExe {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        ChessBoard ch=new ChessBoard();
        ChessPiece[] allpieces=new ChessPiece[8];

        String type="";//type of piece
        String color="Black",column="";//color and column of the piece to create object;
        int row=1,counter=0,opc=2; //row fot object counter for array of objects and opc to select at the end
        boolean swtch1=true;  //switch to exit the loop
        PieceColor c=PieceColor.valueOf(color.toUpperCase());

        System.out.println("You will select up to 8 pieces you will use, then you will choose a target position to try it out");

        while(swtch1==true) {
            System.out.println("Please select the valid piecee that you are going to use");//prompt the user to select a chess piece: Pawn, Rook, Knight, Bishop, Queen, and King
            type=k.next();
            PieceType p= PieceType.valueOf(type.toUpperCase());
            ChessPiece piece; //declared an object of type chess piece to use it later

            switch(p){
                case PAWN:
                    System.out.println("Please introduce the color of the piece (white or black):");
                    color=k.next();
                    c=PieceColor.valueOf(color.toUpperCase());
                    switch(c)
                    {
                        case BLACK:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-F");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Pawn("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        case WHITE:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-F");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece =new Pawn("WHITE",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        default:
                            System.out.println("Not a valid choice. Color will be set to Black");
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-F");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Pawn("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                    }

                    System.out.println("Do you want to add another piece?(1= Yes  2= No)");
                    opc=k.nextInt();
                    if(opc==1){}
                    else{
                        System.out.println("Exiting...");
                        swtch1=false;
                    }
                    break;

                case BISHOP:
                    System.out.println("Please introduce the color of the piece (white or black):");
                    color=k.next();
                    c=PieceColor.valueOf(color.toUpperCase());
                    switch(c)
                    {
                        case BLACK:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-F");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Bishop("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        case WHITE:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-F");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Bishop("WHITE",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        default:
                            System.out.println("Not a valid choice. Color will be set to Black");
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-F");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Bishop("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                    }

                    System.out.println("Do you want to add another piece?(1= Yes  2= No)");
                    opc=k.nextInt();
                    if(opc==1){}
                    else{
                        System.out.println("Exiting...");
                        swtch1=false;
                    }
                    break;

                case KNIGHT:
                    System.out.println("Please introduce the color of the piece (white or black):");
                    color=k.next();
                    c= PieceColor.valueOf(color);
                    switch(c)
                    {
                        case BLACK:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Knight("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        case WHITE:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Knight("WHITE",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        default:
                            System.out.println("Not a valid choice. Color will be set to Black");
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Knight("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                    }

                    System.out.println("Do you want to add another piece?(1= Yes  2= No)");
                    opc=k.nextInt();
                    if(opc==1){}
                    else{
                        System.out.println("Exiting...");
                        swtch1=false;
                    }
                    break;

                case QUEEN:
                    System.out.println("Please introduce the color of the piece (white or black):");
                    color=k.next();
                    c= PieceColor.valueOf(color.toUpperCase());
                    switch(c)
                    {
                        case BLACK:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Queen("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        case WHITE:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Queen("WHITE",column,row);
                            allpieces[counter]=piece;
                            counter++;
                            break;

                        default:
                            System.out.println("Not a valid choice. Color will be set to Black");
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Queen("BLACK",column,row);
                            allpieces[counter]=piece;
                            counter++;
                    }
                    System.out.println("Do you want to add another piece?(1= Yes  2= No)");
                    opc=k.nextInt();
                    if(opc==1){}
                    else{
                        System.out.println("Exiting...");
                        swtch1=false;
                    }
                    break;

                case KING:
                    System.out.println("Please introduce the color of the piece (white or black):");
                    color=k.next();
                    c= PieceColor.valueOf(color.toUpperCase());
                    switch(c)
                    {
                        case BLACK:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new King("BLACK",column,row);
                            allpieces[counter]=piece; //saves the object in the array
                            counter++;
                            break;

                        case WHITE:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new King("WHITE",column,row);
                            allpieces[counter]=piece;//saves the object in the array
                            counter++;
                            break;

                        default:
                            System.out.println("Not a valid choice. Color will be set to Black");
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new King("BLACK",column,row);
                            allpieces[counter]=piece;//saves the object in the array
                            counter++;
                    }
                    System.out.println("Do you want to add another piece?(1= Yes  2= No)");
                    opc=k.nextInt();
                    if(opc==1){}
                    else{
                        System.out.println("Exiting...");
                        swtch1=false;
                    }
                    break;


                case ROOK:
                    System.out.println("Please introduce the color of the piece (white or black):");
                    color=k.next();
                    c= PieceColor.valueOf(color.toUpperCase());
                    switch(c)
                    {
                        case BLACK:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Rook("BLACK",column,row);
                            allpieces[counter]=piece;//saves the object in the array
                            counter++;
                            break;

                        case WHITE:
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Rook("WHITE",column,row);
                            allpieces[counter]=piece;//saves the object in the array
                            counter++;
                            break;

                        default:
                            System.out.println("Not a valid choice. Color will be set to Black");
                            System.out.println("Insert the current position of the piece:");
                            System.out.println("Row: (1-8)");
                            row=k.nextInt();
                            System.out.println("Column: A-H");
                            column=k.next();
                            ch.withinChessboard(column,row);//determine if the target position is within chess boundary.
                            piece=new Rook("BLACK",column,row);
                            allpieces[counter]=piece;//saves the object in the array
                            counter++;
                    }
                    System.out.println("Do you want to add another piece?(1= Yes  2= No)");
                    opc=k.nextInt();
                    if(opc==1){}
                    else{
                        System.out.println("Exiting...");
                        swtch1=false;
                    }
                    break;

                default:
                    System.out.println("Not a valid piece type..");
            }
            if(counter>=7)
            {
                swtch1=false;
            }

        }


do  {
    System.out.println("Inroduce the target position you want to move the pieces to:");
    System.out.println("Location on X(Column A-H)");
    column = k.next();
    System.out.println("Row (Y)");
    row = k.nextInt();
}while(ch.withinChessboard(column, row)==false);

        for(int i=0;i<counter;i++) {
            allpieces[i].verifyMovement(column, row);
        }

        }//main

    public enum PieceColor
    {
        WHITE,BLACK;
    }

    public enum PieceType// Enumerated types for type of chess pieces, columns, and colors
    {
        KING,QUEEN,ROOK,BISHOP,KNIGHT,PAWN;
    }
}
