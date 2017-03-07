/**
 * 这厮客户端连接服务的后台
 */
package com.qq.client.model;
import java.util.*;
import com.qq.common.*;
import java.net.*;
import java.io.*;
public class QqClientConServer {

	//发送第一次请求
	public boolean sendLoginInfoToServer(Object o){
		boolean b=false;
		try {
			  
			  Socket s=new Socket("127.0.0.1",9999);
			  ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			  oos.writeObject(o);
			  ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			  
			  Message mes=(Message)ois.readObject();
			  //这里就是验证用户登录的地方
			  if(mes.getMesType().equals("1")){
				  //就创建一个该QQ号与服务器保持通信的线路
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
