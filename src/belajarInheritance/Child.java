package belajarInheritance;

//kelas ini mengextend kelas Parent
public class Child extends Parent{
	//inisiasi banyakBalok
	int banyakBalok =7;
	//inisiasi kelas parent, dg nama kubus 
	Parent kubus = new Parent();
	
	public void hitungKubus(){
		//mengeprint method luasBalok() dari kelas parent
		System.out.println("Luas balok : "+kubus.hitungLuas()+" m2");
		System.out.println();
		//mengeprint method hitungVolume() dari kelas parent
		System.out.println("Volume balok : "+kubus.hitungVolume()+" m3");
	}
	public int Balok(){
		
		//mereturn hitungVolume  dari kelas parent
		return hitungVolume()*banyakBalok;
	}
}