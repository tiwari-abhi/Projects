/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resources;

/**
 *
 * @author abhin
 */
public class ClothingResource extends Resource{
    
    private String clothingItemName;
    private String manufacturerName;   
    private double clothesTaxBenefitPercent;
    
//    public static double taxBenefitPercent; //Common value for both Clothing and Book
//    //Can also help monitor if the tax benefit incentive is working or not.

//    public static double getTaxBenefitPercent() {
//        return taxBenefitPercent;
//    }
//
//    public static void setTaxBenefitPercent(double taxBenefitPercent) {
//        ClothingResource.taxBenefitPercent = taxBenefitPercent;
//    }

    public double getClothesTaxBenefitPercent() {
        return clothesTaxBenefitPercent;
    }

    public void setClothesTaxBenefitPercent(double clothesTaxBenefitPercent) {
        this.clothesTaxBenefitPercent = clothesTaxBenefitPercent;
    }
            
    public String getClothingItemName() {
        return clothingItemName;
    }

    public void setClothingItemName(String clothingItemName) {
        this.clothingItemName = clothingItemName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    
    @Override
    public String toString(){
        return clothingItemName;
    }
    
}
