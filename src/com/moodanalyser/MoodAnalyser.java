package com.moodanalyser;

public class MoodAnalyser {
	public static void main(String args[]) {
		System.out.println("Mood Analyser");

		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = moodAnalyser.analyseMood("I am Happy");
		System.out.println(message);
		message = moodAnalyser.analyseMood("I am Sad");
		System.out.println(message);
	}

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("happy")) {
			return "Happy";
		} else if (message.toLowerCase().contains("sad")) {
			return "Sad";
		} else {
			return null;
		}
	}
}