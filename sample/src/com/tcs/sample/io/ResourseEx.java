package com.tcs.sample.io;

public class ResourseEx {
	public static void main(String[] args) {
		try(Resource r1 = new Resource();){
			r1.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
