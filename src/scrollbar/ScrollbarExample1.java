package scrollbar;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarExample1 {

	ScrollbarExample1(){  
        Frame f= new Frame("Scrollbar Example");  
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        final Scrollbar s=new Scrollbar();  
        s.setBounds(100,100, 50,100);  
        f.add(s);f.add(label);   
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        s.addAdjustmentListener(new AdjustmentListener() {  
            public void adjustmentValueChanged(AdjustmentEvent e) {  
               label.setText("Vertical Scrollbar value is:"+ s.getValue());  
            }  
        });  
     }

	public static void main(String args[]) {
		new ScrollbarExample1();
	}
}
