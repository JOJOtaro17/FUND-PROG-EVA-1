/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacion;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class Ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        double pendiente;
        double area;
        double x1;
        double x2;
        Scanner captu = new Scanner(System.in);
        System.out.println("y=x^2");
        System.out.println("1.Calcular la pendiente para un valor de x");
        System.out.println("ingrese el valor de x para calcular la pendiente: ");
        x=captu.nextDouble();
        pendiente=2*x;
        System.out.println(pendiente);
        System.out.println("2.Calcular el area entre dos valores de x");
        System.out.println("ingrese el primer valor de x para calcular el area: ");
        x1= captu.nextDouble();
        System.out.println("ingrese el segundo valor de x para calcular el area: ");
        x2= captu.nextDouble();
        area=(Math.pow(x2,3)- Math.pow(x1,3))/3;
        System.out.println("el area es y="+area);
    }  
}
