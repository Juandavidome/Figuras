
public class Eneagono extends Figuras
{
    private double apotema;
    private double totalEneagono;
    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getTotalEneagono() {
        return totalEneagono;
    }

    public void setTotalEneagono(double totalEneagono) {
        this.totalEneagono = totalEneagono;
    }

    public Eneagono(double base, double altura, double lados, double tamañoLados, double total, double apotema) {
        super(base, altura, lados, tamañoLados, total);
        this.apotema = apotema;
    }
    public void calcularAreaEneagono()
    {
        System.out.println("Por favor ingrese el apotema de la figura:");
        apotema = lectura.nextDouble();
        totalEneagono = (getTotal()*apotema/2);
        System.out.println("El area de la figura es de: "+totalEneagono+"");

    }

    
    
}
