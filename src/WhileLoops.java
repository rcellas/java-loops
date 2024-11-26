import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7
        //Has de usar la función getRandomNumber

        int diceRoll = -1;
        while(diceRoll != 7){
            diceRoll = getRandomNumber(10);
            System.out.println(diceRoll);
        }


        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70
        //Has de usar la función getRandomNumber
        int randomNum = 1;
        while (randomNum < 70) {
            randomNum = getRandomNumber(100);
            System.out.println(randomNum);
        }

        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100 (usando la función getRandomNumber). El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado.

        Scanner scanner = new Scanner(System.in);
        int secretNumber = getRandomNumber(100);
        int userChoice;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            userChoice = scanner.nextInt();

            if (userChoice < secretNumber) {
                System.out.println("El número es mayor.");
            } else if (userChoice > secretNumber) {
                System.out.println("El número es menor.");
            }
        } while (userChoice != secretNumber);

        System.out.println("¡Felicidades! Has adivinado el número.");
        scanner.close();
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