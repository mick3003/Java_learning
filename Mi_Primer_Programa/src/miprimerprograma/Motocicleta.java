package miprimerprograma;

public class Motocicleta extends Vehiculo {
     int numRuedas = 2;

public void arrancarMotor() {
    super.arrancarMotor();
    System.out.println("Avería de motor");
    }
}
