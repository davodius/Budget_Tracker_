package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class IncomeStorage {


    private Map<String, Income> incomeList;
    // här säger vi att vår key ska vara av datatypen String => Map<String, >
    // sen säger vi att värdet ska vara vår Income klass => Map<String, Income>
    // alla värden kommer sparas som key value pairs, alltså en nyckel och ett värde för den nyckeln
    private String fileName = "src/main/java/org/example/income.json";



    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public IncomeStorage() {
    }

    public void readFile() throws IOException {
        Type type = new TypeToken<Map<String, User>>(){}.getType();
        // vi typar om vår map för att det ska bli lättare mellan java och json
        // det här behöver ske först i applikationen, så läs in det första du gör
        Reader reader = new FileReader(new File(fileName));
        // skapar en file reader coh sätter vår file path
        incomeList = gson.fromJson(reader, type);
        // läser in json filen och sparar ner objekten i incomeList
        // notera att vi skickar med vår reader och vår type = TypeToken



    }

    // METOD FÖR ATT SPARA TILL JSO FILEN
    public void saveFile() throws IOException {
        FileWriter fw = new FileWriter(new File(fileName));
        // skapar en ny file writer
        gson.toJson(incomeList, fw);
        // sparar till fil
        fw.close();
        // stänger file writer
    }

    // METOD FÖR ATT LÄGGA TILL EN INCOME TILL incomeList
    // först måste du se till att du kan skapa en Income!
    public void addIncome(Income income) {
        incomeList.put(income.getId(), income);
        System.out.println("Income added!");
    }

    public void removeIncome(String id){
            incomeList.remove(id);
            System.out.println("Income removed!");
    }
}

