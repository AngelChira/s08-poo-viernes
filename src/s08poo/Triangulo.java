package s08poo;

public class Triangulo implements Figura{
    private float lado1, lado2, lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public float area() {
        float s = perimetro()/2;
        return (float) Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    public float area(float lado1, float lado2, float lado3) {
        float s = perimetro()/2;
        return (float) Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    public float area(float base, float altura) {
        return (base*altura)/2;
    }

    @Override
    public float perimetro() {
        return lado1 + lado2 +lado3;
    }
    
}
