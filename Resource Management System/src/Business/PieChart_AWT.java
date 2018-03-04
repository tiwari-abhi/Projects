/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organization.BookInventoryOrg;
import Business.Organization.ClothingInventoryOrg;
import Business.Organization.Organization;
import Business.Resources.Resource;
import Business.WorkQueue.ProviderTaxBenefitWorkRequest;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author abhin
 */
public class PieChart_AWT extends ApplicationFrame{
    public static EcoSystem system;
    
    public PieChart_AWT(String title, EcoSystem system) {
        super(title);
        this.system = system;
    }
    
    public static PieDataset createDataSetForTotalResourceCalculation() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        int booksDonated = calculateTotalBookDonated();
        int clothesDonated = calculateTotalClothesDonated();
        dataset.setValue("Books", booksDonated);
        dataset.setValue("Clothes",clothesDonated);

        return dataset;        
    }
    
    public static PieDataset createTaxDataSet(){
        DefaultPieDataset dataset = new DefaultPieDataset();
        int app = calculateApprovedTaxBenefitRequests();
        int rej = calculateRejectedTaxBenefitRequests();
        
        dataset.setValue("Approved Requests", app);
        dataset.setValue("Rejected Requests", rej);
        
        return dataset;
    }
    
    public static int calculateTotalBookDonated(){
        int totalDonatedToNGO=0;
        
        for (Network n : system.getNetworkList()){
            
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    
                    if (o instanceof BookInventoryOrg){
                        BookInventoryOrg org = (BookInventoryOrg) o;
                        
                        if (org!=null){
                            for (Resource r : org.getBooksDonated().getResourceList()){
                                totalDonatedToNGO += r.getTotalDonatedToNGO();
                            }
                            
                        }
                        
                    }
                    
                }
            }
        }
        return totalDonatedToNGO;
    }
    
     public static int calculateTotalClothesDonated(){
        int totalDonatedToNGO=0;
        
        for (Network n : system.getNetworkList()){
            
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    
                    if (o instanceof ClothingInventoryOrg){
                        ClothingInventoryOrg org = (ClothingInventoryOrg) o;
                        
                        if (org!=null){
                            for (Resource r : org.getClothingDonated().getResourceList()){
                                totalDonatedToNGO += r.getTotalDonatedToNGO();
                            }
                            
                        }
                        
                    }
                    
                }
            }
        }
        return totalDonatedToNGO;
    }
     
    public static int calculateApprovedTaxBenefitRequests(){
        int approvedNumber=0;
        
        for (Network n : system.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if (e instanceof GovernmentEnterprise){
                    GovernmentEnterprise ge = (GovernmentEnterprise) e;
                    
                    if (ge !=null){
                        for (ProviderTaxBenefitWorkRequest ptb : ge.getProcessedRequestList()){
                            if (ptb.getApprovalDecision().equalsIgnoreCase("Approved")){
                                approvedNumber++;
                            }

                        }
                    }
                    
                }
            }
        }
        return approvedNumber;
    }
    
     public static int calculateRejectedTaxBenefitRequests(){
        int rejectedNumber=0;
        
        for (Network n : system.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if (e instanceof GovernmentEnterprise){
                    GovernmentEnterprise ge = (GovernmentEnterprise) e;
                    
                    if (ge !=null){
                        for (ProviderTaxBenefitWorkRequest ptb : ge.getProcessedRequestList()){
                            if (ptb.getApprovalDecision().equalsIgnoreCase("Rejected")){
                                rejectedNumber++;
                            }
                        }
                    }
                    
                }
            }
        }
        return rejectedNumber;
    }
    
}
