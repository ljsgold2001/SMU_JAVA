package System.out;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class data{
	String number;
	String address;
	
	public data(String number, String address) {
		this.number = number;
		this.address = address;
	}
}

public class abcd extends JFrame{
	
	JTextField tf = new JTextField(20);
	JTextField tf1 = new JTextField(20);
	JTextField tf3 = new JTextField(20);
	
	
	JTextArea tff = new JTextArea();
	JScrollPane scroll = new JScrollPane(tff);
	
	HashMap<String,data> map = new HashMap<String,data>();
	
	public abcd(){
		setTitle("ex");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		MyMouseListener listener = new MyMouseListener();
		
		
		JButton btn1 = new JButton("ga");
		
		
		JButton btn2 = new JButton("12");
	
		
		JButton btn3 = new JButton("ssa");
	
		
		JButton btn4 = new JButton("dsfd");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2));
		p1.add(new JLabel("name"));
		p1.add(tf);
		p1.add(new JLabel("name"));
		p1.add(tf1);
		p1.add(new JLabel("name"));
		p1.add(tf3);
		p1.setLocation(450,200);
		p1.setSize(400,100);
		c.add(p1);
		
		btn1.setLocation(450, 100);
		btn1.setSize(100, 50);
		c.add(btn1);
		btn1.addMouseListener(listener);
		
		btn2.setLocation(550, 100);
		btn2.setSize(100, 50);
		c.add(btn2);
		btn2.addMouseListener(listener);
		
		btn3.setLocation(650, 100);
		btn3.setSize(100, 50);
		c.add(btn3);
		btn3.addMouseListener(listener);
		
		btn4.setLocation(750, 100);
		btn4.setSize(100, 50);
		c.add(btn4);
		btn4.addMouseListener(listener);
		
		scroll.setLocation(300,300);
		scroll.setSize(300,300);
		c.add(scroll);
		
		setSize(900,400);
		setVisible(true);
	
	}
	public class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals(sd)) {
				map.put(tf.getText(),new data(tf1.getText(),tf3.getText()));
				tff.append(str);
				
			}
			if(b.getText().equals("search")) {
				String findvalue = tf.getText();
				data findData = map.get(findvalue);
				
				if(findData == null) {
					tff.append("dsfaafds");
					
				}
			}
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new abcd();
		
		

	}

}
