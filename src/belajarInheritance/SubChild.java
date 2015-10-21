package belajarInheritance;

public class SubChild extends Child{
	//inisiasi kelas child
	Child child = new Child();
	//inisiasi banyak balok menurunkan dari kelas child
	int banyakBalok = child.banyakBalok;
	
	//membuat method hitungLuasBalok()
	public int hitungLuasBalok(){
		//mereturn hitungLuas() dari kelas child dikalikan dengan banyak Balok
		return child.hitungLuas()*banyakBalok;
	}

}
