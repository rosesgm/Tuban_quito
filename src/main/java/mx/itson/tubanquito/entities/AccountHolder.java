/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tubanquito.entities;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author DanielMorales
 */
public class AccountHolder {

    //all AccountHolder attributes were encapsulated
    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the taxpayerId
     */
    public String getTaxpayerId() {
        return taxpayerId;
    }

    /**
     * @param taxpayerId the taxpayerId to set
     */
    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }

    /**
     * @return the zipCode
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    /*code is the account holder code
    name is the account holder name
    address is the account holder address
    city is the account holder city
    taxpayerId is the account holder taxpayer id
    zipCode is the account holder zip code
    */
    private int code;
    private String name;
    private String address;
    private String city;
    @SerializedName("taxpayer-id")
    private String taxpayerId;
    @SerializedName("zip-code")
    private int zipCode;   
    
}
