package Figuras;
public class Deltoide extends Figuras
{
    private double diagonalMayor;
    private double diagonalMenor;
    private double totalDeltoide;
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public double getTotalDeltoide() {
        return totalDeltoide;
    }
    public void setTotalDeltoide(double totalDeltoide) {
        this.totalDeltoide = totalDeltoide;
    }
    public Deltoide(double base, double altura, double lados, double tamañoLados, double total,
            double diagonalMayor, double diagonalMenor, double totalDeltoide) {
        super(base, altura, lados, tamañoLados, total);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.totalDeltoide=totalDeltoide;
    }

    public void calcularAreaDeltoide()
    {
        System.out.println("Ingrese el diagonal mayor del deltoide:");
        diagonalMayor=lectura.nextDouble();
        System.out.println("Ingrese el diagonal menor del deltoide:");
        diagonalMenor=lectura.nextDouble();
        totalDeltoide=(diagonalMayor*diagonalMenor)/2;
        System.out.println("El area del deltoide es de: "+totalDeltoide+"");
    }
    public void mostrarDatos()
    {
        System.out.println("El perimetro del deltoide es: "+getTotal()+" y el area es: "+totalDeltoide+"");

    }

}
