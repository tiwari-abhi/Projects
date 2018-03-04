/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author abhin
 */
public class NGOResourceWorkRequest extends WorkRequest{
    
    String resourceType;
    String resourceName;
    int quantityNeeded;

    public String getResourceType() {
        return resourceType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
        
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }
    
    @Override
    public String toString(){
        return resourceName;
    }
       
        
}
