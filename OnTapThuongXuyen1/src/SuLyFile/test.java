package SuLyFile;

import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import emtity.Diachi;
import emtity.HoSo;

public class test {
	// dọc file
	public static void ReadFile(String nameFile) {

		 try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
	            String line;
	            while ((line = br.readLine()) != null) {// độc từng dòng
	            	// cắt dong
//	            	String[] s = line.split(",");
//	            	for(String x: s) {
//	            		System.out.print(x+  "  ");
//	            	}
//	            	System.out.println();
	                System.out.println(line); // In từng dòng văn bản
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

	// tạo file
	public static void main(String[] args) {
		ArrayList<Diachi> dcs = new ArrayList<>();
		Diachi e= new Diachi();
		Diachi e1=new Diachi();
		Diachi e2= new Diachi();
		dcs.add(e);
		dcs.add(e1);
		dcs.add(e2);
		Collections.sort(dcs, Comparator.comparingInt(Diachi::getId).reversed());
		for(Diachi x: dcs) {
			System.out.println(x.toString());
		}
		HoSo s1= new HoSo(1, "Huyen", e);
		System.out.println(s1);

		

	}

}
