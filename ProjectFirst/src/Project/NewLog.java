package Project;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class NewLog extends JFrame {
	
	JTextField txtid,txtmail;
	JPasswordField txtpwd,txtpwdcheck;
	JButton check;
	
	GridBagLayout        gb;
	GridBagConstraints   gbc;

	public NewLog() {
		initComponent();
	}
	
public void initComponent() {
	
	setTitle("BUSINSA");
	setSize(280,150);
	setResizable(false);
	setLocation(800,450);
	
	
	gb           =  new GridBagLayout();
	this.setLayout(gb);
	
	gbc          =  new GridBagConstraints();
	gbc.fill     =  GridBagConstraints.RELATIVE;
	gbc.weightx  =  1.0; 
	gbc.weighty  =  1.0;
	
		
	JLabel lbllogo = new JLabel("아이디");
	gbAdd( lbllogo, 0, 1, 3, 1);
	
	//아이디
	JLabel  lblid = new JLabel("아이디");
	JLabel  lblidt = new JLabel("  영문, 숫자 조합 5-11");
	lblid.setHorizontalAlignment(JLabel.CENTER);
	this.txtid    = new JTextField( 20 );
	gbAdd( txtid, 2, 2, 3, 1);
	gbAdd( lblidt, 0, 3, 4, 1);
	gbAdd( txtid, 0, 3, 4, 1);
	
		
	//비밀번호

	JLabel  lblpwd = new JLabel("비밀번호");
	JLabel  lblpwdt = new JLabel("  영문, 숫자 , 특수문자 최소 조합 8자");
	lblpwd.setHorizontalAlignment(JLabel.CENTER);
	txtpwd         = new JPasswordField(20);
	gbAdd( lblpwd, 1, 4, 1, 1);
	gbAdd( lblpwdt, 0, 5, 4, 1);
	gbAdd( txtpwd, 0, 5, 4, 1);
	
	//비밀번호 확인
	txtpwdcheck         = new JPasswordField(20);
	JLabel  lblpwdct = new JLabel("  비밀번호 확인");
	gbAdd( lblpwdct, 0, 6, 3, 1);
	gbAdd( txtpwdcheck, 0, 6, 3, 1);
	
		
	//이메일
	JLabel  lblmail = new JLabel("이메일");
	lblmail.setHorizontalAlignment(JLabel.CENTER);
	this.txtmail   = new JTextField( 20 );
	gbAdd( lblmail, 1, 7, 1, 1);
	gbAdd( txtmail, 0, 8, 3, 1);

	//가입완료
	  check = new JButton("가입완료");
      gbAdd(check, 0, 9, 4, 1);
      
  	
		
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(300, 300);
    setLocationRelativeTo(null);
    setVisible(true);

    check.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			new Logcheck();
			setVisible(false);
		}
	});
    
	
}


private void gbAdd(JComponent c, int x, int y, int w, int h) {

	gbc.gridx        = x;
	gbc.gridy        = y;
	gbc.gridwidth    = w;
	gbc.gridheight   = h;
	//gbc.ipadz 		 = z;
	gb.setConstraints(c, gbc);
	gbc.insets       = new Insets(1, 1, 1, 1);
	this.add( c, gbc );
	

}

	public static void main(String[] args) {
		
		new NewLog();
		
	}
	
	
}

