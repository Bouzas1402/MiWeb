package Practica3;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios? \n1. if \n2. switch");
        int ifOrSwitch = sc.nextInt();
        if (ifOrSwitch == 1) {
            System.out.println("Introduce el Numero de ejercicio que quieres que resuelva: \n 1. Par-impar \n 2. Sueldo anual (impuestos) \n 5. Triangulo válido \n 6.Fiesta de marmotas \n 7. Notas");
            int ejerciciosIf = sc.nextInt();
            switch (ejerciciosIf) {
                case 1:
                    System.out.println("Introduzca un número: ");
                    int parImpar = sc.nextInt();
                    if (parImpar % 2 == 0) {
                        System.out.println("El numero introducido " + parImpar + " es par.");
                    } else {
                        System.out.println("El numero introducido" + parImpar + " es impar.");
                    }
                    break;
                case 2:
                    System.out.println("¿Canto cobra al año?");
                    int sueldo = sc.nextInt();
                    if (sueldo <= 9_000) {
                        System.out.println("No tienes pagar impuestos");
                    } else {
                        System.out.println("Tienes pagar impuestos");
                    }
                    break;
                case 5:
                    System.out.println("Introduce las medidas de los lados:");
                    System.out.println("Lado A: ");
                    int ladoA = sc.nextInt();
                    System.out.println("Lado B: ");
                    int ladoB = sc.nextInt();
                    System.out.println("Lado C: ");
                    int ladoC = sc.nextInt();
                    System.out.println("¿Puede ser un triangulo?:");
                    if (ladoA + ladoB > ladoC || ladoA + ladoC > ladoB || ladoB + ladoC > ladoA) {
                        System.out.println("Si puede ser un triangulo.");
                    } else {
                        System.out.println("No puede ser un triangulo.");
                    }
                    break;
                case 6:
                    
        } /*else if (ifOrSwitch == 2) {
            System.out.println("Introduce el numero de ejercicio que quieres que resuelva:");
            int ejerciciosSwitch = sc.nextInt();
        } */} else {
            System.out.println("Opción incorrecta");
        }
        }
    }


