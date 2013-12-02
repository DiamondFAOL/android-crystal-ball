package com.austincorp.crystalball;

import java.util.Random;

public class CrystalBall {
	
	public String[] mAnswerArray = {
			"yes",
			"definately",
			"without a doubt",
			"no", 
			"unlikely",
			"probably not",
			"could do",
			"possibly",
			"maybe"};
	
	
	/**
	 * Get a random crystal ball answer
	 * 
	 * @return String
	 */
	public String getAnAnswer(){

		Random rand = new Random();
		int  n = rand.nextInt(mAnswerArray.length);
		
		return mAnswerArray[n];
	}

}