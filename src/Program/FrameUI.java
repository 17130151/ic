package Program;

import javax.swing.*; 
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameUI extends JFrame {
    
	private double tb = 0; /*Переменная коэф. базового тарифа*/
    private double kt = 0; /*Переменная территериального коэф.*/
    private double kbm = 0; /*Переменная коэф. бонус-малус*/
    private double kbc = 0; /*Переменная коэф. возраст-стаж*/
    private double ko = 0; /*Переменная ограничивающего коэф.*/
    private double km = 0; /*Перменная коэф. можности ТС*/
    private double kс = 0; /*Перменная коэф. сезонности*/
    private double kn = 0; /*Переменная коэф. нарушений*/
    private double kp = 0; /*Переменная коэф. период страхования*/

    /*Геттер переменной ТБ*/
    public double getTb(){
        return tb;
    }
    
    /*Геттер переменной КТ*/
    public double getKt(){
        return kt;
    }

    /*Геттер переменной КБМ*/
    public double getKbm(){
        return kbm;
    }

    /*Геттер переменной КБС*/
    public double getKbc(){
        return kbc;
    }

    /*Геттер переменной КО*/
    public double getKo(){
        return ko;
    }

    /*Геттер переменной КМ*/
    public double getKm(){
        return km;
    }

    /*Геттер переменной КС*/
    public double getKc(){
        return kс;
    }

    /*Геттер переменной КН*/
    public double getKn(){
        return kn;
    }

    /*Геттер переменной КП*/
    public double getKp(){
        return kp;
    }

    /*Сеттер переменной ТБ*/
    public void setTb(double tb){
        this.tb = tb;
    }

    /*Сеттер переменной КТ*/
    public void setKt(double kt){
        this.kt = kt;
    }

    /*Сеттер переменной КБМ*/
    public void setKbm (double kbm){
        this.kbm = kbm;
    }

    /*Сеттер переменной КБС*/
    public void setKbc(double kbc){
        this.kbc = kbc;
    }

    /*Сеттер переменной КО*/
    public void setKo (double ko){
        this.ko = ko;
    }

    /*Сеттер переменной КМ*/
    public void setKm(double km){
        this.km = km;
    }

    /*Сеттер переменной КС*/
    public void setKc(double kc){
        this.kс = kc;
    }

    /*Сеттер переменной КН*/
    public void setKn(double kn){
        this.kn = kn;
    }

    /*Сеттер переменной КП*/
    public void setKp(double kp){
        this.kp = kp;
    }

    
    
    /*Конструктор класса Frame*/
 public FrameUI(String name, int wight, int height){
     setTitle(name); /*Установка имени окна*/
     setSize(wight, height); /*Указание размеров окна*/
     setDefaultCloseOperation(2); /*Операции при закрытии*/
     setLocationRelativeTo(null); /*Положение окна при отрытии*/
     setVisible(true); /*Видимость окна*/
     setResizable(false); /*Запрет масштабирования*/

     /*Собственные начертания*/
     Font hugeFont = new Font("Arial", Font.BOLD, 25);
     Font largeFont = new Font("Arial", Font.PLAIN, 18);
     Font regularFont = new Font("Arial", Font.PLAIN, 15);

     /* Создание главной панели */
     JPanel mainPanel = new JPanel(); /*Создание экземпляра класса JPanel*/
     mainPanel.setLayout(null); /*Установка менеджера расположения*/
     mainPanel.setSize(wight,height); /*Установка размеров панели*/
     mainPanel.setBackground(Color.WHITE); /*Устновка фонового цвета панели*/

     /*Создание надписи - Страховой калькулятор*/
     JLabel logoLabel = new JLabel("Страховой калькулятор"); /*Создание экземпляра класса JLabel*/
     logoLabel.setBounds(mainPanel.getWidth()/2-148,5,296,30); /*Установка положения и размеров элемента*/
     logoLabel.setFont(hugeFont); /*Установка начертания*/
     mainPanel.add(logoLabel); /*Размещение элемента на главной панели*/

     /*Создание надписи - Расчет стоимости полиса ОСАГО*/
     JLabel subLogoLabel = new JLabel("Расчет стоимости полиса ОСАГО"); /*Создание экземпляра класса JLabel*/
     subLogoLabel.setBounds(mainPanel.getWidth()/2-140,30,281,30); /*Установка положения и размеров элемента*/
     subLogoLabel.setFont(largeFont); /*Установка начертания*/
     mainPanel.add(subLogoLabel); /*Размещение элемента на главной панели*/

     /* Создание панели вывода результатов расчета */
     JPanel resultPanel = new JPanel(); /*Создание экземпляра класса JPanel*/
     resultPanel.setLayout(null); /*Установка менеджера расположения*/
     resultPanel.setBounds(570,75,220,90); /*Установка положения и размеров элемента*/
     resultPanel.setBackground(new Color(250, 250, 250)); /*Устновка фонового цвета панели*/
     resultPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED)); /*Установка обрамления элемента*/
     mainPanel.add(resultPanel); /*Размещение элемента на главной панели*/

     /*Создание надписи - Стоимость страхования*/
     JLabel textResultLabel = new JLabel("Стоимость страхования: "); /*Создание экземпляра класса JLabel*/
     textResultLabel.setFont(regularFont); /*Установка начертания*/
     textResultLabel.setBounds(10,10,200,30); /*Установка положения и размеров элемента*/
     resultPanel.add(textResultLabel); /*Размещение элемента на панели расчета*/

     /*Создание поля результата вычислений*/
     JTextField resultLabel = new JTextField("0 руб."); /*Создание экземпляра класса JTextField*/
     resultLabel.setFont(largeFont); /*Установка начертания*/
     resultLabel.setBorder(null); /*Установка рамки элемента*/
     resultLabel.setBackground(new Color(250, 250, 250)); /*Установка фонового цвета*/
     resultLabel.setEditable(false); /*Запрет на редактирование*/
     resultLabel.setBounds(10,40,200,30); /*Установка положения и размеров элемента*/
     resultPanel.add(resultLabel); /*Размещение элемента на панели расчета*/

     /* Создание панели выбора параметров */
     JPanel questionPanel = new JPanel(); /*Создание экземпляра класса JPanel*/
     questionPanel.setLayout(null); /*Установка менеджера расположения*/
     questionPanel.setBounds(10,75,550,620); /*Установка положения и размеров элемента*/
     questionPanel.setBackground(new Color(250, 250, 250)); /*Установка фонового цвета*/
     questionPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED)); /*Установка обрамления элемента*/
     mainPanel.add(questionPanel); /*Размещение элемента на главной панели*/

     /*Создание надписи - Категория транспортного средства*/
     JLabel question1Label = new JLabel("Категория транспортного средства:"); /*Создание экземпляра класса JLabel*/
     question1Label.setBounds(15,10,300,20); /*Установка положения и размеров элемента*/
     question1Label.setFont(regularFont); /*Установка начертания*/
     questionPanel.add(question1Label); /*Размещение элемента на панели выбора параметров*/

     /* Создание выпадающего меню - Категория транспортного средства*/
     String[] question1Items = {/*Создание строкового массива для хранения вариантов ответа*/
             "Категория А",
             "Категория В",
             "Категория B, используемые в качестве такси",
             "Категория С, максимальной массой 16 тонн и менее",
             "Категория С, максимальной массой более 16 тонн",
             "Категория D, с числом пассажиров до 20 включительно",
             "Категория D, с числом пассажиров более 20",
             "Троллейбусы",
             "Трамваи",
             "Прицепы к легковым автомобилям"
     };
     JComboBox question1ComboBox = new JComboBox(question1Items); /*Создание экземпляра класса JComboBox */
     question1ComboBox.setBounds(15,33,520,24); /*Установка положения и размеров элемента*/
     question1ComboBox.setFont(regularFont); /*Установка начертания*/
     question1ComboBox.setBackground(Color.WHITE); /*Установка фонового цвета*/
     questionPanel.add(question1ComboBox); /*Добавление элемента на панель выбора параметров*/

     /*Создание надписи - Регион регистрации*/
     JLabel question2Label = new JLabel("Регион регистрации транспортного средства:"); /*Создание экземпляра класса JLabel*/
     question2Label.setBounds(15,68,400,20); /*Установка положения и размеров элемента*/
     question2Label.setFont(regularFont);  /*Установка начертания*/
     questionPanel.add(question2Label); /*Размещение элемента на панели выбора параметров*/

     /* Создание выпадающего меню - Регион регистрации*/
     String[] question2Items = { /*Создание строкового массива для хранения вариантов ответа*/
             "Москва",
             "Санкт-Петербург",
             "Казань",
             "Уфа",
             "Самара",
             "Воронеж",
             "другое",

     };
     JComboBox question2ComboBox = new JComboBox(question2Items);/*Создание экземпляра класса JComboBox */
     question2ComboBox.setBounds(15,91,520,24);/*Установка положения и размеров элемента*/
     question2ComboBox.setFont(regularFont); /*Установка начертания*/
     question2ComboBox.setBackground(Color.WHITE); /*Установка фонового цвета*/
     questionPanel.add(question2ComboBox);/*Добавление элемента на панель выбора параметров*/

     /*Создание надписи - Бонус малус*/
     JLabel question3Label = new JLabel("Класс бонуса-малус:");/*Создание экземпляра класса JLabel*/
     question3Label.setBounds(15,126,400,20);/*Установка положения и размеров элемента*/
     question3Label.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question3Label); /*Размещение элемента на панели выбора параметров*/

     /* Создание выпадающего меню - Выберите класс бонуса-малуса*/
     String[] question3Items = { /*Создание строкового массива для хранения вариантов ответа*/
             "М","0","1","2","3","4","5","6","7","8","9","10","11","12","13"
     };
     JComboBox question3ComboBox = new JComboBox(question3Items);/*Создание экземпляра класса JComboBox */
     question3ComboBox.setBounds(15,149,520,24);/*Установка положения и размеров элемента*/
     question3ComboBox.setFont(regularFont); /*Установка начертания*/
     question3ComboBox.setBackground(Color.WHITE);/*Установка фонового цвета*/
     questionPanel.add(question3ComboBox);/*Добавление элемента на панель выбора параметров*/

     /*Создание надписи - Стаж вождения*/
     JLabel question4Label = new JLabel("Стаж вождения:");/*Создание экземпляра класса JLabel*/
     question4Label.setBounds(15,184,400,20);/*Установка положения и размеров элемента*/
     question4Label.setFont(regularFont); /*Установка начертания*/
     questionPanel.add(question4Label); /*Размещение элемента на панели выбора параметров*/

     /*Создание поля ввода - Стаж вождения*/
     JTextField question4Field = new JTextField(); /*Создание экземпляра класса JTextField*/
     question4Field.setBounds(15,207,520,22); /*Установка положения и размеров элемента*/
     question4Field.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question4Field);/*Размещение элемента на панели выбора параметров*/

     /*Создание надписи - Возраст*/
     JLabel question5Label = new JLabel("Возраст:");/*Создание экземпляра класса JLabel*/
     question5Label.setBounds(15,242,400,20);/*Установка положения и размеров элемента*/
     question5Label.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question5Label);/*Размещение элемента на панели выбора параметров*/

     /*Создание поля ввода - Возраст*/
     JTextField question5Field = new JTextField();/*Создание экземпляра класса JTextField*/
     question5Field.setBounds(15,265,520,22);/*Установка положения и размеров элемента*/
     question5Field.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question5Field);/*Размещение элемента на панели выбора параметров*/


     /*Создание надписи - Количество лиц, допущенных к управлению ТС*/
     JLabel question6Label = new JLabel("Количество лиц, допущенных к управлению транспортным средством:");/*Создание экземпляра класса JLabel*/
     question6Label.setBounds(15,300,550,20);/*Установка положения и размеров элемента*/
     question6Label.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question6Label);/*Размещение элемента на панели выбора параметров*/

     /*Создание комбобокса - Лиц допущенных к управлению-1*/
     JRadioButton question71Radio = new JRadioButton("Предусматривается ограничение до 5 лиц ");/*Создание экземпляра класса JRadioButton*/
     question71Radio.setBounds(15, 323, 400,20);/*Установка положения и размеров элемента*/
     question71Radio.setSelected(true);/*Установка выбора по умолчанию*/
     question71Radio.setFont(regularFont);/*Установка начертания*/
     question71Radio.setBackground(new Color(250, 250, 250));//Установка фонового цвета*/
     questionPanel.add(question71Radio);/*Размещение элемента на панели выбора параметров*/

     /*Создание комбобокса - Лиц допущенных к управлению-2*/
     JRadioButton question72Radio = new JRadioButton("Ограничение лиц не предусмотренно ");/*Создание экземпляра класса JRadioButton*/
     question72Radio.setBounds(15, 346, 400,20);/*Установка положения и размеров элемента*/
     question72Radio.setFont(regularFont);/*Установка начертания*/
     question72Radio.setBackground(new Color(250, 250, 250));/*Установка фонового цвета*/
     questionPanel.add(question72Radio);/*Размещение элемента на панели выбора параметров*/

     /*Объединение в группу элементы типа RadioButton*/
     ButtonGroup group = new ButtonGroup();/*Создание группы элементов RadioButton*/
     group.add(question71Radio);/*Добавление в группу RadioButton*/
     group.add(question72Radio);/*Добавление в группу RadioButton*/

     /*Создание надписи - Мощность автомобиля*/
     JLabel question8Label = new JLabel("Мощность автомобиля: (л.с.)");/*Создание экземпляра класса JLabel*/
     question8Label.setBounds(15,381,400,20); /*Установка положения и размеров элемента*/
     question8Label.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question8Label);/*Размещение элемента на панели выбора параметров*/

     /*Создание поля ввода - Мощность автоомобиля*/
     JTextField question8Field = new JTextField();/*Создание экземпляра класса JTextField*/
     question8Field.setBounds(15,404,520,22);/*Создание экземпляра класса JLabel*/
     question8Field.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question8Field);/*Размещение элемента на панели выбора параметров*/


     /*Создание надписи - Сезонность*/
     JLabel question9Label = new JLabel("Сезонность: (от 3 месяцев)");/*Создание экземпляра класса JLabel*/
     question9Label.setBounds(15,439,400,20);/*Установка положения и размеров элемента*/
     question9Label.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question9Label);/*Размещение элемента на панели выбора параметров*/

     /*Создание поля ввода - Сезонность*/
     JTextField question9Field = new JTextField(); /*Создание экземпляра класса JTextField*/
     question9Field.setBounds(15,462,520,22); /*Установка положения и размеров элемента*/
     question9Field.setFont(regularFont); /*Установка начертания*/
     questionPanel.add(question9Field); /*Размещение элемента на панели выбора параметров*/

     /*Создание надписи - Грубые нарушения*/
     JLabel question10Label = new JLabel("Коэффициент нарушений:");/*Создание экземпляра класса JLabel*/
     question10Label.setBounds(15,497,400,20);/*Установка положения и размеров элемента*/
     question10Label.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question10Label);/*Размещение элемента на панели выбора параметров*/

     /*Создание комбобокса - Грубые нарушения*/
     JCheckBox question10CheckBox = new JCheckBox("Применение коэффициента за грубые нарушения");/*Создание экземпляра класса JCheckBox*/
     question10CheckBox.setBounds(15, 520, 400,20);/*Установка положения и размеров элемента*/
     question10CheckBox.setFont(regularFont);/*Установка начертания*/
     question10CheckBox.setBackground(new Color(250, 250, 250));/*Установка фонового цвета*/
     questionPanel.add(question10CheckBox);/*Размещение элемента на панели выбора параметров*/


     /*Создание надписи - Срок страхования*/
     JLabel question11Label = new JLabel("Срок страхования:");/*Создание экземпляра класса JLabel*/
     question11Label.setBounds(15,555,400,20);/*Установка положения и размеров элемента*/
     question11Label.setFont(regularFont);/*Установка начертания*/
     questionPanel.add(question11Label);/*Размещение элемента на панели выбора параметров*/

     /* Создание выпадающего меню - Выберите класс бонуса-малуса*/
     String[] question11Items = { /*Создание строкового массива для хранения вариантов ответа*/
             "от 5 до 15 дней","от 16 дней до 1 месяца","2 месяца","3 месяца","4 месяца","5 месяцев","6 месяцев","7 месяцев","8 месяцев","9 месяцев","10 и более месяцев"
     };
     JComboBox question11ComboBox = new JComboBox(question11Items);/*Создание экземпляра класса JComboBox*/
     question11ComboBox.setBounds(15,578,520,24);/*Установка положения и размеров элемента*/
     question11ComboBox.setFont(regularFont);/*Установка начертания*/
     question11ComboBox.setBackground(Color.WHITE);/*Установка фонового цвета*/
     questionPanel.add(question11ComboBox);/*Размещение элемента на панели выбора параметров*/

     /*Создание кнопки вычисления */
     JButton calculButton = new JButton("Расчитать стоимость");/*Создание экземпляра класса  JButton*/
     calculButton.setBounds(570,175,220,48); /*Установка положения и размеров элемента*/
     calculButton.setFont(regularFont);/*Установка начертания*/
     calculButton.setBackground(new Color(220, 237, 200));/*Установка фонового цвета*/
     mainPanel.add(calculButton);/*Размещение элемента на панели выбора параметров*/

     setContentPane(mainPanel); /*Добавление главной панели на фрейм*/

     /*Создание обработчика события нажатия на кнопку - Расчитать стоимость*/
     calculButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             
        	 /*Считывание значения параметра ТБ из формы запуск функции вычисления коэф.*/
        	 setTb(TbVal(question1ComboBox.getSelectedIndex())); /*Получение индекса выбранного варианта и передача полученного значения в функцию вычисления коэф.*/
        	 System.out.println("Коэф. ТБ = " + getTb());/*Вывод коэф. в консоль*/
        	 
        	 
        	 /*Считывание значения параметра КТ из формы запуск функции вычисления коэф.*/
        	 setKt(KtVal(question2ComboBox.getSelectedIndex()));/*Получение индекса выбранного варианта и передача полученного значения в функцию вычисления коэф.*/
             System.out.println("Коэф. КТ = " + getKt()); /*Вывод коэф. в консоль*/
                  
        	 /*Считывание значения параметра КБМ из формы запуск функции вычисления коэф.*/
        	 setKbm(KbmVal(question3ComboBox.getSelectedIndex()));/*Получение индекса выбранного варианта и передача полученного значения в функцию вычисления коэф.*/
        	 System.out.println("Коэф. КБМ = " + getKbm());/*Вывод коэф. в консоль*/
             
        	 /*Считывание значения параметра КБС и присваивание ему коэф.*/
        	 KbcVal(Integer.parseInt(question4Field.getText()),Integer.parseInt(question5Field.getText()));/*Считывание значений введенных в поля - Возраст и Стаж - перевод в int.*/
        	 System.out.println("Коэф. КБС = " + getKbc());/*Вывод коэф. в консоль*/
             
        	 /*Считывание значения параметра КО и присваивание ему коэф.*/
             if (question71Radio.isSelected()){ setKo(1); }; /*Проверка выбранного пункта и выполнение соотв. условия*/
             if (question72Radio.isSelected()){ setKo(1.8); }; /*Проверка выбранного пункта и выполнение соотв. условия*/
             System.out.println("Коэф. КО = " + getKo()); /*Вывод коэф. в консоль*/
             
             /*Считывание значения параметра КМ и присваивание ему коэф.*/
             KmVal(Integer.parseInt(question8Field.getText())); //Получение значение поля и перевод значение в int. - передача значения в фун-ю

             /*Считывание значения параметра КС и присваивание ему коэф.*/
             KcVal(Integer.parseInt(question9Field.getText())); /*Получение значение поля и перевод значение в int.- передача значения в фун-ю*/
             
             /*Считывание значения параметра КН и присваивание ему коэф.*/
             if (question10CheckBox.isSelected()){ setKn(1.5); }else setKn(1.0); /*Проверка выбранного пункта и выполнения соотв. условия*/
             System.out.println("Коэф. КН = " + getKn()); // /*Вывод коэф. в консоль*/
             
             /*Считывание значения параметра КП и присваивание ему коэф.*/
             setKp(KpVal(question11ComboBox.getSelectedIndex())); /*Получение индекса выбранного пунка и передача значения в функцию вычисления коэф.*/
             System.out.println("Коэф. КП = " + getKp()); /*Вывод коэф. в консоль*/
            
             /*Вычисление стоимости страхования*/
             String result = Calculation(getTb(),getKt(),getKbm(),getKbc(),getKo(),getKm(),getKc(),getKn(),getKp()); /*Передача в ф-ю вычисления всех параметров*/
             System.out.println(result); /*Вывод результата в консоль*/
             setResult(result); /*Установка результата в панель */

         }
         /*Установка значения вычисления*/
         public void setResult(String newText){
                 resultLabel.setText(newText + " руб."); /*Установка значения в resultLabel*/
         }
     } );
 }
