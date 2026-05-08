public class Bucle_For {
    public static void main(String[] args) {
//El Bucle For Se usa cuando SÍ sabes exactamente cuántas veces vas a repetir la tarea
        // 1. Tenemos tu edad actual
        int edadHoyner = 22;

        // ESTRUCTURA DEL FOR (PASO A PASO):
        // (Donde empiezo ; Hasta donde llego ; De cuanto en cuanto sumo)
        for ( int i = edadHoyner; i<=30;i++){
            // i es nuestra variable "contador".
            // Empezará valiendo 22, luego 23, luego 24... hasta 30.

            System.out.println("Hoyner ahora tiene: " + i + " años");
        }// Aquí termina el bucle y vuelve a subir a sumar 1
        System.out.println("¡Llegaste a los 30!");
    }

}
/* // ==========================================================
        // SEGUNDA FORMA: RESTA (Hacia atrás / Cuenta regresiva)
        // ==========================================================
        // Imaginemos que Hoyner baja de peso de 67 a 60 kg.

        for (int i = pesoHoyner; i >= 60; i--) {
            // i empieza en 67, se resta 1 en cada vuelta (i--)
            System.out.println("Hoyner bajando de peso... actual: " + i + " kg");
        }
        System.out.println("¡Llegaste a tu peso meta!");
        */
/*
        // ==========================================================
        // TERCERA FORMA: SALTOS (De 2 en 2)
        // ==========================================================
        // Hoyner cuenta sus años de 2 en 2 para ver sus años pares.

        for (int i = edadHoyner; i <= 30; i += 2) {
            // i empieza en 22, se le suman 2 en cada vuelta (i += 2)
            System.out.println("Año par de Hoyner: " + i);
        }
        */