/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.controller.algorithms;

import com.hotelmanagementapp.model.RoomModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santosh Lama 
 * LMU ID: 23048594
 */
/**
 * A class that implements the Merge Sort algorithm to sort RoomModel objects.
 */
public class MergeSort {

    public MergeSort() {

    }

    /**
     * Sorts a list of RoomModel objects by their Room Number in ascending or
     * descending order using the Merge Sort algorithm.
     *
     * @param roomList the list of RoomModel objects to be sorted
     * @param isAscending specifies the sort order (true for ascending, false
     * for descending)
     * @return the sorted list
     */
    public List<RoomModel> sortByRoomNumber(List<RoomModel> roomList, boolean isAscending) {
        List<RoomModel> sortedRoomList = new ArrayList<>(roomList);
        mergeSort(sortedRoomList, isAscending, 0, roomList.size() - 1);
        return sortedRoomList;
    }

    /**
     * Recursively divides the list into smaller sublists and merges them in
     * sorted order.
     *
     * @param roomList the list of RoomModel objects
     * @param isAscending specifies the sort order (true for ascending, false
     * for descending)
     * @param left the starting index of the sublist
     * @param right the ending index of the sublist
     */
    private void mergeSort(List<RoomModel> roomList, boolean isAscending, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(roomList, isAscending, left, mid); // left half
        mergeSort(roomList, isAscending, mid + 1, right); // rigth half

        merge(roomList, isAscending, left, mid, right);
    }

    /**
     * Merges two sorted sublists into a single sorted sublist.
     *
     * @param roomList the list of RoomModel objects
     * @param isAscending specifies the sort order (true for ascending, false
     * for descending)
     * @param start the starting index of the first sublist
     * @param mid the ending index of the first sublist and starting index of
     * the second
     * @param end the ending index of the second sublist
     */
    private void merge(List<RoomModel> roomList, boolean isAscending, int start, int mid, int end) {
        List<RoomModel> temporaryRoomList = new ArrayList();
        int leftIndex = start;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= end) {
            if (isAscending) {
                if (roomList.get(leftIndex).getRoomNumber() <= roomList.get(rightIndex).getRoomNumber()) {
                    temporaryRoomList.add(roomList.get(leftIndex++));
                } else {
                    temporaryRoomList.add(roomList.get(rightIndex++));
                }
            } else {
                if (roomList.get(leftIndex).getRoomNumber() >= roomList.get(rightIndex).getRoomNumber()) {
                    temporaryRoomList.add(roomList.get(leftIndex++));
                } else {
                    temporaryRoomList.add(roomList.get(rightIndex++));
                }
            }

        }

        while (leftIndex <= mid) {
            temporaryRoomList.add(roomList.get(leftIndex++));
        }

        while (rightIndex <= end) {
            temporaryRoomList.add(roomList.get(rightIndex++));
        }

        for (int i = start; i <= end; i++) {
            roomList.set(i, temporaryRoomList.get(i - start));
        }

    }
}
