/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_leibnyz;

/**
 *
 * @author julian
 */
public class Pi_Leibnyz {

    
 /**
 * Esta clase esta diseñada para reflejar en java la serie de Gregory- Leibnyz para la
 * hallar pi, la formula para esta serie es : PI = (-1^n)/2*n+1 , todo
 * es una sumatoria desde n =0 hasta infinito para mas precision, esta bajo la
 * idea de divide y venseras, realizado cada calculo por partes y al final
 * realizar la opinion pertinente.
 *
 * @author: Julian Alberto Peñuela Buitrago ID:607452
 * @version: 15/02/2020
 */
    public static void main(String[] args) {
        /**
         * @param pi Es la variableque usaremos para el calculo de las franciones de la sumatoria
         * teniendo en cuenta el patron que tiene , que es que el denominador va de 2 en dos en numeros
         * impares.
         * 
         * @param Sumatoria es la variable contenedor que tendra dentro de ella el resultado de la sumatoria.
         * @param Contador es la variable que nos servira como un contador que se validara para definir si el numero es par o 
         * impar y determinar el denominador de la fraccion.
         * @param n es la variable que contiene en numero de repeticiones que realizara el ciclo.
         */
        double pi = 1.0;
        int Sumatoria = 1;
        double Contador = 3;
        int n=10000;
        System.out.println("el numero de veces que realizara la serie es : "+n);
        
        /**
         * A continuacion tenemos un condicional while , que plantea que si el contador es
         * menor a n realice dos condicionales if que estan adentr.
         * 
         * El primer if platea que si si la sumatoria mod 2 es igual a 0 osea que si eso da par se le suma a pi
         * el denomindador 1/contador.
         * 
         * El segundo if if platea que si la sumatoria mod 2 es diferente a 0 osea que si eso da impar se le resta a pi
         * el denomindador 1/contador.
         */
        while (Contador <= n) {
            if (Sumatoria % 2 == 0) {
                pi = pi + (1 / Contador);
            } else if (Sumatoria % 2 != 0) {
                pi = pi - (1 / Contador);
            }
            
            /**
             * A continuacion el contador aumenta en dos como indica el patron de la 
             * serie y la variable sumatoria aumenta en 1.
             */
             
            
            Contador = Contador + 2;
            Sumatoria = Sumatoria + 1;
        }
        
        /**
         * Por ultimo se imprime la variable pi multiplicada por 4 debido a que la formula
         * al principio indica que toda la sumatoria se multiplica por 4/1.
         */
        System.out.println("usando la serie de leibnyz pi es aproximadamente: "+(pi * 4));
    }
}