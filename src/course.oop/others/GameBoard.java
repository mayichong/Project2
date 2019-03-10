package course.oop.others;
import java.util.ArrayList;
public class GameBoard extends TwoDArray{


    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();

    public GameBoard(int row, int col, int defaultVal){
        super(row, col, defaultVal);
    }

    public int checkWin() {

        if (newArray[0][0] == newArray[0][1] && newArray[0][1] == newArray[0][2] && newArray[0][0] == 1) {
            return 1;
        } else if (newArray[1][0] == newArray[1][1] && newArray[1][1] == newArray[1][2] && newArray[1][0] == 1) {
            return 1;
        } else if (newArray[2][0] == newArray[2][1] && newArray[2][1] == newArray[2][2] && newArray[2][0] == 1) {
            return 1;
        } else if (newArray[0][0] == newArray[1][0] && newArray[1][0] == newArray[2][0] && newArray[0][0] == 1) {
            return 1;
        } else if (newArray[0][1] == newArray[1][1] && newArray[1][1] == newArray[2][1] && newArray[0][1] == 1) {
            return 1;
        } else if (newArray[0][2] == newArray[1][2] && newArray[1][2] == newArray[2][2] && newArray[0][2] == 1) {
            return 1;
        } else if (newArray[0][0] == newArray[1][1] && newArray[1][1] == newArray[2][2] && newArray[0][0] == 1) {
            return 1;
        } else if (newArray[0][2] == newArray[1][1] && newArray[1][1] == newArray[2][0] && newArray[0][2] == 1) {
            return 1;
        } else if (newArray[0][0] == newArray[0][1] && newArray[0][1] == newArray[0][2] && newArray[0][0] == 2) {
            return 2;
        } else if (newArray[1][0] == newArray[1][1] && newArray[1][1] == newArray[1][2] && newArray[1][0] == 2) {
            return 2;
        } else if (newArray[2][0] == newArray[2][1] && newArray[2][1] == newArray[2][2] && newArray[2][0] == 2) {
            return 2;
        } else if (newArray[0][0] == newArray[1][0] && newArray[1][0] == newArray[2][0] && newArray[0][0] == 2) {
            return 2;
        } else if (newArray[0][1] == newArray[1][1] && newArray[1][1] == newArray[2][1] && newArray[0][1] == 2) {
            return 2;
        } else if (newArray[0][2] == newArray[1][2] && newArray[1][2] == newArray[2][2] && newArray[0][2] == 2) {
            return 2;
        } else if (newArray[0][0] == newArray[1][1] && newArray[1][1] == newArray[2][2] && newArray[0][0] == 2) {
            return 2;
        } else if (newArray[0][2] == newArray[1][1] && newArray[1][1] == newArray[2][0] && newArray[0][2] == 2) {
            return 2;
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (newArray[i][j] == 0) {
                        return 3;
                    }
                }
            }
            return 0;
        }

    }

    public String avaX(){

        for (int i =0;i<3;i++){
            for (int j =0;j<3;j++){
                if (newArray[i][j] == 0){
                    x.add(i);
                    y.add(j);
                }
            }
        }

        int index = 0;
        String coord = x.get(index) + "" + y.get(index);
        x.clear();
        y.clear();
        return coord;
    }

}

