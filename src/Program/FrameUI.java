package Program;

import javax.swing.*; 
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameUI extends JFrame {
    
	private double tb = 0; /*���������� ����. �������� ������*/
    private double kt = 0; /*���������� ���������������� ����.*/
    private double kbm = 0; /*���������� ����. �����-�����*/
    private double kbc = 0; /*���������� ����. �������-����*/
    private double ko = 0; /*���������� ��������������� ����.*/
    private double km = 0; /*��������� ����. �������� ��*/
    private double kc = 0; /*��������� ����. ����������*/
    private double kn = 0; /*���������� ����. ���������*/
    private double kp = 0; /*���������� ����. ������ �����������*/

    /*������ ���������� ��*/
    public double getTb(){
        return tb;
    }
    
    /*������ ���������� ��*/
    public double getKt(){
        return kt;
    }

    /*������ ���������� ���*/
    public double getKbm(){
        return kbm;
    }

    /*������ ���������� ���*/
    public double getKbc(){
        return kbc;
    }

    /*������ ���������� ��*/
    public double getKo(){
        return ko;
    }

    /*������ ���������� ��*/
    public double getKm(){
        return km;
    }

    /*������ ���������� ��*/
    public double getKc(){
        return kc;
    }

    /*������ ���������� ��*/
    public double getKn(){
        return kn;
    }

    /*������ ���������� ��*/
    public double getKp(){
        return kp;
    }

    /*������ ���������� ��*/
    public void setTb(double tb){
        this.tb = tb;
    }

    /*������ ���������� ��*/
    public void setKt(double kt){
        this.kt = kt;
    }

    /*������ ���������� ���*/
    public void setKbm (double kbm){
        this.kbm = kbm;
    }

    /*������ ���������� ���*/
    public void setKbc(double kbc){
        this.kbc = kbc;
    }

    /*������ ���������� ��*/
    public void setKo (double ko){
        this.ko = ko;
    }

    /*������ ���������� ��*/
    public void setKm(double km){
        this.km = km;
    }

    /*������ ���������� ��*/
    public void setKc(double kc){
        this.kc = kc;
    }

    /*������ ���������� ��*/
    public void setKn(double kn){
        this.kn = kn;
    }

    /*������ ���������� ��*/
    public void setKp(double kp){
        this.kp = kp;
    }

    
    
    /*����������� ������ Frame*/
 public FrameUI(String name, int wight, int height){
     setTitle(name); /*��������� ����� ����*/
     setSize(wight, height); /*�������� �������� ����*/
     setDefaultCloseOperation(2); /*�������� ��� ��������*/
     setLocationRelativeTo(null); /*��������� ���� ��� �������*/
     setVisible(true); /*��������� ����*/
     setResizable(false); /*������ ���������������*/

     /*����������� ����������*/
     Font hugeFont = new Font("Arial", Font.BOLD, 25);
     Font largeFont = new Font("Arial", Font.PLAIN, 18);
     Font regularFont = new Font("Arial", Font.PLAIN, 15);

     /* �������� ������� ������ */
     JPanel mainPanel = new JPanel(); /*�������� ���������� ������ JPanel*/
     mainPanel.setLayout(null); /*��������� ��������� ������������*/
     mainPanel.setSize(wight,height); /*��������� �������� ������*/
     mainPanel.setBackground(Color.WHITE); /*�������� �������� ����� ������*/

     /*�������� ������� - ��������� �����������*/
     JLabel logoLabel = new JLabel("��������� �����������"); /*�������� ���������� ������ JLabel*/
     logoLabel.setBounds(mainPanel.getWidth()/2-148,5,296,30); /*��������� ��������� � �������� ��������*/
     logoLabel.setFont(hugeFont); /*��������� ����������*/
     mainPanel.add(logoLabel); /*���������� �������� �� ������� ������*/

     /*�������� ������� - ������ ��������� ������ �����*/
     JLabel subLogoLabel = new JLabel("������ ��������� ������ �����"); /*�������� ���������� ������ JLabel*/
     subLogoLabel.setBounds(mainPanel.getWidth()/2-140,30,281,30); /*��������� ��������� � �������� ��������*/
     subLogoLabel.setFont(largeFont); /*��������� ����������*/
     mainPanel.add(subLogoLabel); /*���������� �������� �� ������� ������*/

     /* �������� ������ ������ ����������� ������� */
     JPanel resultPanel = new JPanel(); /*�������� ���������� ������ JPanel*/
     resultPanel.setLayout(null); /*��������� ��������� ������������*/
     resultPanel.setBounds(570,75,220,90); /*��������� ��������� � �������� ��������*/
     resultPanel.setBackground(new Color(250, 250, 250)); /*�������� �������� ����� ������*/
     resultPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED)); /*��������� ���������� ��������*/
     mainPanel.add(resultPanel); /*���������� �������� �� ������� ������*/

     /*�������� ������� - ��������� �����������*/
     JLabel textResultLabel = new JLabel("��������� �����������: "); /*�������� ���������� ������ JLabel*/
     textResultLabel.setFont(regularFont); /*��������� ����������*/
     textResultLabel.setBounds(10,10,200,30); /*��������� ��������� � �������� ��������*/
     resultPanel.add(textResultLabel); /*���������� �������� �� ������ �������*/

     /*�������� ���� ���������� ����������*/
     JTextField resultLabel = new JTextField("0 ���."); /*�������� ���������� ������ JTextField*/
     resultLabel.setFont(largeFont); /*��������� ����������*/
     resultLabel.setBorder(null); /*��������� ����� ��������*/
     resultLabel.setBackground(new Color(250, 250, 250)); /*��������� �������� �����*/
     resultLabel.setEditable(false); /*������ �� ��������������*/
     resultLabel.setBounds(10,40,200,30); /*��������� ��������� � �������� ��������*/
     resultPanel.add(resultLabel); /*���������� �������� �� ������ �������*/

     /* �������� ������ ������ ���������� */
     JPanel questionPanel = new JPanel(); /*�������� ���������� ������ JPanel*/
     questionPanel.setLayout(null); /*��������� ��������� ������������*/
     questionPanel.setBounds(10,75,550,620); /*��������� ��������� � �������� ��������*/
     questionPanel.setBackground(new Color(250, 250, 250)); /*��������� �������� �����*/
     questionPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED)); /*��������� ���������� ��������*/
     mainPanel.add(questionPanel); /*���������� �������� �� ������� ������*/

     /*�������� ������� - ��������� ������������� ��������*/
     JLabel question1Label = new JLabel("��������� ������������� ��������:"); /*�������� ���������� ������ JLabel*/
     question1Label.setBounds(15,10,300,20); /*��������� ��������� � �������� ��������*/
     question1Label.setFont(regularFont); /*��������� ����������*/
     questionPanel.add(question1Label); /*���������� �������� �� ������ ������ ����������*/

     /* �������� ����������� ���� - ��������� ������������� ��������*/
     String[] question1Items = {/*�������� ���������� ������� ��� �������� ��������� ������*/
             "��������� �",
             "��������� �",
             "��������� B, ������������ � �������� �����",
             "��������� �, ������������ ������ 16 ���� � �����",
             "��������� �, ������������ ������ ����� 16 ����",
             "��������� D, � ������ ���������� �� 20 ������������",
             "��������� D, � ������ ���������� ����� 20",
             "�����������",
             "�������",
             "������� � �������� �����������"
     };
     JComboBox question1ComboBox = new JComboBox(question1Items); /*�������� ���������� ������ JComboBox */
     question1ComboBox.setBounds(15,33,520,24); /*��������� ��������� � �������� ��������*/
     question1ComboBox.setFont(regularFont); /*��������� ����������*/
     question1ComboBox.setBackground(Color.WHITE); /*��������� �������� �����*/
     questionPanel.add(question1ComboBox); /*���������� �������� �� ������ ������ ����������*/

     /*�������� ������� - ������ �����������*/
     JLabel question2Label = new JLabel("������ ����������� ������������� ��������:"); /*�������� ���������� ������ JLabel*/
     question2Label.setBounds(15,68,400,20); /*��������� ��������� � �������� ��������*/
     question2Label.setFont(regularFont);  /*��������� ����������*/
     questionPanel.add(question2Label); /*���������� �������� �� ������ ������ ����������*/

     /* �������� ����������� ���� - ������ �����������*/
     String[] question2Items = { /*�������� ���������� ������� ��� �������� ��������� ������*/
             "������",
             "�����-���������",
             "������",
             "���",
             "������",
             "�������",
             "������",

     };
     JComboBox question2ComboBox = new JComboBox(question2Items);/*�������� ���������� ������ JComboBox */
     question2ComboBox.setBounds(15,91,520,24);/*��������� ��������� � �������� ��������*/
     question2ComboBox.setFont(regularFont); /*��������� ����������*/
     question2ComboBox.setBackground(Color.WHITE); /*��������� �������� �����*/
     questionPanel.add(question2ComboBox);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ������� - ����� �����*/
     JLabel question3Label = new JLabel("����� ������-�����:");/*�������� ���������� ������ JLabel*/
     question3Label.setBounds(15,126,400,20);/*��������� ��������� � �������� ��������*/
     question3Label.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question3Label); /*���������� �������� �� ������ ������ ����������*/

     /* �������� ����������� ���� - �������� ����� ������-������*/
     String[] question3Items = { /*�������� ���������� ������� ��� �������� ��������� ������*/
             "�","0","1","2","3","4","5","6","7","8","9","10","11","12","13"
     };
     JComboBox question3ComboBox = new JComboBox(question3Items);/*�������� ���������� ������ JComboBox */
     question3ComboBox.setBounds(15,149,520,24);/*��������� ��������� � �������� ��������*/
     question3ComboBox.setFont(regularFont); /*��������� ����������*/
     question3ComboBox.setBackground(Color.WHITE);/*��������� �������� �����*/
     questionPanel.add(question3ComboBox);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ������� - ���� ��������*/
     JLabel question4Label = new JLabel("���� ��������:");/*�������� ���������� ������ JLabel*/
     question4Label.setBounds(15,184,400,20);/*��������� ��������� � �������� ��������*/
     question4Label.setFont(regularFont); /*��������� ����������*/
     questionPanel.add(question4Label); /*���������� �������� �� ������ ������ ����������*/

     /*�������� ���� ����� - ���� ��������*/
     JTextField question4Field = new JTextField(); /*�������� ���������� ������ JTextField*/
     question4Field.setBounds(15,207,520,22); /*��������� ��������� � �������� ��������*/
     question4Field.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question4Field);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ������� - �������*/
     JLabel question5Label = new JLabel("�������:");/*�������� ���������� ������ JLabel*/
     question5Label.setBounds(15,242,400,20);/*��������� ��������� � �������� ��������*/
     question5Label.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question5Label);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ���� ����� - �������*/
     JTextField question5Field = new JTextField();/*�������� ���������� ������ JTextField*/
     question5Field.setBounds(15,265,520,22);/*��������� ��������� � �������� ��������*/
     question5Field.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question5Field);/*���������� �������� �� ������ ������ ����������*/


     /*�������� ������� - ���������� ���, ���������� � ���������� ��*/
     JLabel question6Label = new JLabel("���������� ���, ���������� � ���������� ������������ ���������:");/*�������� ���������� ������ JLabel*/
     question6Label.setBounds(15,300,550,20);/*��������� ��������� � �������� ��������*/
     question6Label.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question6Label);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ���������� - ��� ���������� � ����������-1*/
     JRadioButton question71Radio = new JRadioButton("����������������� ����������� �� 5 ��� ");/*�������� ���������� ������ JRadioButton*/
     question71Radio.setBounds(15, 323, 400,20);/*��������� ��������� � �������� ��������*/
     question71Radio.setSelected(true);/*��������� ������ �� ���������*/
     question71Radio.setFont(regularFont);/*��������� ����������*/
     question71Radio.setBackground(new Color(250, 250, 250));//��������� �������� �����*/
     questionPanel.add(question71Radio);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ���������� - ��� ���������� � ����������-2*/
     JRadioButton question72Radio = new JRadioButton("����������� ��� �� �������������� ");/*�������� ���������� ������ JRadioButton*/
     question72Radio.setBounds(15, 346, 400,20);/*��������� ��������� � �������� ��������*/
     question72Radio.setFont(regularFont);/*��������� ����������*/
     question72Radio.setBackground(new Color(250, 250, 250));/*��������� �������� �����*/
     questionPanel.add(question72Radio);/*���������� �������� �� ������ ������ ����������*/

     /*����������� � ������ �������� ���� RadioButton*/
     ButtonGroup group = new ButtonGroup();/*�������� ������ ��������� RadioButton*/
     group.add(question71Radio);/*���������� � ������ RadioButton*/
     group.add(question72Radio);/*���������� � ������ RadioButton*/

     /*�������� ������� - �������� ����������*/
     JLabel question8Label = new JLabel("�������� ����������: (�.�.)");/*�������� ���������� ������ JLabel*/
     question8Label.setBounds(15,381,400,20); /*��������� ��������� � �������� ��������*/
     question8Label.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question8Label);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ���� ����� - �������� �����������*/
     JTextField question8Field = new JTextField();/*�������� ���������� ������ JTextField*/
     question8Field.setBounds(15,404,520,22);/*�������� ���������� ������ JLabel*/
     question8Field.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question8Field);/*���������� �������� �� ������ ������ ����������*/


     /*�������� ������� - ����������*/
     JLabel question9Label = new JLabel("����������: (�� 3 �������)");/*�������� ���������� ������ JLabel*/
     question9Label.setBounds(15,439,400,20);/*��������� ��������� � �������� ��������*/
     question9Label.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question9Label);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ���� ����� - ����������*/
     JTextField question9Field = new JTextField(); /*�������� ���������� ������ JTextField*/
     question9Field.setBounds(15,462,520,22); /*��������� ��������� � �������� ��������*/
     question9Field.setFont(regularFont); /*��������� ����������*/
     questionPanel.add(question9Field); /*���������� �������� �� ������ ������ ����������*/

     /*�������� ������� - ������ ���������*/
     JLabel question10Label = new JLabel("����������� ���������:");/*�������� ���������� ������ JLabel*/
     question10Label.setBounds(15,497,400,20);/*��������� ��������� � �������� ��������*/
     question10Label.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question10Label);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ���������� - ������ ���������*/
     JCheckBox question10CheckBox = new JCheckBox("���������� ������������ �� ������ ���������");/*�������� ���������� ������ JCheckBox*/
     question10CheckBox.setBounds(15, 520, 400,20);/*��������� ��������� � �������� ��������*/
     question10CheckBox.setFont(regularFont);/*��������� ����������*/
     question10CheckBox.setBackground(new Color(250, 250, 250));/*��������� �������� �����*/
     questionPanel.add(question10CheckBox);/*���������� �������� �� ������ ������ ����������*/


     /*�������� ������� - ���� �����������*/
     JLabel question11Label = new JLabel("���� �����������:");/*�������� ���������� ������ JLabel*/
     question11Label.setBounds(15,555,400,20);/*��������� ��������� � �������� ��������*/
     question11Label.setFont(regularFont);/*��������� ����������*/
     questionPanel.add(question11Label);/*���������� �������� �� ������ ������ ����������*/

     /* �������� ����������� ���� - �������� ����� ������-������*/
     String[] question11Items = { /*�������� ���������� ������� ��� �������� ��������� ������*/
             "�� 5 �� 15 ����","�� 16 ���� �� 1 ������","2 ������","3 ������","4 ������","5 �������","6 �������","7 �������","8 �������","9 �������","10 � ����� �������"
     };
     JComboBox question11ComboBox = new JComboBox(question11Items);/*�������� ���������� ������ JComboBox*/
     question11ComboBox.setBounds(15,578,520,24);/*��������� ��������� � �������� ��������*/
     question11ComboBox.setFont(regularFont);/*��������� ����������*/
     question11ComboBox.setBackground(Color.WHITE);/*��������� �������� �����*/
     questionPanel.add(question11ComboBox);/*���������� �������� �� ������ ������ ����������*/

     /*�������� ������ ���������� */
     JButton calculButton = new JButton("��������� ���������");/*�������� ���������� ������  JButton*/
     calculButton.setBounds(570,175,220,48); /*��������� ��������� � �������� ��������*/
     calculButton.setFont(regularFont);/*��������� ����������*/
     calculButton.setBackground(new Color(220, 237, 200));/*��������� �������� �����*/
     mainPanel.add(calculButton);/*���������� �������� �� ������ ������ ����������*/

     setContentPane(mainPanel); /*���������� ������� ������ �� �����*/

     /*�������� ����������� ������� ������� �� ������ - ��������� ���������*/
     calculButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             
        	 /*���������� �������� ��������� �� �� ����� ������ ������� ���������� ����.*/
        	 setTb(TbVal(question1ComboBox.getSelectedIndex())); /*��������� ������� ���������� �������� � �������� ����������� �������� � ������� ���������� ����.*/
        	 System.out.println("����. �� = " + getTb());/*����� ����. � �������*/
        	 
        	 
        	 /*���������� �������� ��������� �� �� ����� ������ ������� ���������� ����.*/
        	 setKt(KtVal(question2ComboBox.getSelectedIndex()));/*��������� ������� ���������� �������� � �������� ����������� �������� � ������� ���������� ����.*/
             System.out.println("����. �� = " + getKt()); /*����� ����. � �������*/
                  
        	 /*���������� �������� ��������� ��� �� ����� ������ ������� ���������� ����.*/
        	 setKbm(KbmVal(question3ComboBox.getSelectedIndex()));/*��������� ������� ���������� �������� � �������� ����������� �������� � ������� ���������� ����.*/
        	 System.out.println("����. ��� = " + getKbm());/*����� ����. � �������*/
             
        	 /*���������� �������� ��������� ��� � ������������ ��� ����.*/
        	 KbcVal(Integer.parseInt(question4Field.getText()),Integer.parseInt(question5Field.getText()));/*���������� �������� ��������� � ���� - ������� � ���� - ������� � int.*/
        	 System.out.println("����. ��� = " + getKbc());/*����� ����. � �������*/
             
        	 /*���������� �������� ��������� �� � ������������ ��� ����.*/
             if (question71Radio.isSelected()){ setKo(1); }; /*�������� ���������� ������ � ���������� �����. �������*/
             if (question72Radio.isSelected()){ setKo(1.8); }; /*�������� ���������� ������ � ���������� �����. �������*/
             System.out.println("����. �� = " + getKo()); /*����� ����. � �������*/
             
             /*���������� �������� ��������� �� � ������������ ��� ����.*/
             KmVal(Integer.parseInt(question8Field.getText())); //��������� �������� ���� � ������� �������� � int. - �������� �������� � ���-�

             /*���������� �������� ��������� �� � ������������ ��� ����.*/
             KcVal(Integer.parseInt(question9Field.getText())); /*��������� �������� ���� � ������� �������� � int.- �������� �������� � ���-�*/
             
             /*���������� �������� ��������� �� � ������������ ��� ����.*/
             if (question10CheckBox.isSelected()){ setKn(1.5); }else setKn(1.0); /*�������� ���������� ������ � ���������� �����. �������*/
             System.out.println("����. �� = " + getKn()); // /*����� ����. � �������*/
             
             /*���������� �������� ��������� �� � ������������ ��� ����.*/
             setKp(KpVal(question11ComboBox.getSelectedIndex())); /*��������� ������� ���������� ����� � �������� �������� � ������� ���������� ����.*/
             System.out.println("����. �� = " + getKp()); /*����� ����. � �������*/
            
             /*���������� ��������� �����������*/
             String result = Calculation(getTb(),getKt(),getKbm(),getKbc(),getKo(),getKm(),getKc(),getKn(),getKp()); /*�������� � �-� ���������� ���� ����������*/
             System.out.println(result); /*����� ���������� � �������*/
             setResult(result); /*��������� ���������� � ������ */

         }
         /*��������� �������� ����������*/
         public void setResult(String newText){
                 resultLabel.setText(newText + " ���."); /*��������� �������� � resultLabel*/
         }
     } );
 }
