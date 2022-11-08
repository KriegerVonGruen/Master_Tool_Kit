import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener
{

    //  create Font's
    static Font largeFont = new Font("Ink Free", Font.BOLD, 25);
    static Font mediumFont = new Font("Ink Free", Font.BOLD, 20);
    static Font smallFont = new Font("Ink Free", Font.BOLD, 15);

    // all Frame parts
    JFrame mainFrame;
    JMenuBar menuBar;
    JMenu tools;
    JMenuItem mIRechner, mINotiz, mIihkKey;
    JLabel headLab;

    public void gui()
    {
        // create Frame
        mainFrame = new JFrame();
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,150);
        mainFrame.setResizable(true);
        mainFrame.setBackground(Color.LIGHT_GRAY);
        mainFrame.setLocationRelativeTo(null);

        // create MenuBar
        menuBar = new JMenuBar();

        // create Menue's
        tools = new JMenu("Tool's");
        tools.setFont(smallFont);

        mIRechner = new JMenuItem("Calculator");
        mIRechner.setFont(smallFont);
        mIRechner.addActionListener(this);

        mINotiz = new JMenuItem("Memo");
        mINotiz.setFont(smallFont);
        mINotiz.addActionListener(this);

        mIihkKey = new JMenuItem("IHK-Noten");
        mIihkKey.setFont(smallFont);
        mIihkKey.addActionListener(this);

        //  create Container
        mainFrame.getContentPane().setLayout(null);

        // add MenuItem's to Menu's
        tools.add(mINotiz);
        tools.add(mIihkKey);
        tools.add(mIRechner);

        // add Menu's to MenuBar
        menuBar.add(tools);

        // add HeadLabel
        headLab = new JLabel("+++ Master Tool Kit +++");
        headLab.setBounds(90,0, 200,80);
        headLab.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        headLab.setFont(mediumFont);
        headLab.setVisible(true);

        mainFrame.setJMenuBar(menuBar);

        mainFrame.add(headLab);

      //  mainFrame.add(topPanel);

        mainFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // set MenuItem Rechner
        if ( e.getSource() == mIRechner )
        {
            if ( Calculator.calculatorFrame != null )
            {
                Calculator.setCalcVisOn();
            }
            else
            {
                Calculator calculator = new Calculator();
                calculator.calculator();
                Calculator.setCalcVisOn();
            }
        }
        // set MenuItem Notiz
        if ( e.getSource() == mINotiz )
        {
            if ( Notiz.notizFrame != null )
            {
                Notiz.setNotizVisOn();
            }
            else
            {
                Notiz notiz = new Notiz();
                notiz.notiz();
                Notiz.setNotizVisOn();
            }
        }
        if ( e.getSource() == mIihkKey)
        {
            if ( IHK_Notenschluessel.ihkFrame != null)
            {
                IHK_Notenschluessel.setIhkVisOn();
            }
            else
            {
                IHK_Notenschluessel nuttenSchluesselIhk = new IHK_Notenschluessel();
                nuttenSchluesselIhk.nuttenSchluessel();
                IHK_Notenschluessel.setIhkVisOn();
            }
        }
    }
}




