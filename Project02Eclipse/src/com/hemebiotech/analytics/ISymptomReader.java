package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomReader {
	/**
	 * Si aucune donnée n’est disponible, retourner la liste vide
	 * 
	 * @return une liste de tous les symptômes obtenus à partir du fichier symptoms.txt, sans prendre en compte les doublons éventuels
	 */
	List<String> getSymptoms ();
}
