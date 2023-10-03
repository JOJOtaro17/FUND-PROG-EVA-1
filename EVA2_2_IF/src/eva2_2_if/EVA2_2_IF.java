/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_if;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_2_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input= new Scanner(System.in);
        System.out.println("Introduce la calificacion");
        califa= input.nextInt();
        
        if(califa>=70){//if(expresion a evaluar)ESTO SE EJECUTA SI ES VERDADERO
            System.out.println("Aprobaste!!");
        System.out.println("quema tus apuntes");
        }else{          //ESTO SE EJECUTA SI ES FALSO. ES OPCIONAL
            System.out.println("No aprobaste");
        }
    }
    
}
