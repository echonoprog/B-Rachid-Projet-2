package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
* Cette classe écrit les résultats de l'analyse des symptômes dans un fichier de sortie.
*/

public class WriteSymptomDataToFile implements ISymptomWriter {

  /**
  * Écrit les symptômes et leur nombre d'occurrences dans un fichier de sortie.
  * @param symptoms un objet Map contenant les symptômes et leur nombre d'occurrences
  */

  public void writeSymptoms(Map<String, Integer> symptoms) {
    try (FileWriter writer = new FileWriter(new File("result.out"))) {
      for (Map.Entry<String, Integer> test : symptoms.entrySet()) {
        writer.write(test.getKey() + " : " + test.getValue() + "\n");
      }
    } catch (IOException e) {
      System.err.println("Erreur");
      e.printStackTrace();
    }
  }
}
