import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
// Num 1
form f= new form();
f.setContentPane(f.pan);
f.setSize(400,400);
f.setVisible(true);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//Num 2
WordCount words=new WordCount();
words.setContentPane(words.msg);
words.setSize(400,400);
words.setVisible(true);
words.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}