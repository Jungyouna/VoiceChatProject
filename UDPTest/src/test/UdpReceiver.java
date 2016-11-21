package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver 
{
	
	public static void main(String[] args)
	{
		try{
			int port = 10000;
			DatagramSocket socket = new DatagramSocket(port);
			byte[] msg = new byte[512];
			
			DatagramPacket p = new DatagramPacket(msg, msg.length);
			System.out.println("���� ����� ... ");
			socket.receive(p);
			System.out.println("���� �Ϸ�");
			System.out.println("ip : " + p.getAddress());
			System.out.println("���� ����  : " + new String(msg));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
