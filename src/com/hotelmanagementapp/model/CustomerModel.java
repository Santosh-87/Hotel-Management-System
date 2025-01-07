/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.model;

import java.util.Date;

/**
 *
 * @author Santosh Lama 
 * LMU ID: 23048594
 */

/**
 * Represents a customer in the hotel management system. 
 * This class holds details about a customer's personal information, 
 * room preferences, check-in and check-out details, and billing information.
 * 
 * The class also includes getters and setters for all properties, 
 * allowing controlled access and modification of customer data.
 * 
 */
public class CustomerModel {

    private String customerName;
    private String mobileNumber;
    private String gender;
    private String nationality;
    private String bedType;
    private String roomType;
    private int roomNumber;
    private String checkInDate;
    private String mealPlan;
    private String checkInPreference;
    private String checkOutDate;
    private double pricePerDay;
    private double totalAmount;

    public CustomerModel(String customerName, String mobileNumber, String gender, String nationality, String mealPlan, String checkInPreference, int roomNumber, String checkInDate) {
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.nationality = nationality;
        this.mealPlan = mealPlan;
        this.checkInPreference = checkInPreference;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
    }

    public CustomerModel(String customerName, String mobileNumber, String checkInDate, String checkOutDate, double pricePerDay, double totalAmount) {
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.pricePerDay = pricePerDay;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getCheckInPreference() {
        return checkInPreference;
    }

    public void setCheckInPreference(String checkInPreference) {
        this.checkInPreference = checkInPreference;
    }

}
