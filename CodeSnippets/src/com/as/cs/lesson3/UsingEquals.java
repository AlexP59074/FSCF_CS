package com.as.cs.lesson3;


public class UsingEquals {
	public static void main(String args[]){
		String longPhraseOne = "floxinoxnihilipilification";
		String longPhraseTwo = "floxinoxnihilipilification";
		String longPhraseThree = "abababababababababababba";
		String longPhraseFour = new String("floxinoxnihilipilification");
		
		System.out.println(longPhraseOne.equals(longPhraseTwo));
		
		System.out.println(longPhraseOne == longPhraseTwo);
		
		System.out.println(longPhraseOne == longPhraseFour);
		
		System.out.println(longPhraseOne == longPhraseThree);
		
	}

}
