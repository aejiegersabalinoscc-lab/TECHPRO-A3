public class SEATWORK11PART2 {

    public static void main(String[] args) {

        System.out.println("SEATWORK11PART2");
        System.out.println();
        System.out.println("GERSABALINO AEJIE");

        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} }; // Corrected array initialization

        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]); // Corrected variable name
            }
        }
    }
}

