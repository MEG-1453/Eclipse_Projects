import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak         *

Kova Burcu : 22 Ocak - 19 Şubat           * 

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.
*/		
	
		
	while(true) {	
		
		System.out.print("lütfen doğduğunuz ayı giriniz(çıkmak için (-1) tuşlayınız): ( örn: 05 / 5 ) ");
		int ay = input.nextInt(); 
		
		if ((ay == -1)) {
			System.out.println("bizi tercih ettiğiniz için teşekkür ederiz ;D");
			break;
		}
		
		System.out.print("lütfen doğduğunuz günü giriniz: ( örn: 23 ) ");
		int gun = input.nextInt();
		
		if (gun == -1) {
			System.out.println("bizi tercih ettiğiniz için teşekkür ederiz ;D");
		}
		
		
		if ( (ay == 1) ) {
			if (gun < 22 ) {
				System.out.println("Burcunuz: Oğlak ");
			}else {
				System.out.println("Burcunuz: Kova");
			}
		}else if (ay == 2) {
			if (gun < 20 ) {
				System.out.println("Burcunuz: kova");
			}else {
				System.out.println("Burcunuz: Balık");
			}
		}else if (ay == 3) {
			if (gun < 21) {
				System.out.println("Burcunuz: Balık");
			}else {
				System.out.println("Burcunuz: koç");
			}
		}else if (ay == 4) {
			if (gun < 21) {
				System.out.println("Burcunuz: koç");
			}else {
				System.out.println("Burcunuz: Boğa");
			}
		}else if (ay == 5) {
			if (gun < 22 ) {
				System.out.println("Burcunuz: Boğa");
			}else {
				System.out.println("Burcunuz: Ikizler");
			}
		}else if (ay == 6) {
			if (gun < 23) {
				System.out.println("Burcunuz: Ikizler");
			}else {
				System.out.println("Burcunuz: Yengeç");
			}
		}else if (ay == 7) {
			if (gun < 23 ) {
				System.out.println("Burcunuz: Yengeç");
			}else {
				System.out.println("Burcunuz: Aslan");
			}
		}else if (ay == 8) {
			if (gun < 23) {
				System.out.println("Burcunuz: Aslan");
			}else {
				System.out.println("Burcunuz: Başak");
			}
		}else if (ay == 9) {
			if (gun < 23) {
				System.out.println("Burcunuz: Başak");
			}else {
				System.out.println("Burcunuz: Terazi");
			}
		}else if (ay == 10) {
			if (gun < 23) {
				System.out.println("Burcunuz: Terazi");
			}else {
				System.out.println("Burcunuz: Akrep");
			}
		}else if (ay == 11) {
			if (gun < 22) {
				System.out.println("Burcunuz: Akrep");
			}else {
				System.out.println("Burcunuz: Yay");
			}
		}else if (ay == 12) {
			if (gun < 22) {
				System.out.println("Burcunuz: Yay");
			}else {
				System.out.println("Burcunuz: Oğlak");
			}
		}else {
			System.out.println("Lütfen girdiğiniz sayıları kontrol ediniz..");
		}
		
		if ((ay == -1) || (gun == -1)) {
			System.out.println("bizi tercih ettiğiniz için teşekkür ederiz ;D");
			break;
		}
		
		
	}	
		
		
		
	}

}
