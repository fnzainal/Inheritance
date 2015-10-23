package belajarInheritance;

public class HitungBanyakBalok extends PrintHitungan{
	//inisiasi kelas PrintPerhitungan
	PrintHitungan printHitungan = new PrintHitungan();
	//inisiasi banyak balok menurunkan dari kelas PrintHitungan
	int banyakBalok = printHitungan.banyakBalok;
	
	//membuat method hitungLuasBalok()
	public int hitungLuasBalok(){
		//mereturn hitungLuas() dari kelas PrintHitungan dikalikan dengan banyakBalok
		return printHitungan.hitungLuas()*banyakBalok;
	}

}
