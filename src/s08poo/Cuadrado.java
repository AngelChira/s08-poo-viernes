package s08poo;

public class Cuadrado implements Figura{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado * lado;
    }

    @Override
    public float perimetro() {
        return 4*lado;
    }
    
}
