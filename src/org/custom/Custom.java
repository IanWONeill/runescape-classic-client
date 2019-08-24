package org.custom;

/*
	NOTE: The idea with this class is to make it obvious
	what is and what is not the original code.
	
	The original code is also compiled this way, keeping it up to date with identifier renaming,
	and giving an error if code that is depended on is deleted.
	
	To get the original code you can just delete this class and fix the compile errors.
*/
public class Custom 
{
	public static final boolean EXISTS = true;
	
	public static String lastMessage = "";
	public static int lastKey;
	
	public static final boolean DEBUG = true;
	public static final boolean ENCODE_PACKET_IDS = false;
	public static final boolean OVERRIDE_SERVER = true;
	public static final boolean LOAD_FROM_DISK = true;
	public static final boolean ALLOW_CLIENTSIDE_IDLE = false;
	
	public static final String SERVER_HOST = "localhost";
	public static final int SERVER_PORT = 43595;
	
	// NOTE: Debug functions to not confuse debug code with the original code.
	public static void exit() { System.exit(1); }
	public static void println(String s) { System.out.println(s); }
}
