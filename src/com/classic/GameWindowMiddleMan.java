package com.classic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

import org.custom.Custom;

public abstract class GameWindowMiddleMan extends GameWindow {
	protected final void login(final String pass, final String user, final boolean reconnecting)
	{
		if (socketTimeout > 0)
		{
			loginScreenPrint("Please wait...", "Connecting to server", false);
			try
			{
				Isaac.unknownSleep(67, 2000L);
			}
			catch (final Exception exception) {}
			loginScreenPrint("Sorry! The server is currently full.", "Please try again later", false);
		}
		else
		{
			while_12_: do
			{
				for (;;)
				{
					if (0 >= reconnectTries)
					{
						break while_12_;
					}
					try
					{
						loginUsername = user;
						loginPassword = pass;
						String string_232_ = mudclient.addCharacters(20, pass);
						if (loginUsername.trim().length() == 0)
						{
							loginScreenPrint("You must enter both a username", "and a password - Please try again", false);
						}
						else
						{
							if (reconnecting)
							{
								gameBoxPrint(2, "Connection lost! Please wait...", "Attempting to re-establish");
							}
							else
							{
								loginScreenPrint("Please wait...", "Connecting to server", false);
							}
							
							if(Custom.OVERRIDE_SERVER)
							{
								streamClass = new StreamClass(makeSocket(Custom.SERVER_HOST, Custom.SERVER_PORT), this);
							}
							else
							{
								final int port = 1 < reconnectTries ? anInt799 : anInt786;
								streamClass = new StreamClass(makeSocket(serverHost, port), this);
							}

							streamClass.maxPacketReadCount = GameWindowMiddleMan.maxPacketReadCount;
							int i_234_ = 0;
							try
							{
								if (Class38.gameFrame == null)
								{
									final String string_235_ = getParameter("limit30");
									if (string_235_.equals("1"))
									{
										i_234_ = 1;
									}
								}
							}
							catch (final Exception exception) {}
							final int[] is = new int[4];
							is[0] = (int) (Math.random() * 9.9999999E7);
							is[2] = (int) (Math.random() * 9.9999999E7);
							is[3] = (int) (9.9999999E7 * Math.random());
							is[1] = (int) (Math.random() * 9.9999999E7);
							streamClass.createPacket(0);
							streamClass.aClass27_Sub1_Sub1_1.put(reconnecting ? 1 : 0);
							streamClass.aClass27_Sub1_Sub1_1.putInt(GameWindowMiddleMan.clientVersion);
							final ByteBuffer buffer = new ByteBuffer(500);
							buffer.put(10);
							buffer.putInt(is[0]);
							buffer.putInt(is[1]);
							buffer.putInt(is[2]);
							buffer.putInt(is[3]);
							buffer.putString(string_232_);
							for (int i_236_ = 0; i_236_ < 5; i_236_++)
							{
								buffer.putInt((int) (9.9999999E7 * Math.random()));
							}
							buffer.putTribyte((int) (Math.random() * 9.9999999E7));
							buffer.encodeWithRSA((RuntimeException_Sub1.aBigInteger2),
							        AClass1.aBigInteger1);
							streamClass.aClass27_Sub1_Sub1_1.writeBytes(buffer.position, buffer.buffer, 0);
							streamClass.aClass27_Sub1_Sub1_1.putShort(0);
							final int i_237_ = ((streamClass.aClass27_Sub1_Sub1_1).position);
							streamClass.aClass27_Sub1_Sub1_1.put(i_234_);
							Class39.method251((streamClass.aClass27_Sub1_Sub1_1));
							streamClass.aClass27_Sub1_Sub1_1.putString(loginUsername);
							streamClass.aClass27_Sub1_Sub1_1.method408(-85, i_237_, is,
							        (streamClass.aClass27_Sub1_Sub1_1).position);
							streamClass.aClass27_Sub1_Sub1_1.method401(
							        (streamClass.aClass27_Sub1_Sub1_1).position + -i_237_);
							streamClass.finalizePacket();
							streamClass.method116(is);
							final int responseCode = streamClass.readInputStream();
							System.out.println("login response:" + responseCode);
							if ((responseCode & 0x40) != 0)
							{
								reconnectTries = 0;
								accountFlags1 = (responseCode >> 2) & 0xf;
								accountFlags2 = responseCode & 0x3;
								resetVars();
							}
							else
							{
								if (responseCode == 1)
								{
									reconnectTries = 0;
								}
								else
								{
									if (!reconnecting)
									{
										if (responseCode == -1)
										{
											loginScreenPrint("Error unable to login.", "Server timed out", false);
										}
										else if (responseCode == 3)
										{
											loginScreenPrint("Invalid username or password.",
											        "Try again, or create a new account", false);
										}
										else if (responseCode != 4)
										{
											if (responseCode == 5)
											{
												loginScreenPrint("The client has been updated.", "Please reload this page",
												        false);
											}
											else if (responseCode == 6)
											{
												loginScreenPrint("You may only use 1 character at once.",
												        "Your ip-address is already in use", false);
											}
											else if (responseCode == 7)
											{
												loginScreenPrint("Login attempts exceeded!", "Please try again in 5 minutes",
												        false);
											}
											else if (responseCode == 8)
											{
												loginScreenPrint("Error unable to login.", "Server rejected session", false);
											}
											else if (responseCode == 9)
											{
												loginScreenPrint("Error unable to login.",
												        "Under 13 accounts cannot access RuneScape Classic", false);
											}
											else if (responseCode == 10)
											{
												loginScreenPrint("That username is already in use.",
												        "Wait 60 seconds then retry", false);
											}
											else if (responseCode == 11)
											{
												loginScreenPrint("Account temporarily disabled.",
												        "Check your message inbox for details", false);
											}
											else if (responseCode == 12)
											{
												loginScreenPrint("Account permanently disabled.",
												        "Check your message inbox for details", false);
											}
											else if (responseCode == 14)
											{
												loginScreenPrint("Sorry! This world is currently full.",
												        "Please try a different world", false);
												socketTimeout = 1500;
											}
											else if (responseCode == 15)
											{
												loginScreenPrint("You need a members account", "to login to this world",
												        false);
											}
											else if (responseCode != 16)
											{
												if (responseCode != 17)
												{
													if (responseCode != 18)
													{
														if (responseCode == 20)
														{
															loginScreenPrint("Error - loginserver mismatch",
															        "Please try a different world", false);
														}
														else if (responseCode == 21)
														{
															loginScreenPrint("That is not a veteran RS-Classic account.",
															        "Please try a non-veterans world.", false);
														}
														else if (responseCode != 22)
														{
															if (responseCode == 23)
															{
																loginScreenPrint("You need to set your display name.",
																        "Please go to the Account Management page to do this.",
																        false);
															}
															else if (responseCode != 24)
															{
																if (responseCode != 25)
																{
																	loginScreenPrint("Error unable to login.",
																	        "Unrecognised response code", false);
																}
																else
																{
																	loginScreenPrint("None of your characters can log in.",
																	        "Contact customer support", false);
																}
															}
															else
															{
																loginScreenPrint("This world does not accept new players.",
																        "Please see the launch page for help", false);
															}
														}
														else
														{
															loginScreenPrint("Password suspected stolen.",
															        "Press 'change your password' on front page.",
															        false);
														}
													}
													else
													{
														loginScreenPrint("Account suspected stolen.",
														        "Press 'recover a locked account' on front page.",
														        false);
													}
												}
												else
												{
													loginScreenPrint("Error - failed to decode profile.",
													        "Contact customer support", false);
												}
											}
											else
											{
												loginScreenPrint("Error - no reply from loginserver.", "Please try again",
												        false);
											}
										}
										else
										{
											loginScreenPrint("That username is already logged in.",
											        "Wait 60 seconds then retry", false);
										}
									}
									else
									{
										loginUsername = "";
										string_232_ = "";
										resetIntVars();
									}
									break;
								}
								break;
							}
							break;
						}
						break;
					}
					catch (final Exception exception)
					{
						System.out.println(new StringBuilder().append("").append(exception).toString());
						if (reconnectTries > 0)
						{
							try
							{
								Isaac.unknownSleep(88, 5000L);
							}
							catch (final Exception exception_239_) {}
							reconnectTries--;
						}
						else if (reconnecting)
						{
							loginPassword = "";
							loginUsername = "";
							resetIntVars();
						}
						else
						{
							Class9.method61(exception, 85, "Error while connecting");
							loginScreenPrint("Sorry! Unable to connect.", "Check internet settings or try another world",
							        false);
						}
					}
				}
				return;
			}
			while (false);
		}
	}

