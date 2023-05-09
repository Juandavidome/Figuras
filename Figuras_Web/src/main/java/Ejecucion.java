
import java.util.Scanner;

public class Ejecucion 
{
    
    
    public static void main(String[] args) 
    {
        Ejecucion ejecucion = new Ejecucion();
        ejecucion.programa();
    }
    public void programa()
    {
        int seleccion, repetir;
        Scanner scanner = new Scanner(System.in);
        Mensajes mensajes = new Mensajes();
        mensajes.MensajeInicio();
        repetir = scanner.nextInt();
        do
        {
            repetir --;
            mensajes.MensajeEscoger();
            seleccion = scanner.nextInt();
        switch(seleccion)
        {
            case 1:
            {
                Deltoide deltoide = new Deltoide(0, 0, 0, 0, 0, 0, 0, 0);
                System.out.println("DELTOIDE");
                deltoide.calcularPerimeto();
                deltoide.calcularAreaDeltoide();
                deltoide.mostrarDatos();
                break;
            }
            case 2: 
            {
                Romboide romboide = new Romboide(0, 0, 0, 0, 0, 0, 0, 0);
                System.out.println("ROMBOIDE");
                romboide.calcularPerimeto();
                romboide.calcularAreaRomboide();
                romboide.mostrarDatos();
                break;
            }
            case 3:
            {
                Eneagono eneagono = new Eneagono(0, 0, 0, 0, 0, 0);
                System.out.println("ENEAGONO");
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