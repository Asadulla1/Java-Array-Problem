package com.company;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        Array a = new Array();
        a.showAvailableCourses();
        sotreCart s = new sotreCart();
//        for(int i =0;i<3;i++){
           //s.setArray();
//        }
        //int i = 0;
        System.out.println("Enter number:");
        for(int i=0;i<=2;i++){
            s.setArray();
        }
        s.ShowStoreCourses();



    }
}