	protected final void sendLogoutPacket(final boolean sendPacket)
	{
		if (sendPacket && (streamClass != null))
		{
			try
			{
				streamClass.createPacket(31);
				streamClass.finalizePacket();
			}
			catch (final IOException ioexception) {}
		}
		loginUsername = "";
		loginPassword = "";
		resetIntVars();
	}

	protected void lostConnection() 
	{
		System.out.println("Lost connection");
		reconnectTries = 10;
		login(loginPassword, loginUsername, true);
	}

	protected final void gameBoxPrint(final int i, final String string, final String string_779_)
	{
		final Graphics graphics = getGraphics();
		if (graphics != null)
		{
			graphics.translate(this.anInt720, this.anInt694);
			final Font font = new Font("Helvetica", 1, 15);
			final int i_780_ = 512;
			graphics.setColor(Color.black);
			final int i_781_ = 344;
			graphics.fillRect((i_780_ / 2) + -140, (i_781_ / 2) - 25, 280, 50);
			graphics.setColor(Color.white);
			graphics.drawRect((i_780_ / 2) - 140, (i_781_ / 2) + -25, 280, 50);
			drawString(i_780_ / 2, graphics, font, string, (i_781_ / i) + -10);
			drawString(i_780_ / 2, graphics, font, string_779_, (i_781_ / 2) + 10);
		}
	}

