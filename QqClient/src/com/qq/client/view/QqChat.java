/**
 * �������������Ľ���
 */
package com.qq.client.view;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class QqChat extends JFrame {
	JTextArea jta;
	JTextField jtf;
	JButton jb;
	JPanel jp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public QqChat(String friend){
		jta=new JTextArea();
		jtf=new JTextField(30);
		jb=new JButton("����");
		jp=new JPanel();
		jp.add(jtf);
		jp.add(jb);
		this.add(jta, "Center");
		this.add(jp, "South");
		this.setTitle("�����ں�"+friend+"����");
		this.setIconImage(new ImageIcon("image/qq.gif").getImage());
		this.setSize(450,200);
		this.setVisible(true);
	}
}
