package OOPS;
public class FractionClass {
  public static class Fraction{
    int num;
    int deno;
    // craete constructor
    public Fraction(int num , int deno){
        this.num = num;
        this.deno = deno;
    }
    public void simplify(){
        if(num<deno){
            if(deno%num==0){
                deno = deno/num;
                num = 1;
            }
        }
    }
  }
    public static void main(String[] args) {
        // Fraction f1 = new Fraction();
        // f1.num = 3;
        // f1.deno = 7;
        Fraction f2 = new Fraction(7, 21);
        System.out.println(f2.num+"/"+f2.deno);
        f2.simplify();
        System.out.println(f2.num+"/"+f2.deno);
    }
}