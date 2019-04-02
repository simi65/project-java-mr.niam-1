import java.util.Scanner;
public class HelloCodiva {
    public static void main (String[] args){
        
        // deklarasi variabel dengan nama 'nama' & alamat dengan 
        // tipe data String 
        String nama, alamat;
        
        Scanner terserah = new Scanner(System.in);
        
        System.out.print("masukan nama anda :");
        nama=terserah.next ();
        
        System.out.print("masukan alamat anda :");
        alamat=terserah.next ();
        
        System.out.println("selamat datang " + nama + ",kapan kamu pulang ke" + alamat + "?");
    }
}