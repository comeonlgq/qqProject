/**
 * ���Ƿ������˵Ŀ��ƽ��棬��������������������رշ�����
 * ���Թ���ͼ���û�����ǿ������
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
		jb1=new JButton("����������");
		jb1.addActionListener(this);
		jb2=new JButton("�رշ�����");
		jb2.addActionListener(this);
		jp1.add(jb1);
		jp1.add(jb2);
		
		this.add(jp1);
		this.setTitle("������");
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
