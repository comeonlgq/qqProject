/**
 * ����QQ�����������ڼ������ȴ�ĳ��QQ�ͻ���������
 */
package com.qq.server.model;
import com.qq.server.common.*;
import java.util.*;
import java.net.*;
import java.io.*;

import javax.annotation.processing.Messager;

import com.qq.server.common.*;
public class MyQqServer {

	public MyQqServer (){
		try{
			System.out.println("���������ڶ˿ں�Ϊ9999....");
			ServerSocket ss=new ServerSocket(9999);
			Socket s;
			while(true){
				//�����ȴ�����
			     s=ss.accept();
				//���տͻ��˷�������Ϣ  
				ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
				User u=(User)ois.readObject();
				
			    System.out.println("QQ����"+u.getUserId()+"����"+u.getPasswd());
			    
				Message m=new Message();
				ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
				
				if(u.getPasswd().equals("123456")){
					//����һ���ɹ���¼����Ϣ��
					
					m.setMesType("1");
					oos.writeObject(m);
				}else {
					m.setMesType("2");
					oos.writeObject(m);
					//�ر�����
					s.close();
					
				}
				
				}	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
	}
}
