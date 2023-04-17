package Task3.one;

public class Main {
    public static void main(String[] args) {
        MyComplex complex = new MyComplex(3,5.4);
        MyComplex complex1 = new MyComplex(5,2.9);
        MyComplex complex2 = new MyComplex(3,4);

        System.out.println(complex.equals(3,5.4));
        System.out.println(complex1.equals(complex));
        System.out.println(complex2.magnitude());
    }
}
