package OOPS;
public class Lecture1 {
    // public static class Student{// class is created
    //     String name;
    //     private int rollNo;
    //     double percentage;
    // }
    // public static void fun(Student x){
    //     System.out.println(x.name);
    //     System.out.println(x.rollNo);
    //     return;
    // }
    public static void change(StudentClass s){// classes are passed by refernce
        s.name = "Rohan";
    }
  public static void main(String[] args) {
   StudentClass x = new StudentClass(); // object of name x is created
   x.name = "Raghav";
//    x.rollNo = 78;
   x.percentage = 92.6;
//    System.out.println(x.name);
//    fun(x);
//    change(x);
//    fun(x);
      System.out.println(x.getRoll());//getter
         x.setRoll(79);//setter
         System.out.println(x.getRoll());//used to print updated value
         
  }  
}
