package com.orange.ftpclient;

public interface IFtpClient{
	public void connect();
	
	public void login(String userName,String password);
	
	public void cwd();
	
	public void rmdir(String dir);
	
	public void mkdir(String dir);
}
