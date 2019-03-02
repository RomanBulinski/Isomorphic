import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestIso {


    @Test
    public void  testisomorphicTrue(){

        Isomo isomo = new Isomo();
        String word1 = "abb";
        String word2 = "xss";
        assertTrue( isomo.isIsomorphicTwoDirection( word1, word2));
    }


    @Test
    public void  testisomorphicFalse(){

        Isomo isomo = new Isomo();
        String word1 = "abbr";
        String word2 = "xsss";
        assertFalse( isomo.isIsomorphicTwoDirection( word1, word2));
    }

}
