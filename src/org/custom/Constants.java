package org.custom;

public class Constants 
{
	//
	// NOTE: Server packets
	//
	public static final int SPacketID_SystemUpdate = 52;

	public static final int SPacketID_ShowChangeAppearance = 59;
	
	public static final int SPacketID_InventorySet = 53;
	public static final int SPacketID_InventorySetSlot = 90;
	public static final int SPacketID_InventoryRemoveSlot = 123;
	
	public static final int SPacketID_ShowWelcomeBox = 182;
	
	public static final int SPacketID_PlaySound = 204;
	
	//
	// NOTE: Client packets
	//
	public static final int CPacketID_Authenticate = 0;
	
	public static final int CPacketID_Ping = 67;
	
	public static final int CPacketID_ActionAttackNpc = 190;
	public static final int CPacketID_ActionPickupItem = 247;

	public static final int CPacketID_RequestNewAppearance = 235;
    
	public static final int CPacketID_LoggedOut = 31;
	public static final int CPacketID_RequestLogout = 102;
	
	public static final int CPacketID_RequestInteractWalk = 16;
	public static final int CPacketID_RequestWalk = 187;
	
	public static final int CPacketID_ChatCommand = 38;
	public static final int CPacketID_PublicChatMsg = 216;
	public static final int CPacketID_PrivateChatMsg = 218;
	
	public static final int CPacketID_InventoryEquip = 169;
	public static final int CPacketID_InventoryUnequip = 170;
	public static final int CPacketID_InventoryDrop = 246;
}
