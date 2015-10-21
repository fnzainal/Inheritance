package belajarInheritance;
/*
 * Simple Inheritance Java
 * @author Zainal Fahrudin
 * Pondok Programmer, 21 Oct 2015
 * 
 * */

public class Main {

	public static void main(String[] args){
		//inisiasi kelas child 
		Child child =new Child();
		SubChild subChild = new SubChild();
		
		//inisiasi kelas parent
		Parent parent = new Parent();
		parent.title();
		
		System.out.println();
		//memanggil method hitungKubus() dari kelas Child
		child.hitungKubus();
		
		
		System.out.println();
		//memanggil method Balok() dari kelas Child
		System.out.println("Volume 7 balok: "+child.Balok()+" m3");
		
		System.out.println();
		//memanggil method hitungLuasBalok dari kelas SubChild
		System.out.println("Luas Permukaan 7 balok : "+subChild.hitungLuasBalok()+" m2");
	}
}
