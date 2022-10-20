// Created by 21343045_Farraz Hadyan

import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        int A,B,C,baris;

        Scanner dataIN = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris = ");
        baris = dataIN.nextInt();

        for(A=0;A<=baris;A++){
            for(B=1;B<=A;B++){
            System.out.print(" ");
            }
            for(C=1;C<=baris-A;C++){
            System.out.print(" #");
            }
            System.out.println();
        }

        for(A=1;A<=baris;A++){
            for(B=1;B<=baris-A;B++){
            System.out.print(" ");
            }
            for(C=1;C<=A;C++){
            System.out.print(" *");
            }
            System.out.println();
        }
    }
}
