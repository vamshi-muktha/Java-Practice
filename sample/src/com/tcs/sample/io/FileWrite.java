package com.tcs.sample.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/home/labuser/Desktop/myfiles/t1.txt");
			String s = "Hii how are you";
			byte[] b = s.getBytes();
			fos.write(b);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("location is wrong");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("something went wrong");
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("something went wrong with close1");
			}
		}
		
		
		
		try (FileOutputStream fos1 = new FileOutputStream("/home/labuser/Desktop/myfiles/t2.txt");){
			
			String s = "Hii how are you";
			byte[] b = s.getBytes();
			fos1.write(b);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("location is wrong");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("something went wrong");
		}
		
		
	}
}
