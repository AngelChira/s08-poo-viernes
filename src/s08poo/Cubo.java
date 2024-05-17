package s08poo;

public class Cubo implements FiguraEspacio {
    private float arista;

    public Cubo(float arista) {
        this.arista = arista;
    }

    @Override
    public float volumen() {
        return arista*arista*arista;
    }

    @Override
    public float area() {
        return 6*arista*arista;
    }

    @Override
    public float perimetro() {
        return 12*arista;
    }
    
}
