package fp;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;

import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JProgressBar;


public class first extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup grp1 = new ButtonGroup();
    JScrollPane pane = new JScrollPane(contentPane);
    
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
int n=0;
	/**
	 * Create the frame.
	 */
	public first() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(102, 51, 0));
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b2 = new JButton("Next");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second obj = new second();
				obj.setVisible(true);
				first ob = new first();
				ob.setVisible(false);
			}
		});
		b2.setBounds(401, 189, 73, 39);
		contentPane.add(b2);
		
		JLabel l1 = new JLabel("Simple Quiz");
		l1.setFont(new Font("Castellar", Font.PLAIN, 18));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(156, 11, 158, 39);
		contentPane.add(l1);
		
		JLabel q1 = new JLabel("1.The first coronavirus case was detected at ________, China.");
		q1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q1.setHorizontalAlignment(SwingConstants.CENTER);
		q1.setBounds(47, 108, 377, 68);
		contentPane.add(q1);
		
		JLabel ans = new JLabel("");
		ans.setHorizontalAlignment(SwingConstants.CENTER);
		ans.setBounds(141, 345, 173, 39);
		contentPane.add(ans);
		
		JRadioButton rb1 = new JRadioButton("Wuhan");
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ans.setText("Right answer" );
			n++;
			}
		});
		grp1.add(rb1);
		
		rb1.setBounds(129, 178, 109, 23);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Xiaogan");
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ans.setText("Wrong answer" );
			n++;
			}
		});
		rb2.setBounds(129, 220, 109, 23);
		contentPane.add(rb2);
		grp1.add(rb2);
		JRadioButton rb3 = new JRadioButton("Ezhuo");
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ans.setText("Wrong answer" );
			n++;
			}
		});
		rb3.setBounds(129, 259, 109, 23);
		contentPane.add(rb3);
		grp1.add(rb3);
		
		
	}
}
