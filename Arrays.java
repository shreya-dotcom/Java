package com.edureka;
import java.util.Scanner;
public class Arrays {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //For simple Arrays
        System.out.println("Enter no of elements in an array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements an array : ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Enter the position of the element of an array : ");
        int pos = sc.nextInt();
        System.out.println("Array found at position "+pos+" is :"+array[pos]);

        //For multidimensional Arrays
        System.out.println("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns : ");
        int c = sc.nextInt();
        int[][] mul = new int[r][c];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mul[i][j]=sc.nextInt() ;
            }
        }

        System.out.println("Multidimensional Array elements :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the position of the element : ");
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        System.out.println("Element at the position "+"("+p1+","+p2+")"+"is : "+mul[p1][p2]);

    }

}
