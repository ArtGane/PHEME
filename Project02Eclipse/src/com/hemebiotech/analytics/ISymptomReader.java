package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomReader {
	/**
	 * Si aucune donnée n’est disponible, retourner la liste vide
	 * une liste de tous les symptômes obtenus à partir du fichier symptoms.txt, sans prendre en compte les doublons éventuels
	 * @return List<String>
	 */
	List<String> getSymptoms();
}
