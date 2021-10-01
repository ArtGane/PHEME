package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomFromTreeMap implements IWriteSymptom {

    @Override
    public void writeSymptom(TreeMap<String, Integer> contentSymptoms) throws IOException {
        FileWriter writer = new FileWriter("result.out");

        for (Map.Entry<String, Integer> roadSymptoms : contentSymptoms.entrySet()) {
            try {
                writer.flush();
                writer.write(roadSymptoms.getKey()
                        + " | " + roadSymptoms.getValue() + " ;");
                writer.write(System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
                writer.close();
            }
            System.out.println(roadSymptoms);
// result.out contient les symptomes comptés et triés par ordre alphabétique
        }
    }
}
