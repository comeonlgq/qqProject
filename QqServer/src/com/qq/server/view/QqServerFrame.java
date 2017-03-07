/**
 * 这是服务器端的控制界面，可以完成启动服务器，关闭服务器
 * 可以管理和监控用户，或强制下线
 */
package com.qq.server.view;
import javax.swing.*;
import com.qq.server.model.*;

import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class QqServerFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	JPanel jp1;
	JButton jb1,jb2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqServerFrame qs=new  QqServerFrame();
	}
	public QqServerFrame(){
		jp1=new JPanel();
		jb1=new JButton("启动服务器");
		jb1.addActionListener(this);
		jb2=new JButton("关闭服务器");
		jb2.addActionListener(this);
		jp1.add(jb1);
		jp1.add(jb2);
		
		this.add(jp1);
		this.setTitle("服务器");
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==jb1){
			new MyQqServer();
		}
	}
}
