package capculatorimpl;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import interfaceimpl.Comanda;

/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

/**
 * @author <a href="mailto:Sorin@ssi-schaefer-noell.com">Sorin</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Calculator2 extends JFrame implements ActionListener {

  private static final long serialVersionUID = 1L;

  private JPanel mainPanel;
  private JPanel panel1;
  private JPanel panel2;
  private JPanel panel3;
  private JPanel panel4;
  private JPanel panel5;
  private JPanel panel6;

  //private JButton buttonNine;
  private ButonNine butonNine;
  //private JButton buttonEight;
  private ButonNine butonOpt;

  private JButton buttonSeven;
  private JButton buttonSix;
  private JButton buttonFive;
  private JButton buttonFour;
  private JButton buttonThree;
  private JButton buttonTwo;
  private JButton buttonOne;
  private JButton buttonZero;

  private JButton buttonDecimal;
  private JButton buttonPosNeg;

  private JButton buttonEquals;
  private JButton buttonPlus;
  private JButton buttonMinus;
  private JButton buttonImpartire;
  private JButton buttonInmultire;
  private JButton buttonClear;

  private JTextArea textFieldDisplay;

  private double tempFirstNumber = 0.0;
  private double tempSecoundNumber = 0.0;
  //putem face si un vector private boolean[] operatii=new boolean[4]
  private boolean esteImpartire = false;
  private boolean esteInmultire = false;
  private boolean esteAdunare = false;
  private boolean esteScadere = false;

  public Calculator2() {
    //panel principal - contine toate Panel.urile sub forma de layer
    mainPanel = new JPanel();
    //Panel.ul contine dispay.ul calculatorului
    panel1 = new JPanel();
    //Panel contine butoanele 9,8,7
    panel2 = new JPanel();
    //panel raspunzator pentru 6,5,4
    panel3 = new JPanel();
    //panel responabil cu butoanele 3,2,1
    panel4 = new JPanel();
    //panel responsabl cu butoanele 0,virgula,negativ/pozitiv
    panel5 = new JPanel();
    //panel care contine Clear
    panel6 = new JPanel();

    Border border = BorderFactory.createLineBorder(Color.BLACK);

    //acest textArea contine display.ul caclulatorului
    textFieldDisplay = new JTextArea(1, 15);

    textFieldDisplay.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    textFieldDisplay.setBackground(Color.ORANGE);
    textFieldDisplay.setForeground(Color.BLACK);
    textFieldDisplay.setFont(new Font("Arial", Font.PLAIN, 15));
    textFieldDisplay.setText("0");
    // textFieldDisplay.setSize(300, 40); //????
    panel1.add(textFieldDisplay);

    //initializarea butoanelor

    //    buttonNine = new JButton();
    //    buttonNine.setText("9");
    //    panel2.add(buttonNine);

    String numarNoua = "9";
    butonNine = new ButonNine(textFieldDisplay, numarNoua);
    butonNine.setText("9");
    panel2.add(butonNine);
    butonNine.addActionListener(this);

    String numarOpt = "8";
    butonOpt = new ButonNine(textFieldDisplay, numarOpt);
    //    buttonEight = new JButton();
    butonOpt.setText("8");
    panel2.add(butonOpt);
    butonOpt.addActionListener(this);

    buttonSeven = new JButton();
    buttonSeven.setText("7");
    panel2.add(buttonSeven);

    buttonSix = new JButton();
    buttonSix.setText("6");
    panel3.add(buttonSix);

    buttonFive = new JButton();
    buttonFive.setText("5");
    panel3.add(buttonFive);

    buttonFour = new JButton();
    buttonFour.setText("4");
    panel3.add(buttonFour);

    buttonThree = new JButton();
    buttonThree.setText("3");
    panel4.add(buttonThree);

    buttonTwo = new JButton();
    buttonTwo.setText("2");
    panel4.add(buttonTwo);

    buttonOne = new JButton();
    buttonOne.setText("1");
    panel4.add(buttonOne);

    buttonZero = new JButton();
    buttonZero.setText("0");
    panel5.add(buttonZero);

    buttonDecimal = new JButton();
    buttonDecimal.setText(".");
    panel5.add(buttonDecimal);

    buttonPosNeg = new JButton();
    buttonPosNeg.setText("+/-");
    panel5.add(buttonPosNeg);

    buttonPlus = new JButton();
    buttonPlus.setText("+");
    panel2.add(buttonPlus);

    buttonMinus = new JButton();
    buttonMinus.setText("-");
    panel3.add(buttonMinus);

    buttonImpartire = new JButton();
    buttonImpartire.setText("/");
    panel4.add(buttonImpartire);

    buttonInmultire = new JButton();
    buttonInmultire.setText("x");
    panel5.add(buttonInmultire);

    buttonEquals = new JButton();
    buttonEquals.setText("=");
    panel6.add(buttonEquals);

    buttonClear = new JButton();
    buttonClear.setText("Clear");
    panel6.add(buttonClear);

    //implementarea butoanelor

    //imlementarea butonului cu numarul 9
    //    buttonNine.addActionListener(new ActionListener() {
    //
    //      @Override
    //      public void actionPerformed(ActionEvent e) {
    //        if (textFieldDisplay.getText().length() > 12) {
    //          return;
    //        }
    //        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
    //          textFieldDisplay.setText("9");
    //          return;
    //        }
    //        textFieldDisplay.append("9");
    //      }
    //    });

    //    buttonEight.addActionListener(new ActionListener() {
    //
    //      @Override
    //      public void actionPerformed(ActionEvent e) {
    //        if (textFieldDisplay.getText().length() > 12)
    //          return;
    //        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
    //          textFieldDisplay.setText("8");
    //          return;
    //        }
    //        textFieldDisplay.append("8");
    //
    //      }
    //    });

    buttonSeven.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("7");
          return;
        }
        textFieldDisplay.append("7");

      }
    });

    buttonSix.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("6");
          return;
        }
        textFieldDisplay.append("6");

      }
    });

    buttonFive.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("5");
          return;
        }
        textFieldDisplay.append("5");

      }
    });

    buttonFour.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("4");
          return;
        }
        textFieldDisplay.append("4");
      }
    });

    buttonThree.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("3");
          return;
        }
        textFieldDisplay.append("3");

      }
    });

    buttonTwo.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("2");
          return;
        }
        textFieldDisplay.append("2");

      }
    });

    buttonOne.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("1");
          return;
        }
        textFieldDisplay.append("1");
      }
    });

    buttonZero.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().length() > 12)
          return;
        if (textFieldDisplay.getText().equalsIgnoreCase("0")) {
          textFieldDisplay.setText("0");
          return;
        }
        textFieldDisplay.append("0");

      }
    });

    buttonDecimal.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().contains("."))
          return;
        textFieldDisplay.append(".");

      }
    });

    buttonPosNeg.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (textFieldDisplay.getText().equalsIgnoreCase("0"))
          return;
        textFieldDisplay.setText(Double.toString(Double.parseDouble(textFieldDisplay.getText()) * (-1)));
        if (textFieldDisplay.getText().endsWith(".0"))
          textFieldDisplay.setText(textFieldDisplay.getText().replace(".0", ""));

      }
    });

    buttonClear.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldDisplay.setText("0");
        setTempFirstNumber(0.0);
        esteImpartire = false;
        esteInmultire = false;
        esteAdunare = false;
        esteScadere = false;

      }
    });

    buttonImpartire.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        setTempFirstNumber(Double.parseDouble(textFieldDisplay.getText()));
        textFieldDisplay.setText("");
        esteImpartire = true;
        System.out.println(tempFirstNumber);
      }
    });

    buttonInmultire.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        setTempFirstNumber(Double.parseDouble(textFieldDisplay.getText()));
        textFieldDisplay.setText("");
        esteInmultire = true;
      }
    });

    buttonPlus.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        setTempFirstNumber(Double.parseDouble(textFieldDisplay.getText()));
        textFieldDisplay.setText("");
        esteAdunare = true;

      }
    });

    buttonMinus.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        setTempFirstNumber(Double.parseDouble(textFieldDisplay.getText()));
        textFieldDisplay.setText("");
        esteScadere = true;
      }
    });

    buttonEquals.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        if (esteImpartire) {
          setTempSecoundNumber(Double.parseDouble(textFieldDisplay.getText()));
          textFieldDisplay.setText(Double.toString(getTempFirstNumber() / getTempSecoundNumber()));
        } else if (esteInmultire) {
          setTempSecoundNumber(Double.parseDouble(textFieldDisplay.getText()));
          textFieldDisplay.setText(Double.toString(getTempFirstNumber() * getTempSecoundNumber()));
        } else if (esteAdunare) {
          setTempSecoundNumber(Double.parseDouble(textFieldDisplay.getText()));
          textFieldDisplay.setText(Double.toString(getTempFirstNumber() + getTempSecoundNumber()));
        } else if (esteScadere) {
          setTempSecoundNumber(Double.parseDouble(textFieldDisplay.getText()));
          textFieldDisplay.setText(Double.toString(getTempFirstNumber() - getTempSecoundNumber()));
        }
        setTempFirstNumber(0.0);
        if (textFieldDisplay.getText().endsWith(".0"))
          textFieldDisplay.setText(textFieldDisplay.getText().replace(".0", ""));

      }
    });

    panel1.setBorder(border);
    mainPanel.add(panel1);
    mainPanel.add(panel2);
    mainPanel.add(panel3);
    mainPanel.add(panel4);
    mainPanel.add(panel5);
    mainPanel.add(panel6);

    //adauga mainPanel/ul la JFRAME

    mainPanel.setBorder(border);
    this.add(mainPanel);
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    //super.setTitle("Calculator2");

    this.setResizable(false);
    this.setSize(250, 350);
    //this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    ((Comanda) e.getSource()).executa();

  }

  public double getTempFirstNumber() {
    return tempFirstNumber;
  }

  public void setTempFirstNumber(double tempFirstNumber) {
    this.tempFirstNumber = tempFirstNumber;
  }

  public double getTempSecoundNumber() {
    return tempSecoundNumber;
  }

  public void setTempSecoundNumber(double tempSecoundNumber) {
    this.tempSecoundNumber = tempSecoundNumber;
  }

  public static void main(String[] args) {
    new Calculator2();
  }

}
