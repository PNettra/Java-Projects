import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YourSong extends JFrame {
    private JPanel MainPanel;
    private JTextField txtSong;
    private JButton btnClick;
    private JTextField txtName;
    private JButton resultsButton;

    public YourSong() {
    btnClick.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(btnClick, txtSong.getText() + " " + txtSong.getText() + " " + txtSong.getText() + " ");
        }
    });

    resultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(resultsButton, txtName.getText() + " " + txtName.getText() + " " + txtName.getText() + " ");
            }
        });

}



    public static void main(String[] args) {
        YourSong letitbe = new YourSong();
        letitbe.setContentPane(letitbe.MainPanel);
        letitbe.setTitle("Song");
        letitbe.setSize(300, 400);
        letitbe.setVisible(true);
        letitbe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
