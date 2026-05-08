//Este es especial. Se asegura de que la tarea se haga al menos una vez,
// y recién después pregunta si debe seguir.

public class Bucle_DoWhile {
    public static void main(String[] args) {

        // DATOS DE HOYNER
        String nombre = "Hoyner";
        int temasEstudiados = 0;
        boolean cansado = false; // Esta es nuestra "llave" para detener el bucle

        System.out.println("--- INICIO DE LA SESIÓN DE ESTUDIO ---");

        // ESTRUCTURA: Primero el bloque 'do', luego la condición 'while'
        do {
            // 1. ACCIÓN: Lo que se hace sin preguntar la primera vez
            temasEstudiados++; // Hoyner estudia un tema (suma 1)
            System.out.println(nombre + " ha estudiado el tema #" + temasEstudiados);

            // 2. EL PARE: Decidimos cuándo parar
            if (temasEstudiados == 3) {
                cansado = true; // Si ya estudió 3 temas, se cansa
            }

        } while (cansado == false);
        // ¡OJO! El do-while es el único que lleva punto y coma (;) al final del while.

        System.out.println("Hoyner terminó por hoy porque está cansado.");
    }
}
