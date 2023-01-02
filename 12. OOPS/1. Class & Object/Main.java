
import java.util.*;
import java.io.*;

class Student {
    int rollNo;
    String name;
    int marks;

    public void study(String subject) {
        System.out.println(name + " Studies" + " " + subject);
    }
}

public class Main {
    public static void main(String[] args) {

        int[] marks = new int[4];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;

        String[] name = new String[4];
        name[0] = "Bade Bhaijaan";
        name[1] = "Chhote Bhaijaan";
        name[2] = "razu";
        name[3] = "Ammi";

        Student Imtiyaz = new Student();
        Imtiyaz.marks = 10;
        Imtiyaz.rollNo = 10;
        Imtiyaz.name = "imtiyaz";
        System.out.println(Imtiyaz.marks + " " + Imtiyaz.name + " " + Imtiyaz.rollNo);
        Imtiyaz.study("DSA");

        Student Mustak = new Student();
        Mustak.marks = 10;
        Mustak.rollNo = 10;
        Mustak.name = "mustak";
        System.out.println(Mustak.marks + " " + Mustak.name + " " + Mustak.rollNo);
        Mustak.study("OOPS");

    }
}
