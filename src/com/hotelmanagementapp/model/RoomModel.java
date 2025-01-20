/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.model;

/**
 *
 * Represents a room in the hotel management system. This class encapsulates the
 * details of a room, including its number, type, grade, bed configuration,
 * pricing, and availability status. It includes getters and setters to manage
 * room details efficiently.
 *
 * @author Santosh Lama 
 * LMU ID: 23048594
 *
 */
public class RoomModel {

    private int roomNumber;
    private String roomType;
    private String roomGrade;
    private String bedType;
    private double price;
    private String status;
    
    public RoomModel(int roomNumber, String roomType, String roomGrade, String bedType, double price, String status) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomGrade = roomGrade;
        this.bedType = bedType;
        this.price = price;
        this.status = status;
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
    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Gets the room type.
     *
     * @return the room type.
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the room type.
     *
     * @param roomType the room type to set.
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * Gets the room grade.
     *
     * @return the room grade.
     */
    public String getRoomGrade() {
        return roomGrade;
    }

    /**
     * Sets the room grade.
     *
     * @param roomGrade the room grade to set.
     */
    public void setRoomGrade(String roomGrade) {
        this.roomGrade = roomGrade;
    }

    /**
     * Gets the bed type.
     *
     * @return the bed type.
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * Sets the bed type.
     *
     * @param bedType the bed type to set.
     */
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    /**
     * Gets the price of the room.
     *
     * @return the price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the room.
     *
     * @param price the price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the status of the room.
     *
     * @return the status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the room.
     *
     * @param status the status to set.
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
