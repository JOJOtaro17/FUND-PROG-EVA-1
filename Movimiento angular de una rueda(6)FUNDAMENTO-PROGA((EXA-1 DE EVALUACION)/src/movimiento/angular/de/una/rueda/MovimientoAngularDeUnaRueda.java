/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movimiento.angular.de.una.rueda;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class MovimientoAngularDeUnaRueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velinicial;
        double velfinal;
        double tiemporota;
        double radiorueda;
        double distanangular;
        double distanmetro;
        double velangularprom;
        double velmetrosporseg;
        double acelangular;
        double acelmetrosporsegcuadrado;
        double frecuenciagiro;
        Scanner captu = new Scanner(System.in);
        System.out.println("ingrese la veloidad inicial");
        velinicial= captu.nextDouble();
        System.out.println("ingrese la veloidad final");
        velfinal= captu.nextDouble();
        System.out.println("ingrese el tiempo de rotacion");
        tiemporota= captu.nextDouble();
        System.out.println("ingrese el radio de la rueda");
        radiorueda= captu.nextDouble();
        distanangular=(velinicial+velfinal)*tiemporota/2;
        distanmetro=distanangular*radiorueda;
        velangularprom=distanangular/tiemporota;
        velmetrosporseg=distanmetro/tiemporota;
        acelangular=(velfinal-velinicial)/tiemporota;
        frecuenciagiro=velfinal/(2*3.1416);
        System.out.println("Distancia angular recorrida:");
        System.out.println(distanangular);
        System.out.println("Distancia en metros recorridas:");
        System.out.println(distanmetro);
        System.out.println("Velocidad angular:");
        System.out.println(velangularprom);
        System.out.println("Velocidad en m/s promedio:");
        System.out.println(velmetrosporseg);
        System.out.println("Aceleracion angular:");
        System.out.println(acelangular);
        System.out.println("Distancia angular recorrida:");
        System.out.println(frecuenciagiro+"hertz");
        
    }
    
}
