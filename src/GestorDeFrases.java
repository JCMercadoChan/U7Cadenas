import java.util.Scanner;

// Sigue las instrucciones especificadas en el archivo readme.txt del repositorio
// para completar el siguiente código, donde se utilizan los métodos de String y StringBuilder
// analizados en el pdf "7. Gestión de Cadenas".

public class GestorDeFrases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Parte 1: Operaciones con String

        // 1. Solicitar al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        String frase1 = sc.nextLine();

        // 2. Mostrar la longitud de la frase (usar length())
        System.out.println("Longitud de la frase: ");

        // 3. Mostrar el primer y el último carácter (usar charAt())
        System.out.println("Primer carácter: ");
        System.out.println("Último carácter: ");

        // 4. Convertir y mostrar la frase en mayúsculas y en minúsculas (usar toUpperCase(), toLowerCase())
        System.out.println("Frase en mayúsculas: ");
        System.out.println("Frase en minúsculas: ");

        // 5. Verificar si comienza con "Hola" y si termina con "adiós" (usar startsWith(), endsWith())
        System.out.println("¿Comienza con 'Hola'?: ");
        System.out.println("¿Termina con 'adiós'?: ");

        // 6. Verificar si contiene la palabra "Java" (usar contains())
        System.out.println("¿Contiene la palabra 'Java'?: ");

        // 7. Buscar la primera y última aparición de la letra 'a' (usar indexOf(), lastIndexOf())
        System.out.println("Posición de la primera aparición de 'a': ");
        System.out.println("Posición de la última aparición de 'a': ");

        // 8. Pedir una segunda frase al usuario
        System.out.println("Ingrese una segunda frase para comparar:");
        String frase2 = sc.nextLine();

        // 9. Comparar ambas frases (usar equals(), equalsIgnoreCase(), compareTo())
        System.out.println("¿Son iguales?: ");
        System.out.println("¿Son iguales ignorando mayúsculas?: ");
        System.out.println("Resultado de compareTo: ");

        // 10. Eliminar espacios al inicio y fin (usar trim())
        System.out.println("Frase sin espacios al inicio/final: ");

        // 11. Reemplazar todas las letras "a" por "@" (usar replace())
        System.out.println("Frase con 'a' reemplazada por '@': ");

        // 12. Extraer y mostrar subcadena del carácter 5 al 10 (usar substring())
        System.out.println("Subcadena del carácter 5 al 10: ");

        // 13. Convertir frase en arreglo de caracteres y mostrarlo (usar toCharArray())
        System.out.println("Arreglo de caracteres: ");

        /*********************************************************************************
         ** Parte 2: Uso de StringBuilder
         *********************************************************************************/

        // 1. Crear un StringBuilder a partir de la frase (usar new StringBuilder())
        // 2. Agregar " ¡Bienvenido a Java!" al final (usar append())
        System.out.println("Resultado tras usar append(): ");

        // 3. Insertar "programador " al inicio (usar insert())
        System.out.println("Resultado tras usar insert(): ");

        // 4. Reemplazar "Java" por "la programación" (usar indexOf() y replace())
        System.out.println("Resultado tras reemplazar 'Java': ");

        // 5. Eliminar los primeros 5 caracteres (usar delete())
        System.out.println("Resultado tras eliminar primeros 5 caracteres: ");

        // 6. Invertir la frase (usar reverse())
        System.out.println("Frase invertida: ");

        // 7. Mostrar la capacidad y longitud (usar capacity(), length())
        System.out.println("Capacidad del StringBuilder: ");
        System.out.println("Longitud actual del StringBuilder: ");

        // 8. Truncar la frase a 20 caracteres si es necesario (usar setLength())
        System.out.println("Frase truncada a 20 caracteres: ");

        sc.close();
    }
}