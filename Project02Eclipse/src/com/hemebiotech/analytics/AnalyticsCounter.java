package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
// Lecture des symptoms
		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> listSymptoms = readSymptoms.getSymptoms();
		System.out.println(listSymptoms);

		AnalyticsCounter counterSymptom = new AnalyticsCounter();
		TreeMap<String, Integer> contentSymptoms = counterSymptom.countSymptom(listSymptoms);
	}

	public TreeMap<String, Integer> countSymptom(List<String> listSymptoms) {
		TreeMap<String, Integer> contentSymptoms = new TreeMap<String, Integer>();
			// Comptage des symptoms
		for (String s : listSymptoms){

			if (contentSymptoms.containsKey(s) == true ) {
				int num = contentSymptoms.get(s);
				num++;
				contentSymptoms.put(s, num);
			} else {
				contentSymptoms.put(s, 1);
			}
		}
		System.out.println(contentSymptoms);
		return contentSymptoms;
	}

	public void writeSymptom(TreeMap<String, Integer> contentSymptoms) throws IOException {
		FileWriter writer = new FileWriter ("result.out");

			//Transmission symptoms dans .out
		contentSymptoms.entrySet().forEach(roadSymptoms -> {
			System.out.println(roadSymptoms.getKey()
					+ " | " + roadSymptoms.getValue());
			try {
				writer.write(String.valueOf(contentSymptoms));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
}}
