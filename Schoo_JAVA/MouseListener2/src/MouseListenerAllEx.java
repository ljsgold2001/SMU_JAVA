import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerAllEx extends JFrame {
	
	JPanel ContentPane = new JPanel();
	
	JLabel la = new JLabel("no mouse Event");
	
	MouseListenerAllEx(){
		setTitle("예");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		MyMouseListener listener = new MyMouseListener();
		c.add(la);
		c.addMouseListener(listener);
		
		setSize(300,200);
		setVisible(true);
		
		
	}
	
	public class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("Mouse Dragged ( " + e.getX() + "," + e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("Mouse Moved ( " + e.getX() + "," + e.getY()+")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
		new MouseListenerAllEx();
	}
}
