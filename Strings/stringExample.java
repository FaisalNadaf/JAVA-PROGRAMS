package Strings;

import java.util.Arrays;

class stringExample {
    String s1 = "fsjuwaisaql";
    String s2 = "swjuaisaqfl";

    void print() {
        // Check if lengths of both strings are same
        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagrams of each other.");
            return;
        }

        // Convert strings to character arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Strings are anagrams of each other.");
        } else {
            System.out.println("Strings are not anagrams of each other.");
        }
    }
}

class mainclass {
    public static void main(String args[]) {
        stringExample s = new stringExample();
        s.print();
    }
}
