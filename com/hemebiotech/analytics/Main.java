package com.hemebiotech.analytics;

import com.hemebiotech.analytics.AnalyticsCounter;
import com.hemebiotech.analytics.ISymptomReader;
import com.hemebiotech.analytics.ISymptomWriter;
import com.hemebiotech.analytics.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.WriteSymptomDataToFile;
import java.util.List;
import java.util.Map;

public class Main {

  /**
  * Point d'entrée de l'application.
  * @param args un tableau de chaînes de caractères.
  */
  public static void main(String[] args) {

    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");

    ISymptomWriter writer = new WriteSymptomDataToFile();

    AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);

    List<String> symptoms = analyticsCounter.getSymptoms();

    Map<String, Integer> countedSymptoms = analyticsCounter.countSymptoms(symptoms);

    Map<String, Integer> sortedSymptoms = analyticsCounter.sortSymptoms(countedSymptoms);

    analyticsCounter.writeSymptoms(sortedSymptoms); 
  }
}
