/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senotaylor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * Esta clase esta diseñada para reflejar en java la serie de Taylor hallar el seno,
 * la formula para esta serie es : sen x = ((-1^n)/(2*n+1)!)* x^ , todo
 * es una sumatoria desde n =0 hasta infinito para mas precision, esta bajo la
 * idea de divide y venseras, realizado cada calculo por partes y al final
 * realizar la opinion pertinente.
 *
 * @author: Julian Alberto Peñuela Buitrago ID:607452
 * @version: 15/02/2020
 */
public class SenoTaylor {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) throws IOException {
        /**
         * A continuacion creamos BufferedReader y BufferedWriter los cuales nos
         * ayudaran a leer y escribir en pantalla, son un poco mas eficientes
         * que el sscaner o lector
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        /**
         * @param x Es el numero que se recibe por medio de pantalla para
         * evaluar la funcion seno x
         * @param n n el numero de veces que se va a relizar la sumatoria , este
         * numero no se dejo a disposicion del ususario ya que si el usuario por
         * ejemplo ingresa n=1 y x=7 el exponente nos dara errado lo cual esta mal,
         * por eso se determino que 10 es un n aceptable.
         */
        double factorial = 1;
         int n = 10;
        // A continuacion usamos el Integer.parseInt(br.readLine()); para leer el numero 
         //al que se va a evaluar el seno.
         System.out.print("ingrese  x: ");
        int x = Integer.parseInt(br.readLine());
        
        /**
         * @param Sumatoria lo usaremos conmo una variable para llevar la
         * sumatoria del ciclo que se repite y asi poder determinar el
         * resultado, esta variable se inicializa en 1.
         */
        /**
         * @param Factorial se inicializa en 1 debido que debemos multiplicar
         * esta variable por otros numero ya que si la ponemos en 0 el resultado
         * seria 0, siguiendo el principio del factorial que es (a=a*z) donde a
         * es factorial y z el numero del ciclo , lo que hacemos ahi es decir a
         * es igual a z por a , luego al siguiente ciclo se repite lo mismo
         * hasta que se multiplica 1*2*3*4*n.. hasta llegar al factorial
         * deseado.
         */
        /**
         * @param Contenedor Esta variable se usa para almacenar la potencia del
         * x para juntar todo en la operacion final, esta variable funciona como
         * un contenedor, calcula la potencia con cada ciclo del for
         * almacenandose ella misma por la X.
         */
        double sumatoria = 0;
        double contenedor;
        
        /**
         * A continuacion encontramos un ciclo For desde 1 hasta n, adentro de
         * el realizamos las operacions de potencia, factorial, y se calcular el
         * resultado de la sumatoria en la variable resultado.
         */
      
        for (int i = 0; i < n; i++) {
            
            for (int j = 1; j <= i; j++) {
            factorial =factorial*i;
        }
            contenedor = Math.pow(x, i) / factorial;
            sumatoria =sumatoria+contenedor;
        }
        /**
         * A continuacion se imprime por pantalla el resultado de la operacion.
         */

        System.out.printf("el seno de "+x+" es "+sumatoria);
    }
    }