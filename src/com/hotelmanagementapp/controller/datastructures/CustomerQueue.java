/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.controller.datastructures;

import com.hotelmanagementapp.model.CustomerModel;
import java.util.LinkedList;
import java.util.List;

/**
 * MyQueue is a custom queue implementation for managing CustomerModel objects. 
 * It uses a LinkedList for efficient FIFO (First In, First Out) operations.
 * 
 * Features:
 * Add customers with `enQueue`.
 * Remove customers with `deQueue`.
 * Peek at the first customer using `peek`.
 * Check queue size with `poll`.
 * Verify if the queue is empty with `isEmpty`.
 * 
 * Designed for customer management in a hotel system.
 * 
 * @author Santosh Lama 
 * LMU ID: 23048594
 */
public class CustomerQueue {

    private List<CustomerModel> customerList; // Internal storage for the queue.  

    /**
     * Constructs a CustomQueue
     */
    public CustomerQueue() {
        this.customerList = new LinkedList<>();
    }

    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first Customer in the queue, or null if the queue is empty.
     */
    public CustomerModel deQueue() {
        return customerList.removeFirst();
    }

    /**
     * Adds a new element to the end of the queue
     *
     * @param CustomerModel the CustomerModel to be added to the queue.
     */
    public void enQueue(CustomerModel CustomerModel) {
        customerList.addLast(CustomerModel);
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
    public int poll() {
        return customerList.size();
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first CustomerModel in the queue
     */
    public CustomerModel peek() {
        return customerList.getFirst();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return customerList.isEmpty();
    }
}
