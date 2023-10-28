
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Random rastgele = new Random();
		int rastgele_sayi = 1 + rastgele.nextInt(99);
		System.out.println("Rastgele sayi 1 ile 100 arasindadir.");
		int sayi,sayac = 0;
		
		do {
			System.out.println("Bir sayi giriniz:");
			sayi = scan.nextInt();
			if (sayi>rastgele_sayi)
			{
				System.out.println("Sayiyi kucultun.");
			}
			else if (sayi< rastgele_sayi)
			{
				System.out.println("Sayiyi buyutun.");
			}
			sayac++;
		
			}
		 while (sayi!= rastgele_sayi);
		System.out.println("Tebrikler!! " +sayac+".denemede buldun.");

	}

}
