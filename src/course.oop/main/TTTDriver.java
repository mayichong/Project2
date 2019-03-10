package course.oop.main;
import course.oop.controller.TTTControllerImpl;
import java.util.*;

public class TTTDriver {
    public static void main(String[] args){
        TTTControllerImpl controller = new TTTControllerImpl();
        System.out.println("Welcome to Tic Tac Toe game!\n");

        Scanner input = new Scanner(System.in);
        boolean isOver = false;
        boolean gameOver = false;
        boolean markerSelection = false;
        while (isOver == false){

        System.out.println("What game mode would you like to play?\n");
        System.out.println("1.Play against computer");
        System.out.println("2.Play against another player");
        System.out.println("3.Quit");
        String choice = input.next();


            if (choice.equals("1")) {
                controller.startNewGame(Integer.parseInt(choice),20);
                System.out.println("You want to play against computer.");
                System.out.println("Please input your username:");
                String username = input.next();

                while (markerSelection == false){

                System.out.println("Please input a marker (1 character):");
                String marker = input.next();

                if (marker.length() != 1){
                    System.out.println("Invalid input. Marker only accepts one character long.");
                }else{
                    controller.createPlayer(username,marker,1);
                    System.out.println(username + ", you chose marker " + marker + ", let's begin!");

                    while(gameOver == false){
                        controller.getGameDisplay();

                        System.out.print("Please enter the row number (0-2, 8 for quit):");
                        int rowNum = input.nextInt();
                        System.out.print("Please enter the column number (0-2 8 for quit):");
                        int colNum = input.nextInt();

                        if (rowNum == 8 || colNum == 8){
                            System.out.println("You quit the game! Computer won!\n");
                            System.out.println("Do you want to play again?");
                            break;

                        }
                        if (controller.setSelection(rowNum,colNum,1) == true){
                            System.out.println("works");
                        }else{
                            System.out.println("No");
                        }

                        controller.setSelection(rowNum,colNum,1);

                        String computer = controller.please();
                        char x = computer.charAt(0);
                        char y = computer.charAt(1);
                        int xNum = x - '0';
                        int yNum = y- '0';
                        System.out.println("Computer's Turn!");
                        controller.setSelection(xNum,yNum,2);
                        if (controller.determineWinner() == 1){
                            System.out.println(username + ", You won!");
                            break;
                        }else if (controller.determineWinner() == 0){
                            System.out.println("It is a draw!");
                            break;

                        }else if (controller.determineWinner() == 2){
                            System.out.println("Computer won!");
                            break;
                        }

                    }
                    break;
                }

                }

            } else if (choice.equals("2")){
                System.out.println("You want to play against another player.");
                System.out.println("Please input player1 username:");
                String player1 = input.next();
                System.out.println("Please input player2 username:");
                String player2 = input.next();
            }
            else if (choice.equals("3")){
                System.out.println("See you next time!");
                break;
            }else{
                System.out.println("Invalid choice. Please try again.");
            }

        }


        //controller.startNewGame();
    }
}
