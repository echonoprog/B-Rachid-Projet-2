package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
* Classe qui permet de compter le nombre de symptômes dans une liste de symptômes.
*/
public class AnalyticsCounter {

  private ISymptomReader reader;
  private ISymptomWriter writer;

  /**
  * Constructeur.
  * @param reader    objet qui lit une liste de symptômes.
  * @param writer    objet qui écrit une liste de symptômes.
  */
  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;
  }

  /**
  * Récupère la liste de symptômes à partir de l'objet reader.
  * @return  la liste de symptômes.
  */
  public List<String> getSymptoms() {
    return reader.getSymptoms();
  }

  /**
  * Compte le nombre de fois qu'un symptôme apparaît dans la liste de symptômes.
  * @param symptoms  la liste de symptômes.
  * @return          une map avec le nombre d'occurrences pour chaque symptôme.
  */
  public Map<String, Integer> countSymptoms(List<String> symptoms) {
    Map<String, Integer> symptomCount = new HashMap<>();
    for (String symptom : symptoms) {
      if (symptomCount.containsKey(symptom)) {
        symptomCount.put(symptom, symptomCount.get(symptom) + 1);
      } else {
        symptomCount.put(symptom, 1);
      }
    }
    return symptomCount;
  }

  /**
  * Trie la liste de symptômes par ordre alphabétique.
  * @param symptoms  une map avec le nombre d'occurrences pour chaque symptôme.
  * @return          une map triée par ordre alphabétique.
  */
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    return new TreeMap<>(symptoms);
  }

  /**
  * Écrit la liste de symptômes et compte à partir de l'objet writer.
  * @param symptoms   map avec le nombre d'occurrences pour chaque symptôme.
  */
  public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms);
  }
}
