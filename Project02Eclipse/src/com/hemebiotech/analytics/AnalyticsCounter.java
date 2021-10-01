package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
// Lecture des symptomes
		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> listSymptoms = readSymptoms.getSymptoms();
		System.out.println(listSymptoms);

		AnalyticsCounter counterSymptom = new AnalyticsCounter();
		TreeMap<String, Integer> contentSymptoms = counterSymptom.countSymptom(listSymptoms);

		writeSymptom(contentSymptoms);
	}

	/**
	 * Comptage des symptomes
	 * @param listSymptoms
	 * @return
	 */

	public TreeMap<String, Integer> countSymptom(List<String> listSymptoms) {
		TreeMap<String, Integer> contentSymptoms = new TreeMap<>();
		for (String s : listSymptoms){

			if (contentSymptoms.containsKey(s)) {
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

	/**
	 * Transmission symptomes dans result.out
	 * @param contentSymptoms
	 * @throws IOException
	 */
	public static void writeSymptom(TreeMap<String, Integer> contentSymptoms) throws IOException {
		FileWriter writer = new FileWriter ("result.out");

		for (Map.Entry<String, Integer> roadSymptoms : contentSymptoms.entrySet()) {
			try {
				writer.flush();
				writer.write(roadSymptoms.getKey()
						+ " | " + roadSymptoms.getValue() + " ;");
				writer.write(System.getProperty( "line.separator" ));
			} catch (IOException e) {
				e.printStackTrace();
				writer.close();
			}
			System.out.println(roadSymptoms);
// result.out contient les symptomes comptés et triés par ordre alphabétique
		}
	}}


