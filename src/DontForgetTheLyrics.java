//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
JOptionPane.showMessageDialog(null, "In this game, the goal is to guess what song is playing.");
		// 5. Use the playSound method to play your song.
playSound("PPAP.wav");
		// 6. Make a pop-up for the player to type their answer.
String guess = JOptionPane.showInputDialog(null, "What is your guess?");
		// 7. If they answered correctly, tell them that they were right.
if (guess.equals("PPAP")) {
	JOptionPane.showMessageDialog(null, "You got it right!");
}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
else {
	JOptionPane.showMessageDialog(null, "Your wrong!");
}
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String PPAP) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource("PPAP.wav"));
		audioClip.play();
	}
}


