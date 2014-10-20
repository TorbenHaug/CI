/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buchstabenraetsel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author ClausTorben
 */
public class BuchstabenRaetsel {
    private static String readFile(String path){
        InputStreamReader reader2 = null;
        try {
            CharsetDecoder decoder = Charset.forName("ISO-8859-1").newDecoder();
            //decoder.onMalformedInput(CodingErrorAction.IGNORE);
            reader2 = new InputStreamReader(new FileInputStream(new File(path)), decoder);
            BufferedReader reader = new BufferedReader(reader2);
            String line = null;
            String returnValue = "";
            while ((line = reader.readLine()) != null)
            {
                returnValue += (line + "\n");
            }   
            return returnValue;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BuchstabenRaetsel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BuchstabenRaetsel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader2.close();
            } catch (IOException ex) {
                Logger.getLogger(BuchstabenRaetsel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public BuchstabenRaetsel(String filePath){
        //Loading the DSL script into the ANTLR stream.
        CharStream cs = new ANTLRInputStream(readFile(filePath));
        //Passing the input to the lexer to create tokens
        buchstabenGrammarLexer lexer = new buchstabenGrammarLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Passing the tokens to the parser to create the parse trea. 
        buchstabenGrammarParser parser = new buchstabenGrammarParser(tokens);
        parser.start();
        
        
    }
    public static void main(String[] args) {
        BuchstabenRaetsel test = new BuchstabenRaetsel("C:\\Users\\ClausTorben\\OneDrive\\Dokumente\\Studium\\Praktikum\\CI\\CI1\\src\\buchstabenraetsel\\raetsel1.txt");
    }
}
