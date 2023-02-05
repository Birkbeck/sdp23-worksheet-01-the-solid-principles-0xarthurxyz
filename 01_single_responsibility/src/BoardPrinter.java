public class BoardPrinter {
    // Attribute(s)
    Board board;

    // Constructor
    public BoardPrinter(Board board) {
        this.board = board;
    }

    // method
    public void printBoard() {
        // Instantiates empty StringBuilder
        StringBuilder printedBoard = new StringBuilder();
        // Appends board rows to StringBuilder
        printedBoard.append( this.board.firstRow() ); // e.g. [0, 1, 2]
        printedBoard.append( this.board.secondRow() ); // e.g. [0, 1, 2][3, 4, 5]
        printedBoard.append( this.board.thirdRow() ); // e.g. [0, 1, 2][3, 4, 5][6, 7, 8]

        /* Input:
         * [0, 1, 2][3, 4, 5][6, 7, 8]
         * 
         * Formats string:
         * 1. New lines `\n`
         * 2. Remove brackets `[`
         * 3. Remove commas `,` 
         * 
         * Output:
         * 0 | 1 | 2
         * 3 | 4 | 5
         * 6 | 7 | 8
         */

        // Remove first and last
        // 0, 1, 2][3, 4, 5][6, 7, 8
        printedBoard.deleteCharAt(0); // removes first character
        printedBoard.deleteCharAt( printedBoard.length()-1  );  // removes last character
        
        // Removes "["
        // 0, 1, 2]3, 4, 5]6, 7, 8
        for (int i = 0; i < printedBoard.length(); i++) {
            if( Character.toString( printedBoard.charAt(i) ).equals("[") ){
                printedBoard.deleteCharAt(i);
            }
        }
        
        // Replace "]" with "\n"
        // 0, 1, 2\n3, 4, 5\n6, 7, 8
        for (int i = 0; i < printedBoard.length(); i++) {
            if( Character.toString( printedBoard.charAt(i) ).equals("]") ){
                printedBoard.replace(i, i+1, "\n");
            }
        }
        
        // Replaces "," with " |"
        // 0 | 1 | 2\n3 | 4 | 5\n6 | 7 | 8
        for (int i = 0; i < printedBoard.length(); i++) {
            if( Character.toString( printedBoard.charAt(i) ).equals(",") ){
                printedBoard.replace(i, i+1, " |");
            }
        }

        // Converts StringBuilder to String 
        System.out.print( printedBoard.toString() );
    }
}

