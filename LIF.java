import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LIF extends JFrame {

  Border ob = BorderFactory.createLineBorder(new Color(0xa0d6d4));
  JPanel bcl = new JPanel();
  JLabel dob = new JLabel();
  JLabel tnme = new JLabel();
  JLabel nme = new JLabel();
  JLabel lnme = new JLabel();
  JLabel nnme = new JLabel();
  JLabel llnme = new JLabel();
  JLabel rgn = new JLabel();
  JLabel g = new JLabel();
  JTextField tfnme = new JTextField();
  JTextField tlnme = new JTextField();
  JTextField ttfnme = new JTextField();
  JPasswordField cpw = new JPasswordField();
  JRadioButton bg = new JRadioButton();
  JRadioButton bg2 = new JRadioButton();
  JRadioButton bg3 = new JRadioButton();
  JRadioButton bg4 = new JRadioButton();
  ButtonGroup gp = new ButtonGroup();
  JCheckBox ag = new JCheckBox();
  JCheckBox shw = new JCheckBox();
  JButton r = new JButton();
  JButton s = new JButton();
  String[] days = {
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10",
    "11",
    "12",
    "13",
    "14",
    "15",
    "16",
    "17",
    "18",
    "19",
    "20",
    "21",
    "22",
    "23",
    "24",
    "25",
    "26",
    "27",
    "28",
    "29",
    "30",
    "31",
  };
  JComboBox<String> dt = new JComboBox<String>(days);
  String[] months = {
    "January",
    "Febuary",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December",
  };
  JComboBox<String> mnt = new JComboBox<String>(months);
  String[] years = {
    "1995",
    "1996",
    "1997",
    "1998",
    "1999",
    "2000",
    "2001",
    "2002",
    "2003",
    "2004",
    "2005",
    "2006",
    "2007",
    "2008",
    "2009",
    "2010",
    "2011",
    "2012",
    "2013",
    "2014",
    "2015",
    "2016",
    "2017",
    "2018",
    "2019",
    "2020",
    "2021",
    "2022",
    "2022",
    "2023",
    "2024",
  };
  JComboBox<String> yr = new JComboBox<String>(years);
  String server[] = { "Teacher", "Student" };
  JList<String> svr = new JList<String>(server);

  public static void main(String[] args) {
    LIF frame = new LIF();
    frame.setTitle("Register");
    frame.setVisible(true);
    frame.setSize(870, 600);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon image = new ImageIcon("logo.png");
    frame.setIconImage(image.getImage());
    frame.getContentPane().setBackground(new Color(0xa0d6d4));
  }

  public LIF() {
    setLayout(null);

    tnme.setBounds(320, 20, 250, 35);
    tnme.setText("Make An Account");
    tnme.setForeground(Color.white);
    tnme.setFont(new Font("Open Sans", Font.BOLD, 25));
    add(tnme);

    nme.setBounds(150, 100, 100, 20);
    nme.setText("First Name");
    nme.setForeground(Color.white);
    nme.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(nme);

    nnme.setBounds(150, 140, 100, 20);
    nnme.setText("Last Name");
    nnme.setForeground(Color.white);
    nnme.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(nnme);

    tfnme.setBounds(240, 100, 150, 25);
    tfnme.setBorder(ob);
    add(tfnme);

    ttfnme.setBounds(240, 140, 150, 25);
    ttfnme.setBorder(ob);
    add(ttfnme);

    lnme.setBounds(420, 100, 100, 20);
    lnme.setText("Phone No.");
    lnme.setForeground(Color.white);
    lnme.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(lnme);

    llnme.setBounds(420, 140, 100, 20);
    llnme.setText("Occupation");
    llnme.setForeground(Color.white);
    llnme.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(llnme);

    tlnme.setBounds(520, 100, 150, 25);
    tlnme.setBorder(ob);
    add(tlnme);

    svr.setBounds(520, 140, 150, 44);
    svr.setFont(new Font("Open Sans", Font.BOLD, 13));
    svr.setBorde  r(ob);
    add(svr);

    bg.setBounds(255, 305, 60, 25);
    bg.setText("Male");
    bg.setBackground(new Color(0xa0d6d4));
    bg.setFont(new Font("Open Sans", Font.BOLD, 12));
    add(bg);

    bg2.setBounds(315, 305, 75, 25);
    bg2.setText("Female");
    bg2.setBackground(new Color(0xa0d6d4));
    bg2.setFont(new Font("Open Sans", Font.BOLD, 12));
    add(bg2);

    bg3.setBounds(390, 305, 65, 25);
    bg3.setText("Other");
    bg3.setBackground(new Color(0xa0d6d4));
    bg3.setFont(new Font("Open Sans", Font.BOLD, 12));
    add(bg3);

    bg4.setBounds(455, 305, 130, 25);
    bg4.setText("Prefer Not To Say");
    bg4.setBackground(new Color(0xa0d6d4));
    bg4.setFont(new Font("Open Sans", Font.BOLD, 12));
    add(bg4);

    gp.add(bg);
    gp.add(bg2);
    gp.add(bg3);
    gp.add(bg4);

    g.setBounds(390, 273, 120, 25);
    g.setText("Gender");
    g.setForeground(Color.white);
    g.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(g);

    dob.setBounds(370, 200, 120, 25);
    dob.setText("Date of Birth");
    dob.setForeground(Color.white);
    dob.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(dob);

    mnt.setBounds(269, 235, 100, 20);
    mnt.setBorder(ob);
    add(mnt);

    dt.setBounds(370, 235, 100, 20);
    dt.setBorder(ob);
    add(dt);

    yr.setBounds(471, 235, 100, 20);
    yr.setBorder(ob);
    add(yr);

    rgn.setBounds(227, 360, 150, 25);
    rgn.setText("Create Password");
    rgn.setForeground(Color.white);
    rgn.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(rgn);

    cpw.setBounds(370, 360, 240, 25);
    cpw.setBorder(ob);
    add(cpw);

    shw.setBounds(511, 392, 105, 15);
    shw.setText("view password");
    shw.setBackground(new Color(0x73c1be));
    shw.setFont(new Font("Open Sans", Font.BOLD, 10));
    add(shw);

    ag.setBounds(328, 420, 185, 20);
    ag.setText("Accept Terms And Condition");
    ag.setBackground(new Color(0xa0d6d4));
    ag.setFont(new Font("Open Sans", Font.BOLD, 11));
    add(ag);

    r.setBounds(335, 460, 80, 23);
    r.setText("Reset");
    r.setFont(new Font("Open Sans", Font.BOLD, 12));
    add(r);

    s.setBounds(425, 460, 80, 23);
    s.setText("Submit");
    s.setFont(new Font("Open Sans", Font.BOLD, 12));
    add(s);

    bcl.setBackground(new Color(0x73c1be));
    bcl.setBounds(100, 70, 650, 450);
    add(bcl);

    r.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          tfnme.setText("");
          tlnme.setText("");
          ttfnme.setText("");
          cpw.setText("");
          gp.clearSelection();
          svr.clearSelection();
          ag.setSelected(false);
          shw.setSelected(false);
          mnt.setSelectedIndex(0);
          dt.setSelectedIndex(0);
          yr.setSelectedIndex(0);
        }
      }
    );

    shw.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (shw.isSelected()) {
            cpw.setEchoChar((char) 0);
          } else {
            cpw.setEchoChar('•');
          }
        }
      }
    );

    s.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (
            areRequiredFieldsFilled() &&
            isAnyRadioButtonSelected() &&
            isSelectedItemsInJList() &&
            ifCheckBoxSelected()
          ) {
            JOptionPane.showMessageDialog(
              null,
              "Account created successfully!",
              "Message",
              JOptionPane.INFORMATION_MESSAGE
            );
            // SwingUtilities.invokeLater(
            //   new Runnable() {
            //     public void run() {
            //       LIFnw newFrame = new LIFnw(870, 600, new Color(0xa0d6d4));
            //       newFrame.setTitle("Registration");
            //       newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //       newFrame.setVisible(true);

            //       dispose();
            //     }
            //   }
            // );
          } else {
            JOptionPane.showMessageDialog(
              null,
              "Please fill in all required fields.",
              "Message",
              JOptionPane.ERROR_MESSAGE
            );
          }
        }

        private boolean areRequiredFieldsFilled() {
          return (
            isNonEmpty(tfnme) &&
            isNonEmpty(tlnme) &&
            isNonEmpty(ttfnme) &&
            isNonEmpty(cpw)
          );
        }

        private boolean isSelectedItemsInJList() {
          return !svr.isSelectionEmpty();
        }

        private boolean isAnyRadioButtonSelected() {
          return (
            bg.isSelected() ||
            bg2.isSelected() ||
            bg3.isSelected() ||
            bg4.isSelected()
          );
        }

        private boolean ifCheckBoxSelected() {
          return ag.isSelected();
        }

        private boolean isNonEmpty(JTextField textField) {
          return textField.getText().trim().length() > 0;
        }
      }
    );
  }
}
