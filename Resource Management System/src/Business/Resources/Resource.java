/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resources;

import Business.Resources.Sales.SalesRecord;

/**
 *
 * @author abhin
 */

public class Resource {

    private String resourceType;
    private int unitPrice;
    
    private int totalManufacturedUnits;//For all months
    private int totalSoldUnits;//For all months
    private int totalExcessUnits;//For all months
    
    private int totalDonatedToSystem;// Provider --> System
    private int tempDonatedToSystem;
    
    private int totalDonatedToNGO;// System --> NGO
    
    private SalesRecord salesRecord;
    
    public Resource(){
        salesRecord = new SalesRecord();
    }
    
    public enum ResourceType{
        
        Book("Book Resource"),
        Clothing("Clothing Resource");
        
        private String value;
        
        private ResourceType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public int getTempDonatedToSystem() {
        return tempDonatedToSystem;
    }

    public void setTempDonatedToSystem(int tempDonatedToSystem) {
        this.tempDonatedToSystem = tempDonatedToSystem;
    }
            
    public int getTotalDonatedToNGO() {
        return totalDonatedToNGO;
    }

    public void setTotalDonatedToNGO(int totalDonatedToNGO) {
        this.totalDonatedToNGO = totalDonatedToNGO;
    }
    
    
    public int getTotalDonatedToSystem() {
        return totalDonatedToSystem;
    }

    public void setTotalDonatedToSystem(int totalDonatedToSystem) {
        this.totalDonatedToSystem = totalDonatedToSystem;
    } 

    public int getTotalExcessUnits() {
        return totalExcessUnits;
    }

    public void setTotalExcessUnits(int totalExcessUnits) {
        this.totalExcessUnits = totalExcessUnits;
    }
        
    public int getTotalManufacturedUnits() {
        return totalManufacturedUnits;
    }

    public void setTotalManufacturedUnits(int totalManufacturedUnits) {
        this.totalManufacturedUnits = totalManufacturedUnits;
    }

    public int getTotalSoldUnits() {
        return totalSoldUnits;
    }

    public void setTotalSoldUnits(int totalSoldUnits) {
        this.totalSoldUnits = totalSoldUnits;
    }
        
    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public SalesRecord getSalesRecord() {
        return salesRecord;
    }

    public void setSalesRecord(SalesRecord salesRecord) {
        this.salesRecord = salesRecord;
    }
        
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }
             
}
