
// package com.company;
import java.util.Scanner;

public class pro01 {
    String usn;
    String Name;
    String Branch;
    int Phone;
    // private static String[] args;

    void insertrecord(String reg, String name, String branch, int phone) {
        usn = reg;
        Name = name;
        Branch = branch;
        Phone = phone;
    }

    void displayrecord() {
        System.out.println("Students details are");
        System.out.println(usn + " " + Name + " " + Branch + " " + Phone);
    }

    public static void main(String args[]) {
        // sha.args = args;1'
        pro01 s[] = new pro01[100];
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter no of students");
        int n = Sc.nextInt();
        for (int i = 0; i < n; i++) {
            s[i] = new pro01();

            for (int j = 0; j < n; j++) {
                System.out.println("enter usn,name,branch,phone");
                String usn = Sc.next();
                String Name = Sc.next();
                String Branch = Sc.next();
                int Phone = Sc.nextInt();
                s[i].insertrecord(usn, Name, Branch, Phone);
                 {
                    Sc.close();
                }
            }
            for (int m = 0; m < n; m++) {
                s[m].displayrecord();
            }
        }
            
    }
}
