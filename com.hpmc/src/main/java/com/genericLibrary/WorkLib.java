package com.genericLibrary;

import java.util.Random;

public class WorkLib {

	public static int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(10000);
	}
	
}
