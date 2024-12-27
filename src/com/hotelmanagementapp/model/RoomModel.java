/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.model;

/**
 *
 * @author lamab
 */
public class RoomModel {

    private int roomNumber;
    private String roomType;
    private String roomGrade;
    private String bedType;
    private double price;

    public RoomModel(int roomNumber, String roomType, String roomGrade, String bedType, double price, String status) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomGrade = roomGrade;
        this.bedType = bedType;
        this.price = price;
        this.status = status;
    }
    private String status;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomGrade() {
        return roomGrade;
    }

    public void setRoomGrade(String roomGrade) {
        this.roomGrade = roomGrade;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
