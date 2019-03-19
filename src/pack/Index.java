package pack; /*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;
import java.awt.event.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую 
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"."(точка) используется для выделения элементов из ссылки на объект.
*/
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class Index extends JFrame{
	/*	(Public) - поля и методы класса Index доступны для всех других объектов и классов. 
	зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Index.
	Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
	 JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы 
	 используем его методы в своей программе. { }-описание класса располагается между фигурными скобками. 
	*/
	
	private static final long serialVersionUID = 1L;
	public static Index Frame = new Index(); /* Index() - это установка компонентов (панель вкладок) на JFrame. 
	(Public) - означает что фрейм Index можно вызвать из любого файла который лежит в пакете pack.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса*/
	
	public static void main(String[] args) { /*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
				void ()означает, что метод run не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/
					Frame.setVisible(true); //устанавливаем что окно Index (Расчет расхода топлива) видно пользователю

				} catch (Exception e) {
					e.printStackTrace();
					/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
					1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
					доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
					 прерывается, и управление прыгает в начало блока catch(err).
					*/
				}
			}
		});
	}
	
	private JPanel panel_1, panel_2, panel_3;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton button_1;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel label_1,label_2,label_3,label_4, label_5, label_6, label_7, label_8, label_9, label_10, label_11, 
	label_12, label_13; // Панели на которых располагается текст
	public static JTextField Vel_u_text, Str_sum_text, Stoim_oc_text, Pokaz_stoim_text, Stoim_im_text;/* текстовые поля 
	в которые пользователь вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox sistema_1, sistema_2, sistema_3, sistema_4, sistema_5, sistema_6;// компонент флажок
	public static int sistema_1_int=0, sistema_2_int=0,sistema_3_int=0, sistema_4_int=0, sistema_5_int=0, sistema_6_int=0,
	ver=0;//переменная типа integer, доступная любому классу
		/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/
	
	
	public Index() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Index - расположение на фрейме компонентов (панель вкладок), .*/
		setTitle("Страховой калькулятор имущества"); //устанавливает название окна 
		setSize(530, 440); // указывает ширину (530) и высоту (440).
		setLocationRelativeTo(null);//установить посередине экрана
		setResizable(false); //запрет на расширение окна 
		
		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        panel_1 = new JPanel();//Панель на которой  располагаются текстовые поля и поля для ввода текста
        panel_2 = new JPanel(); //Панель на которой располагаются текстовые поля и поля для ввода текста
        panel_3 = new JPanel();//Панель на которой располагается кнопка

		add(panel_1, BorderLayout.NORTH);//Добавление панели panel_1 наверх
		add(panel_2, BorderLayout.CENTER);//Добавление панели panel_2 по центру
		add(panel_3, BorderLayout.SOUTH);//Добавление панели panel_3 снизу

		panel_1.setBorder(new EmptyBorder(10,10,5,10));//установка внутренних отступов(10сверху,10слева,10снизу,10справа)
		panel_2.setBorder(new EmptyBorder(5,10,15,10));//установка внутренних отступов

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		panel_1.setLayout(new GridLayout(1,1,0,15));//на панели 1 строки,1столбец ("Выберите систему....")
		panel_2.setLayout(new GridLayout(11,2,15,5));/* на панеле будет 11 строк, 2 столбца, расстояние между
		 столбцами 15, расстояние между строками 5 */
		panel_3.setLayout(new GridLayout(1,1));//на панели 1 строка,1столбец, будет расположена кнопка

		label_1 = new JLabel("Выберите систему страховой ответственности:", JLabel.LEFT);
		label_2 = new JLabel("     1. Действительной стоимости", JLabel.LEFT);
		label_3 = new JLabel("     2. Пропорциональной ответственности", JLabel.LEFT);
		label_4 = new JLabel("     3. Первого риска", JLabel.LEFT);
		label_5 = new JLabel("     4. Дробной части", JLabel.LEFT);
		label_6 = new JLabel("     5. Восстановительной стоимости", JLabel.LEFT);
		
		label_7 = new JLabel("Введите данные:", JLabel.LEFT);
		label_8 = new JLabel("");

		label_9 = new JLabel("Величина ущерба, руб:", JLabel.RIGHT);
		label_10 = new JLabel("страховая сумма, руб:", JLabel.RIGHT);
		label_11 = new JLabel("стоимостная оценка, руб:", JLabel.RIGHT);
		label_12 = new JLabel("показная стоимость, руб:", JLabel.RIGHT);
		label_13 = new JLabel("стоимость нового имущества, руб:", JLabel.RIGHT);

		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.RIGHT - выравнивание по правому краю
		*/
		
		button_1 = new JButton("Рассчитать величину страховых выплат"); //В скобках - надпись на кнопке
		
		sistema_1 = new JCheckBox();//компонент флажок 
		sistema_1.setToolTipText("Выбрать систему действительной стоимости");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент (компонент флажок)*/
		
		sistema_2 = new JCheckBox();//компонент флажок 
		sistema_2.setToolTipText("Выбрать систему пропорциональной ответственности");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент (компонент флажок)*/
		
		sistema_3 = new JCheckBox();//компонент флажок 
		sistema_3.setToolTipText("Выбрать систему первого риска");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент (компонент флажок)*/
		
		sistema_4 = new JCheckBox();//компонент флажок 
		sistema_4.setToolTipText("Выбрать систему дробной части");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент (компонент флажок)*/
		
		sistema_5 = new JCheckBox();//компонент флажок 
		sistema_5.setToolTipText("Выбрать систему восстановительной стоимости");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент (компонент флажок)*/
		
		Vel_u_text = new JTextField();
		Vel_u_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Vel_u_text.setToolTipText("Введите величину ущерба");//всплывающая подсказка при наведении на текстовое поле
    	
		Str_sum_text = new JTextField();
		Str_sum_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Str_sum_text.setToolTipText("Введите страховую сумму");//всплывающая подсказка при наведении на текстовое поле
    			
		Stoim_oc_text = new JTextField();
		Stoim_oc_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Stoim_oc_text.setToolTipText("Введите стоимостную оценку");//всплывающая подсказка при наведении на текстовое поле

		Pokaz_stoim_text = new JTextField();
		Pokaz_stoim_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Pokaz_stoim_text.setToolTipText("Введите показную стоимость");//всплывающая подсказка при наведении на текстовое поле

		Stoim_im_text = new JTextField();
		Stoim_im_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Stoim_im_text.setToolTipText("Введите стоимость нового имущества");//всплывающая подсказка при наведении на текстовое поле
		
		panel_3.add(button_1);//Добавление кнопки на панель panel_3
		
		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели panel_1 и panel_2
		panel_1.add(label_1);

		panel_2.add(label_2);
		panel_2.add(sistema_1);
		panel_2.add(label_3);
		panel_2.add(sistema_2);
		panel_2.add(label_4);
		panel_2.add(sistema_3);
		panel_2.add(label_5);
		panel_2.add(sistema_4);
		panel_2.add(label_6);
		panel_2.add(sistema_5);	
		panel_2.add(label_7);
		panel_2.add(label_8);
		panel_2.add(label_9);
		panel_2.add(Vel_u_text);
		panel_2.add(label_10);
		panel_2.add(Str_sum_text);
		panel_2.add(label_11);
		panel_2.add(Stoim_oc_text);
		panel_2.add(label_12);
		panel_2.add(Pokaz_stoim_text);
		panel_2.add(label_13);
		panel_2.add(Stoim_im_text);		
		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели panel_1 и panel_2

		//устанавливаем что поля недоступны пока не выбрать систему страховой ответственности
		Str_sum_text.setEditable(false);
		Stoim_oc_text.setEditable(false);
		Pokaz_stoim_text.setEditable(false);
		Stoim_im_text.setEditable(false);
			sistema_1.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==sistema_1)//если событие произошло именно с флажком sistema_1, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбрана 
					система действительной стоимости (первая)  */
						sistema_1_int=1; //переменная которая отвечает за то выбрана первая система или нет
						sistema_2.setSelected(false);
						sistema_3.setSelected(false);
						sistema_4.setSelected(false);
						sistema_5.setSelected(false);
						}
					else { //если флажок выключен, то значит первая система не выбрана
						sistema_1_int=0;//переменная которая отвечает за то выбрана первая система или нет
					}
			}                                                       
    	   }); 		
		
		sistema_2.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==sistema_2)//если событие произошло именно с флажком sistema_2, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбрана 
					система пропорциональной ответственности (вторая)  */
						sistema_2_int=1; //переменная которая отвечает за то выбрана вторая система или нет
						Str_sum_text.setEditable(true);
						Stoim_oc_text.setEditable(true);
						sistema_1.setSelected(false);
						sistema_3.setSelected(false);
						sistema_4.setSelected(false);
						sistema_5.setSelected(false);
						}
					else { //если флажок выключен, то значит вторая система не выбрана
						sistema_2_int=0;//переменная которая отвечает за то выбрана вторая система или нет
						Str_sum_text.setEditable(false);
						Stoim_oc_text.setEditable(false);
					}
			}                                                       
    	   });
    	   
    	   	sistema_3.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==sistema_3)//если событие произошло именно с флажком sistema_3, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбрана 
					система первого риска (третья)  */
						sistema_3_int=1; //переменная которая отвечает за то выбрана третья система или нет
						Str_sum_text.setEditable(true);
						sistema_1.setSelected(false);
						sistema_2.setSelected(false);
						sistema_4.setSelected(false);
						sistema_5.setSelected(false);
						}
					else { //если флажок выключен, то значит третья система не выбрана
						sistema_3_int=0;//переменная которая отвечает за то выбрана третья система или нет
						Str_sum_text.setEditable(false);
					}
			}                                                       
    	   });
		
		sistema_4.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==sistema_4)//если событие произошло именно с флажком sistema_4, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбрана 
					система дробной части (четвертая)  */
						sistema_4_int=1; //переменная которая отвечает за то выбрана четвертая система или нет
						Pokaz_stoim_text.setEditable(true);
						Stoim_oc_text.setEditable(true);
						Str_sum_text.setEditable(true);
						sistema_1.setSelected(false);
						sistema_2.setSelected(false);
						sistema_3.setSelected(false);
						sistema_5.setSelected(false);
						}
					else { //если флажок выключен, то значит четвертая система не выбрана
						sistema_4_int=0;//переменная которая отвечает за то выбрана четвертая система или нет
						Pokaz_stoim_text.setEditable(false);
						Stoim_oc_text.setEditable(false);
						Str_sum_text.setEditable(false);
					}
			}                                                       
    	   });
    	   		sistema_5.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==sistema_5)//если событие произошло именно с флажком sistema_5, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбрана 
					система восстановительной стоимости (пятая)  */
						sistema_5_int=1; //переменная которая отвечает за то выбрана пятая система или нет
						Stoim_im_text.setEditable(true);
						sistema_1.setSelected(false);
						sistema_2.setSelected(false);
						sistema_3.setSelected(false);
						sistema_4.setSelected(false);
						}
					else { //если флажок выключен, то значит пятая система не выбрана
						sistema_5_int=0;//переменная которая отвечает за то выбрана пятая система или нет
						Stoim_im_text.setEditable(false);
					}
			}                                                       
    	   });
    		button_1.addActionListener(new ActionListener()   
    			/* 	Sost_smetu - кнопка Составить смету
    	 		"."  - указывает к какой переменной (кнопке) следует применить слушателя.
    	 		addActionListener - добавление слушателя ActionListener к кнопке
    	  		new - Оператор new создает экземпляр указанного класса 
    	  		(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
    	  		который будет отвечать за реагирование на события. 
    	  		В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
    	  		Поэтому будет использоваться интерфейс "ActionListener", 
    	  		предназначенный для обработки событий "ActionEvent".
    	  		тело интерфейса указывается ниже после фигурной скобки "{"
    	  		*/ 
    	   {                                                         
    	    public void actionPerformed(ActionEvent e)   
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
      		который реализуется путем простого вызова обработчика событий ActionPerformed.
      		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
      		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
      	*/
    	    {  

        	if (sistema_1_int+sistema_2_int+sistema_3_int+sistema_4_int+sistema_5_int!=0){
    	    	if ((isValidInput(Vel_u_text, "величину ущерба")))
    	    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    		 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    		   		Если введены некорректные данные, то выдает ошибку */	
    	    		{
    	    		if (sistema_1_int==1){ //нужно рассчитывать амортизацию или нет, =0 - не нужно
    	    			ver=1;
    	    		} else if (sistema_2_int==1){ //нужно рассчитывать амортизацию или нет, =0 - не нужно
    	    			if (isValidInput(Str_sum_text, "страховую сумму") &&
    	    	    		isValidInput(Stoim_oc_text, "стоимостную оценку")) {ver=1;} else {ver=0;};
    	    			/* проверка правильно ли ввели данные в поля для ввода */
    	    		} else if  (sistema_3_int==1) {
    	    			if (isValidInput(Str_sum_text, "страховую сумму")) {ver=1;} else {ver=0;};	
    	    			/* проверка правильно ли ввели данные в поля для ввода */
    	    		} else if  (sistema_4_int==1) {
    	    			if (isValidInput(Str_sum_text, "страховую сумму") &&
        	    	    	isValidInput(Stoim_oc_text, "стоимостную оценку")&&
        	    	    	isValidInput(Pokaz_stoim_text, "показную стоимость")) {
    	    				if (Double.parseDouble(Pokaz_stoim_text.getText())>Double.parseDouble(Stoim_oc_text.getText())){
    	    					JDialog D=new JDialog();
    	                	JOptionPane.showMessageDialog(D, "Показная стоимость не может быть больше стоимостной оценки", "Ошибка", JOptionPane.WARNING_MESSAGE);
    	                	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
    		    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
    		    		 "показная..."  это сообщение отображаемые в диалоге
    		               */
    	                	Stoim_oc_text.requestFocus();//ставит фокус на строчке Pokaz_stoim_text
    	                	Pokaz_stoim_text.setText("");    
    		    			/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
    				    	*/  
    	                	Stoim_oc_text.setText("");    } 
    	    				else {ver=1;}   	    				
    	    				} else {ver=0;};	
    	    			/* проверка правильно ли ввели данные в поля для ввода */
    	    		} else if  (sistema_5_int==1) {
    	    			if (isValidInput(Stoim_im_text, "цену нового имущества")) {ver=1;} else {ver=0;};	
        	    			/* проверка правильно ли ввели данные в поля для ввода */
        	    	}   	
    	    		
    	    		if (ver==1){
    	    		Srtah_kal.text_str_kal(); /* Обращаемся в класс Srtah_kal к методу text_str_kal 	*/
        	    	Frame.setVisible(false);//Окно становится невидимым
        	    	Result.main(null);
    	    		/* 	что будет происходить при нажатии на кнопку 
    				(открывается новая оконная форма класса Result) 
    				программа передает в метод main класса Result null. 
    				Тем самым происходит запуск метода без передачи переменных 
    				*/

    	    		}
    	    	} 
    	     }  else {
    	    	 JDialog D=new JDialog();
             	JOptionPane.showMessageDialog(D, "Пожалуйста, выберите одну из систем страхования имущества", "Ошибка", JOptionPane.WARNING_MESSAGE);
             	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
	    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
	    		 "показная..."  это сообщение отображаемые в диалоге
	               */
    	     }
    	    }
    	   });  
	}
		   
	//проверка данных, введенных пользователем
    public static boolean isValidInput(JTextField jtxt, String description) {

        JDialog D = new JDialog();
		//если был введен какой-либо текст
        if (jtxt.getText().trim().length() > 0) {
            //проверка на ввод только целого числа
            try { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/
              
                 double num = Double.parseDouble(jtxt.getText()); //попытка преобразовать текст в целое число      
                return true; //если все нормально - возвращаем true

            } catch (NumberFormatException e) {
            	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/

                //предупреждение - неверный формат числа
                JOptionPane.showMessageDialog(D, "Вы должны ввести целое число!", "Ошибка", JOptionPane.WARNING_MESSAGE);

                //расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число
                jtxt.requestFocus();
                jtxt.setText("");//очистить текстовое поле

                return false;//ошибка - возвращаем false
            }

        } else {// если пользователь не ввели никаких данных

            //предупреждение, что нужно ввести данные
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);

            //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
            jtxt.requestFocus();
            jtxt.selectAll();//очистить текстовое поле

            //ошибка - возвращаем false
            return false;
        }
    }	

}
