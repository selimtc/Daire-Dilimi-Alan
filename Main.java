/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	// Değişkenleri oluşturalım
		int r;
		double pi=3.14;
		
		//Kullanıcıdan veri alalım
		
		Scanner inp= new Scanner(System.in);
		System.out.println("dairenin yari capını giriniz");
		
		r= inp.nextInt();
		double alan= pi*r*r;
		double cevre= 2*pi*r;
		
		System.out.print("Daire alanı : " + alan);
		
		
		System.out.print("Daire cevresi : " + cevre);
		
		
		
	}
}

