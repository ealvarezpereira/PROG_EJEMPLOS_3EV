/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializableej2;

/**
 *
 * @author quique
 */
import java.io.*;

/**
 *
 * @author quique
 */
public class MiObjectOutputStream extends ObjectOutputStream {

    // constructores :
    public MiObjectOutputStream() throws IOException {

    }

    public MiObjectOutputStream(OutputStream ou) throws IOException {
        super(ou);
    }

    /* redefinición do método que escribe a cabeceira para que non faga nada */
    @Override
    protected void writeStreamHeader() throws IOException {
    }
    
}
