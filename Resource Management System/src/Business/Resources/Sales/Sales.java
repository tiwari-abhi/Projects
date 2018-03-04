/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resources.Sales;

/**
 *
 * @author abhin
 */
public class Sales {
    
    private String month;
    private int resourcesManufactured;
    private int resourcesSold;
    private int excessResource;
        
    public enum MonthType{
        
        Jan("January"),
        Feb("February"),
        Mar("March"),
        Apr("April"),
        May("May"),
        June("June"),
        July("July"),
        Aug("August"),
        Sep("September"),
        Oct("October"),
        Nov("November"),
        Dec("December");
        
        private String value;
        
        private MonthType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public int getExcessResource() {
        return excessResource;
    }

    public void setExcessResource(int excessResource) {
        this.excessResource = excessResource;
    }
                
    public String getMonth() {
        return month;
    }
        
    public void setMonth(String month) {
        this.month = month;
    }

    public int getResourcesManufactured() {
        return resourcesManufactured;
    }

    public void setResourcesManufactured(int resourcesManufactured) {
        this.resourcesManufactured = resourcesManufactured;
    }

    public int getResourcesSold() {
        return resourcesSold;
    }

    public void setResourcesSold(int resourcesSold) {
        this.resourcesSold = resourcesSold;
    }
    
}
