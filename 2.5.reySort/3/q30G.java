/*

    MAU cse111 Page 1 - Spring2026
    
    Create a static method called removeDuplicates() that will remove the duplicates from a given array.
    Sample Output (for the given case below):
        [CSE110, CSE111, CSE220]

 */

import java.util.Arrays;

public class q30G {
    public static String[] removeDuplicates(String arr) {
        /* Implement this function  */
    }

    public static void main(String[] args) {
        String [] arr = {"CSE110", "CSE111", "CSE220", "CSE220", "CSE110", "CSE110", "CSE111"};

        String [] new_array = removeDuplicates(arr);
        System.out.println(Arrays.toString(new_array));
    }
}