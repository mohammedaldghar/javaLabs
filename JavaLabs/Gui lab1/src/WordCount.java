import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCount extends JFrame{
    private JTextArea str;
    public JPanel msg;
    private JButton getChar;
    private JButton getWords;
public WordCount() {
    getWords.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
String words[]= str.getText().split(" ");
JOptionPane.showMessageDialog(null,"Number of words = "+words.length,"Words",JOptionPane.INFORMATION_MESSAGE);
        }
    });
    getChar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null,"Number of Characters with spaces = "+ str.getText().length(),"Words",JOptionPane.INFORMATION_MESSAGE);
        }
    });
}
}
