import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        ArrayList<Shape> s =new ArrayList<>();
        s.add(new Circle());
        s.add(new Rectangle());
        Picture p =new Picture();
        p.draw(s);

        /*ComplexNumber <Double>c =new ComplexNumber();
        ComplexNumber<Double> c2 =new ComplexNumber();
        System.out.println("Enter real part");
        c.real=input.nextDouble();
        System.out.println("Enter imaginery number");
        c.img=input.nextDouble();
        System.out.println("Enter real part");
        c2.real=input.nextDouble();
        System.out.println("Enter imaginery number");
        c2.img=input.nextDouble();
        ComplexNumber res = c.add(c2);
        System.out.println(res.toString());*/



    }
}