	protected final void sendPingPacketReadPacketData(final int i)
	{
		final long l = Class52.method377();
		if (streamClass.containsData(86))
		{
			lastPing = l;
		}
		if ((l - lastPing) > 5000L)
		{
			lastPing = l;
			streamClass.createPacket(67);
			streamClass.finishPacket();
		}
		
		try
		{
			streamClass.writePacket(i);
		}
		catch (final IOException ioexception)
		{
			lostConnection();
			return;
		}

		final int packetLength = streamClass.method125(i - 20, packetsIncoming);
		if (packetLength > 0)
		{
			checkIncomingPacket(packetsIncoming.readUnsignedByte(), packetLength);
		}
	}
	
	private void checkIncomingPacket(int command, final int length)
	{
		command = streamClass.decodePacketCommand(command);
		if (command != 131)
		{
			if (command == 4)
			{
				sendLogoutPacket(true);
			}
			else if (command != 183)
			{
				if (command == 189)
				{
					packetsIncoming.position += 28;
					if (packetsIncoming.compareCrc(0))
					{
						Class2.method3(packetsIncoming.position + -28, packetsIncoming);
					}
				}
				else if (command != 165)
				{
					if (command != 149)
					{
						if (command == 237)
						{
							final String string = packetsIncoming.readString();
							String string_17_ = packetsIncoming.readString();
							if (string_17_.length() == 0)
							{
								string_17_ = string;
							}
							final String string_18_ = packetsIncoming.readString();
							String string_19_ = packetsIncoming.readString();
							if (0 == string_19_.length())
							{
								string_19_ = string;
							}
							final boolean bool = 1 == packetsIncoming.readUnsignedByte();
							for (int i_20_ = 0; GameWindowMiddleMan.ignoreListCount > i_20_; i_20_++)
							{
								if (!bool)
								{
									if (Camera.aStringArray28[i_20_].equals(string_17_))
									{
										return;
									}
								}
								else if (Camera.aStringArray28[i_20_].equals(string_19_))
								{
									GameWindowMiddleMan.ignoreListNames[i_20_] = string;
									Camera.aStringArray28[i_20_] = string_17_;
									EngineHandle.aStringArray7[i_20_] = string_18_;
									Class3.aStringArray4[i_20_] = string_19_;
									return;
								}
							}
							if (bool)
							{
								System.out.println(new StringBuilder()
								        .append("Error: ignore display name change packet received, but old name '")
								        .append(string_19_).append("' is not on ignore list").toString());
								return;
							}
							GameWindowMiddleMan.ignoreListNames[GameWindowMiddleMan.ignoreListCount] = string;
							Camera.aStringArray28[GameWindowMiddleMan.ignoreListCount] = string_17_;
							EngineHandle.aStringArray7[GameWindowMiddleMan.ignoreListCount] = string_18_;
							Class3.aStringArray4[GameWindowMiddleMan.ignoreListCount] = string_19_;
							GameWindowMiddleMan.ignoreListCount++;
						}
						else if (command != 109)
						{
							if (command != 51)
							{
								if (command == 120)
								{
									final String string = packetsIncoming.readString();
									final String string_21_ = packetsIncoming.readString();
									final int i_22_ = packetsIncoming.readUnsignedByte();
									final long l = packetsIncoming.method396();
									final String string_23_ = Class4.method8(packetsIncoming, 20 + -66);
									for (int i_24_ = 0; 100 > i_24_; i_24_++)
									{
										if (l == aLongArray4[i_24_])
										{
											return;
										}
									}
									aLongArray4[anInt911] = l;
									anInt911 = (anInt911 - -1) % 100;
									displayMessage(i_22_, string_23_, 1, string, 20 ^ ~0x71, null, string_21_,
									        i_22_ == 2);
								}
								else if (command != 87)
								{
									handleIncomingPacket((byte) -34, command, length);
								}
								else
								{
									final String string = packetsIncoming.readString();
									final String string_25_ = Class4.method8(packetsIncoming, -46);
									displayMessage(0, string_25_, 2, string, 20 ^ ~0x27, null, string, false);
								}
							}
							else
							{
								blockChatMessages = packetsIncoming.readUnsignedByte();
								blockPrivateMessages = packetsIncoming.readUnsignedByte();
								blockTradeRequests = packetsIncoming.readUnsignedByte();
								blockDuelRequests = packetsIncoming.readUnsignedByte();
							}
						}
						else
						{
							GameWindowMiddleMan.ignoreListCount = packetsIncoming.readUnsignedByte();
							for (int i_26_ = 0; GameWindowMiddleMan.ignoreListCount > i_26_; i_26_++)
							{
								GameWindowMiddleMan.ignoreListNames[i_26_] = packetsIncoming.readString();
								Camera.aStringArray28[i_26_] = packetsIncoming.readString();
								EngineHandle.aStringArray7[i_26_] = packetsIncoming.readString();
								Class3.aStringArray4[i_26_] = packetsIncoming.readString();
							}
						}
					}
					else
					{
						final String string = packetsIncoming.readString();
						final String string_27_ = packetsIncoming.readString();
						final int i_28_ = packetsIncoming.readUnsignedByte();
						final boolean bool = (0x1 & i_28_) != 0;
						final boolean bool_29_ = (0x4 & i_28_) != 0;
						String string_30_ = null;
						if (bool_29_)
						{
							string_30_ = packetsIncoming.readString();
						}
						for (int i_31_ = 0; i_31_ < GameWindowMiddleMan.friendsCount; i_31_++)
						{
							if (!bool)
							{
								if (GameWindowMiddleMan.friendsListNames[i_31_].equals(string))
								{
									if ((Menu.aStringArray8[i_31_] == null) && bool_29_)
									{
										displayMessage(0,
										        new StringBuilder().append(string).append(" has logged in").toString(),
										        5, null, -97, null, null, false);
									}
									if ((Menu.aStringArray8[i_31_] != null) && !bool_29_)
									{
										displayMessage(0,
										        new StringBuilder().append(string).append(" has logged out").toString(),
										        5, null, -98, null, null, false);
									}
									RuntimeException_Sub1.aStringArray41[i_31_] = string_27_;
									Menu.aStringArray8[i_31_] = string_30_;
									GameWindowMiddleMan.friendsListOnlineStatus[i_31_] = i_28_;
									reOrderFriendsListByOnlineStatus();
									return;
								}
							}
							else if (GameWindowMiddleMan.friendsListNames[i_31_].equals(string_27_))
							{
								if ((Menu.aStringArray8[i_31_] == null) && bool_29_)
								{
									displayMessage(0, new StringBuilder().append(string).append(" has logged in").toString(),
									        5, null, -34, null, null, false);
								}
								if ((Menu.aStringArray8[i_31_] != null) && !bool_29_)
								{
									displayMessage(0,
									        new StringBuilder().append(string).append(" has logged out").toString(), 5,
									        null, -63, null, null, false);
								}
								GameWindowMiddleMan.friendsListNames[i_31_] = string;
								RuntimeException_Sub1.aStringArray41[i_31_] = string_27_;
								Menu.aStringArray8[i_31_] = string_30_;
								GameWindowMiddleMan.friendsListOnlineStatus[i_31_] = i_28_;
								reOrderFriendsListByOnlineStatus();
								return;
							}
						}
						if (bool)
						{
							System.out.println(new StringBuilder()
							        .append("Error: friend display name change packet received, but old name '")
							        .append(string_27_).append("' is not on friend list").toString());
							return;
						}
						GameWindowMiddleMan.friendsListNames[GameWindowMiddleMan.friendsCount] = string;
						RuntimeException_Sub1.aStringArray41[GameWindowMiddleMan.friendsCount] = string_27_;
						Menu.aStringArray8[GameWindowMiddleMan.friendsCount] = string_30_;
						GameWindowMiddleMan.friendsListOnlineStatus[GameWindowMiddleMan.friendsCount] = i_28_;
						GameWindowMiddleMan.friendsCount++;
						reOrderFriendsListByOnlineStatus();
					}
				}
				else
				{
					sendLogoutPacket(false);
				}
			}
			else
			{
				cantLogout();
			}
		}
		else
		{
			final int i_34_ = packetsIncoming.readUnsignedByte();
			final int i_35_ = packetsIncoming.readUnsignedByte();
			final String string = packetsIncoming.readString();
			String string_36_ = null;
			String string_37_ = null;
			if ((0x1 & i_35_) != 0)
			{
				string_36_ = packetsIncoming.readString();
			}
			String string_38_ = null;
			if ((0x1 & i_35_) != 0)
			{
				string_37_ = packetsIncoming.readString();
			}
			if ((0x2 & i_35_) != 0)
			{
				string_38_ = packetsIncoming.readString();
			}
			displayMessage(0, string, i_34_, string_36_, -72, string_38_, string_37_, false);
		}
	}
	
