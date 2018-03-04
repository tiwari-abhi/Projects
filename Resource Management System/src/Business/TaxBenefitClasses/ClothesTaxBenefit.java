/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TaxBenefitClasses;

/**
 *
 * @author abhin
 */
public class ClothesTaxBenefit {
    
    private double clothesTaxBenefitPercentage;
    
    private static ClothesTaxBenefit clothesTaxBenefit;
    
    public static ClothesTaxBenefit getInstance() {
        if (clothesTaxBenefit == null) {
            clothesTaxBenefit = new ClothesTaxBenefit();
        }
        return clothesTaxBenefit;
    }

    public double getClothesTaxBenefitPercentage() {
        return clothesTaxBenefitPercentage;
    }

    public void setClothesTaxBenefitPercentage(double clothesTaxBenefitPercentage) {
        this.clothesTaxBenefitPercentage = clothesTaxBenefitPercentage;
    }   
    
}
