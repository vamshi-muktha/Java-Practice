package com.tcs.sample.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("/home/labuser/Desktop/myfiles/t1.txt");){
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while((i = fis.read()) != -1) {
				char ch = (char)i;
				sb.append(ch);
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went Wrong");
		}
	}
}
