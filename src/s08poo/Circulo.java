package s08poo;

public class Circulo implements Figura {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return PI*radio*radio;
    }

    @Override
    public float perimetro() {
        return 2*PI*radio;
    }
    
}
