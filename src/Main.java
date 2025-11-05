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
             //   ej2();
                break;
            case 3: //EJ 3
                ej3();
                break;
            case 4: //EJ 4
                ej4();
                break;
            case 5: //EJ 5
                ej5();
                break;
            case 6://EJ 6
                ej6();
                break;
            case 7://EJ 7
                ej7();
                break;
            case 8://EJ 8
                ej8();
                break;
           /* case 9://EJ 9
                ej9();
                break;*/

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
    System.out.print("Introduce opcion valida");


}

public static int validaInt(){
    while (!sc.hasNextInt()){
        System.out.println("Eso no es un numero");
        sc.next();
    }
    return sc.nextInt();
}
//Realiza un programa que cuente los multiplos de 3 desde el 1 hasta un numero que introduzcamos por teclado.
public static void ej1(){
    int n1, cont;
    System.out.println("Introduce un numero (Multiplo de 3:");
    n1 = validaInt();
    cont = 0;

    {
      for (int i = 1; i <= n1; i++){
          if (i % 3 == 0){cont++;

          }
      }
        System.out.println("Cantidad multiplos: "+ cont);
    }
}

public static void ej2(){
    System.out.println("Introduce un numero entero positivo: ");
    int numero = sc.nextInt();
    int contador = 0;
    for (int i = 1; i <=  numero; i++) {
        if (numero % i == 0){
            contador++;
        }
        if (contador==2){
            System.out.println("El numero SI es primo.");
        }else {
            System.out.println("El numero NO es primo");
        }
    }
}

public static void ej3(){

    int n1, n2;

    System.out.println("Introduce un numero inicial ");
     n1 = sc.nextInt();
    for (int i = 0; i != n1;i++){
    do {
        System.out.println("Introduce un numero :");
        n2 = sc.nextInt();
        if (n2 == n1){

            break;
        }
        if (n1 > n2 ){
        i++;
            System.out.println("Fallo, es menor");

        }
    }while (n2 != 0);

        System.out.println("Total numeros introducidos " + i);
        break;

            }

}
public static void ej4(){
    int n1;

    for (int i=1 ;i <= 5; i++){
        n1=i*i;
        System.out.println("Numero cuadrado = "+ n1);
    }
}

public static void ej5(){
    System.out.println("Introduzca un numero ");
    int n1 = sc.nextInt();
    if (n1 <= 0){
        System.out.println("*");

    }else {
        for (int i = 0; i < n1; i++){
            System.out.print(" * ");
        }
        System.out.println();
    }


}

public static void ej6(){
    int n1;
    System.out.println("Introduzca un numero entre 0 y 20 ");
    n1 = sc.nextInt();
    do {
        if ( n1 < 0 || n1 > 20){
            System.out.println(" ERROR, introduzca un numero entre 0 y 20 ");}
    }while (n1 < 0 || n1 > 20);

    for (int i =1; i<= n1; i++){
        for (int i2 = 0; i2 < i; i2++){
            System.out.print(i);
        }
        System.out.println();
    }

    /*int veinte = 20;
    for (int i = 1; i <= n1; i++){
        if (n1 < 20){
            System.out.println(i);
        }*/


    }
        /*if (n1 > i) {



        }*/

        /*int n2 = 0 + n1;
        System.out.println(n2);
        i++;98*/


public static void ej7(){
    System.out.println("Dime un numero");
    int a = sc.nextInt();
    System.out.println("Dime un numero mayor al anterior");
    int b= sc.nextInt();
    int cont = 0;
    for(int i = a; i <= b; i++){
        System.out.println(i);
        if (a >= b){
            System.out.println("ERROR, introduzca un numero mayor");

        } else if (i % 2 == 0) {
            cont++;
        }

    }
    System.out.println("Numeros pares : "+ cont);
}

public static void ej8(){
    System.out.println("Introduce un numero");
    int n1= sc.nextInt();

    /*for (int i = 1; i<= n1;i++){
        for (int j = i; j<n1; j++){
            System.out.print(" ");
        }
        for (int j=1; j<= i; j++){
            System.out.print("*");
        }
        for (int j = i-1; j>= 1; j--){
            System.out.print("*");
        }
        System.out.println();

    }
    System.out.println();*/

    for (int i = 0; i<n1;i++){
        System.out.print(" ");

    for (int j=0; j<(n1*2)-1;j++){
        System.out.print("*");
        if (j>= ((n1-1)-i) && j<= (n1-1)+i){
            System.out.print("*");

        } else{
            System.out.print(" ");
        }
    }
        System.out.println();
    }
    System.out.println();
}