/*������� ���������� ��������� �����������*/
 public String Calculation(double tb, double kt, double kbm, double kbc, double ko, double km, double kc, double kn, double kp){
	String Res = ""; /* ���������� ����������*/
	double result = tb * kt * kbm * kbc * ko * km * kc * kn * kp;
	Res = Double.toString(Math.round(result)); /*������� �������� � ������ � ����������� ���������� ���� ������*/
    return Res; /*����������� ����������*/
 };
 
 /*������� ���������� ����. ��*/
 public double TbVal(int Val){ /*���������� ����. � ����������� � ��������� ��������*/
	 double u=0.0;
	 switch (Val){
	 case 0: u=1215.0;break;
     case 1: u=2375.0;break;
     case 2: u=2965.0;break;
     case 3: u=2025.0;break;
     case 4: u=3240.0;break;
     case 5: u=1620.0;break;
     case 6: u=2025.0;break;
     case 7: u=1620.0;break;
     case 8: u=1010.0;break;
     case 9: u=395.0;break;     
	  }
	return u; 
 }
 
 /*������� ���������� ����. ��*/
 public double KtVal(int Val){ /*���������� ����. � ������������ � ��������� ��������*/
	 double a=0.0;
	 switch (Val){
     case 0: a=2.0;break;
     case 1: a=1.9;break;
     case 2: a=2;break;
     case 3: a=1.8;break;
     case 4: a=1.4;break;
     case 5: a=1.3;break;
     case 6: a=1.5;break;
     
    } 
 return a;/*����������� ����.*/
 }
 
