package belajarInheritance;
/*
 * Simple Inheritance Java
 * @writer Zainal Fahrudin
 * Pondok Programmer, 21 Oct 2015
 * 
 * */

public class Main {

	public static void main(String[] args){
		//inisiasi kelas PrintHitungan 
		PrintHitungan printHitungan =new PrintHitungan();
		//inisiasi kelas HitungBanyakBalok
		HitungBanyakBalok hitungBanyakBalok = new HitungBanyakBalok();
		
		//inisiasi kelas Balok
		Balok balok = new Balok();
		//memanggil method title() dari kelas Balok
		balok.title();
		
		System.out.println();
		//memanggil method hitungKubus() dari kelas PrintHitungan
		printHitungan.hitungKubus();
		
		System.out.println();
		//memanggil method hitungLuasBalok dari kelas HitungBanyakBalok
		System.out.println("Luas Permukaan 7 balok : "+hitungBanyakBalok.hitungLuasBalok()+" m2");
		
		System.out.println();
		//memanggil method Balok() dari kelas PrintHitungan
		System.out.println("Volume 7 balok: "+printHitungan.Balok()+" m3");
	}
}