/*Функция вычисления стоимость страхования*/
 public String Calculation(double tb, double kt, double kbm, double kbc, double ko, double km, double kc, double kn, double kp){
	String Res = ""; /* Объявление переменной*/
	double result = tb * kt * kbm * kbc * ko * km * kc * kn * kp;
	Res = Double.toString(Math.round(result)); /*Перевод значения в строку и присаивание переменную типа строка*/
    return Res; /*Возвращение результата*/
 };
 
 /*Функция вычисления коэф. ТБ*/
 public double TbVal(int Val){ /*Присвоение коэф. в соотвтствии с выбранным значение*/
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
 
 /*Функция вычисления коэф. КТ*/
 public double KtVal(int Val){ /*Присвоение коэф. в соответствии с выбранным значение*/
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
 return a;/*Возвращение коэф.*/
 }
 
/*Функция вычисления коэф. КБМ*/
 public double KbmVal(int Val){
	 double a=0.0;
	 switch (Val){ /*Присвоение коэф. в соответствии с выбранным значение*/
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
 
/*Функция вычисления коэф. КБC*/
 public void KbcVal(int Val1, int Val2){ //Присвоение коэф. в соотв. с условиями 
	 if (Val1<=3 && Val2<=22){setKbc(1.8);}
     if (Val1<=3 && Val2>22){setKbc(1.7);}
     if (Val1>3 && Val2<=22){setKbc(1.6);}
     if (Val1>3 && Val2>22){setKbc(1);}
 }
 
/*Функция вычисления коэф. КМ*/
 public void KmVal(int Val) { /*Присвоение коэф. в соотв. с условиями */
	 if (Val<=50){setKm(0.6);}
     if (Val>50 && Val<=70){setKm(1);}
     if (Val>70 && Val<=100){setKm(1.1);}
     if (Val>100 && Val<=120){setKm(1.2);}
     if (Val>120 && Val<=150){setKm(1.4);}
     if (Val>150) {setKm(1.6);}
     System.out.println("Коэф. КМ = " + getKm()); /*Вывод коэф. в консоль*/
 }
 
/*Функция вычисления коэф. КC*/
 public void KcVal(int Val){ /*Присвоение коэф. в соотв. с условиями */
	 if (Val<=3){setKc(0.5);}
     if (Val==4){setKc(0.6);}
     if (Val==5){setKc(0.65);}
     if (Val==6){setKc(0.7);}
     if (Val==7){setKc(0.8);}
     if (Val==8){setKc(0.9);}
     if (Val==9){setKc(0.95);}
     if (Val>=10){setKc(1);}
     System.out.println("Коэф. КC = " + getKc());/*Вывод коэф. в консоль*/
 }
 
/*Функция вычисления коэф. КП*/
 public double KpVal(int Val) {
	 double a=0.0;
	 switch (Val){ /*Присвоение коэф. в соответствии с выбранным значение*/
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
