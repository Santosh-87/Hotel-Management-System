/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.controller.algorithms;

import com.hotelmanagementapp.model.CustomerModel;
import java.util.List;

/**
 * @author Santosh Lama 
 * LMU ID: 23048594
 */

/**
 * A class that implements the Binary Search algorithm to search for a customer
 * by name in a sorted list of CustomerModel objects.
 * 
 * Note: The list must be sorted in ascending order by customer name before 
 * performing the binary search.
 */
public class BinarySearch {

    /**
     * Searches for a CustomerModel object by the customer's name in a sorted
     * list using the Binary Search algorithm.
     *
     * @param searchValue the name of the customer to search for
     * @param sortedCheckInList the sorted list of CustomerModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @return the CustomerModel object if found; null otherwise
     */
    public CustomerModel searchByName(String searchValue, List<CustomerModel> sortedCheckInList, int left, int right) {

        if (right < left) {
            return null;
        }

        int mid = (left + right) / 2;

        if (searchValue.toLowerCase().equals(sortedCheckInList.get(mid).getCustomerName().toLowerCase())) {
            return sortedCheckInList.get(mid);
        } else if (searchValue.compareToIgnoreCase(sortedCheckInList.get(mid).getCustomerName()) < 0) {
            return searchByName(searchValue, sortedCheckInList, left, mid - 1);
        } else {
            return searchByName(searchValue, sortedCheckInList, mid + 1, right);
        }

    }
}
