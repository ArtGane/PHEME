package com.hemebiotech.analytics;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.TreeMap;

public class CountSymptomFromList implements ICountSymptom {

    @Override
    public TreeMap<String, Integer> contentSymptoms(List<String> listSymptoms) {
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
    }
