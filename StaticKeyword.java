package OOPS;
public class StaticKeyword {
    String name;
    int roll;
    double percnt;
    private static int numberOfStudent;// static help to create only one box which can be access by multiple obj pof same class

public StaticKeyword(){
    // default constructor
}
public StaticKeyword(String name,int roll,double percnt){
    this.name = name;
    this.roll = roll;
    this.percnt = percnt;
    numberOfStudent++;
}
public int getNumberOfStudent(){// if the variable is private and static pritn val by gettter
    return  numberOfStudent;
}
}