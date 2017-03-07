/**
 * 我的好友列表，也包括陌生人、黑名单
 */
package com.qq.client.view;
import com.qq.client.tools.*;
import com.qq.common.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class QqFriendList extends JFrame implements ActionListener,MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//先处理第一张卡片
	JPanel jphy1,jphy2,jphy3;
	JButton jphy1_jb1,jphy1_jb2,jphy1_jb3;
	JScrollPane jsp1;
	//处理第二张卡片
	JPanel jpmsr1,jpmsr2,jpmsr3;
	JButton jpmsr1_jb1,jpmsr1_jb2,jpmsr1_jb3;
	JScrollPane jsp2;
	
	//处理第三张卡片
	JPanel jphmd1,jphmd2,jphmd3;
	JButton jphmd1_jb1,jphmd1_jb2,jphmd1_jb3;
	JScrollPane jsp3;
	
	CardLayout cl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QqFriendList s=new QqFriendList();
		
	}
	public QqFriendList(){
		//处理第一张卡片，显示好友列表
		jphy1=new JPanel(new BorderLayout());
		jphy1_jb1=new JButton("我的好友");
		jphy1_jb1.addActionListener(this);
		jphy1_jb2=new JButton("陌生人");
		jphy1_jb2.addActionListener(this);
		jphy1_jb3=new JButton("黑名单");
		jphy1_jb3.addActionListener(this);
		
		jphy2=new JPanel(new GridLayout(50,1,4,4));
		JLabel []jlbs1=new JLabel[50];
		for(int i=0;i<jlbs1.length;i++)
		{
			jlbs1[i]=new JLabel(i+1+"",new ImageIcon("image/zhu.gif"),JLabel.LEFT);
			jlbs1[i].addMouseListener(this);
			jphy2.add(jlbs1[i]);
		}
		
		jphy3=new JPanel(new GridLayout(2,1));
		jphy3.add(jphy1_jb2);	
		jphy3.add(jphy1_jb3);	
		
		jsp1=new JScrollPane(jphy2);
		
		jphy1.add(jphy1_jb1,"North");
		jphy1.add(jsp1,"Center");
		jphy1.add(jphy3,"South");
		
		//处理第二张卡片，显示陌生人列表
		jpmsr1_jb1=new JButton("我的好友");
		jpmsr1_jb1.addActionListener(this);
		jpmsr1_jb2 = new JButton("陌生人");
		jpmsr1_jb2.addActionListener(this);
		jpmsr1_jb3=new JButton("黑名单");
		jpmsr1_jb3.addActionListener(this);
		jpmsr1=new JPanel(new BorderLayout());
				
		jpmsr2=new JPanel(new GridLayout(20,1,4,4));
		JLabel []jlbs2=new JLabel[20];
		for(int i=0;i<jlbs2.length;i++)
		{
			jlbs2[i]=new JLabel(i+1+"",new ImageIcon("image/mm.jpg"),JLabel.LEFT);
			jlbs2[i].addMouseListener(this);
			jpmsr2.add(jlbs2[i]);
		}
				
		jpmsr3=new JPanel(new GridLayout(2,1));
		jpmsr3.add(jpmsr1_jb1);	
		jpmsr3.add(jpmsr1_jb2);	
				
		jsp2=new JScrollPane(jpmsr2);
				
		jpmsr1.add(jpmsr3,"North");
		jpmsr1.add(jsp2,"Center");
		jpmsr1.add(jpmsr1_jb3,"South");	
		
		//处理第三张卡片，显示黑名单列表
		jphmd1_jb1=new JButton("我的好友");
		jphmd1_jb1.addActionListener(this);
		jphmd1_jb2 = new JButton("陌生人");
		jphmd1_jb2.addActionListener(this);
		jphmd1_jb3=new JButton("黑名单");
		jphmd1_jb3.addActionListener(this);
		jphmd1=new JPanel(new BorderLayout());
				
		jphmd2=new JPanel(new GridLayout(10,1,4,4));
		JLabel []jlbs3=new JLabel[10];
		for(int i=0;i<jlbs3.length;i++)
		{
			jlbs3[i]=new JLabel(i+1+"",new ImageIcon("image/qq.gif"),JLabel.LEFT);
			jlbs3[i].addMouseListener(this);
			jphmd2.add(jlbs3[i]);
		}
				
		jphmd3=new JPanel(new GridLayout(2,1));
		jphmd3.add(jphmd1_jb1);	
		jphmd3.add(jphmd1_jb2);	
				
		jsp3=new JScrollPane(jphmd2);
				
		jphmd1.add(jphmd3,"North");
		jphmd1.add(jphmd1_jb3,"Center");
		jphmd1.add(jsp3,"South");	
		
		
		cl=new CardLayout();
		this.setLayout(cl);
		this.add(jphy1, "1");
		this.add(jpmsr1, "2");
		this.add(jphmd1, "3");
		this.setTitle("QQ2015");
		this.setIconImage((new ImageIcon("image/jie.jpg").getImage()));
		this.setSize(230,340);
		this.setVisible(true);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()==jphy1_jb1)
			    cl.show(this.getContentPane(), "1");
		   if(e.getSource()==jphy1_jb2)
		      cl.show(this.getContentPane(), "2");
		   if(e.getSource()==jphy1_jb3)
			    cl.show(this.getContentPane(), "3");
		   
		    if(e.getSource()==jpmsr1_jb1)
			   cl.show(this.getContentPane(), "1");
		    if(e.getSource()==jpmsr1_jb2)
				   cl.show(this.getContentPane(), "2");
		    if(e.getSource()==jpmsr1_jb3)
				   cl.show(this.getContentPane(), "3");
		    if(e.getSource()==jphmd1_jb1)
				cl.show(this.getContentPane(), "1");
		    if(e.getSource()==jphmd1_jb2)
				cl.show(this.getContentPane(), "2");
		    if(e.getSource()==jphmd1_jb3)
				cl.show(this.getContentPane(), "3");
		   
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//响应用户双击事件，并得到好友的编号
		if(e.getClickCount()==2){
			//得到该好友的编号
			String friendNo=((JLabel)e.getSource()).getText();
			QqChat qc=new QqChat(friendNo);
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel j1=(JLabel)e.getSource();
		j1.setForeground(Color.red);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel j1=(JLabel)e.getSource();
		j1.setForeground(Color.black);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
