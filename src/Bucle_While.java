public class Bucle_While {
    public static void main(String[] args){

//BUCLE WHILE Se usa cuando no sabes exactamente cuántas veces vas a repetir algo.
// Solo sabes que mientras una condición sea verdad, debes seguir.
      //crear una varibale con mi peso
      double PesoHoyner = 67;

      //Plabra clave (condicion se cumple){
        // se ejecuta una accion
        // colocar un enunciado para cumplir la condicion de arriba y detener el bucle}

        while (PesoHoyner>65){
            System.out.println("Debes hacer ejercicio, tu peso es: "+ PesoHoyner+" sigue entrenando");
           //si cada semana bajo 0.5 kg
            PesoHoyner = PesoHoyner- 0.5;
        }
        System.out.println("Meta alcanzada ahora Hoyner pesa: " + PesoHoyner);
    }
}
