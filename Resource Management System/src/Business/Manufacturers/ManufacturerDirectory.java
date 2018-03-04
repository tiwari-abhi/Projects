/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturers;

import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class ManufacturerDirectory {
    
    private ArrayList<Manufacturer> manufacturerDirectory;
    
    public ManufacturerDirectory(){
        manufacturerDirectory = new ArrayList<Manufacturer>();
    }

    public ArrayList<Manufacturer> getManufacturerDirectory() {
        return manufacturerDirectory;
    }

    public void setManufacturerDirectory(ArrayList<Manufacturer> manufacturerDirectory) {
        this.manufacturerDirectory = manufacturerDirectory;
    }
    
    public Manufacturer addToManufacturerDirectory(String name){
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName(name);
        manufacturerDirectory.add(manufacturer);
        return manufacturer;
    }
    
    public void removeManufacturer(Manufacturer manufacturer){
        manufacturerDirectory.remove(manufacturer);
    }
    
}
