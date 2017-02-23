package com.iba.kozlov.dao;

public class ReaderQueryFacade {
	
	public static String getQueryReadReader(){
		return "SELECT id,name,surname FROM reader";
	}

}
