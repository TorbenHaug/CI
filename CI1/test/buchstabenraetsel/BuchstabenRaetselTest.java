/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchstabenraetsel;

import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ClausTorben
 */
public class BuchstabenRaetselTest {
    
    public BuchstabenRaetselTest() {
    }

    @Test
    public void testSuccessfullBuilding() {
        String folderPath = System.getProperty("user.dir") + "\\testfiles\\BuchstabenRaetsel\\correctGrammar\\";
        new BuchstabenRaetsel(folderPath + "1.txt");
        new BuchstabenRaetsel(folderPath + "2.txt");
        new BuchstabenRaetsel(folderPath + "3.txt");
        new BuchstabenRaetsel(folderPath + "4.txt");
        new BuchstabenRaetsel(folderPath + "5.txt");
        new BuchstabenRaetsel(folderPath + "6.txt");
        assert(true);
    }
    @Test(expected = org.antlr.runtime.RecognitionException.class)
    public void testIncorrectFile() throws RecognitionException{
        String folderPath = System.getProperty("user.dir") + "\\testfiles\\BuchstabenRaetsel\\incorrectGrammar\\";
        new BuchstabenRaetsel(folderPath + "1.txt");
        new BuchstabenRaetsel(folderPath + "2.txt");
        new BuchstabenRaetsel(folderPath + "3.txt");
        new BuchstabenRaetsel(folderPath + "4.txt");
        new BuchstabenRaetsel(folderPath + "5.txt");
        new BuchstabenRaetsel(folderPath + "6.txt");
    }
    
}
