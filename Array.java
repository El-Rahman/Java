//CLEAR DATA FROM ARRAY in JAVA

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlah,angkaHilang;
    int angka[];

    System.out.print("Masukkan Jumlah Array: ");
    jumlah = sc.nextInt();
    angka = new int[jumlah];

    for (int i=0; i<jumlah; i++){
        System.out.print("Masukkan Array ke-" + i + ": ");
        angka[i]=sc.nextInt();
    }
    System.out.println("------------------------------------");
    System.out.print("Masukkan Angka yang ingin dihapus: ");
    angkaHilang = sc.nextInt();

    System.out.println("====================================");
    System.out.println("DATA AWAL: " );
    for (int j=0; j<angka.length; j++){
    System.out.print(angka[j]+ "     ");
    }
    System.out.println();
    System.out.println("====================================");

    System.out.println("DATA AKHIR: ");
    for (int k=0; k<angka.length; k++){  
        if(angkaHilang!=angka[k]){ 
            System.out.print(angka[k] + "     ");              
        }
    }
    System.out.println();
    System.out.println("====================================");
  }
 }
