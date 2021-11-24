package com.juaracoding.main;

import java.text.DecimalFormat;

public class HelloWorld {

	public static void main(String[]args) {
		String nama;
		int usia=23;
		boolean var1, var2, var3;
		double nilai1;
		float nilai2;
		char grade ='A';
		nama="Lintang Abu bakar";
		var1= 10<9;
		var2= 10>9;
		var3= "A" == "a";
		nilai1 = 7.5543454;
		DecimalFormat df=new DecimalFormat("#,###.##");
		nilai2 = (7.5543454f);
		System.out.println("Identitas Diri");
		System.out.println("Nama : " + nama);
		System.out.println("Usia :" + usia);
		System.out.println("Jawab :" + var1);
		System.out.println("Jawab :" + var2);
		System.out.println("Jawab :" + var3);
		System.out.println("nilai :" + nilai1);
		System.out.println("nilai :" + nilai2);
		System.out.println("nilai :" + df.format(nilai1));
		System.out.println("nilai :" + df.format(nilai2));
		System.out.println("Grade :" + grade);
		System.out.println(String.format("%.3f", nilai1*1000000));
		System.out.println(String.format("%.3f", nilai2*1000000));
	}
	
	
}
