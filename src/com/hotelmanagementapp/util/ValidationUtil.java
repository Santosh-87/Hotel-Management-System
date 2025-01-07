/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanagementapp.util;

/**
 *
 * @author Santosh Lama LMU ID: 23048594
 */
import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern ROOM_NUMBER_PATTERN = Pattern.compile("^[1-9]\\d{0,2}$"); // 1-3 digits, no leading zero
    private static final Pattern PRICE_PATTERN = Pattern.compile("^[1-9]\\d{0,4}(\\.\\d{1,2})?\\s*$"); // Positive integer/decimal, optional 2 decimal places
    private static final Pattern ROOM_TYPE_PATTERN = Pattern.compile("^(AC|Non-AC)\\s*$"); // AC or Non-AC
    private static final Pattern ROOM_GRADE_PATTERN = Pattern.compile("^(Standard|Deluxe|Family Suite|Presidential Suite)\\s*$"); // Predefined room grades
    private static final Pattern BED_TYPE_PATTERN = Pattern.compile("^(Single-bed|Double-bed)\\s*$"); // Pre-defined Bed types
    private static final Pattern STATUS_PATTERN = Pattern.compile("^(Booked|Not-Booked)\\s*$"); // Pre-defined Room status
    private static final Pattern CUSTOMER_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]{2,50}$");
    private static final Pattern GENDER_PATTERN = Pattern.compile("^(Male|Female)\\s*$"); // Pre-defined Gender types
    private static final Pattern MOBILE_NUMBER_PATTERN = Pattern.compile("^98\\d{8}$"); // 
    private static final Pattern NATIONALITY_PATTERN = Pattern.compile("^[a-zA-Z\\s]{2,30}$"); // Matches a valid nationality (2 to 20 alphabetic characters, including spaces)
    private static final Pattern MEAL_PLAN_PATTERN = Pattern.compile("^(Breakfast only|Full Board|No Meal)\\s*$");
    private static final Pattern CHECKIN_PREFERENCE_PATTERN = Pattern.compile("^(Morning|Afternoon|Evening)\\s*$");

    /**
     * Validates Room Number.
     *
     * @param roomNumber the room number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidRoomNumber(String roomNumber) {
        return ROOM_NUMBER_PATTERN.matcher(roomNumber).matches();
    }

    /**
     * Validates Price.
     *
     * @param price the price to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPrice(String price) {
        return PRICE_PATTERN.matcher(price).matches();
    }

    /**
     * Validates Room Type.
     *
     * @param roomType the room type to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidRoomType(String roomType) {
        return ROOM_TYPE_PATTERN.matcher(roomType).matches();
    }

    /**
     * Validates Room Grade.
     *
     * @param roomGrade the room grade to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidRoomGrade(String roomGrade) {
        return ROOM_GRADE_PATTERN.matcher(roomGrade).matches();
    }

    /**
     * Validates Bed Type.
     *
     * @param bedType the bed type to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBedType(String bedType) {
        return BED_TYPE_PATTERN.matcher(bedType).matches();
    }

    /**
     * Validates Status.
     *
     * @param status the room status to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStatus(String status) {
        return STATUS_PATTERN.matcher(status).matches();
    }

    /**
     * Validates Customer Name.
     *
     * @param name the customer name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidCustomerName(String name) {
        return CUSTOMER_NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates Customer Name.
     *
     * @param gender the gender to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidGender(String gender) {
        return CUSTOMER_NAME_PATTERN.matcher(gender).matches();
    }

    /**
     * Validates Mobile Number.
     *
     * @param mobile the mobile number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidMobileNumber(String mobile) {
        return MOBILE_NUMBER_PATTERN.matcher(mobile).matches();
    }

    /**
     * Validates Nationality.
     *
     * @param nationality the nationality to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidNationality(String nationality) {
        return NATIONALITY_PATTERN.matcher(nationality).matches();
    }

    /**
     * Validates Meal Plan.
     *
     * @param mealPlan the meal plan to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidMealPlan(String mealPlan) {
        return MEAL_PLAN_PATTERN.matcher(mealPlan).matches();
    }

    /**
     * Validates Check In Preference Selection.
     *
     * @param checkInPreference the checkInPreference to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidCheckInPreference(String checkInPreference) {
        return CHECKIN_PREFERENCE_PATTERN.matcher(checkInPreference).matches();
    }
}
