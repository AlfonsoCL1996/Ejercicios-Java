/*
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.------------------------------OK
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).-----------------------------------OK
 * - Crea una variable (y una constante si el lenguaje lo soporta).-------------OK
 * - Crea variables representando todos los tipos de datos primitivos----------OK
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"------OK
 */

public class ejercicio00 {

    private static final int MI_CONSTANTE_GLOBAL = 1;   //Constante privada, pertenece a la clase y es inmutable
    public static final int MI_CONSTANTE_GLOBAL_2 = 2;  //Constante publica, pertenece a la clase y es inmutable
    public final int MI_CONSTANTE_GLOBAL_3 = 3; //Constante publica (accesible desde cualquier clase), inmutable, y como no tiene static cada objeto tendra una copia de esta constante.

    public static void main(String[] args) {
        /**
         * Java official website: https://www.java.com/es/
         * Comentario Javadoc
         */

        /* Comentario
        en
        bloque */

        //Comentario unico

        final int miConstanteLocal = 4; //Constante local, solo dentro del metodo main.
        int miVariable = 1; //Variable

        byte numeritoChiquitito = 0;
        short numerito = 12;
        int numero = 1000;
        long numeroGrande = 1000000;

        float decimalPeque = 1.5f;
        double decimalGrandote = 1225.62926;

        char c = 'c';
        String miString = "Cadena literal";

        boolean siono = true;

        System.out.println("Hola, java");

    }
}