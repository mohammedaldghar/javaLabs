import java.util.StringTokenizer;
class IpAddress{
public static void main(String [] args){
StringTokenizer s= new StringTokenizer("192.66.125.30",".");
while (s.hasMoreTokens()){
System.out.println(s.nextToken());
}
}
}
