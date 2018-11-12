/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import FiguraGeometrica.FiguraGeometrica;
import Punto.Punto;



/**
 *
 * @author invitado
 */
public class Rectangulo extends FiguraGeometrica{

    @Override
    public int CalculaArea() {
        private int Largo=0;
        private int Ancho;

    @Override
    public void DibujarFigura() {
        Punto EsqInfIzq, EsqSupDer, EsqInfDer;
        EsqInfIzq = new Punto();
        EsqSupDer = new Punto();
        EsqInfDer = new Punto();
        EsqInfIzq.setX(getEsqSupIzq().getX());
        EsqInfIzq.setY(getEsqSupIzq().getY());
    }

    public void setBase(int iBase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAltura(int iAltura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
}

 
   
    

