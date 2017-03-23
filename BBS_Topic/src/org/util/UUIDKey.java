package org.util;

import java.net.InetAddress;
import java.security.SecureRandom;

public class UUIDKey {
	public static UUIDKey instance=null;
	private String midValue;
	SecureRandom seeder;
	public static UUIDKey getInstance() {
		if (instance == null)
			try {
				instance = new UUIDKey();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		return instance;
	}
	private UUIDKey() throws Exception {
		StringBuffer buffer = new StringBuffer(16);
		byte addr[] = InetAddress.getLocalHost().getAddress();
		buffer.append(toHex(toInt(addr), 8));
		buffer.append(toHex(System.identityHashCode(this), 8));
		midValue = buffer.toString();
		seeder = new SecureRandom();
	}
	public String getNewUUID() {
		StringBuffer buffer = new StringBuffer(32);
		buffer.append(toHex((int) (System.currentTimeMillis() & -1L), 8));
		buffer.append(midValue);
		buffer.append(toHex(seeder.nextInt(), 8));
		return buffer.toString();
	}
	private String toHex(int value, int length) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		StringBuffer buffer = new StringBuffer(length);
		int shift = length - 1 << 2;
		for (int i = -1; ++i < length;) {
			buffer.append(hexDigits[value >> shift & 0xf]);
			value <<= 4;
		}
		return buffer.toString();
	}
	private static int toInt(byte bytes[]) {
		int value = 0;
		for (int i = -1; ++i < bytes.length;) {
			value <<= 8;
			int b = bytes[i] & 0xff;
			value |= b;
		}
		return value;
	}
	

}
