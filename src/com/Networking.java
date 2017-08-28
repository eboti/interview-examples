package com;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

public class Networking {

	public static void main(String[] args) {
		createURL();
		
	}

	

	public static void createURL(){
	     URL url = null;
	        InputStream is = null;
	
		try {

            String myUrl = "http://www.epam.com";
            url = new URL(myUrl);
            System.out.println(url.getContent());
//            System.out.println(url.toString());
            
//            is = url.openStream();
//            byte[] b = new byte[8];
//            while(is.read(b) != -1){
//                System.out.print(new String(b));
//            }

            
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
            System.out.println(ipAddr.getHostName());

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
