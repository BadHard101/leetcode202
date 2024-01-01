package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int temp = 0;
            while (n != 0) {
                int digit = n % 10;
                temp += digit * digit;
                n /= 10;
            }
            n = temp;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}