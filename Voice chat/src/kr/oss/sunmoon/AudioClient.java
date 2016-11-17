package kr.oss.sunmoon;

import java.io.*; //Ŭ���̾�Ʈ, ������ ����ϴ� ���� ����
import java.net.*; //��Ʈ��ũ ���ϼ���
 
public class AudioClient{
	private static final int bufferSize = 0;

	public static void main(String[] args) {

		try{
			DatagramSocket socket = new DatagramSocket(null);
			//�����͸� �ְ�ޱ� ���ؼ� udp ���� ����
			InetSocketAddress ip = new InetSocketAddress("220.69.166.100",6800);
			//������ ���ϴ� ���� �ּ� �ۼ�
			byte[] send = new byte[1024];
			byte[] receive = new byte[1024];
			//������ ���� ������ ����Ʈ �迭�� ��ȯ

			socket.bind(ip); //����
			System.out.println("������ �Ϸ��Ͽ����ϴ�.");
			
			DatagramPacket sendpacket = new DatagramPacket(send, send.length, ip);
			//�� ������ ��� ����
			socket.send(sendpacket); //��Ŷ ����
			
			DatagramPacket receivepacket = new DatagramPacket(receive, receive.length);
			socket.receive(receivepacket);
		}
		
		catch(IOException e){ //����
			e.printStackTrace(); //���� ��Ȳ �ذ�
			}
		}
}
