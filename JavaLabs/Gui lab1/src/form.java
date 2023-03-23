import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class form  extends JFrame{
    private JTextField input;
    private JButton btn;
    public JPanel pan;

    public form() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    InetAddress ip=InetAddress.getByName(input.getText());
                    JOptionPane.showMessageDialog(null,"Ip Address is : "+ip);
                } catch (UnknownHostException e) {
                    throw new RuntimeException(e);
                }

            }
        });

    }

    private void createUIComponents() {

        // TODO: place custom component creation code here
    }
}
