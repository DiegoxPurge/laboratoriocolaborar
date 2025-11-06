import java.util.Scanner;

static Scanner sc;



public  static void main(String[] args){
    int opcion;
    sc = new Scanner(System.in);
    do {
        menu();
        opcion = validaInt();
        switch (opcion){
            case 1: //EJ 1
                ej1();
                break;
            case 2: // EJ 2
                ej2();
                break;
            case 3: // EJ 3
                ej3();
                break;
            case 4: // EJ 4
                ej4();
                break;
            case 5: //EJ 5
                ej5();
                break;
            case 6: //EJ 6
                ej6();
                break;
            case 7: //EJ 7
                ej7();
                break;
            case 8: //EJ 8
                ej8();
                break;
            case 9:
                ej9();
                break;
            case 10:
                ej10();
                break;
            case 11:
                ej11();
                break;
            case 12:
                ej12();
                break;
            case 13:
                ej13();
                break;
            default: // en otro caso
                System.out.println("ERROR! opcion incorrecta");
        }
    }while (opcion!=9);
}
public static void menu(){
    System.out.println("Que quieres hacer?");
    System.out.println("1. Ejercicio 1");
    System.out.println("2. Ejercicio 2");
    System.out.println("3. Ejercicio 3");
    System.out.println("4. Ejercicio 4");
    System.out.println("5. Ejercicio 5");
    System.out.println("6. Ejercicio 6");
    System.out.println("7. Ejercicio 7");
    System.out.println("8. Ejercicio 8");
    System.out.println("9. Ejercicio 9");
    System.out.println("10. Ejercicio 10");
    System.out.println("11. Ejercicio 11");
    System.out.println("12. Ejercicio 12");
    System.out.println("13. Ejercicio 13");
    System.out.print("Introduce opcion valida");


}

public static int validaInt(){
    while (!sc.hasNextInt()){
        System.out.println("Eso no es un numero");
        sc.next();
    }
    return sc.nextInt();
}

public static void ej1(){
   /* Realiza un programa que muestre por pantalla los 20 primeros números naturales
            (1, 2, 3... 20).*/

    for (int i = 1; i < 21; i++) {
        System.out.println(i);
    }
}


public static void ej2(){
/*Realiza un programa que muestre los números pares comprendidos entre el 1 y el
200. Para ello utiliza un contador y suma de 2 en 2.*/
    int cont = 2;

    while (cont<=200){
        System.out.println(cont);
        cont = cont +2;
    }
}


public static void ej3() {
    /*Realiza un programa que muestre los números pares comprendidos entre el 1 y el
200. Esta vez utiliza un contador sumando de 1 en 1. */
    int cont = 1;


    while (cont <=200){

        if (cont % 2 == 0){
            System.out.println("N par"+ cont);
        }

        cont = cont +1;
    }
}

public static void ej4(){
/*Realiza un programa que muestre los números desde el 1 hasta un número N que se
introducirá por teclado.*/
    System.out.println("introduce un numero");
    int n1 = sc.nextInt();

    for (int i = 0; i < n1; i++) {
        System.out.println(i);
    }

}


public static void ej5(){
/*Realiza un programa que lea un número positivo N y calcule y visualice su factorial
N!
 Siendo el factorial:
 0! = 1
 1! = 1
 2! = 2 * 1
 3! = 3 * 2* 1
 N! = N * (N-1) * (N-2)........* 3*2*1
*/

    System.out.println("introduce un numero");
    int n1 = sc.nextInt();

    int fact = 1;
    for (int i = 1; i <= n1; i++) {
        fact = fact*i;

        System.out.println(fact);
    }
}


public static void ej6(){
/*Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si
ha leído algún número negativo o no*/
int n1;
    for (int i = 0; i < 10; i++) {
        System.out.println("introduzca un numero");
        n1 = sc.nextInt();

        if (n1 < 0){
            System.out.println("Numero negativo : "+ n1);
        }else{
            System.out.println("Numero positivo");
        }
    }


}


public static void ej7(){
/*
Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
indicando cuántos son positivos y cuantos negativos. */
    int n1;

    int positivo= 0;
    int negativo = 0;

    for (int i = 0; i < 10; i++) {
        System.out.println("Introduce valores negativos y positivos");
        n1 = sc.nextInt();

        if (n1 < 0){
            negativo++;
        }else {
            positivo++;
        }
    }
    System.out.println("Numeros positivos : "+ positivo);
    System.out.println("Numeros negativos : "+ negativo);
}


public static void ej8(){
/*Realiza un programa que lea una secuencia de números no nulos hasta que se
introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos
positivos y cuantos negativos.
*/
    int n1;

    int positivo = 0;
    int negativo = 0;


        for (int i = 0; i < 1000000; i++) {
            System.out.println("Introduzca numeros negativos y positivos (Se parara con el 0)");
            n1 = sc.nextInt();

                if (n1 > 0){
                    positivo++;
                } else if (n1 == 0) {
                    break;
                } else{
                    negativo++;
                }
            }
    System.out.println("Numeros positivos : "+ positivo);
    System.out.println("Numeros negativos : "+ negativo);

    System.out.println("aaa"); //Cambio Liana

    System.out.println("Hola liana");//Diego
    /* hola Diego*/
    /*Hola liana*/



}


public static void ej9(){
    System.out.println("numero 1");
    int n1= sc.nextInt();
    System.out.println("pon un numero");
    int n3= sc.nextInt();
}



public static void ej10(){

}


public static void ej11(){

}


public static void ej12(){

}


public static void ej13(){

}




