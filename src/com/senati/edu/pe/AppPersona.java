package com.senati.edu.pe;

public class AppPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona ("25782211","Jorge","Luque",'M',44);
		Persona p1=new Persona ("25782211","Freddy","Morgan",'M',22);
		Persona p2 =new Persona("25782211","Jorge","Luque",'M',44);
		Persona p3 =new Persona("------","-------","----",'-',0);
		
		System.out.println(" " + p.toString());
		System.out.println(" " + p1.toString());
		System.out.println(" " + p2.toString());
		System.out.println(" " + p3.toString());
		
	}

}
