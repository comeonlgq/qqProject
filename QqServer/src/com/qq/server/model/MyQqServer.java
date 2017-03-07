/**
 * 这是QQ服务器，它在监听，等待某个QQ客户端来连接
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
			System.out.println("服务器正在端口号为9999....");
			ServerSocket ss=new ServerSocket(9999);
			Socket s;
			while(true){
				//阻塞等待连接
			     s=ss.accept();
				//接收客户端发来的信息  
				ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
				User u=(User)ois.readObject();
				
			    System.out.println("QQ号码"+u.getUserId()+"密码"+u.getPasswd());
			    
				Message m=new Message();
				ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
				
				if(u.getPasswd().equals("123456")){
					//返回一个成功登录的信息包
					
					m.setMesType("1");
					oos.writeObject(m);
				}else {
					m.setMesType("2");
					oos.writeObject(m);
					//关闭连接
					s.close();
					
				}
				
				}	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
	}
}
