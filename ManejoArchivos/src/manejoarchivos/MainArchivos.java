/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author DCA
 */
public class MainArchivos {
    
    public static void main(String [] args){
        try {
            GuardarArchivo guardarArchivo = new GuardarArchivo();
            guardarArchivo.GuardarArchivo();
        } catch (FileNotFoundException ffe) {
            Logger.getLogger(MainArchivos.class.getName()).log(Level.SEVERE, null, ffe);
        }catch(IOException ie){
            Logger.getLogger(MainArchivos.class.getName()).log(Level.SEVERE, null, ie);
        }
        
    }
    
}
