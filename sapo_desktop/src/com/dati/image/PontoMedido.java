package com.dati.image;
import java.awt.Point;
//import java.io.Serializable;

/*
 * Created on 27/01/2005 - Puig
 *
 * Esta classe cont�m as coordenadas, denomina��o,
 * designa��o gen�rica e outras informa��es do ponto medido.
 * 
 */


public class PontoMedido /*implements Serializable*/ {
    public Point p = new Point();
    public String nome = new String();
    public String generico = new String(); // designa��o gen�rica
    public boolean apresenta;
}