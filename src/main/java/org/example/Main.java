package org.example;

import java.util.ArrayList;

public class Main {

    public static String insertDash(int num) {
        // Your code here...
        String s = String.format("%d", num);
        ArrayList<String> list = new ArrayList<>();
        list.add(String.format("%c", s.charAt(0) ));
        for(int i=1;i<s.length();i++){
            int left = Integer.parseInt(String.format("%c", s.charAt(i-1) ));
            int right = Integer.parseInt(String.format("%c", s.charAt(i) ));
            if(left % 2 != 0 && right % 2 != 0){
                list.add("-");
            }
            list.add(String.format("%c", s.charAt(i) ));
        }
        return String.join("",list);
    }

    public static void main(String[] args) {
        System.out.println(insertDash(454793));
    }
}
/*
454793 ---> "4547-9-3"
     0 ---> "0"
     1 ---> "1"
13579  ---> "1-3-5-7-9"
 86420 ---> "86420"

 */
