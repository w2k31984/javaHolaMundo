 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj1;

/**
 *
 * @author w2k31984
 */
public class holaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hola Mundo
        //System.out.print("Hola Mundo\n");
        //System.out.println("Hola Mundo2");
        //System.out.println("Hola Mundo3");
        //System.out.println("Hola Mundo4");
        //byte mordida;
        //mordida=126;
        //Utilizando casting
        //mordida=(byte)126.56;
        //System.out.println("mordida="+mordida);
        
        //Tipos de Variables
        short corto;
        corto=32000;
        System.out.println("corto="+corto);
        
        int entero;
        entero=32000;
        System.out.println("entero="+entero);
        
        long largo;
        largo=32000;
        System.out.println("largo="+largo);
        
        //float flotante;
        //flotante=(float)32000.55;
        //flotante=32000.55f;
        //System.out.println("flotante="+flotante);
        
        double doble;
        doble=32000.55;
        System.out.println("doble="+doble);
        
        char caracter;
        caracter='C';
        System.out.println("caracter="+caracter);
        
        boolean booleano;
        //booleano=true;
        booleano=false;
        System.out.println("booleano="+booleano);
        
        //Datos Envoltorios
        Byte mordida;
        mordida=(byte)126.55;
        System.out.println("mordida="+mordida);
        //Trasladando el valor de Byte a float
        float flotante;
        flotante=mordida.floatValue();
        System.out.println("flotante="+flotante);
 }
}
