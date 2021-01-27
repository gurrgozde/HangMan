import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Hangman {


	private JTextField txt;
	private JTextField txthigh;
	private JTextField txtyour;
	private JTextField info;
	private JTextField ipucu2;
	int score=0;
	int hscore=0;
	int sayac = -1;
	private JTextField ins;
	static char [] word2 = {'_','_','_','_','_','_','_'};
	//	static String [] word = {"Ankara","Beckham","Banana","Batman"};
	static String word = "Beckham" ;
	//	char [] alfabe = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z' ,
	//			'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' };
	char arr[]= new char[29];
	int sayici = 0;
	JFrame f;

	public Hangman() {
		initialize();
	}

	private void initialize() {

		f = new JFrame();
		f.setFont(new Font("Dialog", Font.BOLD, 15));
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Berke ERDEM\\eclipse-workspace\\Proje\\img\\a.png"));
		f.setTitle("HANGMAN <3");
		f.getContentPane().setBackground(Color.PINK);
		f.setBounds(100, 100, 830, 766);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);

		JLabel l = new JLabel("HANGMAN");
		l.setFont(new Font("Cooper Black", Font.BOLD, 40));
		l.setForeground(new Color(0, 0, 0));
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setBounds(208, 0, 367, 60);
		f.getContentPane().add(l);

		JButton A = new JButton("A");
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='a' || c=='A') {
						A.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						A.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		A.setFont(new Font("Tahoma", Font.BOLD, 15));
		A.setForeground(Color.BLACK);
		A.setBackground(Color.LIGHT_GRAY);
		A.setBounds(12, 62, 47, 25);
		f.getContentPane().add(A);

		JButton C = new JButton("C");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='c' || c=='C') {
						C.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						C.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		C.setFont(new Font("Tahoma", Font.BOLD, 15));
		C.setForeground(Color.BLACK);
		C.setBackground(Color.LIGHT_GRAY);
		C.setBounds(130, 62, 47, 25);
		f.getContentPane().add(C);

		JButton D = new JButton("D");
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='d' || c=='D') {
						D.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						D.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		D.setFont(new Font("Tahoma", Font.BOLD, 15));
		D.setBackground(Color.LIGHT_GRAY);
		D.setBounds(189, 62, 47, 25);
		f.getContentPane().add(D);



		JButton B = new JButton("B");
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='b' || c=='B') {
						B.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						B.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;



				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		B.setFont(new Font("Tahoma", Font.BOLD, 15));
		B.setForeground(Color.BLACK);
		B.setBackground(Color.LIGHT_GRAY);
		B.setBounds(71, 62, 47, 25);
		f.getContentPane().add(B);

		JButton E = new JButton("E");
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='e' || c=='E') {
						E.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						E.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;


				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		E.setBackground(Color.LIGHT_GRAY);
		E.setFont(new Font("Tahoma", Font.BOLD, 15));
		E.setBounds(248, 62, 47, 25);
		f.getContentPane().add(E);

		JButton F = new JButton("F");
		F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='f' || c=='F') {
						F.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						F.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		F.setFont(new Font("Tahoma", Font.BOLD, 15));
		F.setBackground(Color.LIGHT_GRAY);
		F.setBounds(307, 62, 47, 25);
		f.getContentPane().add(F);

		JButton G = new JButton("G");
		G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='g' || c=='G') {
						G.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						G.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		G.setBackground(Color.LIGHT_GRAY);
		G.setFont(new Font("Tahoma", Font.BOLD, 15));
		G.setBounds(366, 62, 47, 25);
		f.getContentPane().add(G);

		JButton H = new JButton("H");
		H.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='h' || c=='H') {
						H.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						H.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		H.setBackground(Color.LIGHT_GRAY);
		H.setFont(new Font("Tahoma", Font.BOLD, 15));
		H.setBounds(425, 62, 47, 25);
		f.getContentPane().add(H);

		JButton I = new JButton("I");
		I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='ý' || c=='I') {
						I.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						I.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		I.setBackground(Color.LIGHT_GRAY);
		I.setFont(new Font("Tahoma", Font.BOLD, 15));
		I.setBounds(484, 62, 47, 25);
		f.getContentPane().add(I);

		JButton J = new JButton("J");
		J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='j' || c=='J') {
						J.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						J.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		J.setBackground(Color.LIGHT_GRAY);
		J.setFont(new Font("Tahoma", Font.BOLD, 15));
		J.setBounds(543, 62, 57, 25);
		f.getContentPane().add(J);

		JButton K = new JButton("K");
		K.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='k' || c=='K') {
						K.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						K.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		K.setBackground(Color.LIGHT_GRAY);
		K.setFont(new Font("Tahoma", Font.BOLD, 15));
		K.setBounds(612, 62, 47, 25);
		f.getContentPane().add(K);

		JButton L = new JButton("L");
		L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='l' || c=='L') {
						L.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						L.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		L.setBackground(Color.LIGHT_GRAY);
		L.setFont(new Font("Tahoma", Font.BOLD, 15));
		L.setBounds(671, 62, 47, 25);
		f.getContentPane().add(L);

		JButton M = new JButton("M");
		M.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='m' || c=='M') {
						M.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						M.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		M.setBackground(Color.LIGHT_GRAY);
		M.setFont(new Font("Tahoma", Font.BOLD, 15));
		M.setBounds(730, 62, 47, 25);
		f.getContentPane().add(M);

		JButton N = new JButton("N");
		N.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='n' || c=='N') {
						N.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						N.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		N.setBackground(Color.LIGHT_GRAY);
		N.setFont(new Font("Tahoma", Font.BOLD, 15));
		N.setBounds(12, 100, 47, 25);
		f.getContentPane().add(N);

		JButton O = new JButton("O");
		O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='o' || c=='O') {
						O.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						O.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		O.setBackground(Color.LIGHT_GRAY);
		O.setFont(new Font("Tahoma", Font.BOLD, 15));
		O.setBounds(71, 100, 47, 25);
		f.getContentPane().add(O);

		JButton P = new JButton("P");
		P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='p' || c=='P') {
						P.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						P.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		P.setBackground(Color.LIGHT_GRAY);
		P.setFont(new Font("Tahoma", Font.BOLD, 15));
		P.setBounds(130, 100, 47, 25);
		f.getContentPane().add(P);

		JButton Q = new JButton("Q");
		Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='q' || c=='Q') {
						Q.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						Q.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		Q.setBackground(Color.LIGHT_GRAY);
		Q.setFont(new Font("Tahoma", Font.BOLD, 15));
		Q.setBounds(189, 100, 47, 25);
		f.getContentPane().add(Q);

		JButton R = new JButton("R");
		R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='r' || c=='R') {
						R.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						R.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		R.setBackground(Color.LIGHT_GRAY);
		R.setFont(new Font("Tahoma", Font.BOLD, 15));
		R.setBounds(248, 100, 47, 25);
		f.getContentPane().add(R);

		JButton S = new JButton("S");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='s' || c=='S') {
						S.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						S.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		S.setBackground(Color.LIGHT_GRAY);
		S.setFont(new Font("Tahoma", Font.BOLD, 15));
		S.setBounds(307, 100, 47, 25);
		f.getContentPane().add(S);

		JButton T = new JButton("T");
		T.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='t' || c=='T') {
						T.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						T.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		T.setBackground(Color.LIGHT_GRAY);
		T.setFont(new Font("Tahoma", Font.BOLD, 15));
		T.setBounds(366, 100, 47, 25);
		f.getContentPane().add(T);

		JButton U = new JButton("U");
		U.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='u' || c=='U') {
						U.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						U.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		U.setBackground(Color.LIGHT_GRAY);
		U.setFont(new Font("Tahoma", Font.BOLD, 15));
		U.setBounds(425, 100, 47, 25);
		f.getContentPane().add(U);

		JButton V = new JButton("V");

		V.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='v' || c=='V') {
						V.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						V.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		V.setBackground(Color.LIGHT_GRAY);
		V.setFont(new Font("Tahoma", Font.BOLD, 15));
		V.setBounds(484, 100, 47, 25);
		f.getContentPane().add(V);

		JButton W = new JButton("W");
		W.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='W' || c=='w') {
						W.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						W.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		W.setBackground(Color.LIGHT_GRAY);
		W.setFont(new Font("Tahoma", Font.BOLD, 15));
		W.setBounds(543, 100, 57, 25);
		f.getContentPane().add(W);

		JButton X = new JButton("X");
		X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='x' || c=='X') {
						X.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						X.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		X.setBackground(Color.LIGHT_GRAY);
		X.setFont(new Font("Tahoma", Font.BOLD, 15));
		X.setBounds(612, 100, 47, 25);
		f.getContentPane().add(X);

		JButton Y = new JButton("Y");
		Y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='Y' || c=='y') {
						Y.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						Y.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		Y.setBackground(Color.LIGHT_GRAY);
		Y.setFont(new Font("Tahoma", Font.BOLD, 15));
		Y.setBounds(671, 100, 47, 25);
		f.getContentPane().add(Y);

		JButton Z = new JButton("Z");
		Z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c5 = 0 ;
				for(int i=0 ; i<word.length() ; i++) {

					char c = word.charAt(i);

					if(c=='z' || c=='Z') {
						Z.setVisible(false);
						word2[i] =  word.charAt(i);
						System.out.println(word2);
						arr[sayici] = c  ;
						sayici++;
						score+=1;
						txtyour.setText(txtyour.getText() +score);
						if(score>hscore) {
							txthigh.setText(txthigh.getText() + score);
						}
						else {
							txthigh.setText(txthigh.getText() + hscore);
						}
					}

					else {

						Z.setVisible(false);
						if(c5==0) {
							sayac++;
						}
						c5++;
					}

				}

				String n = "";

				for(int m = 0 ; m<word2.length;m++) {
					n = n + word2[m];
				}
				txt.setText(n) ;

				JLabel zero = new JLabel();
				JLabel one = new JLabel();
				JLabel two = new JLabel();
				JLabel three = new JLabel();
				JLabel four = new JLabel();
				JLabel five = new JLabel();
				JLabel six = new JLabel();


				if(sayac == 0) {
					zero.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("c.png"));
					zero.setIcon(image1);
					zero.setBounds(435, 150, 285, 266);
					f.add(zero);
				}

				if(sayac == 1) {
					one.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("d.png"));
					one.setIcon(image1);
					one.setBounds(435, 150, 285, 266);
					f.remove(zero);
					f.add(one);
				}

				if(sayac == 2) {
					two.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("e.png"));
					two.setIcon(image1);
					two.setBounds(435, 150, 285, 266);
					f.remove(one);
					f.add(two);
				}

				if(sayac == 3) {
					three.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("f.png"));
					three.setIcon(image1);
					three.setBounds(435, 150, 285, 266);
					f.remove(two);
					f.add(three);
				}

				if(sayac == 4) {
					four.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("g.png"));
					four.setIcon(image1);
					four.setBounds(435, 150, 285, 266);
					f.remove(three);
					f.add(four);
				}

				if(sayac == 5) {
					five.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("h.png"));
					five.setIcon(image1);
					five.setBounds(435, 150, 285, 266);
					f.remove(four);
					f.add(five);
				}

				if(sayac == 6) {
					six.setHorizontalAlignment(SwingConstants.CENTER);
					ImageIcon image1 = new ImageIcon(Hangman.class.getResource("ý.png"));
					six.setIcon(image1);
					six.setBounds(435, 150, 285, 266);
					f.remove(five);
					f.add(six);
				}
			}
		});
		Z.setBackground(Color.LIGHT_GRAY);
		Z.setFont(new Font("Tahoma", Font.BOLD, 15));
		Z.setBounds(730, 100, 47, 25);
		f.getContentPane().add(Z);

		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setBackground(Color.LIGHT_GRAY);
		txt.setBounds(425, 444, 293, 51);
		f.getContentPane().add(txt);
		txt.setColumns(10);

		JButton start = new JButton("New HangMan");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
				txtyour.setText("");
				txthigh.setText("");
				ins.setText("");
				ipucu2.setText("");
				info.setText("");
				A.setVisible(true);
				B.setVisible(true);
				C.setVisible(true);
				D.setVisible(true);
				E.setVisible(true);
				F.setVisible(true);
				G.setVisible(true);
				I.setVisible(true);
				H.setVisible(true);
				J.setVisible(true);
				K.setVisible(true);
				L.setVisible(true);
				M.setVisible(true);
				N.setVisible(true);
				O.setVisible(true);
				P.setVisible(true);
				Q.setVisible(true);
				R.setVisible(true);
				S.setVisible(true);
				T.setVisible(true);
				U.setVisible(true);
				V.setVisible(true);
				W.setVisible(true);
				X.setVisible(true);
				Y.setVisible(true);
				Z.setVisible(true);

			}
		});
		start.setForeground(Color.BLACK);
		start.setBackground(Color.WHITE);
		start.setFont(new Font("Tahoma", Font.BOLD, 15));
		start.setBounds(490, 508, 160, 33);
		f.getContentPane().add(start);

		JLabel your = new JLabel("Your Score :");
		your.setBounds(37, 473, 96, 25);
		f.getContentPane().add(your);

		JLabel high = new JLabel("High Score :");
		high.setBounds(37, 444, 81, 16);
		f.getContentPane().add(high);

		txthigh = new JTextField();
		txthigh.setBackground(Color.PINK);
		txthigh.setBounds(120, 441, 116, 22);
		f.getContentPane().add(txthigh);
		txthigh.setColumns(10);

		txtyour = new JTextField();
		txtyour.setBackground(Color.PINK);
		txtyour.setBounds(120, 474, 116, 22);
		f.getContentPane().add(txtyour);
		txtyour.setColumns(10);

		JLabel img = new JLabel();
		Image image = new ImageIcon(Hangman.class.getResource("/b.png")).getImage();
		img.setIcon(new ImageIcon(image));
		img.setBounds(57, 143, 202, 288);
		f.getContentPane().add(img);

		JButton information = new JButton("Information");
		information.setBackground(Color.WHITE);
		information.setForeground(Color.BLACK);
		information.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				info.setText(info.getText()+ "Designed | made by Berke ERDEM");
				ins.setText(ins.getText()+ "Designed | made by Gözde GÜR");
				information.setVisible(false);
			}
		});
		information.setFont(new Font("Tahoma", Font.BOLD, 15));
		information.setBounds(535, 650, 137, 43);
		f.getContentPane().add(information);

		info = new JTextField();
		info.setHorizontalAlignment(SwingConstants.CENTER);
		info.setFont(new Font("Tahoma", Font.BOLD, 13));
		info.setBackground(Color.PINK);
		info.setBounds(37, 633, 293, 33);
		f.getContentPane().add(info);
		info.setColumns(10);

		JButton blue = new JButton("Blue");
		blue.setFont(new Font("Tahoma", Font.BOLD, 15));
		blue.setBackground(Color.WHITE);
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f.getContentPane().setBackground(new Color (153,255,255));
				txthigh.setBackground(new Color (153,255,255));
				txtyour.setBackground(new Color (153,255,255));
				info.setBackground(new Color (153,255,255));
				ipucu2.setBackground(new Color (153,255,255));
				ins.setBackground(new Color(153,255,255));

			}
		});
		blue.setBounds(411, 612, 120, 25);
		f.getContentPane().add(blue);

		JButton pink = new JButton("Pink");
		pink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.getContentPane().setBackground(Color.PINK);
				txthigh.setBackground(Color.PINK);
				txtyour.setBackground(Color.PINK);
				info.setBackground(Color.PINK);
				ipucu2.setBackground(Color.PINK);
				ins.setBackground(Color.PINK);


			}
		});
		pink.setFont(new Font("Tahoma", Font.BOLD, 15));
		pink.setBackground(Color.WHITE);
		pink.setBounds(543, 612, 116, 25);
		f.getContentPane().add(pink);

		JButton ipucu = new JButton("Clue");
		ipucu.setBackground(Color.WHITE);
		ipucu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ipucu2.setText(ipucu2.getText()+ "Handsome , Best Player and Retired");
				ipucu.setVisible(false);
			}
		});
		ipucu.setFont(new Font("Tahoma", Font.BOLD, 15));
		ipucu.setBounds(130, 524, 97, 25);
		f.getContentPane().add(ipucu);

		ipucu2 = new JTextField();
		ipucu2.setFont(new Font("Tahoma", Font.BOLD, 15));
		ipucu2.setHorizontalAlignment(SwingConstants.CENTER);
		ipucu2.setBackground(Color.PINK);
		ipucu2.setBounds(37, 569, 293, 51);
		f.getContentPane().add(ipucu2);
		ipucu2.setColumns(10);

		ins = new JTextField();
		ins.setHorizontalAlignment(SwingConstants.CENTER);
		ins.setFont(new Font("Tahoma", Font.BOLD, 13));
		ins.setColumns(10);
		ins.setBackground(Color.PINK);
		ins.setBounds(37, 679, 293, 33);
		f.getContentPane().add(ins);

		JButton yeþil = new JButton("Green");
		yeþil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f.getContentPane().setBackground(Color.GREEN);
				txthigh.setBackground(Color.GREEN);
				txtyour.setBackground(Color.GREEN);
				info.setBackground(Color.GREEN);
				ipucu2.setBackground(Color.GREEN);
				ins.setBackground(Color.GREEN);
			}
		});
		yeþil.setFont(new Font("Tahoma", Font.BOLD, 15));
		yeþil.setBackground(Color.WHITE);
		yeþil.setBounds(671, 612, 116, 25);
		f.getContentPane().add(yeþil);

	}
}

