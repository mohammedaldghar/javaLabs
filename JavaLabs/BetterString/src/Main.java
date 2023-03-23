@FunctionalInterface
interface BetterString {
    boolean isBetter(String s1,String  s2);
}
@FunctionalInterface
interface stringlettel
{
    boolean isletter(String s1);
}


public class Main {
    public static void  main(String []args){

        String s1="Mohammed", s2="Dghar";

        String longer = betterString(s1, s2, (spredicate1, spredicate12) -> spredicate1.length() > spredicate12.length());
        System.out.println(longer);

        String first = betterString(s1, s2, (spredicate1, spredicate12) -> true);
        System.out.println(first);


        String letterstring="osdd333d";

        stringlettel letter = (s) -> {

            for (int i=0;i<s1.length();i++){
                if(!Character.isLetter(s1.charAt(i))) return false;
            }
            return true;
        };
        System.out.println(letter.isletter(letterstring));

    }

    public static String betterString(String s1, String s2, BetterString predicate) {
        if (predicate.isBetter(s1, s2)) {
            return s1;
        } else {
            return s2;
        }
    }
}