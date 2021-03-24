package com.edureka;

public class StringDemo {
    public static void main(String[] args)
    {
        String s1 = "Shreya";
        String s2 = "Patil";
        String s3 = "Shre";
        String s4 = "Shreya";
        System.out.println("Length of the string : "+s1.length());

        //print substring from the beginning index 2
        //print substring from the beginning index 2 and ending index 4
        System.out.println("Substrings of String : "+s1.substring(2)+","+s1.substring(2,4));

        //compareTo method compares string lexicographically
//        If first string is lexicographically greater than second string,
//        it returns positive number (difference of character value).
//        If first string is less than second string lexicographically, it returns negative number and
//        if first string is lexicographically equal to second string, it returns 0.
        System.out.println("Comparison between two Strings : "+s1.compareTo(s2));
        System.out.println("Comparison between two Strings : "+s1.compareTo(s3));
        System.out.println("Comparison between two Strings : "+s1.compareTo(s4));

        //equals method compares original content of the string
        System.out.println("Check equality of strings :"+s1.equals(s2));
        System.out.println("Check equality of strings :"+s1.equals(s4));

        // == operator compares references not values
        System.out.println("Check equality of strings :"+(s1==s2));
        System.out.println("Check equality of strings :"+(s1==s4));

        //isEmpty() method checks whether the string is empty or not
        String s = "";
        System.out.println("Check whether string is empty or not: "+(s1.isEmpty()));
        System.out.println("Check whether string is empty or not: "+(s.isEmpty()));
        
        //Convert to lower case
        System.out.println("To convert into lower case : "+s1.toLowerCase());
        
        //Convert to Upper Case
        System.out.println("To convert to Upper Case : "+s1.toUpperCase());

        //Convert int to String
        int a = 1000;
        String str = String.valueOf(a);
        System.out.println("Conversion from int to String : "+str);

        //replace characters in string
        String name = "Mahasansthapak";
        String replace = name.replace('a','e');
        System.out.println(" After Replacement of characters :"+replace);

        //contains - searches seq of characters in the string
        System.out.println("Whether seq is in string or not ? "+replace.contains("pak"));
        System.out.println("Whether seq is in string or not ? "+replace.contains("pek"));

        //charAt() returns character present at that index
        System.out.println("Character at index 2 is : "+s1.charAt(2));

        //endsWith() returns true if string ends with that sequence
        System.out.println("Whether string ends with ya : "+s1.endsWith("ya"));
    }
}
