package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver 
{
	 private boolean flag = true;
	 final int port = 10000;
	 DatagramSocket socket;
	 public UdpReceiver()
	 {
		try{
			socket = new DatagramSocket(port);
			byte[] msg = new byte[512];
			
			DatagramPacket p = new DatagramPacket(msg, msg.length);
			System.out.println("���� ����� ... ");
			while(flag)
			{
				Thread.sleep(1000);
				socket.receive(p);
				System.out.println("���� �Ϸ�");
				System.out.println("ip : " + p.getAddress());
				System.out.println("���� ����  : " + new String(msg));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
