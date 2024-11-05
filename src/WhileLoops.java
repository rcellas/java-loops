public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber



        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        


        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber

    
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
