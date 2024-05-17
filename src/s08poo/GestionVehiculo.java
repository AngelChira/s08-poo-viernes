package s08poo;

public class GestionVehiculo {
//    Con clases
//    private Auto auto;
//    private Bicicleta bicicleta;

//    public GestionVehiculo(Auto auto) {
//        this.auto = auto;
//    }
//
//    public GestionVehiculo(Bicicleta bicicleta) {
//        this.bicicleta = bicicleta;
//    }
//    
//    public void conducirAuto(){
//        auto.conducir();
//    }
//    
//    public void conducirBicicleta(){
//        bicicleta.conducir();
//    }
    
//    Con interface
    private IVehiculo vehiculo;

    public GestionVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void conducir() {
        vehiculo.conducir();
    }
}
