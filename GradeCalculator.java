import java.util.*;
public class GradeCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Student: ");
        String name = sc.nextLine();
        System.out.println("Enter marks out of 100");
        System.out.println("Enter marks in integer");
        System.out.println("Enter marks in hindi: ");
        int hindi = sc.nextInt();
        System.out.println("Enter marks in English: ");
        int english = sc.nextInt();
        System.out.println("Enter marks in Maths: ");
        int maths = sc.nextInt();
        System.out.println("Enter marks in Java: ");
        int java = sc.nextInt();
        System.out.println("Enter marks in DSA: ");
        int dsa = sc.nextInt();
       int totalMarks =  hindi+english+maths+java+dsa;
       System.out.println("Total marks of " +name+ " is " +totalMarks);
       int avg = totalMarks/5;
       System.out.println("Average Marks of student is = "+avg);
       double percentage = totalMarks / 5;
       System.out.println("Percentage of Student is = "+percentage);
       if(percentage<=100&&percentage>=90) {
    	   System.out.println("Grade is = A1");
    	   
       }else if(percentage<=89&&percentage>=80){
    	   System.out.println("Grade is = A2");
    	   
       }else if(percentage<=79&&percentage>=70){
    	   System.out.println("Grade is = B1");
    	   
       }else if(percentage<=69&&percentage>=60){
    	   System.out.println("Grade is = B2");
    	   
       }else if(percentage<=59&&percentage>=50){
    	   System.out.println("Grade is = C1");
    	   
       }else if(percentage<=49&&percentage>=40){
    	   System.out.println("Grade is = C2");
    	   
       }else if(percentage<=39&&percentage>=33){
    	   System.out.println("Grade is = D");
    	   
       }else {
    	   System.out.println("Grade is = Failed");
       }
    }
}
