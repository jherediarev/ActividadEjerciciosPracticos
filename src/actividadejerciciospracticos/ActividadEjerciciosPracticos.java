/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadejerciciospracticos;
import java.util.Scanner;

/**
 *
 * @author Johnny Reveles
 */
public class ActividadEjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Encabezado();
        
        
        Cuerpo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elige el ejercicio que desees realizar escribiendo su número asignado: \nCódigo Morse         (1) \nStar Wars            (2) \nQuizz Java           (3)");
        int numero = entrada.nextInt();
        elegir(numero);
        Pie();
        
    }
    
    public static void elegir(int numElegido){
        Scanner entrada = new Scanner(System.in);
        switch(numElegido){
            case 1:
                System.out.println("Introduce una frase \nMenos de 5 palabras: $10 \nPalabra extra:       $3");
                String frase = entrada.nextLine().toUpperCase();
                char carFrase[] = frase.toCharArray();
                arrayList();
                bucle(frase, carFrase);
                System.out.println(Pago(frase, carFrase));
                break;
            case 2:
                System.out.println("Introduce un género de los siguientes para revelar a los personages de Star Wars que pertenezcan a ese tipo, también se incluirá la estatura de cada uno");
                System.out.println("1. male \n2. female \n3. n/a \n4. hermaphrodite");
                String genero = entrada.nextLine();
                Personajes();
                recorrido(genero);
                break;
            case 3:
                preguntasJava();
                incisosJava();
                recorrido();
                System.out.println();

                System.out.println("Tu calificación es " + contador + " / 10");
                break;
            default:
                System.out.println("Introduce un numero correcto por favor");
        }
    }
    
    
    public static void Encabezado(){
    
        System.out.println("-----------------------------------------------------");  
        System.out.println("         UNIVERSIDAD AUTÓNOMA DE CAMPECHE            ");
        System.out.println("              Facultad de Ingeniería           ");
        System.out.println("      Ingeniería en Sistemas Computacionales   ");
        System.out.println("-----------------------------------------------------"); 
        
        }
    
    
    // CUERPO
    
    public static void Cuerpo(){
    
 
        System.out.println("              Lenguaje de programación I             "); 
        System.out.println("-----------------------------------------------------");
        System.out.println("        Alumno: Johnny Abjomar Heredia Reveles       ");
        System.out.println("-----------------------------------------------------");
        
    }
    
    // PIE
    
    public static void Pie(){
    
        System.out.println("-----------------------------------------------------");
        System.out.println("                                           ABRIL 2021"); 
    
    }
    
    public static String[][] aMorse;
    
    public static void arrayList(){
        aMorse = new String[26][2];
        
        // ALFABETO
        aMorse[0][0] = "A";
        aMorse[1][0] = "B";
        aMorse[2][0] = "C";
        aMorse[3][0] = "D";
        aMorse[4][0] = "E";
        aMorse[5][0] = "F";
        aMorse[6][0] = "G";
        aMorse[7][0] = "H";
        aMorse[8][0] = "I";
        aMorse[9][0] = "J";
        aMorse[10][0] = "K";
        aMorse[11][0] = "L";
        aMorse[12][0] = "M";
        aMorse[13][0] = "N";
        aMorse[14][0] = "O";
        aMorse[15][0] = "P";
        aMorse[16][0] = "Q";
        aMorse[17][0] = "R";
        aMorse[18][0] = "S";
        aMorse[19][0] = "T";
        aMorse[20][0] = "U";
        aMorse[21][0] = "V";
        aMorse[22][0] = "W";
        aMorse[23][0] = "X";
        aMorse[24][0] = "Y";
        aMorse[25][0] = "Z";
        
        // MORSE
        aMorse[0][1] = ".-";
        aMorse[1][1] = "-...";
        aMorse[2][1] = "-.-.";
        aMorse[3][1] = "-..";
        aMorse[4][1] = ".";
        aMorse[5][1] = "..-.";
        aMorse[6][1] = "--.";
        aMorse[7][1] = "...";
        aMorse[8][1] = "..";
        aMorse[9][1] = ".---";
        aMorse[10][1] = "-.-";
        aMorse[11][1] = ".-..";
        aMorse[12][1] = "--";
        aMorse[13][1] = "-.";
        aMorse[14][1] = "---";
        aMorse[15][1] = ".--.";
        aMorse[16][1] = "--.-";
        aMorse[17][1] = ".-.";
        aMorse[18][1] = "...";
        aMorse[19][1] = "-";
        aMorse[20][1] = "..-";
        aMorse[21][1] = "...-";
        aMorse[22][1] = ".--";
        aMorse[23][1] = "-..-";
        aMorse[24][1] = "-.--";
        aMorse[25][1] = "--..";
    }

    public static String caracter(char car) {
        int numCa = (int) car;
        return aMorse[numCa - 65][0] + " " + aMorse[numCa - 65][1];
    }
    
    public static void bucle(String frase, char carFrase[]){
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                System.out.println("");
            } else {
                System.out.println(caracter(carFrase[i]));
            }
        }
    }
    
    public static String Pago(String frase, char carFrase[]){
        int contador = 1;
        int precio = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                contador++;
            }
        }

        if(contador <= 5){
            precio = 10;
        } else{
            precio = ((contador - 5) * 3) + 10;
        }
        return "Numero de palabras: " + contador + "\n" + "Total a pagar: $" + precio;
    }
    
    static String[][] aPersonajes; 
    static String sexo;
    
    public static void Personajes(){
        
        aPersonajes = new String[16][3];
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172 cm";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96 cm";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167 cm";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202 cm";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150 cm";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178 cm";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165 cm";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97 cm";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183 cm";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182 cm";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66 cm";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180 cm";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175 cm";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180 cm";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228 cm";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188 cm";
        aPersonajes[15][2] = "male"; 
    }
    
    public static void recorrido(String genero){
        sexo = genero;
        
        for (int i = 0; i < aPersonajes.length; i++) {
            if(aPersonajes[i][2].equals(sexo)){
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }
    
    public static String[][] Preguntas;
    public static String[][] Incisos;
    public static int contador;

    public static void preguntasJava() {
        Preguntas = new String[10][2];
        Preguntas[0][0] = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        Preguntas[0][1] = "0";
        Preguntas[1][0] = "¿Cómo se insertan comentarios de una línea en Java?";
        Preguntas[1][1] = "1";
        Preguntas[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        Preguntas[2][1] = "2";
        Preguntas[3][0] = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        Preguntas[3][1] = "0";
        Preguntas[4][0] = "¿Qué operador se utiliza para comparar dos valores?";
        Preguntas[4][1] = "1";
        Preguntas[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        Preguntas[5][1] = "2";
        Preguntas[6][0] = "¿Qué instrucción se usa para crear una clase en Java?";
        Preguntas[6][1] = "0";
        Preguntas[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? ";
        Preguntas[7][1] = "1";
        Preguntas[8][0] = "¿Cuál es el operador que se utiliza para multiplicar números?";
        Preguntas[8][1] = "2";
        Preguntas[9][0] = "¿Cómo se inicia la sentencia if en Java?";
        Preguntas[9][1] = "0";
    }

    public static void incisosJava() {
        Incisos = new String[10][3];
        Incisos[0][0] = "System.out.println( Hello World );";
        Incisos[0][1] = "echo( Hello World );";
        Incisos[0][2] = "print ( Hello World );";
        Incisos[1][0] = "/* This is a comment";
        Incisos[1][1] = "// This is a comment";
        Incisos[1][2] = "# This is a comment";
        Incisos[2][0] = "myString";
        Incisos[2][1] = "string";
        Incisos[2][2] = "String";
        Incisos[3][0] = "int x = 5;";
        Incisos[3][1] = "num x = 5";
        Incisos[3][2] = "x = 5;";
        Incisos[4][0] = "><";
        Incisos[4][1] = "==";
        Incisos[4][2] = "<>";
        Incisos[5][0] = "{}";
        Incisos[5][1] = "()";
        Incisos[5][2] = "[]";
        Incisos[6][0] = "class";
        Incisos[6][1] = "MyClass";
        Incisos[6][2] = "class()";
        Incisos[7][0] = "class MyClass = new myObj();";
        Incisos[7][1] = "MyClass myObj = new MyClass();";
        Incisos[7][2] = "new myObj = MyClass();";
        Incisos[8][0] = "%";
        Incisos[8][1] = "X";
        Incisos[8][2] = "*";
        Incisos[9][0] = "if (x > y)";
        Incisos[9][1] = "if x > y;";
        Incisos[9][2] = "if x > y then;";
    }

    public static void recorrido(){
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < Preguntas.length; i++) {
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(Preguntas[i][0]);
            System.out.println("0.- " + Incisos[i][0]);
            System.out.println("1.- " + Incisos[i][1]);
            System.out.println("2.- " + Incisos[i][2]);
            System.out.println();
            System.out.print("Escribe la respuesta correcta: ");
            respuesta = entrada.nextLine();
            if(Preguntas[i][1].equals(respuesta)){
                contador++;
            }
        }
    }
    
    public static int contador(){
        return contador;
    }
    
}