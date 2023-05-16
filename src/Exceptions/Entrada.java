package Exceptions;

import java.util.Scanner;

public class Entrada {

    static Scanner sc = new Scanner(System.in);

    private static String nextLine(){
        System.out.println(" Tecleja cualsevol lletra: ");
        return sc.nextLine();
    }

    private static int nextInt(){
        System.out.println(" Tecleja cualsevol numero: ");
        return sc.nextInt();
    }
}
