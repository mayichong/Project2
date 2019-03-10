package course.oop.controller;
import course.oop.others.GameBoard;
import course.oop.others.UserPlayer;
import course.oop.others.SecondPlayer;

public class TTTControllerImpl {

    String globalMarker = "1";
    String compMarker = "C";
    GameBoard board = new GameBoard(3,3,"0");
    public void startNewGame(int numPlayers, int timeoutInSecs){

        //initialize a game board with entry 0
        board.initArray("0");

        //check if numplayer is valid or not
        
        if (numPlayers < 1 || numPlayers > 2){
            System.out.println("Invalid Input. Please try again.");
        }

        //Timer, WIP

    }

    public void createPlayer(String username, String marker, int playerNum){

        /**
         * Create a player with specified username, marker,
         * and player number (either 1 or 2)
         *
         * @param username
         * @param marker
         * @param playerNum
         */

        if (playerNum == 1){
            //create user player
            UserPlayer myself = new UserPlayer(username,marker);
            globalMarker = myself.markerChoice(username,marker);

        }else if (playerNum == 2){
            //create second player
            UserPlayer myself = new UserPlayer(username,marker);
            UserPlayer other = new UserPlayer(username,marker);
            compMarker = other.markerChoice(username,marker);



        }

    }

    /**
     * Allow user to specify location for marker.
     * Return true if the location is valid and available.
     *
     * @param row Must be valid. 0,1,2
     * @param col Must be valid. 0,1,2
     * @param currentPlayer Must be valid. 1 = player1; 2 = player2
     * @return
     */
    public boolean setSelection(int row, int col, int currentPlayer){


        if (row >= 3 || row < 0){
            return false;
        }

        if (col >= 3 || col < 0){
            return false;
        }

        if (currentPlayer == 1){

            return board.insertInt(row,col,globalMarker);

        }

        if (currentPlayer == 2){
            return board.insertInt(row,col,compMarker);
        }else{
            return false;
        }

    }


    /**
     * Determines if there is a winner and returns the following:
     *
     * 0=no winner / game in progress / not all spaces have been selected;
     * 1=player1;
     * 2=player2;
     * 3=tie/no more available locations
     *
     * @return
     */
    public int determineWinner(){

        int hello = board.checkWin(globalMarker,compMarker);

        return hello;
    }

    /**
     * Return a printable display of current selections.
     * Shows 3x3 (or nxn) board with each players marker.
     *
     * @return
     */
    public String getGameDisplay(){


        System.out.println(board.boardDisplay(globalMarker));
        String cool = "";
        return cool;
    }

    public String please(){

        String lol = board.avaX();
        return lol;
    }


}
