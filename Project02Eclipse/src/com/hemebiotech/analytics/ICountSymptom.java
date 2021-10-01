package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ICountSymptom {

    /**
     * Contient tous les symptômes triés et comptés
     * @return TreeMap<String, Integer>
     */
    TreeMap<String, Integer> contentSymptoms(List<String> listSymptoms);
}
