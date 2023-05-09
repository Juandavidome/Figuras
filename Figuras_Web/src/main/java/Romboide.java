
public class Romboide extends Figuras
{
    private double base;
    private double altura;
    private double totalRomboide;
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getTotalRomboide() {
        return totalRomboide;
    }
    public void setTotalRomboide(double totalRomboide) {
        this.totalRomboide = totalRomboide;
    }
    public Romboide(double base, double altura, double lados, double tamañoLados, double total, double base2,
            double altura2, double totalRomboide) {
        super(base, altura, lados, tamañoLados, total);
        base = base2;
        altura = altura2;
        this.totalRomboide = totalRomboide;
    }
    public void calcularAreaRomboide()
    {
        System.out.println("Registre la base para calcular el area");
        base=lectura.nextInt();
        System.out.println("Registre la altura para calcular el area");
        altura= lectura.nextDouble();
        totalRomboide= (base*altura);
        System.out.println("El area del Romboide es de: "+totalRomboide+"");
    }
    public void mostrarDatos()
    {
        System.out.println("El perimetro del romboide es: "+getTotal()+" y el area es: "+totalRomboide+"");
    }
    
}
