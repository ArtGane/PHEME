package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public interface IWriteSymptom {
    void writeSymptom(TreeMap<String, Integer> contentSymptoms) throws IOException;
}
