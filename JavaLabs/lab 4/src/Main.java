import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Age");
        OwenException ex=new OwenException();

        try {
            String age = input.nextLine();
            if (age.isEmpty()){
                ex.setAgeEmpty(age);
            }
            else if (Integer.parseInt(age)<0){
                ex.setAgeNeg(Integer.parseInt(age));
            }else if (Integer.parseInt(age)==0) {
                ex.setAgeAsZero(Integer.parseInt(age));
            }
            else {
                ex.setAgeString(age);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}