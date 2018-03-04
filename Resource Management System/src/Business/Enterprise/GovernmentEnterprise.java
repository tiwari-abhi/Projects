/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.WorkQueue.ProviderTaxBenefitWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class GovernmentEnterprise extends Enterprise{

    private ArrayList<ProviderTaxBenefitWorkRequest> processedRequestList;
    
    private ArrayList<Double> bookTaxPercentages;
    private ArrayList<Double> clothingTaxPercentages;
    
    public GovernmentEnterprise(String name){
        super(name, EnterpriseType.GovernmentEnterprise);
        processedRequestList = new ArrayList<>();
        bookTaxPercentages = new ArrayList<>();
        clothingTaxPercentages = new ArrayList<>();
    }

    public ArrayList<Double> getBookTaxPercentages() {
        return bookTaxPercentages;
    }

    public void setBookTaxPercentages(ArrayList<Double> bookTaxPercentages) {
        this.bookTaxPercentages = bookTaxPercentages;
    }

    public ArrayList<Double> getClothingTaxPercentages() {
        return clothingTaxPercentages;
    }

    public void setClothingTaxPercentages(ArrayList<Double> clothingTaxPercentages) {
        this.clothingTaxPercentages = clothingTaxPercentages;
    }
                  
    public ArrayList<ProviderTaxBenefitWorkRequest> getProcessedRequestList() {
        return processedRequestList;
    }

    public void setProcessedRequestList(ArrayList<ProviderTaxBenefitWorkRequest> processedRequestList) {
        this.processedRequestList = processedRequestList;
    }
            
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
