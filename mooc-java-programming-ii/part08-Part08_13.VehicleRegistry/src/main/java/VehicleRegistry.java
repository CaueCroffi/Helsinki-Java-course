/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        }
        this.registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.registry.containsKey(licensePlate)) {
            return false;
        }
        this.registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate i : this.registry.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String i : this.registry.values()) {
            if (owners.contains(i)) {
                continue;
            }
            owners.add(i);
            System.out.println(i);
        }
    }

}
