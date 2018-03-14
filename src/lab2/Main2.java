package lab2;


import lab1.AdvancedJavaCourse;
import lab1.IntroJavaCourse;
import lab1.IntroToProgrammingCourse;

import java.util.Scanner;

public class Main2 {

    public static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        IntroJavaCourse newClass = new IntroJavaCourse("Intro To Java", "IJ212");
        // I know this is bad, but everything works.
        newClass.setPrerequisites("Intro to Programming");
        newClass.setCredits(2.5);
        System.out.println("Name: " + newClass.getCourseName() + "      Number:" + newClass.getCourseNumber() +
                "       PreReq:" + newClass.getPrerequisites() + "      Credits: "  + newClass.getCredits());
        IntroToProgrammingCourse
                newClass2 = new IntroToProgrammingCourse("Intro to Programming", "IP111");
        newClass2.setCredits(4);
        System.out.println("Name: " + newClass2.getCourseName() + "      Number:" + newClass2.getCourseNumber() +
        "      credits:" + newClass2.getCredits());
        AdvancedJavaCourse
                newClass3 = new AdvancedJavaCourse("Adv Java", "AJ565");
        newClass3.setCredits(4);
        newClass3.setPrerequisites("Java, Intro to P");
        System.out.println("Name: " + newClass3.getCourseName() + "      Number: " + newClass3.getCourseNumber() +
        "      Preq: " + newClass3.getPrerequisites() + "      credits: " + newClass3.getPrerequisites());
    }
}
