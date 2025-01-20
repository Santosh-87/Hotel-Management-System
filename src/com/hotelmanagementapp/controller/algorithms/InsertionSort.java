/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.controller.algorithms;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.hotelmanagementapp.model.CustomerModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements the insertion sort algorithm to sort a list of CustomerModel
 * objects by customer name in either ascending or descending order.
 *
 * @author Santosh Lama 
 * LMU ID: 23048594
 */
public class InsertionSort {

    public InsertionSort() {

    }

    /**
     * Sorts a LinkedList of CustomerModel objects by their customerName in
     * ascending or descending order.
     *
     * @param customerList the LinkedList of CustomerModel objects to be sorted
     * @param isAscending specifies the sort order (true for ascending, false
     * for descending)
     * @return the sorted LinkedList
     */
    public List<CustomerModel> sortByCustomerName(List<CustomerModel> customerList, boolean isAscending) {

        List<CustomerModel> sortedCustomerList = new ArrayList<>(customerList);
        // Perform insertion sort on the ArrayList
        for (int i = 1; i < sortedCustomerList.size(); i++) {
            CustomerModel key = sortedCustomerList.get(i);
            int j = i - 1;

            // Compare based on order
            while (j >= 0 && shouldSwap(sortedCustomerList.get(j).getCustomerName(), key.getCustomerName(), isAscending)) {
                sortedCustomerList.set(j + 1, sortedCustomerList.get(j));
                j--;
            }
            sortedCustomerList.set(j + 1, key);
        }

        return sortedCustomerList;
    }

    /**
     * Determines whether two strings should be swapped based on the sort order.
     *
     * @param currentName the current string
     * @param key the key string
     * @param isAscending specifies the sort order (true for ascending, false
     * for descending)
     * @return true if the strings should be swapped; false otherwise
     */
    private boolean shouldSwap(String currentName, String key, boolean isAscending) {
        return isAscending ? currentName.compareToIgnoreCase(key) > 0 : currentName.compareToIgnoreCase(key) < 0;
    }
}
