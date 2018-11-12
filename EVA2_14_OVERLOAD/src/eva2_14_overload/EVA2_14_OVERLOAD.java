/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_overload;

/**
 *
 * @author Luis Fernando Martínez Santillano #18550371
 */
public class EVA2_14_OVERLOAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal aAni = new Animal();
      Mamifero mMam = new Mamifero();
      //TODAS LAS CLASES DESCIENDEN DE LA CLASE OBJECT
      Mamifero mJirafa = new Mamifero ("Pararce");
      
    }
    
}
//java solo permite herencia simple (pero puede simular herencia multiple)
//Permite herencia multiple
class Mamifero extends Animal{//CLase hijo, Subclase
    public Mamifero(){
        // LOPRIMERO QUE HACE ES LLAMAR AL CONSTRUCTOR DE LA CLASE ANIMAL
        super();
    }
    public Mamifero (String accion){
        super (accion);
        System.out.println("y salir corriendo");
    }
}
class Animal{//CLase base, Clase padre
    public Animal(){
        System.out.println("Respirando");
    }
    public Animal (String accion){
        System.out.println("Respirar y " + accion);
    }
}