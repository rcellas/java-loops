# Recursos Java 

## Bucles
Un bucle es una estructura de control que permite repetir un bloque de código múltiples veces, basándose en una condición lógica. Hay varios tipos de bucles en Java, cada uno con su propia sintaxis y usos específicos. Los principales tipos de bucles son:

### for
Se utiliza cuando se sabe de antemano cuántas veces se debe repetir el bloque de código. La sintaxis básica es:

for (int i = 0; i < 10; i++) {
    System.out.println("El valor de i es: " + i);
}

### while
Se utiliza cuando no se sabe exactamente cuántas veces se debe repetir el bloque de código, y la condición se evalúa antes de cada iteración. La sintaxis básica es:

int i = 0;
while (i < 10) {
    System.out.println("El valor de i es: " + i);
    i++;
}

### do while
Similar al bucle while, pero la condición se evalúa después de cada iteración, garantizando que el bloque de código se ejecute al menos una vez. La sintaxis básica es:

int i = 0;
do {
    System.out.println("El valor de i es: " + i);
    i++;
} while (i < 10);

### Bucles anidados
Un bucle anidado se refiere a la estructura en la cual un bucle se encuentra dentro de otro bucle. Esto significa que el bucle interior se ejecuta completamente para cada iteración del bucle exterior. Los bucles anidados son útiles para trabajar con estructuras de datos multidimensionales, como matrices, o para resolver problemas que requieren múltiples niveles de iteración.



* For Loop
https://www.w3schools.com/java/java_for_loop.asp

* While Loop
https://www.w3schools.com/java/java_while_loop.asp

* Do While Loop
https://www.w3schools.com/java/java_while_loop_do.asp

* Break - Continue
https://www.w3schools.com/java/java_break.asp

* Nested Loop
https://www.w3schools.com/java/java_for_loop_nested.asp
