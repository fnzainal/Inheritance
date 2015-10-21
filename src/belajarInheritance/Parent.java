package belajarInheritance;

public class Parent {
	//inisiasi panjang lebar tinggi
	int panjang=2,lebar=3,tinggi=5;
	
	
	public void title(){
		System.out.println("==Menghitung Volume dan Luas Permukaan Balok==");
		System.out.println("panjang = "+panjang+" m");
		System.out.println("lebar = "+lebar+" m");
		System.out.println("tinggi = "+tinggi+" m");
	}
	//method hitungVolume()
	public int hitungVolume() {
		//mereturn nilai panjang x lebar x tinggi
		return panjang*lebar*tinggi;
	}
	//method luasBalok()
	public int hitungLuas(){
		//mereturn (nilai panjang x lebar x tinggi)
		return (2*(panjang*lebar+lebar*tinggi+panjang*tinggi));
	}

}
