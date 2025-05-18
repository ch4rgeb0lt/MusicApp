import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Main extends JFrame {
    private JPanel MusicApp;
    private JTextField Name;
    private JComboBox Q1;
    private JComboBox Q2;
    private JComboBox Q3;
    private JButton SUBMITButton;

    private JLabel resultLabel;

    private int pick = 0;
    private int pop = 0;
    private int rock = 0;
    private int hiphop = 0;
    private int jazz = 0;
    private int indie = 0;

    Main() {
        setContentPane(MusicApp);
        setTitle("Music App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        String name = Name.getText();

        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // reset
                pick = pop = rock = hiphop = jazz = indie = 0;

                //Q1
                int q1Answer = Q1.getSelectedIndex();
                if (q1Answer == 0) pick++;
                else if (q1Answer == 1) {
                    rock += 2;
                    hiphop++;
                } else if (q1Answer == 2) jazz += 2;
                else if (q1Answer == 3) pop += 2;
                else if (q1Answer == 4) indie += 2;

                // Process Q2
                int q2Answer = Q2.getSelectedIndex();
                if (q2Answer == 0) pick++;
                else if (q2Answer == 1) {
                    hiphop += 2;
                    rock++;
                } else if (q2Answer == 2) pop += 2;
                else if (q2Answer == 3) jazz += 2;
                else if (q2Answer == 4) indie += 2;

                // Process Q3
                int q3Answer = Q3.getSelectedIndex();
                if (q3Answer == 0) pick++;
                else if (q3Answer == 1) {
                    indie += 2;
                    hiphop++;
                } else if (q3Answer == 2) jazz += 2;
                else if (q3Answer == 3) rock += 2;
                else if (q3Answer == 4) pop += 2;


                // process results
                String name = Name.getText().trim();
                if (name.isEmpty()) name = "Girly";

                int max = Math.max(Math.max(Math.max(pop, rock), Math.max(hiphop, jazz)), indie);

                String text = "";

                if (max == pop) text = "you're a Pop enthusiast!";
                if (max == rock) text = "you're a Rock rebel!";
                if (max == hiphop) text = "you've got Hip-Hop in your soul!";
                if (max == jazz) text = "you're a Jazz connoisseur!";
                if (max == indie) text = "you have Indie taste in music!";
                if (max == indie) text = "try to pick something, okay?";

                resultLabel.setText(name + ", " +  text);

                // animation
                new Thread(() -> {
                    try {
                        for (int i = 0; i < 3; i++) {
                            resultLabel.setForeground(new Color(101, 124, 106)); // Crimson
                            Thread.sleep(200);
                            resultLabel.setForeground(new Color(245, 236, 213)); // Steel blue
                            Thread.sleep(200);
                        }
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }).start();

                try {
                    FileWriter writer = new FileWriter("output.txt", true);
                    writer.write("═══════════════════════════════════════════════════════════════════════\n");
                    writer.write("User: " + name + " | Best Genre: " + text + "\n");
                    writer.write("═══════════════════════════════════════════════════════════════════════\n");

                    writer.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }


    public static void main(String[] args) {
        new Main();

        MusicAppIntro intro = new MusicAppIntro();
        intro.start();


    }
}

