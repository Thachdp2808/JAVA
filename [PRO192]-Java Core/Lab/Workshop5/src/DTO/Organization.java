/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Buta
 */
abstract class Organization {
    abstract void communicateByTool();
    int size;

    public Organization() {
    }

    public Organization(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    
    @Override
    public String toString() {
        return String.format("\nthe organization’s size is", +size);
    }
}
