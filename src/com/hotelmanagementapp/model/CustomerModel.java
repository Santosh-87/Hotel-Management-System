/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.model;

/**
 * Represents a customer in the hotel management system. This class holds
 * details about a customer's personal information, room preferences, check-in
 * and check-out details, and billing information.
 *
 * The class also includes getters and setters for all properties, allowing
 * controlled access and modification of customer data.
 *
 * @author Santosh Lama LMU ID: 23048594
 *
 */
public class CustomerModel {

    private String customerName;
    private String mobileNumber;
    private String gender;
    private String nationality;
    private int roomNumber;
    private String checkInDate;
    private String checkOutDate;
    private String mealPlan;
    private String checkInPreference;

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

    public CustomerModel(String customerName, int roomNumber, String checkInDate) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
    }

    /**
     * Gets the customer's name.
     *
     * @return the customer's name.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the customer's name.
     *
     * @param customerName the customer's name to set.
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets the mobile number.
     *
     * @return the mobile number.
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the mobile number.
     *
     * @param mobileNumber the mobile number to set.
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * Gets the customer's gender.
     *
     * @return the gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the customer's gender.
     *
     * @param gender the gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the nationality of the customer.
     *
     * @return the nationality.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the customer.
     *
     * @param nationality the nationality to set.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Gets the room number.
     *
     * @return the room number.
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the room number.
     *
     * @param roomNumber the room number to set.
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Gets the check-in date.
     *
     * @return the check-in date.
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the check-in date.
     *
     * @param checkInDate the check-in date to set.
     */
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * Gets the meal plan preference.
     *
     * @return the meal plan preference.
     */
    public String getMealPlan() {
        return mealPlan;
    }

    /**
     * Sets the meal plan preference.
     *
     * @param mealPlan the meal plan preference to set.
     */
    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    /**
     * Gets the check-in preference.
     *
     * @return the check-in preference.
     */
    public String getCheckInPreference() {
        return checkInPreference;
    }

    /**
     * Sets the check-in preference.
     *
     * @param checkInPreference the check-in preference to set.
     */
    public void setCheckInPreference(String checkInPreference) {
        this.checkInPreference = checkInPreference;
    }

    /**
     * Gets the check-out date.
     *
     * @return the check-out date.
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the check-out date.
     *
     * @param checkOutDate the check-out date to set.
     */
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

}
