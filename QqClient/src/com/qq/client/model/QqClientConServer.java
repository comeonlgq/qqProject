/**
 * ���˿ͻ������ӷ���ĺ�̨
 */
package com.qq.client.model;
import java.util.*;
import com.qq.common.*;
import java.net.*;
import java.io.*;
public class QqClientConServer {

	//���͵�һ������
	public boolean sendLoginInfoToServer(Object o){
		boolean b=false;
		try {
			  
			  Socket s=new Socket("127.0.0.1",9999);
			  ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			  oos.writeObject(o);
			  ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			  
			  Message mes=(Message)ois.readObject();
			  //���������֤�û���¼�ĵط�
			  if(mes.getMesType().equals("1")){
				  //�ʹ���һ����QQ�������������ͨ�ŵ���·
				  b=true;
			  }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
		}
		return b;
	}
	
}
