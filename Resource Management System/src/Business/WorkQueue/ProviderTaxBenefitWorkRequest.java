/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Providers.Provider;
import Business.Resources.BookResource;
import Business.Resources.ClothingResource;
import Business.Resources.Resource;
/**
 *
 * @author abhin
 */
public class ProviderTaxBenefitWorkRequest extends WorkRequest{
   Provider provider; 
   String approvalDecision; 
   Resource donatedResource;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
         
   public ProviderTaxBenefitWorkRequest(BookResource bookResource){
       this.donatedResource = bookResource;
   }
   
   public ProviderTaxBenefitWorkRequest(ClothingResource clothingResource){
       this.donatedResource = clothingResource;
   }

    public String getApprovalDecision() {
        return approvalDecision;
    }

    public void setApprovalDecision(String approvalDecision) {
        this.approvalDecision = approvalDecision;
    }  

    public Resource getDonatedResource() {
        return donatedResource;
    }

    public void setDonatedResource(Resource donatedResource) {
        this.donatedResource = donatedResource;
    }
    
    @Override
    public String toString(){
        return donatedResource.toString();
    }
             
}
