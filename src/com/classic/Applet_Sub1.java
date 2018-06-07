package com.classic;
 
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;

public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	static int anInt678;
	static int anInt679;
	static int anInt680;
	static int anInt681;
	private int anInt682;
	static int anInt683;
	static int anInt684;
	Thread aThread2 = null;
	static String[] aStringArray43 = { "Are you sure you wish to skip the tutorial", "and teleport to Lumbridge?" };
	static int anInt685;
	private int anInt686;
	static char[] aCharArray3;
	static int anInt687;
	static String[] aStringArray44;
	static int[] anIntArray151 = new int[2048];
	static long aLong16;
	boolean aBool37 = false;
	static int anInt688;
	static int anInt689;
	static int anInt690;
	static int anInt691;
	static int anInt692;
	static int anInt693;
	int anInt694;
	static int anInt695;
	static int anInt696;
	static int anInt697;
	String aString22;
	static int anInt698;
	static int anInt699;
	static int anInt700;
	static int anInt701;
	static int anInt702;
	static int anInt703;
	static int anInt704;
	static int anInt705;
	static int anInt706;
	private int anInt707;
	private int anInt708;
	static int anInt709;
	private final int anInt710;
	static int anInt711;
	static int anInt712;
	static int anInt713;
	static int anInt714;
	static int anInt715;
	static int anInt716;
	static int[] anIntArray152;
	static int anInt717;
	long[] aLongArray3;
	static int anInt718;
	static int anInt719;
	int anInt720;
	Font aFont1;
	static int anInt721;
	int anInt722;
	static int anInt723;
	private int anInt724;
	static int anInt725;
	private int anInt726;
	static int anInt727;
	static int anInt728;
	String aString23;
	static int anInt729;
	static int anInt730;
	static int anInt731;
	static int anInt732;
	private int anInt733;
	static int anInt734;
	private final boolean aBool38;
	static int anInt735;
	Font aFont2;
	Font aFont3;
	int anInt736;
	Image anImage2;
	boolean aBool39;
	int anInt737;
	private boolean aBool40;
	int anInt738;
	boolean aBool41;
	String aString24;
	int anInt739;
	Graphics aGraphics1;
	boolean aBool42;
	String aString25;
	String aString26;
	boolean aBool43;
	String aString27;
	boolean aBool44;
	int anInt740;
	public static boolean aBool45;
	public static boolean aBool46;
	public static int anInt741;
	public static int anInt742;
	public static boolean aBool47;
	public static boolean aBool48;
	public static boolean aBool49;

	private void method463(final int i, final String string)
	{
		anInt716++;
		if (!aBool40)
		{
			aBool40 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try
			{
				if (Class27.anApplet1 == null)
				{
					Class11.method107("loggedout", 87, this);
				}
				else
				{
					Class11.method107("loggedout", 54, Class27.anApplet1);
				}
			}
			catch (final Throwable throwable)
			{
				/* empty */
			}
			try
			{
				getAppletContext().showDocument(
				        new URL(getCodeBase(),
				                new StringBuilder().append("error_game_").append(string).append(".ws").toString()),
				        "_top");
			}
			catch (final Exception exception)
			{
				/* empty */
			}
		}
	}

	@Override
	public synchronized void mouseDragged(final MouseEvent mouseevent)
	{
		anInt681++;
		method472(0, mouseevent);
		this.anInt739 = mouseevent.getX() - this.anInt720;
		this.anInt736 = mouseevent.getY() - this.anInt694;
		if (!mouseevent.isMetaDown())
		{
			this.anInt737 = 1;
		}
		else
		{
			this.anInt737 = 2;
		}
	}

	private void method464(final int i, final String string, final int i_0_)
	{
		try
		{
			int i_1_ = (anInt708 + -281) / 2;
			int i_2_ = (anInt682 - 148) / 2;
			this.aGraphics1.setColor(Color.black);
			this.aGraphics1.fillRect(0, 0, anInt708, anInt682);
			if (!aBool38)
			{
				this.aGraphics1.drawImage((this.anImage2), i_1_, i_2_, this);
			}
			i_2_ += 90;
			anInt733 = i;
			i_1_ += 2;
			this.aString22 = string;
			this.aGraphics1.setColor(new Color(132, 132, 132));
			if (aBool38)
			{
				this.aGraphics1.setColor(new Color(220, 0, 0));
			}
			this.aGraphics1.drawRect(i_1_ + -2, i_2_ + -2, 280, 23);
			this.aGraphics1.fillRect(i_1_, i_2_, (i * 277) / 100, 20);
			this.aGraphics1.setColor(new Color(198, 198, 198));
			if (aBool38)
			{
				this.aGraphics1.setColor(new Color(255, 255, 255));
			}
			method465(i_1_ + 138, true, this.aGraphics1, this.aFont1, string, i_2_ + 10);
			if (!aBool38)
			{
				method465(i_1_ - -138, true, this.aGraphics1, this.aFont2, "Created by JAGeX - visit www.jagex.com",
				        i_2_ + 30);
				method465(
				        i_1_ + 138, true, this.aGraphics1, this.aFont2, new StringBuilder().append("\u00a9 2001-")
				                .append(RuntimeException_Sub1.method462((byte) -114)).append(" Jagex Ltd").toString(),
				        i_2_ + 44);
			}
			else
			{
				this.aGraphics1.setColor(new Color(132, 132, 152));
				method465(
				        i_1_ + 138, true, this.aGraphics1, this.aFont3, new StringBuilder().append("\u00a9 2001-")
				                .append(RuntimeException_Sub1.method462((byte) -101)).append(" Jagex Ltd").toString(),
				        anInt682 + -20);
			}
			if (this.aString23 != null)
			{
				this.aGraphics1.setColor(Color.white);
				method465(i_1_ + 138, true, this.aGraphics1, this.aFont2, this.aString23, i_2_ + -120);
			}
		}
		catch (final Exception exception)
		{
			/* empty */
		}
		anInt692++;
	}

	@Override
	public void run()
	{
		anInt699++;
		try
		{
			if (anInt724 == 1)
			{
				anInt724 = 2;
				while (!isDisplayable() && (anInt686 >= 0))
				{
					if (anInt686 > 0)
					{
						anInt686--;
						if (anInt686 == 0)
						{
							method480((byte) -89);
							this.aThread2 = null;
							return;
						}
					}
					Class7.method51(95, anInt707);
				}
				if (0 > anInt686)
				{
					if (anInt686 == -1)
					{
						method480((byte) -118);
					}
					this.aThread2 = null;
					return;
				}
				if (!method475(true))
				{
					if (anInt686 != -2)
					{
						method480((byte) -72);
					}
					this.aThread2 = null;
					return;
				}
				method467(-6464);
				anInt724 = 0;
			}
			if (Class38.aFrame_Sub1_1 != null)
			{
				Class38.aFrame_Sub1_1.addMouseListener(this);
				Class38.aFrame_Sub1_1.addMouseMotionListener(this);
				Class38.aFrame_Sub1_1.addKeyListener(this);
			}
			else if (Class27.anApplet1 != null)
			{
				Class27.anApplet1.addMouseListener(this);
				Class27.anApplet1.addMouseMotionListener(this);
				Class27.anApplet1.addKeyListener(this);
			}
			else
			{
				addMouseListener(this);
				addMouseMotionListener(this);
				addKeyListener(this);
			}
			int i = 0;
			int i_3_ = 256;
			int i_4_ = 1;
			int i_5_ = 0;
			for (int i_6_ = 0; 10 > i_6_; i_6_++)
			{
				this.aLongArray3[i_6_] = Class52.method377(0);
			}
			long l = Class52.method377(0);
			while (anInt686 >= 0)
			{
				if (anInt686 > 0)
				{
					anInt686--;
					if (anInt686 == 0)
					{
						method480((byte) 47);
						this.aThread2 = null;
						return;
					}
				}
				final int i_7_ = i_3_;
				final int i_8_ = i_4_;
				i_3_ = 300;
				i_4_ = 1;
				l = Class52.method377(0);
				if (0L == this.aLongArray3[i])
				{
					i_4_ = i_8_;
					i_3_ = i_7_;
				}
				else if (l > this.aLongArray3[i])
				{
					i_3_ = (int) (anInt707 * 2560 / (l + -this.aLongArray3[i]));
				}
				if (25 > i_3_)
				{
					i_3_ = 25;
				}
				if (256 < i_3_)
				{
					i_4_ = (int) (-((l + -this.aLongArray3[i]) / 10L) + anInt707);
					i_3_ = 256;
					if (i_4_ < this.anInt740)
					{
						i_4_ = this.anInt740;
					}
				}
				Class7.method51(70, i_4_);
				this.aLongArray3[i] = l;
				i = (i + 1) % 10;
				if (i_4_ > 1)
				{
					for (int i_9_ = 0; 10 > i_9_; i_9_++)
					{
						if (0L != this.aLongArray3[i_9_])
						{
							this.aLongArray3[i_9_] += i_4_;
						}
					}
				}
				int i_10_ = 0;
				while_25_: do
				{
					do
					{
						if (i_5_ >= 256)
						{
							break while_25_;
						}
						method470(31634);
						i_10_++;
						i_5_ += i_3_;
					}
					while (anInt710 >= i_10_);
					anInt726 += 6;
					i_5_ = 0;
					if (25 < anInt726)
					{
						anInt726 = 0;
						this.aBool39 = true;
					}
				}
				while (false);
				i_5_ &= 0xff;
				anInt726--;
				method473(false);
			}
			if (anInt686 == -1)
			{
				method480((byte) -117);
			}
			this.aThread2 = null;
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, 81, null);
			method463(85, "crash");
		}
	}

	void method465(final int i, final boolean bool, final Graphics graphics, final Font font, final String string,
	        final int i_11_)
	{
		anInt697++;
		java.awt.Container container;
		if (Class38.aFrame_Sub1_1 == null)
		{
			container = this;
		}
		else
		{
			container = Class38.aFrame_Sub1_1;
		}
		final FontMetrics fontmetrics = container.getFontMetrics(font);
		fontmetrics.stringWidth(string);
		graphics.setFont(font);
		graphics.drawString(string, -(fontmetrics.stringWidth(string) / 2) + i, (fontmetrics.getHeight() / 4) + i_11_);
	}

	@Override
	public Image createImage(final int i, final int i_12_)
	{
		anInt721++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return Class38.aFrame_Sub1_1.createImage(i, i_12_);
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.createImage(i, i_12_);
		}
		return super.createImage(i, i_12_);
	}

	void method466(final int i, final int i_13_)
	{
		anInt729++;
	}

	void method467(final int i)
	{
		anInt684++;
		if (i != -6464)
		{
			this.anInt694 = 12;
		}
	}

	@Override
	public synchronized void keyReleased(final KeyEvent keyevent)
	{
		anInt728++;
		method472(0, keyevent);
		final char c = keyevent.getKeyChar();
		final int i = keyevent.getKeyCode();
		if (i == 37)
		{
			this.aBool41 = false;
		}
		if (c == '}')
		{
			/* empty */
		}
		if (i == 39)
		{
			this.aBool43 = false;
		}
		if (i == 40)
		{
			/* empty */
		}
		if (c != ' ')
		{
			/* empty */
		}
		if ((c != 'n') && (c != 'm'))
		{
			/* empty */
		}
		if ((c != 'N') && (c == 'M'))
		{
			/* empty */
		}
		if (c != '{')
		{
			/* empty */
		}
		if (i == 38)
		{
			/* empty */
		}
	}

	@Override
	public URL getDocumentBase()
	{
		anInt709++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return null;
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.getDocumentBase();
		}
		return super.getDocumentBase();
	}

	byte[] method468(final String string, final int i, final int i_14_, final int i_15_)
	{
		anInt715++;
		byte[] is;
		try
		{
			is = Class2.method5(i_14_, i, string, 5000);
		}
		catch (final IOException ioexception)
		{
			Class9.method61(ioexception, 118,
			        new StringBuilder().append("Unable to load content pack ").append(i_14_).toString());
			return null;
		}
		return is;
	}

	@Override
	public void mouseEntered(final MouseEvent mouseevent)
	{
		anInt685++;
		method472(0, mouseevent);
	}

	@Override
	public void mouseClicked(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
		anInt723++;
	}

	boolean method469(final boolean bool)
	{
		anInt732++;
		final Graphics graphics = getGraphics();
		if (graphics == null)
		{
			return false;
		}
		this.aGraphics1 = graphics.create();
		if (bool)
		{
			return false;
		}
		this.aGraphics1.translate((this.anInt720), (this.anInt694));
		this.aGraphics1.setColor(Color.black);
		this.aGraphics1.fillRect(0, 0, anInt708, anInt682);
		method464(0, "Loading...", -148);
		return true;
	}

	synchronized void method470(final int i)
	{
		anInt706++;
	}

	@Override
	public String getParameter(final String string)
	{
		anInt693++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return null;
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.getParameter(string);
		}
		return super.getParameter(string);
	}

	void method471(final int i)
	{
		anInt705++;
	}

	@Override
	public URL getCodeBase()
	{
		anInt691++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return null;
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.getCodeBase();
		}
		return super.getCodeBase();
	}

	@Override
	public synchronized void mouseMoved(final MouseEvent mouseevent)
	{
		anInt679++;
		method472(0, mouseevent);
		this.anInt739 = mouseevent.getX() - this.anInt720;
		this.anInt736 = mouseevent.getY() - this.anInt694;
		this.anInt737 = 0;
		this.anInt722 = 0;
	}

	private void method472(final int i, final InputEvent inputevent)
	{
		anInt690++;
		final int i_17_ = inputevent.getModifiers();
		this.aBool44 = (0x2 & i_17_) != 0;
		this.aBool42 = (0x1 & i_17_) != i;
	}

	@Override
	public synchronized void mousePressed(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
		anInt695++;
		this.anInt739 = mouseevent.getX() - this.anInt720;
		this.anInt736 = mouseevent.getY() + -this.anInt694;
		if (mouseevent.isMetaDown())
		{
			this.anInt737 = 2;
		}
		else
		{
			this.anInt737 = 1;
		}
		this.anInt738 = this.anInt737;
		this.anInt722 = 0;
		method478(this.anInt736, this.anInt739, (byte) -58, this.anInt737);
	}

	synchronized void method473(final boolean bool)
	{
		anInt689++;
	}

	void method474(final int i, final int i_18_)
	{
		anInt700++;
		anInt707 = 1000 / i_18_;
	}

	@Override
	public void stop()
	{
		if (0 <= anInt686)
		{
			anInt686 = 4000 / anInt707;
		}
		anInt696++;
	}

	@Override
	public void destroy()
	{
		anInt686 = -1;
		anInt725++;
		Class7.method51(91, 5000L);
		if (anInt686 == -1)
		{
			System.out.println("5 seconds expired, forcing kill");
			method480((byte) 78);
			if (this.aThread2 != null)
			{
				this.aThread2.stop();
				this.aThread2 = null;
			}
		}
	}

	private boolean method475(final boolean bool)
	{
		anInt688++;
		final byte[] is = method468("Jagex library", 0, 3, -21865);
		if (is == null)
		{
			return false;
		}
		final byte[] is_19_ = Class41.method292(is, 0, "logo.tga", 293484812);
		this.anImage2 = method483(0, is_19_);
		if (!Class25.method170(0, 29112, this, "h11p"))
		{
			return false;
		}
		if (!Class25.method170(1, 29112, this, "h12b"))
		{
			return false;
		}
		if (!Class25.method170(2, 29112, this, "h12p"))
		{
			return false;
		}
		if (!Class25.method170(3, 29112, this, "h13b"))
		{
			return false;
		}
		if (!Class25.method170(4, 29112, this, "h14b"))
		{
			return false;
		}
		if (!Class25.method170(5, 29112, this, "h16b"))
		{
			return false;
		}
		if (!Class25.method170(6, 29112, this, "h20b"))
		{
			return false;
		}
		if (!Class25.method170(7, 29112, this, "h24b"))
		{
			return false;
		}
		return true;
	}

	void method476(final int i)
	{
		anInt730++;
	}

	void method477(final byte i, final Runnable runnable)
	{
		anInt712++;
		final Thread thread = new Thread(runnable);
		thread.setDaemon(true);
		thread.start();
	}

	void method478(final int i, final int i_20_, final byte i_21_, final int i_22_)
	{
		anInt713++;
	}

	@Override
	public boolean isDisplayable()
	{
		anInt735++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return Class38.aFrame_Sub1_1.getPeer() != null;
		}
		if (Class27.anApplet1 != null)
		{
			return null != Class27.anApplet1.getPeer();
		}
		return null != super.getPeer();
	}

	@Override
	public AppletContext getAppletContext()
	{
		anInt703++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return null;
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.getAppletContext();
		}
		return super.getAppletContext();
	}

	@Override
	public void start()
	{
		if (0 <= anInt686)
		{
			anInt686 = 0;
		}
		anInt717++;
	}

	void method479(final byte i, final int i_23_, final int i_24_, final int i_25_, final int i_26_)
	{
		anInt680++;
		try
		{
			System.out.println("Started applet");
			anInt682 = i_24_;
			anInt708 = i_26_;
			anInt724 = 1;
			Class47.anURL3 = getCodeBase();
			Class48.anInt579 = i_25_;
			if (Frame_Sub1.aClass32_4 == null)
			{
				Class48.aClass32_3 = Frame_Sub1.aClass32_4 = new Class32(i_23_, null, 0, Class27.anApplet1 != null);
			}
			if (Class27.anApplet1 != null)
			{
				final Method method = Class32.aMethod1;
				if (method != null)
				{
					try
					{
						method.invoke(Class27.anApplet1, new Object[] { Boolean.TRUE });
					}
					catch (final Throwable throwable)
					{
						/* empty */
					}
				}
				final Method method_27_ = Class32.aMethod2;
				if (method_27_ != null)
				{
					try
					{
						method_27_.invoke(Class27.anApplet1, new Object[] { Boolean.FALSE });
					}
					catch (final Throwable throwable)
					{
						/* empty */
					}
				}
			}
			try
			{
				Class36.method230(getCodeBase(), this, (byte) 121);
			}
			catch (final IOException ioexception)
			{
				ioexception.printStackTrace();
			}
			method477((byte) -62, this);
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, 122, null);
			method463(101, "crash");
		}
	}

	public static void provideLoaderApplet(final Applet applet)
	{
		anInt704++;
		Class27.anApplet1 = applet;
	}

	@Override
	public Graphics getGraphics()
	{
		anInt734++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return Class38.aFrame_Sub1_1.getGraphics();
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.getGraphics();
		}
		return super.getGraphics();
	}

	@Override
	public void update(final Graphics graphics)
	{
		anInt711++;
		paint(graphics);
	}

	@Override
	public synchronized void keyPressed(final KeyEvent keyevent)
	{
		anInt719++;
		method472(0, keyevent);
		final char c = keyevent.getKeyChar();
		final int i = keyevent.getKeyCode();
		method466(c, 86);
		if (i == 112)
		{
			this.aBool39 = !this.aBool39;
		}
		if (i == 40)
		{
			/* empty */
		}
		if (i == 37)
		{
			this.aBool41 = true;
		}
		if (c == ' ')
		{
			/* empty */
		}
		if (i == 39)
		{
			this.aBool43 = true;
		}
		if ((c != 'N') && (c != 'M'))
		{
			/* empty */
		}
		this.anInt722 = 0;
		if (c != '}')
		{
			/* empty */
		}
		if ((c != 'n') && (c != 'm'))
		{
			/* empty */
		}
		if (c == '{')
		{
			/* empty */
		}
		if (i == 38)
		{
			/* empty */
		}
		boolean bool = false;
		for (int i_28_ = 0; "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| "
		        .length() > i_28_; i_28_++)
		{
			if (c == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| "
			        .charAt(i_28_))
			{
				bool = true;
				break;
			}
		}
		if (bool && (20 > this.aString27.length()))
		{
			final StringBuilder stringbuilder = new StringBuilder();
			final Applet_Sub1 applet_sub1_29_ = this;
			applet_sub1_29_.aString27 = stringbuilder.append(applet_sub1_29_.aString27).append(c).toString();
		}
		if (bool && (80 > this.aString24.length()))
		{
			final StringBuilder stringbuilder = new StringBuilder();
			final Applet_Sub1 applet_sub1_30_ = this;
			applet_sub1_30_.aString24 = stringbuilder.append(applet_sub1_30_.aString24).append(c).toString();
		}
		if ((c == '\010') && (0 < this.aString27.length()))
		{
			this.aString27 = this.aString27.substring(0, -1 + this.aString27.length());
		}
		if ((c == '\010') && (this.aString24.length() > 0))
		{
			this.aString24 = this.aString24.substring(0, -1 + this.aString24.length());
		}
		if ((c == '\n') || (c == '\r'))
		{
			this.aString25 = this.aString24;
			this.aString26 = this.aString27;
		}
	}

	private void method480(final byte i)
	{
		anInt718++;
		anInt686 = -2;
		System.out.println("Closing program");
		method471(-89);
		Class7.method51(53, 1000L);
		if (Class38.aFrame_Sub1_1 != null)
		{
			Class38.aFrame_Sub1_1.dispose();
			System.exit(0);
		}
	}

	@Override
	public void keyTyped(final KeyEvent keyevent)
	{
		anInt727++;
		method472(0, keyevent);
	}

	@Override
	public void mouseExited(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
		anInt701++;
	}

	void method481(final int i)
	{
		anInt698++;
		for (int i_32_ = 0; 10 > i_32_; i_32_++)
		{
			this.aLongArray3[i_32_] = 0L;
		}
	}

	@Override
	public void paint(final Graphics graphics)
	{
		anInt714++;
		this.aBool37 = true;
		if ((anInt724 != 2) || (this.anImage2 == null))
		{
			if (anInt724 == 0)
			{
				method476(55);
			}
		}
		else
		{
			method464(anInt733, this.aString22, -148);
		}
	}

	void method482(final int i, final int i_33_, final String string)
	{
		try
		{
			int i_34_ = (anInt708 - 281) / 2;
			int i_35_ = (anInt682 + -148) / 2;
			i_34_ += 2;
			i_35_ += 90;
			anInt733 = i;
			this.aString22 = string;
			this.aGraphics1.setColor(new Color(132, 132, 132));
			final int i_37_ = (i * 277) / 100;
			if (aBool38)
			{
				this.aGraphics1.setColor(new Color(220, 0, 0));
			}
			this.aGraphics1.fillRect(i_34_, i_35_, i_37_, 20);
			this.aGraphics1.setColor(Color.black);
			this.aGraphics1.fillRect(i_37_ + i_34_, i_35_, -i_37_ + 277, 20);
			this.aGraphics1.setColor(new Color(198, 198, 198));
			if (aBool38)
			{
				this.aGraphics1.setColor(new Color(255, 255, 255));
			}
			method465(i_34_ + 138, true, this.aGraphics1, this.aFont1, string, i_35_ + 10);
		}
		catch (final Exception exception)
		{
			/* empty */
		}
		anInt678++;
	}

	@Override
	public synchronized void mouseReleased(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
		anInt683++;
		this.anInt739 = mouseevent.getX() - this.anInt720;
		this.anInt736 = mouseevent.getY() - this.anInt694;
		this.anInt737 = 0;
	}

	private Image method483(final int i, final byte[] is)
	{
		anInt731++;
		return Class33.method223(this, is, (byte) -118);
	}

	void method484(final byte i, final boolean bool, final int i_38_, final int i_39_, final int i_40_, final int i_41_,
	        final String string, final int i_42_, final String string_43_)
	{
		try
		{
			System.out.println("Started application");
			anInt682 = i_39_;
			anInt708 = i_41_;
			Class38.aFrame_Sub1_1 = new Frame_Sub1(this, 800, 600, string, bool, false);
			try
			{
				Class38.aFrame_Sub1_1.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE })
				        .invoke(Class38.aFrame_Sub1_1, new Object[] { Boolean.FALSE });
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			anInt724 = 1;
			Class48.anInt579 = i_38_;
			Class48.aClass32_3 = Frame_Sub1.aClass32_4 = new Class32(i_42_, string_43_, 0, true);
			try
			{
				Class36.method230(new URL("http", "127.0.0.1", i_40_, ""), this, (byte) 118);
			}
			catch (final IOException ioexception)
			{
				Class9.method61(ioexception, i + -5, null);
			}
			if (i != 113)
			{
				return;
			}
			this.aThread2 = new Thread(this);
			this.aThread2.start();
			this.aThread2.setPriority(1);
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, i ^ 0x25, null);
		}
		anInt702++;
	}

	@Override
	public Dimension getSize()
	{
		anInt687++;
		if (Class38.aFrame_Sub1_1 != null)
		{
			return Class38.aFrame_Sub1_1.getSize();
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.getSize();
		}
		return super.getSize();
	}

	static int method485(final int i, final int i_44_)
	{
		return i | i_44_;
	}

	protected Applet_Sub1()
	{
		anInt682 = 384;
		anInt686 = 0;
		this.aLongArray3 = new long[10];
		anInt708 = 512;
		anInt710 = 1000;
		anInt726 = 0;
		anInt724 = 1;
		this.anInt722 = 0;
		this.aString23 = null;
		anInt707 = 20;
		this.aString22 = "Loading";
		anInt733 = 0;
		aBool38 = false;
		this.aFont1 = new Font("TimesRoman", 0, 15);
		this.aFont2 = new Font("Helvetica", 1, 13);
		this.aFont3 = new Font("Helvetica", 0, 12);
		this.anInt736 = 0;
		aBool40 = false;
		this.aBool39 = false;
		this.aBool41 = false;
		this.anInt738 = 0;
		this.anInt737 = 0;
		this.aString24 = "";
		this.aString26 = "";
		this.aString25 = "";
		this.aBool42 = false;
		this.aBool43 = false;
		this.aBool44 = false;
		this.aString27 = "";
		this.anInt740 = 1;
		this.anInt739 = 0;
	}

	static
	{
		aCharArray3 = new char[] { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6',
		        '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c',
		        '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0',
		        '\u017e', '\u0178' };
		anIntArray152 = new int[512];
	}
}
