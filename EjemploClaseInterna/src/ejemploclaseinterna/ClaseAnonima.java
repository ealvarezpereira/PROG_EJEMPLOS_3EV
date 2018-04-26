/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseinterna;

/**
 *
 * @author quique
 */
public class ClaseAnonima {
    
    IOperable iobj = new IOperable(){
        public void sumar(double n1, double n2) {
            System.out.println("Suma: "+(n1+n2));
        }
    };
    
    public void operacion(){
    
        iobj.sumar(4, 7);
    }
    
}
