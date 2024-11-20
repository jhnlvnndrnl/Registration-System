import java.awt.*;
import javax.swing.*;

public class LIFnw extends JFrame {

  JLabel main = new JLabel();
  JLabel firstn = new JLabel();
  JLabel lastn = new JLabel();
  JLabel phonen = new JLabel();
  JLabel occu = new JLabel();
  JLabel dob = new JLabel();
  JLabel gen = new JLabel();
  JLabel pass = new JLabel();
  JPanel bcl = new JPanel();
  JLabel firstnb = new JLabel();
  JLabel lastnb = new JLabel();
  JLabel phonenb = new JLabel();
  JLabel occub = new JLabel();
  JLabel dobb = new JLabel();
  JLabel genb = new JLabel();
  JLabel passb = new JLabel();
  JPanel bclb = new JPanel();

  public void setValues(String firstName, String lastName, String phoneNumber, String occupation,
  String dob, String gender, String password) {
firstnb.setText(firstName);
lastnb.setText(lastName);
phonenb.setText(phoneNumber);
occub.setText(occupation);
dobb.setText(dob);
genb.setText(gender);
passb.setText(password);
  }

  public LIFnw(int width, int height, Color backgroundColor) {
    super("Registration");
    setLayout(null);

    setSize(width, height);
    getContentPane().setBackground(backgroundColor);

    main.setBounds(320, 20, 250, 35);
    main.setText("Information Details");
    main.setForeground(Color.white);
    main.setFont(new Font("Open Sans", Font.BOLD, 25));
    add(main);

    firstn.setBounds(120, 100, 100, 20);
    firstn.setText("First Name:");
    firstn.setForeground(Color.white);
    firstn.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(firstn);

    firstnb.setBounds(220, 100, 150, 20);
    firstnb.setText("--");
    firstnb.setForeground(Color.white);
    firstnb.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(firstnb);

    lastn.setBounds(120, 140, 100, 20);
    lastn.setText("Last Name:");
    lastn.setForeground(Color.white);
    lastn.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(lastn);

    lastnb.setBounds(220, 140, 100, 20);
    lastnb.setText("--");
    lastnb.setForeground(Color.white);
    lastnb.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(lastnb);

    phonen.setBounds(120, 180, 130, 20);
    phonen.setText("Phone Number:");
    phonen.setForeground(Color.white);
    phonen.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(phonen);

    phonenb.setBounds(250, 180, 130, 20);
    phonenb.setText("--");
    phonenb.setForeground(Color.white);
    phonenb.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(phonenb);

    occu.setBounds(120, 220, 100, 20);
    occu.setText("Occupation:");
    occu.setForeground(Color.white);
    occu.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(occu);

    occub.setBounds(225, 220, 100, 20);
    occub.setText("--");
    occub.setForeground(Color.white);
    occub.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(occub);

    dob.setBounds(120, 260, 110, 20);
    dob.setText("Date of Birth:");
    dob.setForeground(Color.white);
    dob.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(dob);

    dobb.setBounds(235, 260, 110, 20);
    dobb.setText("--");
    dobb.setForeground(Color.white);
    dobb.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(dobb);

    gen.setBounds(120, 300, 100, 20);
    gen.setText("Gender:");
    gen.setForeground(Color.white);
    gen.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(gen);

    genb.setBounds(190, 300, 100, 20);
    genb.setText("--");
    genb.setForeground(Color.white);
    genb.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(genb);


    pass.setBounds(120, 340, 100, 20);
    pass.setText("Password:");
    pass.setForeground(Color.white);
    pass.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(pass);

    passb.setBounds(210, 340, 100, 20);
    passb.setText("--");
    passb.setForeground(Color.white);
    passb.setFont(new Font("Open Sans", Font.BOLD, 17));
    add(passb);

    bcl.setBackground(new Color(0x73c1be));
    bcl.setBounds(100, 70, 650, 450);
    add(bcl);
  }

  public static void main(String[] args) {
    LIFnw frame = new LIFnw(870, 600, new Color(0xa0d6d4));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon image = new ImageIcon("logo.png");
    frame.setIconImage(image.getImage());
    frame.setResizable(false);
    frame.setVisible(true);
  }
}
