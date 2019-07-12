package org.custom;

/*
	NOTE: The idea with this class is to make it obvious
	what is and what is not the original code.
	
	To get the original code you can just delete this class
	and fix the compile errors.
*/
public class Custom 
{
	public static final boolean ENCODE_PACKET_IDS = false;
	public static final boolean OVERRIDE_SERVER = true;
	public static final boolean LOAD_FROM_DISK = true;
	
	public static final String SERVER_HOST = "localhost";
	public static final int SERVER_PORT = 43595;
	
	// NOTE: Debug functions to not confuse debug code with the original code.
	public static void exit() { System.exit(1); }
	public static void println(String s) { System.out.println(s); }
}