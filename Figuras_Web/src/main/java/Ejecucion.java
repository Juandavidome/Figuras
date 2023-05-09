package Figuras;

import java.util.Scanner;

public class Ejecucion 
{
    public static void main(String[] args) 
    {
        int seleccion, repetir;
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Seleccione cuantas veces desea repetir el programa:");
        repetir = scanner.nextInt();
        do
        {
            repetir --;
        System.out.println("Seleccione que figura desea escoger para hallar el perimetro y el area.");
        System.out.println("Seleccione \n1.Si desea escoger DELTOIDE \n2.Si desea escoger ROMBOIDE \n3.Si desea escoger ENEAGONO");
        seleccion = scanner.nextInt();
        switch(seleccion)
        {
            case 1:
            {
                Deltoide deltoide = new Deltoide(0, 0, 0, 0, 0, 0, 0, 0);
                System.out.println("------------------------------------");
                System.out.println("DELTOIDE");
                System.out.println("------------------------------------");
                deltoide.calcularPerimeto();
                deltoide.calcularAreaDeltoide();
                deltoide.mostrarDatos();
                break;
            }
            case 2: 
            {
                Romboide romboide = new Romboide(0, 0, 0, 0, 0, 0, 0, 0);
                System.out.println("------------------------------------");
                System.out.println("ROMBOIDE");
                System.out.println("------------------------------------");
                romboide.calcularPerimeto();
                romboide.calcularAreaRomboide();
                romboide.mostrarDatos();
                break;
            }
            case 3:
            {
                Eneagono eneagono = new Eneagono(0, 0, 0, 0, 0, 0);
                System.out.println("------------------------------------");
                System.out.println("ENEAGONO");
                System.out.println("------------------------------------");
                eneagono.calcularPerimeto();
                eneagono.calcularAreaEneagono();
                break;
            }
        }
        }while(repetir>0&&repetir<100000);
        System.out.println("FIN DEL POGRAMA");
        scanner.close();
    }
}