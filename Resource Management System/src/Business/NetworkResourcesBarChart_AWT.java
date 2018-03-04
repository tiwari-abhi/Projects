/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BookProviderOrg;
import Business.Organization.ClothingProviderOrg;
import Business.Organization.Organization;
import Business.Providers.Provider;
import Business.Resources.BookResource;
import Business.Resources.ClothingResource;
import Business.Resources.Resource;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author abhin
 */
public class NetworkResourcesBarChart_AWT extends ApplicationFrame{
   public static EcoSystem system;
        
   public NetworkResourcesBarChart_AWT(String applicationTitle, EcoSystem system) {
      super(applicationTitle);
      this.system = system;
   }
   
   public static CategoryDataset createDataset( ) {
      final String totalExcessProduced = "Resources Remaining w/ Providers";
      final String totalDonatedToSystem = "Resources Remaining w/ System";        
      final String totalDonatedToNGO = "Total Donated to NGO";        
      
      String[] networkNamesList = new String[system.getNetworkList().size()];
      
      networkNamesList = getNetworkNames();
      
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  

      for (int i=0; i<networkNamesList.length; i++){
        String network = networkNamesList[i];
        
        int totExcess = calculateTotalExcessResource(network);
        dataset.addValue(totExcess , totalExcessProduced , network);
        
        int totSys = calculateTotalDonatedToSystem(network);
        dataset.addValue(totSys , totalDonatedToSystem , network);
        
        int totNGO = calculateTotalDonatedToNGO(network);
        dataset.addValue(totNGO , totalDonatedToNGO , network);
        
      }
      return dataset; 
   }
   
   public static String[] getNetworkNames(){
       String[] networkNames=new String[system.getNetworkList().size()];
       for (int i=0; i < system.getNetworkList().size(); i++){
           networkNames[i] = system.getNetworkList().get(i).getName();
       }
       return networkNames;
   }
   
   public static int calculateTotalExcessResource(String networkName){
       int bookResourceTotal=0;
       int clothingResourceTotal=0;
              
       for (Network n : system.getNetworkList()){
           if (n.getName().equalsIgnoreCase(networkName)){
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()){

                        if (o instanceof BookProviderOrg){
                            BookProviderOrg org = (BookProviderOrg) o;

                            if (org!=null){

                                for (Provider providers : org.getBookProviderDirectory().getProviderDirectory()){
                                    for (Resource resource : providers.getDonatedResources().getResourceList()){
                                        if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Book.getValue())){
                                            BookResource br = (BookResource) resource;
                                            bookResourceTotal += br.getTotalExcessUnits();
                                        }
                                    }
                                }

                            }

                        } else if (o instanceof ClothingProviderOrg) {
                            ClothingProviderOrg org = (ClothingProviderOrg) o;

                            if (org!=null){

                                for (Provider providers : org.getClothingProviderDirectory().getProviderDirectory()){
                                    for (Resource resource : providers.getDonatedResources().getResourceList()){
                                        if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Clothing.getValue())){
                                            ClothingResource cr = (ClothingResource) resource;
                                            clothingResourceTotal += cr.getTotalExcessUnits();
                                        }
                                    }
                                }
                            }
                        }               
                    }
                }
            }
       }
       return bookResourceTotal + clothingResourceTotal;
   }
   
   public static int calculateTotalDonatedToSystem(String networkName){
       int bookResourceTotal=0;
       int clothingResourceTotal=0;
              
       for (Network n : system.getNetworkList()){
           if (n.getName().equalsIgnoreCase(networkName)){
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()){

                        if (o instanceof BookProviderOrg){
                            BookProviderOrg org = (BookProviderOrg) o;

                            if (org!=null){

                                for (Provider providers : org.getBookProviderDirectory().getProviderDirectory()){
                                    for (Resource resource : providers.getDonatedResources().getResourceList()){
                                        if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Book.getValue())){
                                            BookResource br = (BookResource) resource;
                                            bookResourceTotal += br.getTempDonatedToSystem();
                                        }
                                    }
                                }

                            }

                        } else if (o instanceof ClothingProviderOrg) {
                            ClothingProviderOrg org = (ClothingProviderOrg) o;

                            if (org!=null){

                                for (Provider providers : org.getClothingProviderDirectory().getProviderDirectory()){
                                    for (Resource resource : providers.getDonatedResources().getResourceList()){
                                        if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Clothing.getValue())){
                                            ClothingResource cr = (ClothingResource) resource;
                                            clothingResourceTotal += cr.getTempDonatedToSystem();
                                        }
                                    }
                                }
                            }
                        }               
                    }
                }
            }
       }
       return bookResourceTotal + clothingResourceTotal;
   }
   
   public static int calculateTotalDonatedToNGO(String networkName){
       int bookResourceTotal=0;
       int clothingResourceTotal=0;
              
       for (Network n : system.getNetworkList()){
           if (n.getName().equalsIgnoreCase(networkName)){
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()){

                        if (o instanceof BookProviderOrg){
                            BookProviderOrg org = (BookProviderOrg) o;

                            if (org!=null){

                                for (Provider providers : org.getBookProviderDirectory().getProviderDirectory()){
                                    for (Resource resource : providers.getDonatedResources().getResourceList()){
                                        if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Book.getValue())){
                                            BookResource br = (BookResource) resource;
                                            bookResourceTotal += br.getTotalDonatedToNGO();
                                        }
                                    }
                                }

                            }

                        } else if (o instanceof ClothingProviderOrg) {
                            ClothingProviderOrg org = (ClothingProviderOrg) o;

                            if (org!=null){

                                for (Provider providers : org.getClothingProviderDirectory().getProviderDirectory()){
                                    for (Resource resource : providers.getDonatedResources().getResourceList()){
                                        if (resource.getResourceType().equalsIgnoreCase(Resource.ResourceType.Clothing.getValue())){
                                            ClothingResource cr = (ClothingResource) resource;
                                            clothingResourceTotal += cr.getTotalDonatedToNGO();
                                        }
                                    }
                                }
                            }
                        }               
                    }
                }
            }
       }
       return bookResourceTotal + clothingResourceTotal;
   }
      
}
