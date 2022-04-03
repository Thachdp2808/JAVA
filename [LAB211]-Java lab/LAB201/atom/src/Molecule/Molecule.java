/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Molecule;

/**
 *
 * @author PV
 */
public class Molecule {

    /**
     * @param args the command line arguments
     */
    private String structure;
    private String name;
    private float weight;

    public Molecule() {
    }

    public Molecule(String structure, String name, float weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    void display() {
        System.out.println(getStructure() + "\t" + getName() + "\t" + getWeight());
    }

}