package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import com.hemebiotech.analytics.AnalyticsCounter;
import com.hemebiotech.analytics.ISymptomReader;
import com.hemebiotech.analytics.ISymptomWriter;
import com.hemebiotech.analytics.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.WriteSymptomDataToFile;


public class Main { /**

public static void main(String[] args) {
    // Instancer objet ISymptomReader
    ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");

    // Instancer objet ISymptomWriter
   WriteSymptomDataToFile writer = new WriteSymptomDataToFile("result.out");


    // Instancer objet AnalyticsCounter
    AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);

    // Récupération de la liste des symptômes
    List<String> symptoms = analyticsCounter.getSymptoms();

    // Comptage des occurrences de chaque symptôme
    Map<String, Integer> countedSymptoms = analyticsCounter.countSymptoms(symptoms);

    // Tri de la liste de symptômes et d'occurrences par ordre alphabétique
    Map<String, Integer> sortedSymptoms = analyticsCounter.sortSymptoms(countedSymptoms);

    // Écriture des résultats dans le fichier de sortie
    analyticsCounter.writeSymptoms(sortedSymptoms); **/
}


