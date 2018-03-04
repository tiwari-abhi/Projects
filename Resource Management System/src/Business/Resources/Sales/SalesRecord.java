/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resources.Sales;

import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class SalesRecord {
    
    private ArrayList<Sales> salesRecordList;
    
    
    public SalesRecord(){
        salesRecordList = new ArrayList<>();
    }

    public ArrayList<Sales> getSalesRecordList() {
        return salesRecordList;
    }

    public void setSalesRecordList(ArrayList<Sales> salesRecordList) {
        this.salesRecordList = salesRecordList;
    }
            
    public void addToSalesRecordList(Sales sales){
        salesRecordList.add(sales);
    }
    
    public void removeSalesRecord(Sales sales){
        salesRecordList.remove(sales);
    }
    
    public boolean salesRecordAlreadyPresent(String month){
        for (Sales s : salesRecordList){
            if (s.getMonth().equalsIgnoreCase(month)){
                return true;
            }
        }
        return false;
    }
}
