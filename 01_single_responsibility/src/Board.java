import java.util.ArrayList;
import java.util.List;

public class Board {
    // Attributes
    List<String> spots;

    // Constructor
    public Board() {
        // Sets Board.spots to empty ArrayList
        this.spots = new ArrayList<>();
        /* Populates Board.spots ArrayList with the following Strings:
         * [0, 1, 2, 3, 4, 5, 6, 7, 8]
         * 
         * which is equivalent to the following board:
         * 
         * 0 1 2
         * 3 4 5
         * 6 7 8
         */
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

    // Methods
    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(this.spots.get(0));
        firstRow.add(this.spots.get(1));
        firstRow.add(this.spots.get(2));
        return firstRow;
    }

    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(this.spots.get(3));
        secondRow.add(this.spots.get(4));
        secondRow.add(this.spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(this.spots.get(6));
        thirdRow.add(this.spots.get(7));
        thirdRow.add(this.spots.get(8));
        return thirdRow;
    }

    // Poor code — can you improve this?
    public void display() {
        String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n"
            + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n"
            + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
        System.out.print(formattedFirstRow);
    }

    // Debugging
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.spots);
    }
}
