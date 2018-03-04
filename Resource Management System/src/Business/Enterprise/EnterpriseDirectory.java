/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        
        Enterprise enterprise = null;
        
        if (type == Enterprise.EnterpriseType.BookEnterprise){
            enterprise = new BookEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.ClothingEnterprise){
            enterprise = new ClothingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.GovernmentEnterprise){
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.NGOEnterprise){
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public void removeEnterprise(String entName, Enterprise.EnterpriseType type){
        for (Enterprise e : enterpriseList){
            if (e.getName().equals(entName) && e.getEnterpriseType().equals(type)){
                enterpriseList.remove(e);
                break;
            }
        }
    }
    
}