/*������� ���������� ����. ���*/
 public double KbmVal(int Val){
	 double a=0.0;
	 switch (Val){ /*���������� ����. � ������������ � ��������� ��������*/
     case 0: a=2.45; break;
     case 1: a=2.3;break;
     case 2: a=1.55;break;
     case 3: a=1.4;break;
     case 4: a=1;break;
     case 5: a=0.95;break;
     case 6: a=0.9;break;
     case 7: a=0.85;break;
     case 8: a=0.8;break;
     case 9: a=0.75;break;
     case 10: a=0.7;break;
     case 11: a=0.65;break;
     case 12: a=0.6;break;
     case 13: a=0.55;break;
     case 14: a=0.5;break;
 } 
	 return a;
 }
 
/*������� ���������� ����. ��C*/
 public void KbcVal(int Val1, int Val2){ //���������� ����. � �����. � ��������� 
	 if (Val1<=3 && Val2<=22){setKbc(1.8);}
     if (Val1<=3 && Val2>22){setKbc(1.7);}
     if (Val1>3 && Val2<=22){setKbc(1.6);}
     if (Val1>3 && Val2>22){setKbc(1);}
 }
 
/*������� ���������� ����. ��*/
 public void KmVal(int Val) { /*���������� ����. � �����. � ��������� */
	 if (Val<=50){setKm(0.6);}
     if (Val>50 && Val<=70){setKm(1);}
     if (Val>70 && Val<=100){setKm(1.1);}
     if (Val>100 && Val<=120){setKm(1.2);}
     if (Val>120 && Val<=150){setKm(1.4);}
     if (Val>150) {setKm(1.6);}
     System.out.println("����. �� = " + getKm()); /*����� ����. � �������*/
 }
 
/*������� ���������� ����. �C*/
 public void KcVal(int Val){ /*���������� ����. � �����. � ��������� */
	 if (Val<=3){setKc(0.5);}
     if (Val==4){setKc(0.6);}
     if (Val==5){setKc(0.65);}
     if (Val==6){setKc(0.7);}
     if (Val==7){setKc(0.8);}
     if (Val==8){setKc(0.9);}
     if (Val==9){setKc(0.95);}
     if (Val>=10){setKc(1);}
     System.out.println("����. �C = " + getKc());/*����� ����. � �������*/
 }
 
/*������� ���������� ����. ��*/
 public double KpVal(int Val) {
	 double a=0.0;
	 switch (Val){ /*���������� ����. � ������������ � ��������� ��������*/
     case 0: a=0.2; break;
     case 1: a=0.3;break;
     case 2: a=0.4;break;
     case 3: a=0.5;break;
     case 4: a=0.6;break;
     case 5: a=0.65;break;
     case 6: a=0.7;break;
     case 7: a=0.8;break;
     case 8: a=0.9;break;
     case 9: a=0.95;break;
     case 10: a=1.0;break;
 } 
 return a;
 }
 
 }
