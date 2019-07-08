package com.classic;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Class32 implements Runnable
{
	private final Thread aThread1;
	static String aString13;
	private Class20 aClass20_5;
	private static long aLong3 = 0L;
	Class28 aClass28_1 = null;
	Class28 aClass28_2;
	private static String aString14;
	Class28 aClass28_3;
	static Method aMethod1;
	private static String aString15;
	private boolean aBool18;
	static String aString16;
	private static String aString17;
	private Callback_Sub1 aCallback_Sub1_1;
	private boolean aBool19;
	private Object anObject3;
	private Object anObject4;
	private Class40 aClass40_1;
	private boolean aBool20;
	static Method aMethod2;
	private Class20 aClass20_6;
	private static String aString18;
	private Class28[] aClass28Array1;
	EventQueue anEventQueue1;
	private static int anInt367;

	Class20 method216(final URL url, final boolean bool)
	{
		if (bool)
		{
			method220(77, 19, null);
		}
		return method217(!bool, 4, 0, url, 0);
	}

	private Class20 method217(final boolean bool, final int i, final int i_0_, final Object object, final int maybe_port)
	{
		if (bool != true)
		{
			method221(null, 11, -45);
		}
		final Class20 class20 = new Class20();
		class20.anInt213 = i;
		class20.anObject1 = object;
		class20.anInt214 = i_0_;
		class20.anInt215 = maybe_port;
		synchronized (this)
		{
			if (aClass20_6 != null)
			{
				aClass20_6.aClass20_1 = class20;
				aClass20_6 = class20;
			}
			else
			{
				aClass20_6 = aClass20_5 = class20;
			}
			notify();
		}
		return class20;
	}

	Class20 method218(final int i, final Runnable runnable)
	{
		return method217(true, 2, 0, runnable, i);
	}

	private static Class28 method219(final String string, final int i, final String string_3_)
	{
		String string_5_;
		if (i == 33)
		{
			string_5_ = new StringBuilder().append("jagex_").append(string).append("_preferences").append(string_3_)
			        .append("_rc.dat").toString();
		}
		else if (i != 34)
		{
			string_5_ = new StringBuilder().append("jagex_").append(string).append("_preferences").append(string_3_)
			        .append(".dat").toString();
		}
		else
		{
			string_5_ = new StringBuilder().append("jagex_").append(string).append("_preferences").append(string_3_)
			        .append("_wip.dat").toString();
		}
		final String[] strings = { "c:/rscache/", "/rscache/", aString15, "c:/windows/", "c:/winnt/", "c:/", "/tmp/",
		        "" };
		int i_6_ = 0;
		for (/**/; strings.length > i_6_; i_6_++)
		{
			final String string_8_ = strings[i_6_];
			if ((string_8_.length() <= 0) || new File(string_8_).exists())
			{
				Class28 class28;
				try
				{
					final Class28 class28_9_ = new Class28(new File(string_8_, string_5_), "rw", 10000L);
					class28 = class28_9_;
				}
				catch (final Exception exception)
				{
					continue;
				}
				return class28;
			}
		}
		return null;
	}

	private Class20 method220(final int i, final int maybe_port, final String string)
	{
		if (i != -13127)
		{
			aBool18 = true;
		}
		return method217(true, 1, 0, string, maybe_port);
	}

	Class20 method221(final String string, final int i, final int maybe_port)
	{
		if (i != 0)
		{
			return null;
		}
		return method220(i ^ ~0x3346, maybe_port, string);
	}

	@Override
	public void run()
	{
		for (;;)
		{
			Class20 class20;
			synchronized (this)
			{
				for (;;)
				{
					if (aBool19)
					{
						return;
					}
					if (aClass20_5 != null)
					{
						class20 = aClass20_5;
						aClass20_5 = aClass20_5.aClass20_1;
						if (aClass20_5 == null)
						{
							aClass20_6 = null;
						}
						break;
					}
					try
					{
						this.wait();
					}
					catch (final InterruptedException interruptedexception)
					{
						/* empty */
					}
				}
			}
			try
			{
				final int i = class20.anInt213;
				if (i == 1)
				{
					if (aLong3 > Class52.method377())
					{
						throw new IOException();
					}
					class20.socket = new Socket(InetAddress.getByName((String) (class20.anObject1)),
					        class20.anInt215);
				}
				else if (i != 22)
				{
					if (i == 2)
					{
						final Thread thread = new Thread((Runnable) class20.anObject1);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(class20.anInt215);
						class20.socket = thread;
					}
					else if (i == 4)
					{
						if (Class52.method377() < aLong3)
						{
							throw new IOException();
						}
						class20.socket = new DataInputStream(((URL) (class20.anObject1)).openStream());
					}
					else if (i != 8)
					{
						if (i != 9)
						{
							if (i != 18)
							{
								if (i == 19)
								{
									final Transferable transferable = ((Transferable) class20.anObject1);
									final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
									clipboard.setContents(transferable, null);
								}
								else
								{
									if (!aBool20)
									{
										throw new Exception("");
									}
									if (i != 3)
									{
										if (i == 21)
										{
											if (aLong3 > Class52.method377())
											{
												throw new IOException();
											}
											class20.socket = InetAddress.getByName((String) (class20.anObject1))
											        .getAddress();
										}
										else if (i == 5)
										{
											if (!aBool18)
											{
												class20.socket = ((Class31)anObject3).listmodes();
											}
											else
											{
												class20.socket = (aClass40_1.method258(-2147483648));
											}
										}
										else if (i != 6)
										{
											if (i == 7)
											{
												if (aBool18)
												{
													aClass40_1.method256(((Frame) (class20.anObject1)));
												}
												else
												{
													((Class31)anObject3).exit();
												}
											}
											else if (i != 12)
											{
												if (i == 13)
												{
													final Class28 class28 = (method219("", anInt367, ((String) (class20.anObject1))));
													class20.socket = class28;
												}
												else if (!aBool20 || (i != 14))
												{
													if (!aBool20 || (i != 15))
													{
														if (aBool18 || (i != 17))
														{
															if (i != 16)
															{
																throw new Exception("");
															}
															try
															{
																if (!aString18.startsWith("win"))
																{
																	throw new Exception();
																}
																final String string = ((String) (class20.anObject1));
																if (!(string.startsWith("http://"))
																        && !(string.startsWith("https://")))
																{
																	throw new Exception();
																}
																final String string_12_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
																for (int i_13_ = 0; ((string
																        .length()) > i_13_); i_13_++)
																{
																	if ((string_12_
																	        .indexOf(string.charAt(i_13_))) == -1)
																	{
																		throw new Exception();
																	}
																}
																Runtime.getRuntime().exec(new StringBuilder()
																        .append("cmd /c start \"j\" \"").append(string)
																        .append("\"").toString());
																class20.socket = null;
															}
															catch (final Exception exception)
															{
																class20.socket = exception;
																throw exception;
															}
														}
														else
														{
															final Object[] objects = ((Object[]) (class20.anObject1));
															((Class30)anObject4).setcustomcursor((java.awt.Component)objects[0], (int[])objects[1], class20.anInt215, class20.anInt214, (java.awt.Point)objects[2]);
														}
													}
													else
													{
														final boolean bool = (class20.anInt215 != 0);
														final Component component = ((Component) (class20.anObject1));
														if (aBool18)
														{
															aCallback_Sub1_1.method418(bool, component, 0);
														}
														else
														{
															((Class30)anObject4).showcursor(component, bool);
														}
													}
												}
												else
												{
													final int i_14_ = class20.anInt215;
													final int i_15_ = (class20.anInt214);
													if (!aBool18)
													{
														((Class30)anObject4).movemouse(i_14_, i_15_);
													}
													else
													{
														aCallback_Sub1_1.method419(i_14_, i_15_);
													}
												}
											}
											else
											{
												final Class28 class28 = method219(aString14, anInt367, ((String) (class20.anObject1)));
												class20.socket = class28;
											}
										}
										else
										{
											final Frame frame = (new Frame("Jagex Full Screen"));
											class20.socket = frame;
											frame.setResizable(false);
											if (aBool18)
											{
												aClass40_1.method257((0xffff & (class20.anInt214)),
												        (class20.anInt214) >> 16, frame, class20.anInt215 & 0xffff,
												        class20.anInt215 >>> 16);
											}
											else
											{
												((Class31)anObject3).enter(frame, class20.anInt215 >>> 16, class20.anInt215 & 0xffff, class20.anInt214 >> 16, class20.anInt214 & 0xffff);
											}
										}
									}
									else
									{
										if (Class52.method377() < aLong3)
										{
											throw new IOException();
										}
										final String string = new StringBuilder()
										        .append((class20.anInt215 >> 24) & 0xff).append(".")
										        .append((class20.anInt215 & 0xff3f01) >> 16).append(".")
										        .append(0xff & (class20.anInt215 >> 8)).append(".")
										        .append(0xff & class20.anInt215).toString();
										class20.socket = InetAddress.getByName(string).getHostName();
									}
								}
							}
							else
							{
								final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
								class20.socket = clipboard.getContents(null);
							}
						}
						else
						{
							final Object[] objects = (Object[]) class20.anObject1;
							if (aBool20 && (((Class<?>) objects[0]).getClassLoader() == null))
							{
								throw new SecurityException();
							}

							// TODO: Investigate this use of reflection.
							// The issue is that it may refer to a member that has been renamed.
							System.out.println("This code path hasn't been checked.");
							System.out.println("getDeclaredField: " + objects[1]);
							System.exit(1);
							
							class20.socket = ((Class<?>) objects[0]).getDeclaredField((String) objects[1]);
						}
					}
					else
					{
						final Object[] objects = (Object[]) class20.anObject1;
						if (aBool20 && (null == ((Class<?>) objects[0]).getClassLoader()))
						{
							throw new SecurityException();
						}
						
						// TODO: Investigate this use of reflection.
						// The issue is that it may refer to a member that has been renamed.
						System.out.println("This code path hasn't been checked.");
						System.out.println("getDeclaredMethod: " + objects[1]);
						System.exit(1);
						
						class20.socket = (((Class<?>) objects[0]).getDeclaredMethod((String) objects[1],
						        (Class[]) objects[2]));
					}
				}
				else
				{
					if (Class52.method377() < aLong3)
					{
						throw new IOException();
					}
					try
					{
						class20.socket = Class22.method135((String) class20.anObject1, class20.anInt215)
						        .method174(false);
					}
					catch (final IOException_Sub1 ioexception_sub1)
					{
						class20.socket = ioexception_sub1.getMessage();
						throw ioexception_sub1;
					}
				}
				class20.anInt216 = 1;
			}
			catch (final Throwable throwable)
			{
				class20.anInt216 = 2;
			}
			synchronized (class20)
			{
				class20.notify();
			}
		}
	}

	Class20 method222(final int i, final int i_16_)
	{
		if (i_16_ != -29661)
		{
			method222(0, 50);
		}
		return method217(true, 3, 0, null, i);
	}

	Class32(final int i, final String string, final int i_17_, final boolean bool) throws Exception
	{
		aClass20_5 = null;
		this.aClass28_2 = null;
		this.aClass28_3 = null;
		aBool19 = false;
		aBool18 = false;
		aClass20_6 = null;
		aBool20 = false;
		aString16 = "1.1";
		aString13 = "Unknown";
		aString14 = string;
		anInt367 = i;
		aBool20 = bool;
		try
		{
			aString13 = System.getProperty("java.vendor");
			aString16 = System.getProperty("java.version");
		}
		catch (final Exception exception)
		{
			/* empty */
		}
		if (-1 != aString13.toLowerCase().indexOf("microsoft"))
		{
			aBool18 = true;
		}
		try
		{
			aString17 = System.getProperty("os.name");
		}
		catch (final Exception exception)
		{
			aString17 = "Unknown";
		}
		aString18 = aString17.toLowerCase();
		try
		{
			System.getProperty("os.arch").toLowerCase();
		}
		catch (final Exception exception)
		{
			/* empty */
		}
		try
		{
			System.getProperty("os.version").toLowerCase();
		}
		catch (final Exception exception)
		{
			/* empty */
		}
		try
		{
			aString15 = System.getProperty("user.home");
			if (aString15 != null)
			{
				aString15 = new StringBuilder().append(aString15).append("/").toString();
			}
		}
		catch (final Exception exception)
		{
			/* empty */
		}
		if (aString15 == null)
		{
			aString15 = "~/";
		}
		try
		{
			this.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		}
		catch (final Throwable throwable)
		{
			/* empty */
		}
		if (!aBool18)
		{
			try
			{
				aMethod2 = (Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE }));
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			try
			{
				aMethod1 = (Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE }));
			}
			catch (final Exception exception)
			{
				/* empty */
			}
		}
		Class49.method372(true, anInt367, aString14);
		if (aBool20)
		{
			this.aClass28_1 = new Class28(Class49.method373("random.dat", -2, anInt367, null), "rw", 25L);
			this.aClass28_2 = new Class28(Class49.method371(-2, "main_file_cache.dat2"), "rw", 314572800L);
			this.aClass28_3 = new Class28(Class49.method371(-2, "main_file_cache.idx255"), "rw", 1048576L);
			aClass28Array1 = new Class28[i_17_];
			for (int i_18_ = 0; i_17_ > i_18_; i_18_++)
			{
				aClass28Array1[i_18_] = new Class28(
				        Class49.method371(-2,
				                new StringBuilder().append("main_file_cache.idx").append(i_18_).toString()),
				        "rw", 1048576L);
			}
			if (aBool18)
			{
				new Class50();
			}
			try
			{
				if (aBool18)
				{
					aClass40_1 = new Class40();
				}
				else
				{
					anObject3 = new Class31();
				}
			}
			catch (final Throwable throwable)
			{
				/* empty */
			}
			try
			{
				if (!aBool18)
				{
					anObject4 = new Class30();
				}
				else
				{
					aCallback_Sub1_1 = new Callback_Sub1();
				}
			}
			catch (final Throwable throwable)
			{
				/* empty */
			}
		}
		aBool19 = false;
		aThread1 = new Thread(this);
		aThread1.setPriority(10);
		aThread1.setDaemon(true);
		aThread1.start();
	}
}
