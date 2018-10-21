package rpr.etf.unsa.ba;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj) {
        int suma = 0;
        do {
            suma+=broj%10;
            broj/=10;
        } while (broj!=0);
        return suma;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i=1; i<=n; i++) {
            if (i%sumaCifara(i)==0) System.out.println(i);
        }
    }
}