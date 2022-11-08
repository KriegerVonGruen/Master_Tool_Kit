import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class IHK_Notenschluessel extends JFrame implements ActionListener {
    static JFrame ihkFrame;
    JLabel ueberschrift;
    JLabel maxLab;
    JTextField maxPoint;
    JLabel istLab;
    JTextField istPoint;
    JButton calculateBtn;
    JTextArea resultTxAr;
    Font mediumFont = new Font("Arial", Font.BOLD, 14);
    public static void setIhkVisOn()
    {
        ihkFrame.setVisible(true);
    }
    public void nuttenSchluessel()
    {
        ihkFrame = new JFrame();
        ihkFrame.setSize(320,500);
        ihkFrame.setLocationRelativeTo(null);
        ihkFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        ihkFrame.setResizable(false);
        ihkFrame.setLayout(null);

        ueberschrift = new JLabel("IHK Notenschlüssel");
        ueberschrift.setBounds(50,10,200,30);
        ueberschrift.setFont(mediumFont);
        ueberschrift.setHorizontalAlignment(SwingConstants.CENTER);
        ueberschrift.setVisible(true);

        maxLab = new JLabel("Eingabe Maximale Punktzahl");
        maxLab.setBounds(50,50,200,30);
        maxLab.setFont(mediumFont);
        maxLab.setHorizontalAlignment(SwingConstants.CENTER);
        maxLab.setVisible(true);

        maxPoint= new JTextField();
        maxPoint.setBounds(50,80,200,30);
        maxPoint.setFont(mediumFont);
        maxPoint.setToolTipText("Eingabe Maximale Punktzahl");
        maxPoint.setHorizontalAlignment(SwingConstants.CENTER);
        maxPoint.addActionListener(this);
        maxPoint.setVisible(true);

        istLab = new JLabel("Eingabe erreichte Punktzahl");
        istLab.setBounds(50,120,200,30);
        istLab.setFont(mediumFont);
        istLab.setHorizontalAlignment(SwingConstants.CENTER);
        istLab.setVisible(true);

        istPoint= new JTextField();
        istPoint.setBounds(50,150,200,30);
        istPoint.setFont(mediumFont);
        istPoint.setToolTipText("Eingabe erreichte Punktzahl");
        istPoint.setHorizontalAlignment(SwingConstants.CENTER);
        istPoint.addActionListener(this);
        istPoint.setVisible(true);

        calculateBtn = new JButton("Berechnen");
        calculateBtn.setBounds(50,260,200,30);
        calculateBtn.setFont(mediumFont);
        calculateBtn.setHorizontalAlignment(SwingConstants.CENTER);
        calculateBtn.addActionListener(this);
        calculateBtn.setVisible(true);

        resultTxAr = new JTextArea(10,10);
        resultTxAr.setBounds(50,300,200,80);
        resultTxAr.setFont(mediumFont);
        resultTxAr.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        resultTxAr.setEditable(false);
        resultTxAr.setAlignmentX(SwingConstants.CENTER);
        resultTxAr.setVisible(true);

        ihkFrame.add(ueberschrift);
        ihkFrame.add(maxLab);
        ihkFrame.add(maxPoint);
        ihkFrame.add(istLab);
        ihkFrame.add(istPoint);
        ihkFrame.add(calculateBtn);
        ihkFrame.add(resultTxAr);

        ihkFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if ( e.getSource() == calculateBtn )
        {
            if (Objects.equals(maxPoint.getText(), "") )
            {
                JOptionPane.showMessageDialog(ihkFrame, "Textfeld leer");
            }
            else
            {
                if ( Objects.equals(istPoint.getText(), ""))
                {
                    JOptionPane.showMessageDialog(ihkFrame, "Textfeld leer");
                }
                else
                {
                    String maxPunkte = maxPoint.getText();
                    float max_Punkte = Float.parseFloat(maxPunkte);
                    String istPunkte = istPoint.getText();
                    float ist_Punkte = Float.parseFloat(istPunkte);
                    int prozentsatz = (Math.round(ist_Punkte * 100 / max_Punkte));
                    if (prozentsatz <= 100 && prozentsatz >= 98)
                    {
                        resultTxAr.setText("\nSie haben " + prozentsatz + " % erreicht.\n\nDas ist die Note: 1.0 ");
                    }
                    else if (prozentsatz <= 97 && prozentsatz >= 92)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 1.4");
                    }
                    else if (prozentsatz <= 91 && prozentsatz >= 89)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 1.6");
                    }
                    else if (prozentsatz <= 88 && prozentsatz >= 84)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 2.0");
                    }
                    else if (prozentsatz <= 83 && prozentsatz >= 81)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 2.4");
                    }
                    else if (prozentsatz <= 80 && prozentsatz >= 79)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 2.6");
                    }
                    else if (prozentsatz <= 78 && prozentsatz >= 73)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 3.0");
                    }
                    else if (prozentsatz <= 72 && prozentsatz >= 67)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 3.4");
                    }
                    else if (prozentsatz <= 66 && prozentsatz >= 64)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 3.6");
                    }
                    else if (prozentsatz <= 63 && prozentsatz >= 57)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 4.0");
                    }
                    else if (prozentsatz <= 56 && prozentsatz >= 50)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 4.4");
                    }
                    else if (prozentsatz <= 49 && prozentsatz >= 46)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 4.6");
                    }
                    else if (prozentsatz <= 45 && prozentsatz >= 38)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 5.0");
                    }
                    else if (prozentsatz <= 37 && prozentsatz >= 30)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 5.4");
                    }
                    else if (prozentsatz <= 29 && prozentsatz >= 19)
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 5.6");
                    }
                    else
                    {
                        resultTxAr.setText("\nErreicht: " + prozentsatz + " %\n\nDas entspricht der Note: 6.0");
                    }
                }
            }
        }
    }
}