package OOPS;
public class StudentClass {
    // class is created
        String name;
        private int rollNo;
         double percentage;
  public int  getRoll(){ //get function
    return rollNo;
  }
  public void setRoll(int rollNo){ // set function
    // rollNo = y;
    this.rollNo = rollNo;// here this keyword defines the class attribute
    //names rollNo which is not equals to int rollNo
  }
}