	private void reOrderFriendsListByOnlineStatus()
	{
		boolean flag = true;
		while (flag)
		{
			flag = false;
			for (int i_719_ = 0; (GameWindowMiddleMan.friendsCount + -1) > i_719_; i_719_++)
			{
				if ((((0x2 & GameWindowMiddleMan.friendsListOnlineStatus[i_719_]) == 0) && ((0x2 & GameWindowMiddleMan.friendsListOnlineStatus[i_719_ + 1]) != 0))
				        || (((GameWindowMiddleMan.friendsListOnlineStatus[i_719_] & 0x4) == 0)
				                && ((GameWindowMiddleMan.friendsListOnlineStatus[i_719_ + 1] & 0x4) != 0)))
				{
					final String string = Menu.aStringArray8[i_719_];
					Menu.aStringArray8[i_719_] = Menu.aStringArray8[i_719_ + 1];
					Menu.aStringArray8[i_719_ + 1] = string;
					String string_720_ = GameWindowMiddleMan.friendsListNames[i_719_];
					GameWindowMiddleMan.friendsListNames[i_719_] = GameWindowMiddleMan.friendsListNames[i_719_ - -1];
					GameWindowMiddleMan.friendsListNames[i_719_ + 1] = string_720_;
					string_720_ = RuntimeException_Sub1.aStringArray41[i_719_];
					RuntimeException_Sub1.aStringArray41[i_719_] = RuntimeException_Sub1.aStringArray41[i_719_ + 1];
					RuntimeException_Sub1.aStringArray41[i_719_ + 1] = string_720_;
					final int i_721_ = GameWindowMiddleMan.friendsListOnlineStatus[i_719_];
					GameWindowMiddleMan.friendsListOnlineStatus[i_719_] = GameWindowMiddleMan.friendsListOnlineStatus[i_719_ + 1];
					flag = true;
					GameWindowMiddleMan.friendsListOnlineStatus[i_719_ + 1] = i_721_;
				}
			}
		}
	}

