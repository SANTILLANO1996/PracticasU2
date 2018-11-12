/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_25_imprimir_vehiculo;

/**
 *
 * @author invitado
 */
public class EVA2_25_IMPRIMIR_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
public static void ImprimirRuedas(Vehiculo arg){

    if (arg instanceof automovil)

     System.out.println("Ruedas del " + sTipobehi + ":" + arg.getRuedas());
     //si es un automovil, imprimir la seguridad
        if (arg instanceof Automovil){
      //Convertir el vehiculo a automovil
        automovil aAuto = (Automovil)arg;
        aAuto.seguridad();
}
}