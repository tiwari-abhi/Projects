/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Providers;

import java.util.ArrayList;

/**
 *
 * @author abhin
 */
public class ProviderDirectory {
    
    private ArrayList<Provider> providerDirectory;
    
    public ProviderDirectory(){
        providerDirectory = new ArrayList<Provider>();
    }

    public ArrayList<Provider> getProviderDirectory() {
        return providerDirectory;
    }

    public void setProviderDirectory(ArrayList<Provider> providerDirectory) {
        this.providerDirectory = providerDirectory;
    }
            
    public Provider addToProviderDirectory(String name, String email){
        Provider provider = new Provider();
        provider.setName(name);
        provider.setEmail(email);
        providerDirectory.add(provider);
        return provider;
    }
    
    public void removeManufacturer(Provider provider){
        providerDirectory.remove(provider);
    }
}
