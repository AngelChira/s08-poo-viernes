package s08poo;

public class S08POO {

    public static void main(String[] args) {
//        Con clases
//        Auto auto = new Auto();
//        GestionVehiculo ga = new GestionVehiculo(auto);
//        ga.conducirAuto();
//        Bicicleta bici = new Bicicleta();
//        GestionVehiculo gb = new GestionVehiculo(bici);
//        gb.conducirBicicleta();

//        Con interface
//        mia
//        System.out.println("------------------");
//        IVehiculo auto = new Auto();
//        auto.conducir();
//        IVehiculo bici = new Bicicleta();
//        bici.conducir();
//        System.out.println("------------------\n");
        
//        Clase
//        System.out.println("------------------");
//        GestionVehiculo ga = new GestionVehiculo(new Auto());
//        ga.conducir();
//        GestionVehiculo gc = new GestionVehiculo(new Bicicleta());
//        gc.conducir();
//        System.out.println("------------------");
        
//        Con Interface
        Figura cuadrado = new Cuadrado(5);
        Figura rectangulo = new Rectangulo(4, 6);
        Figura circulo = new Circulo(3);
        Figura triangulo = new Triangulo(3, 4, 5);
        Figura cubo = new Cubo(10);
        resultado(cuadrado);
        resultado(rectangulo);
        resultado(circulo);
        resultado(triangulo);
        resultado(cubo);
    }
    
    public static void resultado(Figura figura) {
        System.out.println("Area: "+ figura.area());
        System.out.println("Perimetro: "+ figura.perimetro());
        if (figura instanceof FiguraEspacio) {
            System.out.println("Volumen: " +((FiguraEspacio) figura).volumen());
        }
        System.out.println("\n");
    }
}