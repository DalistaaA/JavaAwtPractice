package basic;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtEventEx1 extends Frame implements ActionListener{

	TextField textField;
	
	AwtEventEx1(){
		//create components  
		textField = new TextField();
		textField.setBounds(60, 50, 170, 20);
		Button b = new Button("Click Me");
		b.setBounds(100,120, 80, 30);
		
		//register listener  
		b.addActionListener(this);//passing outer class instance  
		
		//add components and set size, layout and visibility 
		add(b);
		add(textField);
		setSize(400,400);
		setLayout(null);  
		setVisible(true);  		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		textField.setText("Welcome");  
	}
	public static void main(String args[]){  
		
		new AwtEventEx1();  
	}  
}
