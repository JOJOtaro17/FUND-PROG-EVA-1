/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hiperbola;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class Hiperbola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double h;
        double k;
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double y1;
        double y2;
        double f1x;
        double f2x;
        double f1y;
        double f2y;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la coordenada del centro");
        h= captu.nextDouble();
        System.out.println("introduce la coordenada del centro");
        k= captu.nextDouble();
        System.out.println("introduce el valor en eje x");
        a= captu.nextDouble();
        System.out.println("introduce el valor en el eje y");
        b= captu.nextDouble();
        c= Math.sqrt(a*a + b*b);
        System.out.println("la distacia del foco es: ");
        System.out.println(c);
        x1=h+a;
        x2=h-a;
        y1=k;
        y2=k;
        System.out.println("las coordenadas de los vertices son");
        System.out.println("vertice1: " +x1);
        System.out.println(y1);
        System.out.println("vertice2: " +x2);
        System.out.println(y2);
        f1x=h+c;
        f2x=h-c;
        f1y=k;
        f2y=k;
        System.out.println("las coordenadas de los focos son");
        System.out.println("foco1: " +f1x);
        System.out.println(f1y);
        System.out.println("foco2: " +f2x);
        System.out.println(f2y);
        
    }
    
}
