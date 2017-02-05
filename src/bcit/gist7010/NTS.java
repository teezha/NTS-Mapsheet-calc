package bcit.gist7010;

/**
 * Created by A00987765 on 14/11/2016.
 */
/**
 * ==============================================================================
 * File         : NTS.java
 * <p>
 * Current Author: Toby Zhang
 * <p>
 * Previous Author: None
 * <p>
 * Contact Info: somebody@somewhere.com
 * <p>
 * Purpose : NTS results replier slave
 * <p>
 * Dependencies: None
 * <p>
 * Modification Log : see above
 * --> Created MMM-DD-YYYY (fl)
 * --> Updated MMM-DD-YYYY (fl)
 * <p>
 * =============================================================================
 */

public class NTS {

    /** ===========================================================
     * sets int positions of the directions on mapsheet
     * ===========================================================
     */
    public static final int CENTER = 0;
    public static final int WEST = 1;
    public static final int EAST = 2;
    public static final int NORTH = 3;
    public static final int SOUTH = 4;
    public static final int NORTHEAST = 5;
    public static final int SOUTHEAST = 6;
    public static final int NORTHWEST = 7;
    public static final int SOUTHWEST = 8;

    /**
     * ==============================================================================
     * Method : W?
     * <p>
     * Current Author: first_name last_name
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : W?Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isWest(String mapLetter) {
        boolean found = false;
        String[] westMapsheetLetters = {"D", "E", "L", "M"};
        for (int i = 0; i < westMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(westMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ==============================================================================
     * Method : E?
     * <p>
     * Current Author: first_name last_name
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : E?Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isEast(String mapLetter) {
        boolean found = false;
        String[] eastMapsheetLetters = {"P", "I", "H", "A"};
        for (int i = 0; i < eastMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(eastMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ==============================================================================
     * Method : N?
     * <p>
     * Current Author: first_name last_name
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : N?Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isNorth(String mapLetter) {
        boolean found = false;
        String[] northMapsheetLetters = {"M", "N", "O", "P"};
        for (int i = 0; i < northMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(northMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ==============================================================================
     * Method : S?
     * <p>
     * Current Author: first_name last_name
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : S?Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isSouth(String mapLetter) {
        boolean found = false;
        String[] southMapsheetLetters = {"A", "B", "C", "D"};
        for (int i = 0; i < southMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(southMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ==============================================================================
     * Method : NW?
     * <p>
     * Current Author: first_name last_name
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : NW?Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isNorthWest(String mapLetter) {
        boolean found = false;
        String[] westMapsheetLetters = {"M"};
        for (int i = 0; i < westMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(westMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ==============================================================================
     * Method : NE?
     * <p>
     * Current Author: first_name last_name
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : NE?Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isNorthEast(String mapLetter) {
        boolean found = false;
        String[] eastMapsheetLetters = {"P"};
        for (int i = 0; i < eastMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(eastMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ==============================================================================
     * Method : SW?
     * <p>
     * Current Author: first_name last_name
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : SW?Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isSouthWest(String mapLetter) {
        boolean found = false;
        String[] northMapsheetLetters = {"D"};
        for (int i = 0; i < northMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(northMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ==============================================================================
     * Method : SE?
     * <p>
     * Current Author: Toby Zhang
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : SE? Y/N
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static boolean isSouthEast(String mapLetter) {
        boolean found = false;
        String[] southMapsheetLetters = {"A"};
        for (int i = 0; i < southMapsheetLetters.length; i++) {
            if (mapLetter.toUpperCase().equals(southMapsheetLetters[i])) {
                found = true;
            }
        }
        return found;
    }

    /**
     * ===========================================================
     * Improved map letters output 2d array
     * ===========================================================
     */
    public static String[][] adjMapLetters =
            {
                    {

                            "A", "B", "D", "H", "P", "E", "M", "G", "O"
                    },
                    {
                            "B", "C", "A", "G", "O", "H", "P", "F", "N"
                    },
                    {
                            "C", "D", "B", "F", "N", "G", "O", "E", "M"
                    },
                    {
                            "D", "A", "C", "E", "M", "F", "N", "H", "P"
                    },
                    {
                            "E", "H", "F", "L", "D", "K", "C", "I", "A"
                    },
                    {
                            "F", "E", "G", "K", "C", "J", "B", "L", "D"
                    },
                    {
                            "G", "F", "H", "J", "B", "I", "A", "K", "C"
                    },
                    {
                            "H", "G", "E", "I", "A", "L", "D", "J", "B"
                    },
                    {
                            "I", "J", "L", "P", "H", "M", "E", "O", "G"
                    },
                    {
                            "J", "K", "I", "O", "G", "P", "H", "N", "F"
                    },
                    {
                            "K", "L", "J", "N", "F", "O", "G", "M", "E"
                    },
                    {
                            "L", "I", "K", "M", "E", "N", "F", "P", "H"
                    },
                    {
                            "M", "P", "N", "D", "L", "C", "K", "A", "I"
                    },
                    {
                            "N", "M", "O", "C", "K", "B", "J", "D", "L"
                    },
                    {
                            "O", "N", "P", "B", "J", "A", "I", "C", "K"
                    },
                    {
                            "P", "O", "M", "A", "I", "D", "L", "B", "J"
                    }
            };

    /**
     * ==============================================================================
     * Method : map index
     * <p>
     * Current Author: Toby Zhang
     * <p>
     * Previous Author: None
     * <p>
     * Purpose : sets input letter in position CENTER(0) through the array as the first
     * of the row
     * <p>
     * Dependencies: none
     * <p>
     * Modification Log :
     * --> Created MMM-DD-YYYY (fl)
     * --> Updated MMM-DD-YYYY (fl)
     * <p>
     * =============================================================================
     */
    public static int mapsheetIndexOf(String blockMapLetter) {
        int position = -1;
        for (int i = 0; i < adjMapLetters.length; i++) {
            if (blockMapLetter.toUpperCase().equals(adjMapLetters[i][CENTER])) {
                position = i;
            }
        }
        return position;
    }
}
