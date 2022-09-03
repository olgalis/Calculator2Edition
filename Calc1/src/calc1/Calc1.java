/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Calc1 {

    private JFrame frame = new JFrame("Calculator"); // der Name von das Projekt 
	
	private JTextArea txtScreen = new JTextArea(); // das Feld für Eingabe
	private JTextArea outputScreen = new JTextArea(); // das feld für Ausgabe
	
	
	// Die Knöpfe für Zahlen
	
	private JButton button1 = new JButton("0");
	private JButton button2 = new JButton("1");
	private JButton button3 = new JButton("2");
	private JButton button4 = new JButton("3");
	private JButton button5 = new JButton("4");
	private JButton button6 = new JButton("5");
	private JButton button7 = new JButton("6");
	private JButton button8 = new JButton("7");
	private JButton button9 = new JButton("8");
	private JButton button10 = new JButton("9");
	
	
	// die Knöpfe für Operatoren
	private JButton divideButton = new JButton("/");
	private JButton multiplyButton = new JButton("*");
	private JButton addButton = new JButton("+");
	private JButton substractButton = new JButton("-");
	private JButton clears = new JButton("clr");
	private JButton back = new JButton("←");
	
	// der Knöpf für das Ergebnis
	private JButton equals = new JButton("=");
	
	public Calc1() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(400,550); 
		frame.setResizable(false); 
		frame.setLayout(null); 
		frame.setBackground(Color.DARK_GRAY);
                        
                  
         // DIe Große von txtScreen       
	txtScreen.setSize(380,50);	
        txtScreen.setLocation(7,5);
       
        //Die Große von output Screen
        outputScreen.setSize(380, 50);
        outputScreen.setLocation(7,70);
        outputScreen.setBackground(Color.LIGHT_GRAY);
        
   
	txtScreen.setSize(380,50);
	txtScreen.setLocation(7,5);
		
	
        outputScreen.setSize(380,50);
        outputScreen.setLocation(7,70);
	outputScreen.setBackground(Color.LIGHT_GRAY);
        
        equals.setSize(100,50);
        equals.setLocation(230,420);
        
        
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try {
                // we try to evaluate the text from the text screen
                // using eval function from Evaluation.java
                double x = Evaluation.eval(txtScreen.getText());
                
                if(x == (1.0/0.0) || x ==(-1.0/0.0) || x == (0.0/0.0)) {
                    // just forbidding the division by 0 as it is Infinity in Java
                    System.out.println("Du sollst Mathe bessere lernen");
                    outputScreen.setText("Du sollst Mathe besser lernen");
                }
                else {
                    // if it works then it is printed on the screen
                    outputScreen.setText(Double.toString(x));
                    System.out.println(x);
                    
                }
            } catch (Exception e1) {
                // catching any exception
                // printing it on the screen
                // and console
                outputScreen.setText("Invalid Input, Please Try Again!");
                outputScreen.append("\n"+e1.getMessage());
                e1.printStackTrace();
            }
            }
                });	

        
	createButtons(); // die Methode Knöpfe zu initialisiren 
		
        addObjectsToScreen(); //die Methode add Buttons
        
        createActionListeners();
		
	frame.setVisible(true); 


	}

	private void addObjectsToScreen() {
		
		
		frame.add(txtScreen);
		frame.add(outputScreen);
		frame.add(clears);
		frame.add(equals);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		frame.add(divideButton);
		frame.add(multiplyButton);
		frame.add(addButton);
		frame.add(substractButton);
		frame.add(back);
	}

        private void createButtons() {
        button1.setSize(75,50);
        button1.setLocation(95,260);
        
        button2.setSize(75,50);
        button2.setLocation(15,150);
        
        button3.setSize(75,50);
        button3.setLocation(95,150);
        
        button4.setSize(75,50);
        button4.setLocation(175,150);
        
        button5.setSize(75,50);
        button5.setLocation(255,150);
        
        button6.setSize(75,50);
        button6.setLocation(15,205);
        
        button7.setSize(75,50);
        button7.setLocation(95,205);
        
        button8.setSize(75,50);
        button8.setLocation(175,205);
        
        button9.setSize(75,50);
        button9.setLocation(255,205);
        
        button10.setSize(75,50);
        button10.setLocation(15,260);
        
        divideButton.setSize(75,50);
        divideButton.setLocation(15,365);
        
        multiplyButton.setSize(75,50);
        multiplyButton.setLocation(95,365);
        
	addButton.setSize(75,50);
        addButton.setLocation(175,365);
        
	substractButton.setSize(75,50);
        substractButton.setLocation(255,365);
        
	clears.setSize(75,50);
	clears.setLocation(15,420);
        
        back.setSize(75,50);
        back.setLocation(95,420);
        
        	
        
        }
        
    private void createActionListeners() {

		// creates action listeners that add text to screen
		// it is here to make the program more readable

		button10.addActionListener((ActionEvent e) -> {
                    txtScreen.append("9");
                });

                button9.addActionListener((ActionEvent e) -> {
                    txtScreen.append("8");
                });

		 button8.addActionListener((ActionEvent e) -> {
                    txtScreen.append("7");
                });
                 
                 button7.addActionListener((ActionEvent e) -> {
                    txtScreen.append("6");
                  });
                 
                 button6.addActionListener((ActionEvent e) -> {
                 txtScreen.append("5");
                });
                 
                 button5.addActionListener((ActionEvent e) -> {
                    txtScreen.append("4");
                });   
                 
                   button4.addActionListener((ActionEvent e) -> {
                    txtScreen.append("3");
                });
                   
                   button3.addActionListener((ActionEvent e) -> {
                    txtScreen.append("2");
                });
                   
                   button2.addActionListener((ActionEvent e) -> {
                    txtScreen.append("1");
                });
                   
                     button1.addActionListener((ActionEvent e) -> {
                    txtScreen.append("0");
                });
                     
                     divideButton.addActionListener((ActionEvent e) -> {
                    txtScreen.append("/");
                });
                     multiplyButton.addActionListener((ActionEvent e) -> {
                    txtScreen.append("*");
                });
                    addButton.addActionListener((ActionEvent e) -> {
                    txtScreen.append("+");  
                });
                    substractButton.addActionListener((ActionEvent e) -> {
                    txtScreen.append("-");  
                });    
                    back.addActionListener(new ActionListener() {
                     
                        @Override
                        public void actionPerformed(ActionEvent e){
                        if(txtScreen.getText().length()!=0){
                        String text = txtScreen.getText().substring(0,txtScreen.getText().length()-1);
                        txtScreen.setText(text);
                        }
                        else {
                    outputScreen.setText("Es ist schon leer! Siehst du nicht?!");
                        }
                        }
                });     
                    clears.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					txtScreen.setText("");
				}
			});
                    
                    }
      
         
        
    public static void main(String[] args) {
      new Calc1();
    }
    
}
