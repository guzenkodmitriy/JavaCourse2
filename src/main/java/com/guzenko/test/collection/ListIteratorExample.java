package com.guzenko.test.collection;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char c : s.toCharArray()){
            list.add(c);
        }
        System.out.println(list);

        ListIterator<Character> listIterator1 = list.listIterator();
        ListIterator<Character> listIterator2 = list.listIterator(list.size());

        boolean isPalindrome = false;
        while (listIterator1.hasNext() && listIterator2.hasPrevious()){
            isPalindrome = listIterator1.next().equals(listIterator2.previous());
            if (!isPalindrome){
                break;
            }
        }
        System.out.println(isPalindrome);
        

    }
}
