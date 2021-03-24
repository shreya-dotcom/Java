package com.edureka;

public class StringDemo1 {
    public static void main(String[] args)
    {
        //StringBuffer
        StringBuffer sb = new StringBuffer("Welcome to Java ");
        System.out.println("Original String : "+sb);
        sb.append("Shreya");
        System.out.println("After appending string: "+sb);
        sb.insert(15,",");
        System.out.println("After inserting in String : "+sb);
        sb.delete(0,1);
        System.out.println("After deleting String : "+sb);
        sb.replace(0,5,"shre");
        System.out.println("After replacement in the string : "+sb);
        System.out.println("After reversing string : "+sb.reverse());
        System.out.println("Capacity of String : "+sb.capacity());

        //StringBuilder
        StringBuilder s = new StringBuilder("Heyy,How are you");
        System.out.println("Original String : "+s);
        s.append(" ?");
        System.out.println("After appending string : "+s);
        s.delete(0,3);
        System.out.println("After deleting : "+s);
        s.insert(2,"shera");
        System.out.println("After inserting : "+s);
        System.out.println("Reverse the string : "+s.reverse());
    }
}
