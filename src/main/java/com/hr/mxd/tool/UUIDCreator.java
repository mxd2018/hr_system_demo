package com.hr.mxd.tool;

import java.util.UUID;

public class UUIDCreator {
	public static String createUUID(){
		UUID randomUUID = UUID.randomUUID();
		String stringUUID = randomUUID.toString().replaceAll("-", "").substring(1, 25);	
		return stringUUID;
	}
	
	public static void main(String[] args) {
		//49549ed4-3d25-40d7-8d3b-0cd13d6fbc7
		System.out.println(UUID.randomUUID().toString());
		//eae6235a73948f9a4474da35
		System.out.println(createUUID());
	}
}
