package grades;

import java.util.Scanner;

public class Dapp {

    public void getGrades() {
        Scanner sc = new Scanner(System.in);

        AdGrades[] gr = new AdGrades[100];

        System.out.print("Enter number of students: ");
        int nums = sc.nextInt(); 

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter details of student " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Prelim: ");
            double pr = sc.nextDouble();

            System.out.print("Enter Midterm: ");
            double md = sc.nextDouble();

            System.out.print("Enter Prefinal: ");
            double pf = sc.nextDouble();

            System.out.print("Enter Final: ");
            double fn = sc.nextDouble();

          
            gr[i] = new AdGrades();
            gr[i].addGrades(name, id, pr, md, pf, fn);
        }

       
        for (int i = 0; i < nums; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            gr[i].viewGrades();
        }

        sc.close(); 
    }
}
