package OOPS;
public class StudentClass2 {
       String name;
        int rollNo;
        double percentage; 
        final String schoolName = "RIA";
        int numberOfStudents;

        public StudentClass2(){
          //default java constructor
        }
        public StudentClass2(String naam , int roll , double per){//Constructor
           name = naam;
           rollNo = roll;
           percentage = per;
           numberOfStudents++;
        }
        public int  getRoll(){ //get function
            return rollNo;
          }
          public void setRoll(int rollNo){ // set function
            // rollNo = y;
            this.rollNo = rollNo;
}
}
