package OOPS;
public class Lecture2 {
    public static void change(StudentClass s){// classes are passed by refernce
        s.name = "Rohan";
    }
    public static void main(String[] args) {
        StudentClass2 s1 = new StudentClass2("Himanshi",76,92.4); // call constructor
        
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.percentage);
        System.out.println(s1.schoolName);
        System.out.println(s1.numberOfStudents);//after objection creation numberofstudent will update to 1
      

        StudentClass2 s2 = new StudentClass2();//call default contructor
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.percentage);
        System.out.println(s2.numberOfStudents);
      
    }
}
