/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.controller.datastructures;

import com.hotelmanagementapp.model.CustomerModel;
import java.util.LinkedList;
import java.util.List;

/**
 * MyStack is a custom stack implementation for managing CustomerModel objects. 
 * It uses a LinkedList for efficient LIFO (Last In, First Out) operations.
 * 
 * Features:
 * - Add customers with `push`.
 * - Remove customers with `pop`.
 * - Peek at the last customer using `peek`.
 * - Check stack size with `poll`.
 * - Verify if the stack is empty with `isEmpty`.
 * 
 * Designed for customer management in a hotel system.
 * 
 * @author Santosh Lama
 * LMU ID: 23048594
 * 
 */
public class CustomerStack {
     private List<CustomerModel> customerList; // Internal storage for the stack.  

    /**
     * Constructs a CustomStack with the specified capacity.
     *
     */
    public CustomerStack() {
        this.customerList = new LinkedList<>();
    }

    /**
     * Removes and returns the last element from the stack.
     *
     * @return the first CleanModel in the stack, or null if the stack is empty.
     */
    public CustomerModel pop() {
        return customerList.removeLast();
    }

    /**
     * Adds a new element to the end of the stack
     *
     * @param CustomerModel the CustomerModel to be added to the stack.
     */
    public void push(CustomerModel CustomerModel) {
        customerList.addLast(CustomerModel);
    }

    /**
     * Returns the current size of the stack.
     *
     * @return the number of elements in the stack.
     */
    public int poll() {
        return customerList.size();
    }

    /**
     * Retrieves, but does not remove, the last element of the stack.
     *
     * @return the last CustomerModel in the stack
     */
    public CustomerModel peek() {
        return customerList.getLast();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return customerList.isEmpty();
    }

}
