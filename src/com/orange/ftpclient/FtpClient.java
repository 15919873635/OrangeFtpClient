package com.orange.ftpclient;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FtpClient implements IFtpClient{
	private InetAddress serverAddress;
	private int serverPort;
	
	public FtpClient() 
			throws UnknownHostException{
		this("localhost",21);
	}
	
	public FtpClient(InetAddress address){
		serverAddress = address;
		serverPort = 21;
	}
	
	public FtpClient(InetAddress address,int port){
		serverAddress = address;
		serverPort = port;
	}
	
	public FtpClient(String address,int port) 
			throws UnknownHostException{
		serverAddress = InetAddress.getByName(address);
		serverPort = port;
	}

	@Override
	public void connect() {
		
	}

	@Override
	public void login(String userName, String password) {
		
	}

	@Override
	public void cwd() {
		
	}

	@Override
	public void rmdir(String dir) {
		
	}

	@Override
	public void mkdir(String dir) {
		
	}
}
