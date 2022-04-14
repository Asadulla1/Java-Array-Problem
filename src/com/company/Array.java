package com.company;

public class Array {
    String avaialbeCourses[] = new String[]{"Object oriented Analysis and Design",
            "Software Quality and Testing",
            "Advance Computer Network",
            "Network Security",
            "Data warehouse and Data Mining",
            "Advance Database Management",
            "Linear Programming"};
    public void showAvailableCourses(){
        for(int i=0;i<avaialbeCourses.length;i++){
            System.out.println((i+1)+"."+" "+avaialbeCourses[i]);

        }

    }
}
