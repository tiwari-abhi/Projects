package POJO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhin
 */
public class Application {
    
    int app_ID;
    String app_Name;
    String app_Desc;
    String rel_Date;
    String cost;

    public int getApp_ID() {
        return app_ID;
    }

    public void setApp_ID(int app_ID) {
        this.app_ID = app_ID;
    }

    public String getApp_Name() {
        return app_Name;
    }

    public void setApp_Name(String app_Name) {
        this.app_Name = app_Name;
    }

    public String getApp_Desc() {
        return app_Desc;
    }

    public void setApp_Desc(String app_Desc) {
        this.app_Desc = app_Desc;
    }

    public String getRel_Date() {
        return rel_Date;
    }

    public void setRel_Date(String rel_Date) {
        this.rel_Date = rel_Date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString(){
        return String.valueOf(app_ID);
    }
}
