package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String checkVal : array) {
            if (checkVal.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[array.length - i - 1] = array[i];
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i;
        int j = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i].equals(array[array.length - 1 - i])) {
                j += 1;
            }

        }
        if (i == j) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        // Create a boolean array to track the occurrence of each letter in the alphabet
        boolean[] alphabet = new boolean[26];

        // Loop through each string in the array
        for (String str : array) {
            // Convert the string to lowercase to make it case-insensitive
            str = str.toLowerCase();

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                // If the character is a letter, mark its occurrence in the alphabet array
                if (c >= 'a' && c <= 'z') {
                    alphabet[c - 'a'] = true;
                }
            }
        }

        // Check if all the letters in the alphabet have occurred at least once
        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String checkVal : array) {
            if (checkVal.equals(value)) {
                count++;
//        String[] newArray =  new String[array.length];
//        for (int i = 0; i < newArray.length; i++) {
//            if (newArray[i] == value){
//                count++;
//            }
//        }
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> noVal = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)){
              noVal.add(array[i]);
            }
            //to convert array list to array. run for loop to fulfill parameters and last step is to change array list to array.
            //see below
        }
        String[] strA = noVal.toArray(new String[noVal.size()]);
        return strA;
    }

            /**
             * @param array array of chars
             * @return array of Strings with consecutive duplicates removes
             */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){

                ArrayList<String> noDupes = new ArrayList<String>();
                for (int i = 0; i < array.length; i++) {
                    if (i == 0 || !array[i].equals(array[i-1])) {
                        noDupes.add(array[i]);
                        }
                }
            String[] strA = noDupes.toArray(new String[noDupes.size()]);
                return strA;
        }

                /**
                 * @param array array of chars
                 * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
                 */ // TODO
            public static String[] packConsecutiveDuplicates (String[]array){

                return null;
            }


        }

