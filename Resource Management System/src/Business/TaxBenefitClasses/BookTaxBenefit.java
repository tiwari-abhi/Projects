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
public class BookTaxBenefit {
    
    private static BookTaxBenefit bookTaxBenefit;
    
    private double booktaxBenefitPercentage;
    
    public static BookTaxBenefit getInstance() {
        if (bookTaxBenefit == null) {
            bookTaxBenefit = new BookTaxBenefit();
        }
        return bookTaxBenefit;
    }
    
    private BookTaxBenefit(){
//        booktaxBenefitPercentage = 0;
    }

    public double getBooktaxBenefitPercentage() {
        return booktaxBenefitPercentage;
    }

    public void setBooktaxBenefitPercentage(double booktaxBenefitPercentage) {
        this.booktaxBenefitPercentage = booktaxBenefitPercentage;
    }
       
}
