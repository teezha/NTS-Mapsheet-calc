package bcit.gist7010;

import java.util.Scanner;

/**
 * ==============================================================================
 * File         : NTS_ASCII_Mapsheet_calculator.java
 * <p>
 * Current Author: Toby Zhang
 * <p>
 * Previous Author: None
 * <p>
 * Contact Info: somebody@somewhere.com
 * <p>
 * Purpose : To create where your mapsheet sits on the NTS system in ASCii
 * <p>
 * Dependencies: NTS.java
 * <p>
 * Modification Log :
 * --> Created NOV-10-2016 (tz)
 * --> Updated MMM-15-YYYY (tz)
 * <p>
 * =============================================================================
 */

public class Main {

    public static void main(String[] args) {
        /** ===========================================================
         * You will need to import Scanner (see below)
         * import java.util.Scanner;
         *
         * Link a Scanner to the keyboard so that we can capture
         * what the user types at the keyboard and pipe that data
         * into the program for processing
         * ===========================================================
         */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter mapsheet");
        String ntsMapsheet, blockLetter, blockNumberAsString;
        ntsMapsheet = keyboard.next();

        /** ===========================================================
         * Cuts user input into letters and numbers via string split
         * ===========================================================
         */
        blockLetter = ntsMapsheet.substring(ntsMapsheet.length() - 1);
        blockNumberAsString = ntsMapsheet.substring(0, ntsMapsheet.length() - 1);

        /** ===========================================================
         * sets the block numbers for each direction
         * ===========================================================
         */
        int westBlockNumber = Integer.parseInt(blockNumberAsString);
        int eastBlockNumber = Integer.parseInt(blockNumberAsString);
        int northBlockNumber = Integer.parseInt(blockNumberAsString);
        int southBlockNumber = Integer.parseInt(blockNumberAsString);
        int nWestBlockNumber = Integer.parseInt(blockNumberAsString);
        int nEastBlockNumber = Integer.parseInt(blockNumberAsString);
        int sWestBlockNumber = Integer.parseInt(blockNumberAsString);
        int sEastBlockNumber = Integer.parseInt(blockNumberAsString);
        int blockNumber = Integer.parseInt(blockNumberAsString);

        /** ===========================================================
         * Calculates the new block number depending on where the map
         * sheet falls upon
         * ===========================================================
         */
        if (NTS.isWest(blockLetter)) {
            westBlockNumber = blockNumber + 10;
        }
        if (NTS.isEast(blockLetter)) {
            eastBlockNumber = blockNumber - 10;
        }
        if (NTS.isNorth(blockLetter)) {
            northBlockNumber = blockNumber + 1;
        }
        if (NTS.isSouth(blockLetter)) {
            southBlockNumber = blockNumber - 1;
        }
        if (NTS.isNorthWest(blockLetter)) {
            nWestBlockNumber = blockNumber + 11;
            nEastBlockNumber = blockNumber + 1;
            sWestBlockNumber = blockNumber + 10;
        }
        if (NTS.isNorthEast(blockLetter)) {
            nWestBlockNumber = blockNumber + 1;
            nEastBlockNumber = blockNumber - 9;
            sEastBlockNumber = blockNumber - 10;
        }
        if (NTS.isSouthWest(blockLetter)) {
            nWestBlockNumber = blockNumber + 10;
            sWestBlockNumber = blockNumber + 9;
            sEastBlockNumber = blockNumber - 1;
        }
        if (NTS.isSouthEast(blockLetter)) {
            nEastBlockNumber = blockNumber - 10;
            sWestBlockNumber = blockNumber - 1;
            sEastBlockNumber = blockNumber - 11;
        }

        /** ===========================================================
         * Calls an argument from mapsheetIndexOf method
         * ===========================================================
         */
        int position = NTS.mapsheetIndexOf(blockLetter);

        /** ===========================================================
         * Finds mapsheet letter in a 2d array
         * ===========================================================
         */
        String westMapSheets = NTS.adjMapLetters[position][NTS.WEST];
        String eastMapSheets = NTS.adjMapLetters[position][NTS.EAST];
        String northMapSheets = NTS.adjMapLetters[position][NTS.NORTH];
        String southMapSheets = NTS.adjMapLetters[position][NTS.SOUTH];
        String nWestMapSheets = NTS.adjMapLetters[position][NTS.NORTHWEST];
        String nEastMapSheets = NTS.adjMapLetters[position][NTS.NORTHEAST];
        String sWestMapSheets = NTS.adjMapLetters[position][NTS.SOUTHWEST];
        String sEastMapSheets = NTS.adjMapLetters[position][NTS.SOUTHEAST];

        /** ===========================================================
         * concat the numbers and letters together
         * ===========================================================
         */
        String w = westBlockNumber + westMapSheets;
        String e = eastBlockNumber + eastMapSheets;
        String n = northBlockNumber + northMapSheets;
        String s = southBlockNumber + southMapSheets;
        String nw = nWestBlockNumber + nWestMapSheets;
        String ne = nEastBlockNumber + nEastMapSheets;
        String sw = sWestBlockNumber + sWestMapSheets;
        String se = sEastBlockNumber + sEastMapSheets;

        /** ===========================================================
         * pushes ALL output values into loops to format into 3digits
         * and 1 letter format
         * ===========================================================
         */
        String[] d = {w, e, n, s, nw, ne, sw, se};
        for (int i = 0; i < d.length; i++) {
            while (d[i].length() < 4) {
                d[i] = "0" + d[i];
            }
        }
        while (ntsMapsheet.length() < 4) {
            ntsMapsheet = "0" + ntsMapsheet;
        }

        /** ===========================================================
         * ASCII output
         * ===========================================================
         */

        System.out.println(" /$$     /$$ /$$$$$$  /$$   /$$ /$$$$$$$        /$$      /$$  /$$$$$$  /$$$$$$$         /$$$$$$  /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$");
        System.out.println("|  $$   /$$//$$__  $$| $$  | $$| $$__  $$      | $$$    /$$$ /$$__  $$| $$__  $$       /$$__  $$| $$  | $$| $$_____/| $$_____/|__  $$__//$$__  $$");
        System.out.println(" \\  $$ /$$/| $$  \\ $$| $$  | $$| $$  \\ $$      | $$$$  /$$$$| $$  \\ $$| $$  \\ $$      | $$  \\__/| $$  | $$| $$      | $$         | $$  | $$  \\__/");
        System.out.println("  \\  $$$$/ | $$  | $$| $$  | $$| $$$$$$$/      | $$ $$/$$ $$| $$$$$$$$| $$$$$$$/      |  $$$$$$ | $$$$$$$$| $$$$$   | $$$$$      | $$  |  $$$$$$ ");
        System.out.println("   \\  $$/  | $$  | $$| $$  | $$| $$__  $$      | $$  $$$| $$| $$__  $$| $$____/        \\____  $$| $$__  $$| $$__/   | $$__/      | $$   \\____  $$");
        System.out.println("    | $$   | $$  | $$| $$  | $$| $$  \\ $$      | $$\\  $ | $$| $$  | $$| $$             /$$  \\ $$| $$  | $$| $$      | $$         | $$   /$$  \\ $$");
        System.out.println("    | $$   |  $$$$$$/|  $$$$$$/| $$  | $$      | $$ \\/  | $$| $$  | $$| $$            |  $$$$$$/| $$  | $$| $$$$$$$$| $$$$$$$$   | $$  |  $$$$$$/ ");
        System.out.println("    |__/    \\______/  \\______/ |__/  |__/      |__/     |__/|__/  |__/|__/             \\______/ |__/  |__/|________/|________/   |__/   \\______/\n\n");
        System.out.println(" .----------.  .----------.  .----------. ");
        System.out.println("| .--------. || .--------. || .--------. |");
        System.out.println("| |  " + d[4] + "  | || |  " + d[2] + "  | || |  " + d[5] + "  | |");
        System.out.println("| .________. || .________. || .________. |");
        System.out.println(" .__________.  .__________.  .__________. ");
        System.out.println(" .----------.  .----------.  .----------. ");
        System.out.println("| .--------. || .--------. || .--------. |");
        System.out.println("| |  " + d[0] + "  | || |  " + ntsMapsheet.toUpperCase() + "  | || |  " + d[1] + "  | |");
        System.out.println("| .________. || .________. || .________. |");
        System.out.println(" .__________.  .__________.  .__________. ");
        System.out.println(" .----------.  .----------.  .----------. ");
        System.out.println("| .--------. || .--------. || .--------. |");
        System.out.println("| |  " + d[6] + "  | || |  " + d[3] + "  | || |  " + d[7] + "  | |");
        System.out.println("| .________. || .________. || .________. |");
        System.out.println(" .__________.  .__________.  .__________. ");
    }
}
