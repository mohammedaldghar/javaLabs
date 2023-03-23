import java.util.ArrayList;

public class Picture {
    public void draw(ArrayList<? extends Shape> s){
        for (int i=0;i<s.size();i++){
            System.out.println(s.get(i).type);
        }
    }
}