	protected void removeFromFriends(final String string)
	{
		final String string_63_ = Class43.method298(string);
		if (string_63_ != null)
		{
			for (int i_64_ = 0; GameWindowMiddleMan.friendsCount > i_64_; i_64_++)
			{
				if (string_63_.equals(Class43.method298((GameWindowMiddleMan.friendsListNames[i_64_]))))
				{
					GameWindowMiddleMan.friendsCount--;
					for (int i_65_ = i_64_; GameWindowMiddleMan.friendsCount > i_65_; i_65_++)
					{
						GameWindowMiddleMan.friendsListNames[i_65_] = GameWindowMiddleMan.friendsListNames[i_65_ + 1];
						RuntimeException_Sub1.aStringArray41[i_65_] = RuntimeException_Sub1.aStringArray41[i_65_ + 1];
						Menu.aStringArray8[i_65_] = Menu.aStringArray8[i_65_ - -1];
						GameWindowMiddleMan.friendsListOnlineStatus[i_65_] = GameWindowMiddleMan.friendsListOnlineStatus[i_65_ + 1];
					}
					streamClass.createPacket(167);
					streamClass.aClass27_Sub1_Sub1_1.method389(0, string);
					streamClass.finishPacket();
					break;
				}
			}
		}
	}

	protected void sendPrivateMessage(final String string, final int i, final String string_411_)
	{
		streamClass.createPacket(i);
		streamClass.aClass27_Sub1_Sub1_1.method389(0, string_411_);
		Class39.method255((streamClass.aClass27_Sub1_Sub1_1), false, string);
		streamClass.finishPacket();
	}

