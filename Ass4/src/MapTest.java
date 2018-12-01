import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
* <h1>MapMain</h1>
* Purpose: To exhaustively validate the Map.java class methods.
* 
* <p>
* <b>Note:</b> This is a modified version of Prof. Vybihal's code
* 
*
* @author  Joseph Vybihal
* @author Aidan Wadin
* @version 2.0
* @since   October 2018
*/
public class MapTest {

    /**
    * The expectation is that a valid size is greater than or equal to zero
    * Assumes integer range, therefore testing -1, 0, and 1 is enough.
     * 
     */
	@Test
    public void testValidSize(){
        System.out.println("TESTING VALID SIZE");
        assertFalse(Map.validSize(-1));
        assertFalse(Map.validSize(0));
        assertTrue(Map.validSize(1));
        System.out.println("TEST END\n\n");
        
	}
    /**
     * The expectation is that a valid terrain is only these characters: ~ G #
     * Assume ASCII range of characters, therefore testing 34=" 35=# 36=$ 71=G 72=H 126=~ 127={DEL]
     * 
     */
	
    @Test
    public void testValidTerrain(){
        System.out.println("TESTING VALID TERRAIN");
        assertFalse(Map.validTerrain((char) 34));
        assertTrue(Map.validTerrain('#'));
        assertFalse(Map.validTerrain('$'));
        assertTrue(Map.validTerrain('G'));
        assertTrue(Map.validTerrain('~'));
        assertFalse(Map.validTerrain('H'));
        assertFalse(Map.validTerrain((char) 127));
        System.out.println("TEST END\n\n");
    }

    /**
     * The expectation is that an array is created and no errors are thrown
     * Test if array is NULL and if error thrown
     * Test negative boundary and too large integer boundary
     * 
     */
    
    @Test
    public void testConstructor() throws Exception{
        Map theMap;
        Map newMap;
        Map thirdMap;
        Map finalMap;

        System.out.println("TESTING CONSTRUCTOR");

        //Map should not be created
        try {
        	theMap = new Map(-1,-1);
            assertNull(theMap);
        } 
        catch (Exception e) {
        	//Move on
        }
        
        try {
        	newMap = new Map(5,-1);
            assertNull(newMap);
        } 
        catch (Exception e) {
        	//Move on
        }

        //Map Should be created
        thirdMap = new Map(10,10);
        assertNotNull(thirdMap);

        try {
        	finalMap = new Map(Map.MAXINT+1,Map.MAXINT+1);
            assertNull(finalMap);
        } 
        catch (Exception e) {
        	//Move on
        }
        
        System.out.println("TEST END\n\n");
    }

    /**
    * Assumes: testConstructor passed !
    * The expectation is that the value stored in the location in the map is actually there
    * Will do a visual test in this case (to be different from the above)
     * 
     */
    
    @Test
    public void testSetTerrain(){

        System.out.println("TESTING SET TERRAIN");

        try {
            Map theMap = new Map(10, 10);
            //theMap will be compared to testMap in order to ensure improper alterations are not made to theMap(our main map)
            //AKA when an invalid alteration is attempted, it is checked to see if theMap is the same as its previous version testMap
            Map testMap = new Map(10,10);
            
            //Should be invalid, so the 2 maps should be identical, as theMap was not altered
            try { testMap.setTerrain(-1,-1,'G');} catch(Exception e){}
            assertTrue(testMap.toString().equals(theMap.toString()));
            
            try { theMap.setTerrain(-1,-1,'G');} catch(Exception e){}
            assertTrue(testMap.toString().equals(theMap.toString()));
            
            try { theMap.setTerrain(5,-1,'G');} catch(Exception e){}
            assertTrue(testMap.toString().equals(theMap.toString()));
            
            try { theMap.setTerrain(-1,5,'G');} catch(Exception e){}
            assertTrue(testMap.toString().equals(theMap.toString()));
            
            //Here, this is a valid alteration, so the 2 maps SHOULD be different
            try { theMap.setTerrain(5,5,'G');} catch(Exception e){}
            assertFalse(testMap.toString().equals(theMap.toString()));
            //update testMap so it can continuously be made sure invalid changes are not applied to "theMap"
            testMap.setTerrain(5, 5, 'G');
            
            try { theMap.setTerrain(5,6,'T');} catch(Exception e){}
            assertTrue(testMap.toString().equals(theMap.toString()));
            
            try { theMap.setTerrain(0,0,'G');} catch(Exception e){}
            assertFalse(testMap.toString().equals(theMap.toString()));
            testMap.setTerrain(0, 0, 'G');
            
            try { theMap.setTerrain(9,9,'G');} catch(Exception e){}
            assertFalse(testMap.toString().equals(theMap.toString()));
            testMap.setTerrain(9, 9, 'G');
            
            try { theMap.setTerrain(5,6,'#');} catch(Exception e){}
            assertFalse(testMap.toString().equals(theMap.toString()));
            testMap.setTerrain(5, 6, '#');
            
            //This is a valid change, but it does not alter the map, so it should still be equal to testMap
            try { theMap.setTerrain(5,7,'~');} catch(Exception e){}
            assertTrue(testMap.toString().equals(theMap.toString()));
            testMap.setTerrain(5, 7, '~');
          
        } catch (Exception e) {
            System.out.println("Unable to execute test!!");
        }

        System.out.println("TEST END\n\n");
    }

    /**
     * Assumes: test set terrain passed
     * The expectation is that the full array displays
     * No special testing, expecting to see all water.
     * 
     */
    
    @Test
    public void testToString() throws Exception{
        Map theMap;

        System.out.println("TESTING TOSTRING OUTPUT");
        theMap = new Map(10, 10);
        assertEquals(theMap.toString(), "Terrain:\n\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\n"); 
        System.out.println("TEST END\n\n");
        System.out.println("ALL TESTS COMPLETED");
    }
}
