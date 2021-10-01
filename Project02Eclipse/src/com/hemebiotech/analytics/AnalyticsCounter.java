package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        // Lecture des symptomes
        ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> listSymptoms = readSymptoms.getSymptoms();
        System.out.println(listSymptoms);

        // Compte des symptomes
        CountSymptomFromList countSymptom = new CountSymptomFromList();
        TreeMap<String, Integer> counterSymptom = countSymptom.contentSymptoms(listSymptoms);
        System.out.println(counterSymptom);

        // Ecris les symptomes dans un .out
        WriteSymptomFromTreeMap writeSymptomFromTreeMap = new WriteSymptomFromTreeMap();
        writeSymptomFromTreeMap.writeSymptom(counterSymptom);
        // new WriteSymptomFromTreeMap().writeSymptom(counterSymptom);
        System.out.println(writeSymptomFromTreeMap);

    }


}
