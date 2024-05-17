package s08poo;

public class Rectangulo implements Figura{
    private float base, altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return base*altura;
    }

    @Override
    public float perimetro() {
        return 2*base + 2*altura;
    }
}
