package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;



public class WriteSymptomDataToFile implements ISymptomWriter {

 public void writeSymptoms(Map<String, Integer> symptoms) {
    
		try (FileWriter writer = new FileWriter("result.out")) 
		{
      
			for (Map.Entry<String, Integer> symptom : symptoms.entrySet()) 
			{
        writer.write(symptom.getKey() + ": " + symptom.getValue() + "\n");
      }
    } 
		catch (IOException e) 
		{
      System.err.println("An error occurred while writing to the file");
      e.printStackTrace();
    }
  }
}


