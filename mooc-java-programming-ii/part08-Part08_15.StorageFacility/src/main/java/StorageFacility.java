/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.units.putIfAbsent(unit, new ArrayList<>());

        this.units.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.units.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.units.get(storageUnit).remove(item);
        if (this.units.get(storageUnit).size() == 0) {
            this.units.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsToReturn = new ArrayList<>();
        for (String i : this.units.keySet()) {
            unitsToReturn.add(i);
        }
        return unitsToReturn;
    }
}
