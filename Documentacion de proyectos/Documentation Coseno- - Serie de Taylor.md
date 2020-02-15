# Coseno serie de Taylor - Julian Peñuela
1.Esta serie esta regida por una sumatoria que contiene elementos como factorial, potencia y demas, a continuacion encontramos la ecucacion desglozada matematiamente que es:

![alt text](https://wikimedia.org/api/rest_v1/media/math/render/svg/7ec2c0e73f1b75c7b2f4d32fc37cf99f8a52e444)
_____________________________________________________________________________________________________________________________
![alt text](http://recursostic.educacion.es/descartes/web/materiales_didacticos/Desarrollo_serie_taylor/expo.gif)
 
 
 
 Esta clase esta diseñada para reflejar en java la serie de Taylor hallar el seno,
  la formula para esta serie es : sen x = ((-1^n)/(2*n)!)* x^n , todo
  es una sumatoria desde n =0 hasta infinito para mas precision, esta bajo la
  idea de divide y venseras, realizado cada calculo por partes y al final
  realizar la opinion pertinente.


importamos a continuaciontodos los elementos que necesitaremos para realizar la serie.
```
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
```

Esta clase esta diseñada para reflejar en java la serie de Taylor hallar el seno,
  la formula para esta serie es : sen x = ((-1^n)/(2*n)!)* x^2n , todo
  es una sumatoria desde n =0 hasta infinito para mas precision, esta bajo la
  idea de divide y venseras, realizado cada calculo por partes y al final
  realizar la opinion pertinente.
 
  @author: Julian Alberto Peñuela Buitrago ID:607452
  @version: 15/02/2020
``` 
public class Coseno {
```
    
@param args the command line arguments
```
    public static void main(String[] args) throws IOException {
```    
        
 A continuacion creamos BufferedReader y BufferedWriter los cuales nos
          ayudaran a leer y escribir en pantalla, son un poco mas eficientes
          que el sscaner o lector
```         
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
```        
        
          @param x Es el numero que se recibe por medio de pantalla para
          evaluar la funcion seno x
          
```         
        int x=0;
        System.out.print("ingrese el valor de x: ");
        x=Integer.parseInt(br.readLine());
```        
         
@param Suma lo usaremos conmo una variable para llevar la
          sumatoria del ciclo que se repite y asi poder determinar el
          resultado, esta variable se inicializa en 1.
         
        
@param Factorial(fac) se inicializa en 1 debido que debemos multiplicar
          esta variable por otros numero ya que si la ponemos en 0 el resultado
          seria 0, siguiendo el principio del factorial que es (a=a*z) donde a
          es factorial y z el numero del ciclo , lo que hacemos ahi es decir a
          es igual a z por a , luego al siguiente ciclo se repite lo mismo
          hasta que se multiplica 1*2*3*4*n.. hasta llegar al factorial
          deseado.
         
        
@param Contenedor Esta variable se usa para almacenar la potencia del
          x para juntar todo en la operacion final, esta variable funciona como
          un contenedor, calcula la potencia con cada ciclo del for
          almacenandose ella misma por la X.
          
@param ciclos n el numero de veces que se va a relizar la sumatoria , este
          numero no se dejo a disposicion del ususario ya que si el usuario por
          ejemplo ingresa n=1 y x=7 el exponente nos dara errado lo cual esta mal,
          por eso se determino que 10 es un n aceptable.
          
 @param ar Es el numerador de la operacion.
```         
        double sum=0;
        float fac=1;
        int ciclos=50;
        double p=1;
        double ar = 1;  
```        
        //-1^n
        
A continuacion encontramos un ciclo For desde 1 hasta n, adentro de
          el realizamos las operacions de potencia, factorial, y se calcular el
          resultado de la sumatoria en la variable resultado.
         
         
```         
        for (int n = 1; n <=ciclos; n++) {
        ar=Math.pow(-1, n);
        
        p=Math.pow(x, 2*n);
        
        for (int j = 1; j <=2*n; j++) {
               fac=fac*j;  
            }
        sum=ar/fac;
        sum=sum*p;                                                                                                                        
        }
```
       
A continuacion se imprime por pantalla el resultado de la operacion.
          
Tambien se encuentran en comentarios la impresion de los operando infividuales 
          
```       
        System.out.println("numerador total:"+ar);
        System.out.println("potencia total:"+p);
        System.out.println("Factorial total:"+fac);
        
        
        System.out.println("coseno: "+sum);
    }
    
}
```
