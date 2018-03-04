import java.util.Random;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.

String b = "VFvfajuvfdhavFDABFHABFAbftrajbfaBFDFRTAHgtiwjbhgFDUJHBFDZhgrfAFAHGFEABGRFedGFHBUJGRFAgikBHRrfkiFRBHUJGREnkBRHFA" ;
		// 2. Print your String to the console in upper case.
for (int i = 0; i < b.length(); i++) {
	System.out.println((b.charAt(i)+"").toUpperCase());
}

// 3. Print your String to the console in lower case.
for (int o = 0; o < b.length(); o++) {
	System.out.println((b.charAt(o)+"").toLowerCase());
}
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		for (int p = 0; p < 3; p++) {
			System.out.println(b.charAt(p));
		}
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		System.out.println(b.charAt(15));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
	}
}