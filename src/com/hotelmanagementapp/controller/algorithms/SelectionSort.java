/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.controller.algorithms;

/**
 *
 * @author Santosh Lama 
 * LMU ID: 23048594
 */
import com.hotelmanagementapp.model.RoomModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements the selection sort algorithm to sort a list of RoomModel objects
 * by room price in either ascending or descending order.
 */
public class SelectionSort {

    public SelectionSort() {

    }

    /**
     * Sorts a list of RoomModel objects by their Room Number in ascending or
     * descending order.
     *
     * @param roomList the list of roomModel objects to be sorted
     * @param isAscending specifies the sort order (true for ascending, false for
     * descending)
     * @return the sorted list
     */
    public List<RoomModel> sortByRoomPrice(List<RoomModel> roomList, boolean isAscending) {

        List<RoomModel> sortedRoomList = new ArrayList<>(roomList);
        for (int i = 0; i < sortedRoomList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(sortedRoomList, i, isAscending);
            if (i != extremumIndex) {
                swap(sortedRoomList, i, extremumIndex);
            }
        }

        return sortedRoomList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param roomSortList the list of RoomModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<RoomModel> roomSortList, int startIndex, boolean isAscending) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < roomSortList.size(); j++) {
            if (shouldSwap(roomSortList.get(j).getPrice(), roomSortList.get(extremumIndex).getPrice(), isAscending)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(double current, double extremum, boolean isAscending) {
        return isAscending ? current < extremum : current > extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param roomSortList the list of RoomList objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<RoomModel> roomSortList, int i, int j) {
        RoomModel temp = roomSortList.get(i);
        roomSortList.set(i, roomSortList.get(j));
        roomSortList.set(j, temp);
    }
}
