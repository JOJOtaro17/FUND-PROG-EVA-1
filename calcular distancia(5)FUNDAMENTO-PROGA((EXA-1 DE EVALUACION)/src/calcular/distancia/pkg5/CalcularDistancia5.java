/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular.distancia.pkg5;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class CalcularDistancia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velinicial;
        double anguloRAD=45;
        double aceleracion=9.81;
        double alturaMax;
        double distanhorizontal;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la velocidad inicial");
        velinicial= captu.nextDouble();
        alturaMax=(Math.pow(velinicial,2)*Math.pow(Math.sin(anguloRAD),2))/(2*aceleracion);
        distanhorizontal=(Math.pow(velinicial,2)*Math.sin(2*anguloRAD))/aceleracion;
        System.out.println("La altura maxima alcanzada es:");
        System.out.println(alturaMax);
        System.out.println("La distancia horizontal alcanzada es:");
        System.out.println(distanhorizontal);
    }
    
}
