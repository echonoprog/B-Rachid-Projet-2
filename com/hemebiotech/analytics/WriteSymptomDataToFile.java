package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

  




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
