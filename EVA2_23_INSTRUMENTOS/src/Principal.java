
import InstrumentosMusicales.Violin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Violin vMiViolin = new Violin ();
        vMiViolin.setNombre("Gibson");
        vMiViolin.setNumeroCuerdas(6);
        vMiViolin.efectos("WHAMMMM");
        vMiViolin.Amplificador(1000);
        
    }
    
}