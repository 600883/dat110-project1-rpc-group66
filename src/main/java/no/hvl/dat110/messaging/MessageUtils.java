package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START
		
		
		if(message != null) {
			data = message.getData();
			int datalength = data.length;
			segment = new byte[128];
			segment[0] = (byte) datalength;
			for(int i = 0; i < data.length; i++) {
				segment[i+1] = data[i];
			}
		}
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		
		
			
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		// decapsulate segment and put received payload data into a message
		
		
			int messageLength = segment[0];
			byte[] nyByte = new byte[messageLength];
			for(int i = 0; i < messageLength; i++) {
				nyByte[i] = segment[i+1];
				
			}
			message = new Message(nyByte);
		
		
		
		
		
		
		// TODO - END
		
		return message;
		
	}
	
}
