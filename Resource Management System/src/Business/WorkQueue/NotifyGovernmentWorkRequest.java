/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Resources.BookResource;
import Business.Resources.ClothingResource;
import Business.Resources.Resource;

/**
 *
 * @author abhin
 */
public class NotifyGovernmentWorkRequest extends WorkRequest{
    private Resource donatedResource;
    private double donatedResourceValue;
    private double taxBenefitValue;
    
    public NotifyGovernmentWorkRequest(BookResource resource){
        this.donatedResource = resource;
    }
    
    public NotifyGovernmentWorkRequest(ClothingResource resource){
        this.donatedResource = resource;
    }

    public Resource getDonatedResource() {
        return donatedResource;
    }

    public void setDonatedResource(Resource donatedResource) {
        this.donatedResource = donatedResource;
    }

    public double getDonatedResourceValue() {
        return donatedResourceValue;
    }

    public void setDonatedResourceValue(double donatedResourceValue) {
        this.donatedResourceValue = donatedResourceValue;
    }

    public double getTaxBenefitValue() {
        return taxBenefitValue;
    }

    public void setTaxBenefitValue(double taxBenefitValue) {
        this.taxBenefitValue = taxBenefitValue;
    }

    @Override
    public String toString(){
        return donatedResource.toString();
    }
    
}
