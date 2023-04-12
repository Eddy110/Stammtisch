import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 0.2.2 vom 10.07.2019
 * @Alpha 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private Steuerung dieSteuerung;
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();
  private JLabel jLabel8 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JSpinner jSpinner1 = new JSpinner();
    private SpinnerNumberModel jSpinner1Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JSpinner jSpinner2 = new JSpinner();
    private SpinnerNumberModel jSpinner2Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JSpinner jSpinner3 = new JSpinner();
    private SpinnerNumberModel jSpinner3Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JSpinner jSpinner4 = new JSpinner();
    private SpinnerNumberModel jSpinner4Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JSpinner jSpinner5 = new JSpinner();
    private SpinnerNumberModel jSpinner5Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JSpinner jSpinner6 = new JSpinner();
    private SpinnerNumberModel jSpinner6Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JSpinner jSpinner7 = new JSpinner();
    private SpinnerNumberModel jSpinner7Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JSpinner jSpinner8 = new JSpinner();
    private SpinnerNumberModel jSpinner8Model = new SpinnerNumberModel(0, 0, 10, 1);
  private JPasswordField jPasswordField1 = new JPasswordField();
  private JLabel lAdminlogin = new JLabel();
  private JRadioButton rbTisch1 = new JRadioButton();
  private JRadioButton rbTisch2 = new JRadioButton();
  private JRadioButton rbTisch3 = new JRadioButton();
  private JRadioButton rbTisch4 = new JRadioButton();
  private ButtonGroup alpha = new ButtonGroup();  
  private JButton bBestellen = new JButton();
  private JButton bStorno = new JButton();
  private JButton bZahlen = new JButton();
  // Ende Attribute
  
  public GUI(Steuerung strrg) { 
    initPanel();
    dieSteuerung=strrg;
  }
    // Frame-Initialisierung
  public void initPanel(){
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 575; 
    int frameHeight = 500;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(89, 81, 158, 20);
    jLabel1.setText("Text");
    cp.add(jLabel1);
    jLabel2.setBounds(89, 113, 158, 20);
    jLabel2.setText("text");
    cp.add(jLabel2);
    jLabel3.setBounds(89, 145, 158, 20);
    jLabel3.setText("text");
    cp.add(jLabel3);
    jLabel4.setBounds(89, 177, 158, 20);
    jLabel4.setText("text");
    cp.add(jLabel4);
    jLabel5.setBounds(89, 209, 158, 20);
    jLabel5.setText("text");
    cp.add(jLabel5);
    jLabel6.setBounds(89, 241, 158, 20);
    jLabel6.setText("text");
    cp.add(jLabel6);
    jLabel7.setBounds(89, 273, 158, 20);
    jLabel7.setText("text");
    cp.add(jLabel7);
    jLabel8.setBounds(89, 305, 158, 20);
    jLabel8.setText("text");
    cp.add(jLabel8);
    jTextField1.setBounds(306, 81, 230, 300);
    cp.add(jTextField1);
    jSpinner1.setBounds(248, 81, 30, 20);
    jSpinner1.setValue(0);
    jSpinner1.setModel(jSpinner1Model);
    cp.add(jSpinner1);

    jSpinner2.setBounds(248, 113, 30, 20);
    jSpinner2.setValue(0);
    jSpinner2.setModel(jSpinner2Model);
    cp.add(jSpinner2);

    jSpinner3.setBounds(248, 145, 30, 20);
    jSpinner3.setValue(0);
    jSpinner3.setModel(jSpinner3Model);
    cp.add(jSpinner3);

    jSpinner4.setBounds(248, 177, 30, 20);
    jSpinner4.setValue(0);
    jSpinner4.setModel(jSpinner4Model);
    cp.add(jSpinner4);

    jSpinner5.setBounds(248, 209, 30, 20);
    jSpinner5.setValue(0);
    jSpinner5.setModel(jSpinner5Model);
    cp.add(jSpinner5);

    jSpinner6.setBounds(248, 241, 30, 20);
    jSpinner6.setValue(0);
    jSpinner6.setModel(jSpinner6Model);
    cp.add(jSpinner6);

    jSpinner7.setBounds(248, 273, 30, 20);
    jSpinner7.setValue(0);
    jSpinner7.setModel(jSpinner7Model);
    cp.add(jSpinner7);

    jSpinner8.setBounds(248, 305, 30, 20);
    jSpinner8.setValue(0);
    jSpinner8.setModel(jSpinner8Model);
    cp.add(jSpinner8);

    jPasswordField1.setBounds(386, 385, 150, 20);
    cp.add(jPasswordField1);
    lAdminlogin.setBounds(303, 385, 78, 20);
    lAdminlogin.setText("Adminlogin:");
    cp.add(lAdminlogin);
    rbTisch1.setBounds(14, 16, 124, 20);
    rbTisch1.setOpaque(false);
    alpha.add(rbTisch1);
    rbTisch1.setText("Tisch 1");
    rbTisch1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbTisch1_ActionPerformed(evt);
      }
    });
    cp.add(rbTisch1);
    rbTisch2.setBounds(150, 16, 124, 20);
    rbTisch2.setOpaque(false);
    alpha.add(rbTisch2);
    rbTisch2.setText("Tisch 2");
    rbTisch2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbTisch2_ActionPerformed(evt);
      }
    });
    cp.add(rbTisch2);
    rbTisch3.setBounds(286, 16, 124, 20);
    rbTisch3.setOpaque(false);
    alpha.add(rbTisch3);
    rbTisch3.setText("Tisch 3");
    rbTisch3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbTisch3_ActionPerformed(evt);
      }
    });
    cp.add(rbTisch3);
    rbTisch4.setBounds(422, 16, 124, 20);
    rbTisch4.setOpaque(false);
    alpha.add(rbTisch4);
    rbTisch4.setText("Tisch 4");
    rbTisch4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        rbTisch4_ActionPerformed(evt);
      }
    });
    cp.add(rbTisch4);
    bBestellen.setBounds(32, 428, 100, 25);
    bBestellen.setText("Bestellen");
    bBestellen.setMargin(new Insets(2, 2, 2, 2));
    bBestellen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBestellen_ActionPerformed(evt);
      }
    });
    cp.add(bBestellen);
    bStorno.setBounds(136, 428, 100, 25);
    bStorno.setText("Storno");
    bStorno.setMargin(new Insets(2, 2, 2, 2));
    bStorno.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bStorno_ActionPerformed(evt);
      }
    });
    cp.add(bStorno);
    bZahlen.setBounds(240, 428, 100, 25);
    bZahlen.setText("Zahlen");
    bZahlen.setMargin(new Insets(2, 2, 2, 2));
    bZahlen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bZahlen_ActionPerformed(evt);
      }
    });
    cp.add(bZahlen);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  public void setLabel(){
    jLabel1.setText(dieSteuerung.dieWare[0].gibName()+"   "+(dieSteuerung.dieWare[0].gibPreis())+" "+"Euro");
    jLabel2.setText(dieSteuerung.dieWare[1].gibName()+"   "+(dieSteuerung.dieWare[1].gibPreis())+" "+"Euro");
    jLabel3.setText(dieSteuerung.dieWare[2].gibName()+"   "+(dieSteuerung.dieWare[2].gibPreis())+" "+"Euro");
    jLabel4.setText(dieSteuerung.dieWare[3].gibName()+"   "+(dieSteuerung.dieWare[3].gibPreis())+" "+"Euro");
    jLabel5.setText(dieSteuerung.dieWare[4].gibName()+"   "+(dieSteuerung.dieWare[4].gibPreis())+" "+"Euro");
    jLabel6.setText(dieSteuerung.dieWare[5].gibName()+"   "+(dieSteuerung.dieWare[5].gibPreis())+" "+"Euro");
    jLabel7.setText(dieSteuerung.dieWare[6].gibName()+"   "+(dieSteuerung.dieWare[6].gibPreis())+" "+"Euro");
    jLabel8.setText(dieSteuerung.dieWare[7].gibName()+"   "+(dieSteuerung.dieWare[7].gibPreis())+" "+"Euro");
  }

  public void bBestellen_ActionPerformed(ActionEvent evt) {
    dieSteuerung.setBestellung();
  } // end of bBestellen_ActionPerformed

  public void bStorno_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bStorno_ActionPerformed

  public void bZahlen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bZahlen_ActionPerformed
  
  public void rbTisch1_ActionPerformed(ActionEvent evt) {
    rbTisch1.setOpaque(true);
    rbTisch2.setOpaque(false);
    rbTisch3.setOpaque(false);
    rbTisch4.setOpaque(false);
  } // end of rbTisch1_ActionPerformed
  
  public void rbTisch2_ActionPerformed(ActionEvent evt) {
    rbTisch1.setOpaque(false);
    rbTisch2.setOpaque(true);
    rbTisch3.setOpaque(false);
    rbTisch4.setOpaque(false);
  } // end of rbTisch2_ActionPerformed
  
  public void rbTisch3_ActionPerformed(ActionEvent evt) {
    rbTisch1.setOpaque(false);
    rbTisch2.setOpaque(false);
    rbTisch3.setOpaque(true);
    rbTisch4.setOpaque(false);
  } // end of rbTisch3_ActionPerformed
  
  public void rbTisch4_ActionPerformed(ActionEvent evt) {
    rbTisch1.setOpaque(false);
    rbTisch2.setOpaque(false);
    rbTisch3.setOpaque(false);
    rbTisch4.setOpaque(true);
  } // end of rbTisch3_ActionPerformed


  // Ende Methoden
} // end of class GUI

