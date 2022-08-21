package stack;
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan Batas \t: ");
        int batas = input.nextInt();
        System.out.println();
        Stack1 baru = new Stack1(batas);
        for(int i = 0; i<batas ; i++)
        {
            System.out.print(" Masukan Isi "+(i+1)+"\t: ");
            int isi = input.nextInt();
            baru.push(isi);
        }
        System.out.print("______________________________________\n");
        baru.Count();
        System.out.print("______________________________________\n");
        baru.Print();
        System.out.print("______________________________________\n");
        baru.Peek();
        System.out.print("______________________________________\n");
        System.out.print(" Berapa Kali Anda Melakukan POP\t: ");
        int bts = input.nextInt();
        System.out.println();
        int angka;
        for(int i = 1 ; i<=bts ; i++){
            System.out.print(" Masukan Angka POP\t: ");
            angka = input.nextInt();
            baru.pop(angka);
        }
        System.out.println();
        System.out.println("______________________________________");
        baru.Print();
        System.out.println("______________________________________\n");
    }
    
}
