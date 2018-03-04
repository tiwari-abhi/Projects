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
public class BookResource extends Resource{
    private String bookName;
    private String authorName;
    private double bookTaxbenefitPercent;

//    public static double taxBenefitPercent; //Common value for both Clothing and Book
//    //Can also help monitor if the tax benefit incentive is working or not.
//
//    public static double getTaxBenefitPercent() {
//        return taxBenefitPercent;
//    }
//
//    public static void setTaxBenefitPercent(double taxBenefitPercent) {
//        BookResource.taxBenefitPercent = taxBenefitPercent;
//    }
    
    public BookResource(){
    }

    public double getBookTaxbenefitPercent() {
        return bookTaxbenefitPercent;
    }

    public void setBookTaxbenefitPercent(double bookTaxbenefitPercent) {
        this.bookTaxbenefitPercent = bookTaxbenefitPercent;
    }
                        
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
        
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }  
    
    @Override
    public String toString(){
        return bookName;
    }
    
}