	protected void sendChatMessage(final String string)
	{
		streamClass.createPacket(216);
		Class39.method255((streamClass.aClass27_Sub1_Sub1_1), false, string);
		streamClass.finishPacket();
	}

	protected void sendChatString(final String string)
	{
		streamClass.createPacket(38);
		streamClass.aClass27_Sub1_Sub1_1.method389(0, string);
		streamClass.finishPacket();
	}

	protected abstract void resetVars();
	protected abstract void handleIncomingPacket(final byte i, final int command, final int length);
	protected abstract void cantLogout();
	protected abstract void resetIntVars();
	protected abstract void loginScreenPrint(final String string, final String string_368_, final boolean bool);
	protected abstract void displayMessage(final int i, final String string, final int i_165_, final String string_166_,
	        							   final int i_167_, final String string_168_, final String string_169_, final boolean bool);
	
	public GameWindowMiddleMan()
	{
		loginUsername = "";
		loginPassword = "";
		packetsIncoming = new Class27_Sub1_Sub1(5000);
		aLongArray4 = new long[100];
		friendsListNames = new String[200];
		friendsListOnlineStatus = new int[200];
		ignoreListNames = new String[100];
	}

	static int maxPacketReadCount = 0;
	static int clientVersion = 235;
	
	public int socketTimeout;
	protected StreamClass streamClass;
	private long lastPing;
	final Class27_Sub1_Sub1 packetsIncoming;
	int reconnectTries = 0;

	String loginUsername;
	String loginPassword;

	public int blockChatMessages;
	public int blockPrivateMessages;
	public int blockTradeRequests;
	public int blockDuelRequests;
	private final long[] aLongArray4;
	private int anInt911;
	String serverHost;
	int anInt786;
	int anInt799; 
	int accountFlags2;
	int accountFlags1;
	static int friendsCount = 0;
	static int ignoreListCount;
	static String[] ignoreListNames;
	static int[] friendsListOnlineStatus;
	static String[] friendsListNames;
}
