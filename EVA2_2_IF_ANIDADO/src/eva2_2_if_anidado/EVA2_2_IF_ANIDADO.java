/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_2_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;
        Scanner input= new Scanner(System.in);
        
        System.out.println("valor 1: ");
        valor1= input.nextInt();
        System.out.println("valor 2: ");
        valor2= input.nextInt();
        
        if(valor1 > valor2) //VERDAD   //concatenar //> es operador
            System.out.println("el valor mas grande es el " + valor1);
        else{// FALSO, EL VALOR1 NO ES MAS GRANDE QUE EL VALOR2
            //if anidado:un if dentro de otro if
            //EN JAVA
            //= ES ASIGNACION
            //== ES COMPRACION
            if(valor1 == valor2)//VERDAD
                System.out.println("ambos valores son iguales");
            else
                System.out.println("el valor mas pequeno es " + valor1);
        
        }
    }
    
}
