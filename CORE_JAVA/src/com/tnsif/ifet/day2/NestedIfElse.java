package com.tnsif.ifet.day2;

public class NestedIfElse {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        if(a>b){
            if(a>c)
            System.out.print("ais largest");
            else
            System.out.print("c is largest");
        }
        else{
            if(b>c)
            System.out.print("b is largest");
            else
            System.out.print("c is largest");
        }
    }
}
