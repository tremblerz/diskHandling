import java.util.*;
import java.util.Scanner;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

import com.sun.java.swing.plaf.motif.MotifBorders.ToggleButtonBorder;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int head,total,choice;
		int[] position;
	//	Scanner in=new Scanner(System.in);
	//	System.out.println("Total no. of files");
	//	total = in.nextInt();
	//	System.out.println("Enter the position of head");
		Random r = new Random();
		head = r.nextInt(50);
		System.out.println("Head is " + head);
	//	System.out.println("Enter total number of requests");
		total = 50;//in.nextInt();
	//	System.out.println("Enter positions ->");
		position = new int[total];
		for(int i=0;i<total;i++){
			position[i] = r.nextInt(200) + 1;
			System.out.print(position[i] + " ");
		}
		System.out.println();
	//	System.out.println("Enter your Choice");
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		switch(choice){
		case 1:fcfs f = new fcfs(head,total,position);
					f.makeOrder();
					f.printOrder();
					break;
		case 2:sstf st = new sstf(head,total,position);
					st.makeOrder();
					st.printOrder();
					break;
		case 3:scan sc = new scan(head,total,position);
					sc.makeOrder();
					sc.printOrder();
					break;
		case 4:cscan cs = new cscan(head,total,position);
					cs.makeOrder();
					cs.printOrder();
					break;
		case  5:look l = new look(head,total,position);
					l.makeOrder();
					l.printOrder();
					break;
		case 6:clook cl = new clook(head,total,position);
					cl.makeOrder();
					cl.printOrder();
					break;
		case 0:System.exit(0);
		default:System.out.println("Invalid Input");
		}
	}
}