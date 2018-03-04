/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Providers;

import Business.Resources.ResourceDirectory;

/**
 *
 * @author abhin
 */
public class Provider {
    
    private String name;
    private String email;
    
    private static int count=0;
    private int id;
    
    private ResourceDirectory resourceDirectory;
    private ResourceDirectory donatedResources;
    
    public Provider(){
        ++count;
        id = count;
        resourceDirectory = new ResourceDirectory();
        donatedResources = new ResourceDirectory();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
    public ResourceDirectory getDonatedResources() {
        return donatedResources;
    }

    public void setDonatedResources(ResourceDirectory donatedResources) {
        this.donatedResources = donatedResources;
    }
    

    public ResourceDirectory getResourceDirectory() {
        return resourceDirectory;
    }

    public void setResourceDirectory(ResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
    }
                   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    @Override
    public String toString(){
        return name;
    }
    
    
}
