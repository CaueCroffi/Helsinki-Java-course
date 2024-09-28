/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Pichau
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.nio.file.Paths;

public class SaveableDictionary {

    private ArrayList<String> dictionary;
    private ArrayList<String> translations;
    private String file;
    private Scanner scanner;

    public SaveableDictionary() {
        dictionary = new ArrayList<>();
        translations = new ArrayList<>();
    }

    public SaveableDictionary(String filePath) {
        this();
        this.file = filePath;
    }

    public boolean load() {
        try ( Scanner reader = new Scanner(Paths.get(this.file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " file is unreadable");
            return false;
        }
        return true;
    }

    public boolean save() {
        try ( FileWriter writer = new FileWriter(this.file)) {
            for (int i = 0; i < dictionary.size(); i++) {
                writer.append(dictionary.get(i) + ":" + translations.get(i)+"\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        this.dictionary.add(word);
        this.translations.add(translation);
    }

    public String translate(String word) {
        String translation = null;

        for (int i = 0; i < dictionary.size(); i++) {
            if (dictionary.get(i).equals(word) || translations.get(i).equals(word)) {
                return dictionary.get(i).equals(word) ? translations.get(i) : dictionary.get(i);

            }
        }
        return translation;
    }

    public void delete(String word) {
        for (int i = 0; i < dictionary.size(); i++) {
            if (dictionary.get(i).equals(word) || translations.get(i).equals(word)) {
                dictionary.remove(i);
                translations.remove(i);
                return;
            }
        }
    }
}
