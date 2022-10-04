package com;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Test {
	void test(List test);
}

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Vowels = new ArrayList<String>();
		Vowels.add("a");
		Vowels.add("e");
		Vowels.add("i");
		Vowels.add("o");
		Vowels.add("u");

		for (int i = 0; i < Vowels.size(); i++) {
			System.out.println(Vowels.get(i));
		}

		System.out.println("----------------------------------------------");
		Vowels.forEach(vowel -> System.out.println(vowel));
		/* Test t=vowel -> System.out.println(vowel); */

	}

}
