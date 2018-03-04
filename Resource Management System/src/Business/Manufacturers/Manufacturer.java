/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturers;

import Business.Resources.Resource;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class Manufacturer {
    
    private String name;
    private static int count=0;
    private int id;
    
    private ArrayList<Resource> supplierVaccineCatalog;
    
    public Manufacturer(){
        supplierVaccineCatalog = new ArrayList<>();
        ++count;
        id = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Resource> getSupplierVaccineCatalog() {
        return supplierVaccineCatalog;
    }

    public Resource addVaccineToSupplierDirectory(Resource vaccine){
        supplierVaccineCatalog.add(vaccine);
        return vaccine;
    }
    
    public void removeVaccineFromSupplierCatalog(Resource vaccine){
        supplierVaccineCatalog.remove(vaccine);
    }
    
    @Override
    public String toString(){
        return name;
    }
        
}
