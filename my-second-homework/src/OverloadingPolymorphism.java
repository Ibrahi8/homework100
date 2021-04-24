
public class OverloadingPolymorphism  {
	
    public static void add(int a, int b){
        int s=a+b;
        System.out.println(a +" + " + b + " = "+s);
    }
    public static void add(double a, double b){
        double s=a+b;
        System.out.println(a +" + " + b + " = "+s);
    }
    public static void main(String[] args) {
        add(5,5);
        add(2.5,3.0);
    }
}
