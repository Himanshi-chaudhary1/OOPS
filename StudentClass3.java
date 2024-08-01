package OOPS;
public class StudentClass3 {
    public static void Change(StaticKeyword s){
        s.name = "Himanshi";
    }
    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword("Himanshi",76,88.6);
        System.out.println(s1.getNumberOfStudent());//getter only work with objects not with class bcz of static
        // System.out.println(s1.numberOfStudent);
        StaticKeyword s2 = new StaticKeyword("Hash",78,90);
        System.out.println(s2.getNumberOfStudent());
        // System.out.println(s2.numberOfStudent);
        StaticKeyword s3 = new StaticKeyword("Abhishek",79,95);
        System.out.println(s3.getNumberOfStudent());
        // System.out.println(s3.numberOfStudent);
    }
}
