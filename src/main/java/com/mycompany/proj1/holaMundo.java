 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj1;

import java.util.Scanner;

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
        //Short corto;
        //corto=32000;
        //System.out.println("corto="+corto);
        //Para cambiar a dato envoltorio int debemos colocar Integer
        //Integer entero;
        //entero=32000;
        //System.out.println("entero="+entero);
        //En el caso de long pedira un dato casting para ejecutar la conversion
        //long largo;
        //largo=32000l;
        //largo=(long)32000;
        //System.out.println("largo="+largo);
        
        //float flotante;
        //flotante=(float)32000.55;
        //flotante=32000.55f;
        //System.out.println("flotante="+flotante);
        
        //Double doble;
        //doble=32000.55;
        //System.out.println("doble="+doble);
        
        //char caracter;
        //caracter='C';
        //System.out.println("caracter="+caracter);
        
        //boolean booleano;
        //booleano=true;
        //booleano=false;
        //System.out.println("booleano="+booleano);
        
        //Datos Envoltorios
        //Byte mordida;
        //mordida=(byte)126.55;
       // System.out.println("mordida="+mordida);
        //Trasladando el valor de Byte a float
        //Float flotante;
        //flotante=mordida.floatValue();
        //System.out.println("flotante="+flotante);
        
        //String cadena;
        //cadena="Cadena de caracteres";
        //System.out.println("cadena="+cadena);
        
        //Contantes en Java
        //final Byte mordida;
        //mordida=(byte)126.55;
        //System.out.println("mordida="+mordida);
        
        //final float pi=3.1416f;
        //float res=pi*2;
        //System.out.println("pi*2="+res);
        
        //Ingreso de datos por consola
        //Scanner entrada=new Scanner(System.in);
        //int entero;
        //System.out.println("Ingrese un tipo de dato numerico entero:");
        //entero=entrada.nextInt();
        //System.out.println("Tu ingreso es:"+entero);
        
        //Cambiando la entrada a valor flotante o decimal.
        //Scanner entrada=new Scanner(System.in);
        //float decimal;
        //System.out.println("Ingrese un tipo de dato numerico:");
        //decimal=entrada.nextFloat();
        //System.out.println("Tu ingreso es:"+decimal);
        
        //Cambiando la entrada a valor double.
        //Scanner entrada=new Scanner(System.in);
        //double decimal;
        //System.out.println("Ingrese un tipo de dato numerico:");
        //decimal=entrada.nextDouble();
        //System.out.println("Tu ingreso es:"+decimal);
        
        //Cambiando la entrada a valor String o cadena
        //Scanner entrada=new Scanner(System.in);
        //String cadena;
        //System.out.println("Ingrese un texto:");
        //cadena=entrada.nextLine();//nextLine recibe todo lo que se escriba.
        //System.out.println("Tu ingreso es: "+cadena);
        
        //Cambiando la entrada a valor Char o caracter
        Scanner entrada=new Scanner(System.in);
        char caracter;
        System.out.println("Ingrese un tipo de dato numerico:");
        caracter=entrada.next().charAt(0);
        System.out.println("Tu ingreso es:"+caracter);
 }
}
