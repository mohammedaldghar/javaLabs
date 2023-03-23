import java.util.StringTokenizer;
class StringTokenizerTest{
public static void main(String [] args){
StringTokenizer s= new StringTokenizer("ITI develops people and ITI is the hoIuse of developers and ITI for people","ITI");
while (s.hasMoreTokens()){
System.out.println(s.nextToken());
}
}
}
