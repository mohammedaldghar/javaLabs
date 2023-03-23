import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words ;
        char contd;
        char key;
        String data;
        Map<Character, ArrayList<String>> index = new HashMap<>();
        do{
        words=new ArrayList<>();
        System.out.println("Enter the key char");
         key = input.next().charAt(0);
         input.nextLine();
        System.out.println("Enter values then print -1");
        do {
            System.out.print("Enter data: ");
            data = input.nextLine();
            if (data.charAt(0) == key) {
                words.add(data);
            } else {
                System.out.println("You can't add data Start with different Char");
            }

        } while (!data.equals("-1"));
        Collections.sort(words);
        index.put(key, words);
            System.out.println("Do you want to add another char to map? y : n");
            contd=input.next().charAt(0);
    }while (contd=='y');
        System.out.println("Your map is : ");
        printData(index);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Enter key char To Search");
        char searchKey=input.next().charAt(0);
        printCharData(searchKey,index);

    }
    public static void printData(Map<Character, ArrayList<String>> m){
        m.forEach((key,value)->{
            System.out.println("Values for Char "+key+" : " +value);
        });

    }
    public static void printCharData(char ind,Map<Character, ArrayList<String>> data){
        data.forEach((key,value)->{
            if (key==ind){
                System.out.println("Values for "+ind+" is : "+value);
            }
        });
    }
}