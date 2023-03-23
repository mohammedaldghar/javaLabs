import java.lang.String;
class StringTest{
public static void main(String[] args){
String s = "ITI develops People and ITI the hosue of developers and ITI for people.";
String words [] =s.split(" ");
int count =0;
for(int i=0;i<words.length;i++){
if (words[i].equals("ITI")){
count++;
}
}
System.out.println("Number of word ITI= "+count);
String findString="ITI";
int newCount=0;
int indexOfWord=0;
while (indexOfWord!=-1){
indexOfWord=s.indexOf(findString,indexOfWord);
if (indexOfWord !=-1){
indexOfWord++;
newCount++;
}
}
System.out.println("Number of word ITI= "+newCount);
}
}
