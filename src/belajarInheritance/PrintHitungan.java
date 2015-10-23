package belajarInheritance;

//kelas ini mengextend kelas Balok
public class PrintHitungan extends Balok{
	//inisiasi banyakBalok
	int banyakBalok =7;
	//inisiasi kelas Balok, dg nama kubus 
	Balok kubus = new Balok();
	
	public void hitungKubus(){
		//mengeprint method luasBalok() dari kelas Balok
		System.out.println("Luas balok : "+kubus.hitungLuas()+" m2");
		System.out.println();
		//mengeprint method hitungVolume() dari kelas Balok
		System.out.println("Volume balok : "+kubus.hitungVolume()+" m3");
	}
	public int Balok(){
		
		//mereturn hitungVolume  dari kelas Balok*banyakBalok
		return hitungVolume()*banyakBalok;
	}
}