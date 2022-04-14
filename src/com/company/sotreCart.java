package com.company;

import java.util.Scanner;

public class sotreCart extends Array{
    Scanner sc = new Scanner(System.in);
    String storeCourses[] = new String[5];

    public void setArray(){

        boolean flag = true;
        int courseSelection = sc.nextInt();
                   switch (courseSelection) {
                   case 1:
                       for (int i = 0; i < storeCourses.length; i++) {
                           if (storeCourses[i] == null) {
                               storeCourses[i] = avaialbeCourses[0];
                           }
                           // break;
                       }


                   case 2:
                       for (int i = 0; i < storeCourses.length; i++) {
                           if (storeCourses[i] == null) {
                               storeCourses[i] = avaialbeCourses[1];
                           }
                           // break;
                       }

                       break;
               }

           }





    public void ShowStoreCourses(){
        for(int i=0;i< storeCourses.length;i++){
            System.out.println(storeCourses[i]);
            break;
        }
    }

}
/*
if(courseSelection == 1){
//                    for(int i =0;i<storeCourses.length;i++){
//                        storeCourses[i] =avaialbeCourses[0];
//                    }
//                }
//                else if(courseSelection == 2){
//                    for(int i =0;i<storeCourses.length;i++){
//                        storeCourses[i] =avaialbeCourses[1];
//                    }
//                }
//            }
 */