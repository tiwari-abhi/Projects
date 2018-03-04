/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Providers.Provider;
import Business.Resources.Resource;
import Business.Resources.Sales.Sales;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.KeyedValues2DDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author abhin
 */
public class SalesBarChart_AWT extends ApplicationFrame{
    
    public static Provider provider;
    
    public static String[] months = {"January","February","March","April","May",
        "June","July","August","September","October","November","December"};
    
    public SalesBarChart_AWT(String title, Provider provider) {
        super(title);
        this.provider = provider;
    }
    
    public static KeyedValues2DDataset createDatasetForResourceSales( ) {
        DefaultKeyedValues2DDataset dataset = new DefaultKeyedValues2DDataset();
      
        for (int i=0; i<months.length; i++){
          int mfg = calculateMonthlyMfg(months[i]);
          int sold = calculateMonthlySold(months[i]);
          
          dataset.addValue(mfg,"Manufactured",months[i]);
          dataset.addValue(sold, "Sold", months[i]);
        }
        
      return dataset;
   }
    
   public static int calculateMonthlyMfg(String month){
       
       int totalMfg=0;
       
       for (Resource resources : provider.getResourceDirectory().getResourceList()){
           
           for (Sales sales : resources.getSalesRecord().getSalesRecordList()){
               
               if (sales.getMonth().equalsIgnoreCase(month)){
                   totalMfg += sales.getResourcesManufactured();
               }
               
           }
           
       }
       
       return totalMfg;
       
   }
   
   public static int calculateMonthlySold(String month){
       
       int totalSold=0;
       
       for (Resource resources : provider.getResourceDirectory().getResourceList()){
           
           for (Sales sales : resources.getSalesRecord().getSalesRecordList()){
               
               if (sales.getMonth().equalsIgnoreCase(month)){
                   totalSold += sales.getResourcesSold();
               }
               
           }
           
       }
       
       return totalSold;
       
   }
    
}
