import java.util.Scanner;
public class Figuras 
{
    public static void main(String[] args) 
    {
      
    }
    private double base;
    private double altura;
    private double lados;
    private double tamañoLados;
    private double total;
    Scanner lectura=new Scanner(System.in);
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLados() {
        return lados;
    }
    public void setLados(double lados) {
        this.lados = lados;
    }
    
    public Figuras(double base, double altura, double lados, double tamañoLados, double total) {
        this.base = base;
        this.altura = altura;
        this.lados = lados;
        this.tamañoLados = tamañoLados;
        this.total = total;
    }
    public void calcularPerimeto()
    {
        System.out.println("Registre los lados que desea sumar para el perimetro:");
        lados=lectura.nextDouble();
        System.out.println("Digite el valor de los lados iguales que desea sumar para el perimetro:");
        tamañoLados=lectura.nextDouble();
        total= lados*tamañoLados;        
        System.out.println("El perimetro de la figura es: "+total+"");
    }
}

