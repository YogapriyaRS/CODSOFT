import java.util.*;
public class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Subjects: ");
        int numberOfSubjects=sc.nextInt();
        int totalMarks=0;
        for(int i=0;i<numberOfSubjects;i++){
            System.out.println("Enter the marks earned in Subject "+(i+1)+" ");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
        double AvgMark=(double)totalMarks/(numberOfSubjects);
        Results(totalMarks,AvgMark);
        sc.close();
    }
    public static void Results(int totalMarks,double AvgMark){
        double percentage=AvgMark;
        System.out.println("Your Results are as follows:");
        System.out.println("Total Marks earned: "+totalMarks);
        System.out.println("Average Score Calculated: "+AvgMark);
        System.out.print("Overall Pecentage: ");
        if(percentage>=90)
        System.out.print("O");
        else if(percentage>=80 && percentage<90)
        System.out.print("A+");
        else if(percentage>=70 && percentage<80)
        System.out.print("A");
        else if(percentage>=60 && percentage<70)
        System.out.print("B+");
        else if(percentage>=50 && percentage<60)
        System.out.print("B");
        else if(percentage>=40 && percentage<50)
        System.out.print("C");
        else{
            System.out.println("RA");
            System.out.print("Note : RA stands for ReAppear in Exam");
        }
    }
}