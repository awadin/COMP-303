
/**
* <h1>Map</h1>
* Purpose - to create a map class that is safe to share with other developers
* 
* <p>
* <b>Note:</b> This is a modified version of Prof. Vybihal's code.
*
* @author  Joseph Vybihal
* @author Aidan Wadin
* @version 2.0
* @since   October 2018
*/

public class Map {
    public static final int MAXINT = 2147483647;
    private char array[][];
    private int width, height;

    /**
    * Public static methods to be used by external software to validate their data
    * without the need to instantiate an object
    * 
    * This method Checks to make sure the user input value for the dimensions of the array are greater than 0
    * 
     * 
     * @param n The input value
     * @return boolean Whether or not the input value is valid or not (aka greater than 0)
     */

    public static boolean validSize(int n) {
        return n > 0; // cannot create an array of size zero or less
    }

    /**
     * This method makes sure the user input character is valid to be put into the map
     * @param c The user input char
     * @return boolean Whether or not this symbol is valid
     */
    
    public static boolean validTerrain(char c) {
        // A char array of all valid symbols and a loop could have also be used
        return (c == '~' || c == 'G' || c == '#');
    }

    /**
    * Constructor builds a safe world as per instructions 
    * Throws error if it cannot be created.
    *
     * 
     * @param width Width of the generated map
     * @param height Height of the generated map
     * @throws Exception Makes sure all values are properly assigned
     */

    Map(int width, int height) throws Exception {
        int i, j;

        if (Map.validSize(width)) this.width = width;
        else throw new Exception("Incorrect width");

        if (Map.validSize(height)) this.height = height;
        else throw new Exception("Incorrect height");

        array = new char[width][height];

        for(i=0; i<height; i++)
            for(j=0;j<width;j++)
                array[j][i] = '~';
    }

    /**
    *
    * Safe public method to populate the map.
    * It also allows updated to be made by the user in later steps after initial creation
    * This is a versatile method that can be applied to many steps of the problem without needing to re-code something
     * 
     * @param row Which row of the map will be altered
     * @param col Which column of the map will be altered
     * @param terrain What symbol will be put at this row, col coordinate
     * @throws Exception Makes sure all input values are allowed, if they are not the program gracefully handles the problem by throwing this exception
     */

    public void setTerrain(int row, int col, char terrain) throws Exception {
        if ((validSize(row) || row==0) && row < height && (validSize(col) || col==0) && col < width && validTerrain(terrain))
            array[col][row] = terrain;
        else
            throw new Exception("Incorrect information");
    }

    /**
    * Returns a formatted string representing all the values in the map.
     */

    public String toString() {
        String result = "Terrain:\n\n";
        int i, j;

        for(i=0;i<height;i++) {
            for (j = 0; j < width; j++)
                result += " " + array[j][i];

            result += "\n";
        }

        return result;
    }
}
