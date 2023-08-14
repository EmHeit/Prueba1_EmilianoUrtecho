/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1_emilianourtecho;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Prueba1_EmilianoUrtecho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escan = new Scanner(System.in);
        
        System.out.println("        ~Menu~");
        System.out.println("    1. Repetir mi nombre");
        System.out.println("    2. Submenu de mensajes");
        System.out.println("    3. SALIR");
        System.out.print("Que desea ver?");
        int eleccion = escan.nextInt();
        int cont_eleccion = 0;
        
        do {
            
            switch(eleccion){
                case 1: //Repetir mi nombre
                    System.out.print("Ingrese su nombre: ");
                    String nombre = escan.nextLine();
                    nombre = escan.nextLine();
                    System.out.print("Cuantas veces desea repetir su nombre?: ");
                    int n_nombre = escan.nextInt();
                    
                    String nombreRepetido = "Hola mi nombre es "+nombre+" y miren mi prueba!"; 
                    for (int i = 0; i < n_nombre; i++) {
                        System.out.println(nombreRepetido); //solo repetir el string que ya asigne(no tengo tildes en mi teclado). 
                    }
                    
                    break;
                case 2://Sub menu de mensajes
                    System.out.println("       ~Sub Menu~");
                    System.out.println("1. Bienvenida");
                    System.out.println("2. Despedida");
                    System.out.println("3. SALIR del submenu");
                    System.out.print("Que desea ver?");
                    int eleccionsub2 = escan.nextInt();
                    
                    do {
                        switch(eleccionsub2){
                            case 1:
                                System.out.println("Buenas Noches");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa");
                                break;
                            case 3:
                                System.out.println("Si quiere salir del submenu, presione otra vecz la tecla.");
                                break;
                            default:
                                System.out.println("Hmm no puedo leer eso, lo siento :(");
                                break;
                        }
                        System.out.println("       ~Sub Menu~");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        System.out.println("3. SALIR del submenu");
                        System.out.print("Que desea ver?");
                        eleccionsub2 = escan.nextInt();
                    } while (eleccionsub2!=3);
                    break;
                case 3:
                    System.out.println("Vuelva a presionar el boton para salir del cilco");
                    break;
                default:
                    System.out.println("Hmm, no puedo leer eso, por favor vuelva a presionar otra tecla");
                    break;
            }

        System.out.println("        ~Menu~");
        System.out.println("    1. Repetir mi nombre");
        System.out.println("    2. Submenu de mensajes");
        System.out.println("    3. SALIR");
        System.out.print("Que desea ver?");
        eleccion = escan.nextInt();
        cont_eleccion++;
        
            
        } while (eleccion != 3);
        System.out.println("“Adiós, está fue mi prueba”");
        System.out.println("Numero de veces que se repitio el menu principal: "+cont_eleccion);
        
    }
    
}
