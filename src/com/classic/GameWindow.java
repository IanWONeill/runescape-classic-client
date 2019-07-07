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
import java.net.URL;

public class GameWindow extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	static int anInt678;
	static int anInt679;
	static int anInt680;
	static int anInt681;
	private int appletHeight;
	static int anInt683;
	static int anInt684;
	Thread gameWindowThread = null;
	static String[] aStringArray43 = { "Are you sure you wish to skip the tutorial", "and teleport to Lumbridge?" };
	static int anInt685;
	private int exitTimeout;
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
	String loadingBarText;
	static int anInt698;
	static int anInt699;
	static int anInt700;
	static int anInt701;
	static int anInt702;
	static int anInt703;
	static int anInt704;
	static int anInt705;
	static int anInt706;
	private int threadSleepModifier;
	private int appletWidth;
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
	long[] currentTimeArray;
	static int anInt718;
	static int anInt719;
	int anInt720;
	Font aFont1;
	static int anInt721;
	int lastActionTimeout;
	static int anInt723;
	private int loadingScreen;
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
	int mouseY;
	Image anImage2;
	boolean aBool39;
	int mouseDownButton;
	private boolean aBool40;
	int lastMouseDownButton;
	boolean aBool41;
	String aString24;
	int mouseX;
	Graphics loadingGraphics;
	boolean aBool42;
	String aString25;
	String aString26;
	boolean aBool43;
	String aString27;
	boolean aBool44;
	int maybe_threadSleepTime;

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
	public synchronized void mouseDragged(final MouseEvent event)
	{
		anInt681++;
		method472(0, event);
		mouseX = event.getX() - this.anInt720;
		mouseY = event.getY() - this.anInt694;
		mouseDownButton = event.isMetaDown() ? 2 : 1; 
	}

	private void drawLoadingScreen(final int i, final String string, final int i_0_)
	{
		try
		{
			int i_1_ = (appletWidth - 281) / 2;
			int i_2_ = (appletHeight - 148) / 2;
			loadingGraphics.setColor(Color.black);
			loadingGraphics.fillRect(0, 0, appletWidth, appletHeight);
			if (!aBool38)
			{
				loadingGraphics.drawImage((this.anImage2), i_1_, i_2_, this);
			}
			i_2_ += 90;
			anInt733 = i;
			i_1_ += 2;
			loadingBarText = string;
			loadingGraphics.setColor(new Color(132, 132, 132));
			if (aBool38)
			{
				loadingGraphics.setColor(new Color(220, 0, 0));
			}
			loadingGraphics.drawRect(i_1_ - 2, i_2_ - 2, 280, 23);
			loadingGraphics.fillRect(i_1_, i_2_, (i * 277) / 100, 20);
			loadingGraphics.setColor(new Color(198, 198, 198));
			if (aBool38)
			{
				loadingGraphics.setColor(new Color(255, 255, 255));
			}
			drawString(i_1_ + 138, true, loadingGraphics, this.aFont1, string, i_2_ + 10);
			if (!aBool38)
			{
				drawString(i_1_ - -138, true, loadingGraphics, this.aFont2, "Created by JAGeX - visit www.jagex.com",
				        i_2_ + 30);
				drawString(
				        i_1_ + 138, true, loadingGraphics, this.aFont2, new StringBuilder().append("\u00a9 2001-")
				                .append(RuntimeException_Sub1.method462((byte) -114)).append(" Jagex Ltd").toString(),
				        i_2_ + 44);
			}
			else
			{
				loadingGraphics.setColor(new Color(132, 132, 152));
				drawString(
				        i_1_ + 138, true, loadingGraphics, this.aFont3, new StringBuilder().append("\u00a9 2001-")
				                .append(RuntimeException_Sub1.method462((byte) -101)).append(" Jagex Ltd").toString(),
				        appletHeight + -20);
			}
			if (this.aString23 != null)
			{
				loadingGraphics.setColor(Color.white);
				drawString(i_1_ + 138, true, loadingGraphics, this.aFont2, this.aString23, i_2_ + -120);
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
			if (loadingScreen == 1)
			{
				loadingScreen = 2;
				while (!isDisplayable() && (exitTimeout >= 0))
				{
					if (exitTimeout > 0)
					{
						exitTimeout--;
						if (exitTimeout == 0)
						{
							close();
							this.gameWindowThread = null;
							return;
						}
					}
					Class7.method51(95, threadSleepModifier);
				}
				if (0 > exitTimeout)
				{
					if (exitTimeout == -1)
					{
						close();
					}
					this.gameWindowThread = null;
					return;
				}
				if (!loadFonts(true))
				{
					if (exitTimeout != -2)
					{
						close();
					}
					this.gameWindowThread = null;
					return;
				}
				method467(-6464);
				loadingScreen = 0;
			}
			if (Class38.gameFrame != null)
			{
				Class38.gameFrame.addMouseListener(this);
				Class38.gameFrame.addMouseMotionListener(this);
				Class38.gameFrame.addKeyListener(this);
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
				this.currentTimeArray[i_6_] = Class52.method377(0);
			}
			long l = Class52.method377(0);
			while (exitTimeout >= 0)
			{
				if (exitTimeout > 0)
				{
					exitTimeout--;
					if (exitTimeout == 0)
					{
						close();
						this.gameWindowThread = null;
						return;
					}
				}
				final int i_7_ = i_3_;
				final int i_8_ = i_4_;
				i_3_ = 300;
				i_4_ = 1;
				l = Class52.method377(0);
				if (0L == this.currentTimeArray[i])
				{
					i_4_ = i_8_;
					i_3_ = i_7_;
				}
				else if (l > this.currentTimeArray[i])
				{
					i_3_ = (int) (threadSleepModifier * 2560 / (l + -this.currentTimeArray[i]));
				}
				if (25 > i_3_)
				{
					i_3_ = 25;
				}
				if (256 < i_3_)
				{
					i_4_ = (int) (-((l + -this.currentTimeArray[i]) / 10L) + threadSleepModifier);
					i_3_ = 256;
					if (i_4_ < this.maybe_threadSleepTime)
					{
						i_4_ = this.maybe_threadSleepTime;
					}
				}
				Class7.method51(70, i_4_);
				this.currentTimeArray[i] = l;
				i = (i + 1) % 10;
				if (i_4_ > 1)
				{
					for (int i_9_ = 0; 10 > i_9_; i_9_++)
					{
						if (0L != this.currentTimeArray[i_9_])
						{
							this.currentTimeArray[i_9_] += i_4_;
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
			if (exitTimeout == -1)
			{
				close();
			}
			this.gameWindowThread = null;
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, 81, null);
			method463(85, "crash");
		}
	}

	void drawString(final int i, final boolean bool, final Graphics graphics, final Font font, final String string,
	        final int i_11_)
	{
		anInt697++;
		java.awt.Container container;
		if (Class38.gameFrame == null)
		{
			container = this;
		}
		else
		{
			container = Class38.gameFrame;
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
		if (Class38.gameFrame != null)
		{
			return Class38.gameFrame.createImage(i, i_12_);
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
		if (Class38.gameFrame != null)
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
		loadingGraphics = graphics.create();
		if (bool)
		{
			return false;
		}
		loadingGraphics.translate((this.anInt720), (this.anInt694));
		loadingGraphics.setColor(Color.black);
		loadingGraphics.fillRect(0, 0, appletWidth, appletHeight);
		drawLoadingScreen(0, "Loading...", -148);
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
		if (Class38.gameFrame != null)
		{
			return null;
		}
		if (Class27.anApplet1 != null)
		{
			return Class27.anApplet1.getParameter(string);
		}
		return super.getParameter(string);
	}

	void method471(final int unused)
	{
		anInt705++;
	}

	@Override
	public URL getCodeBase()
	{
		anInt691++;
		if (Class38.gameFrame != null)
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
		mouseX = mouseevent.getX() - this.anInt720;
		mouseY = mouseevent.getY() - this.anInt694;
		mouseDownButton = 0;
		this.lastActionTimeout = 0;
	}

	private void method472(final int i, final InputEvent inputevent)
	{
		anInt690++;
		final int i_17_ = inputevent.getModifiers();
		this.aBool44 = (0x2 & i_17_) != 0;
		this.aBool42 = (0x1 & i_17_) != i;
	}

	@Override
	public synchronized void mousePressed(final MouseEvent event)
	{
		method472(0, event);
		anInt695++;
		mouseX = event.getX() - this.anInt720;
		mouseY = event.getY() - this.anInt694;
		mouseDownButton = event.isMetaDown() ? 2 : 1;
		lastMouseDownButton = mouseDownButton;
		lastActionTimeout = 0;
		addMouseClick(mouseY, mouseX, (byte) -58, mouseDownButton);
	}

	synchronized void method473(final boolean bool)
	{
		anInt689++;
	}

	void method474(final int unused, final int i_18_)
	{
		anInt700++;
		threadSleepModifier = 1000 / i_18_;
	}

	@Override
	public void stop()
	{
		if (exitTimeout >=0)
		{
			exitTimeout = 4000 / threadSleepModifier;
		}
		
		anInt696++;
	}

	@Override
	public void destroy()
	{
		exitTimeout = -1;
		anInt725++;
		Class7.method51(91, 5000L);
		if (exitTimeout == -1)
		{
			System.out.println("5 seconds expired, forcing kill");
			close();
			if (this.gameWindowThread != null)
			{
				this.gameWindowThread.stop();
				this.gameWindowThread = null;
			}
		}
	}

	private boolean loadFonts(final boolean unused)
	{
		anInt688++;
		final byte[] is = method468("Jagex library", 0, 3, -21865);
		if (is == null)
		{
			return false;
		}
		final byte[] is_19_ = Class41.method292(is, 0, "logo.tga", 293484812);
		this.anImage2 = method483(0, is_19_);
		if (!Class25.loadFont(0, 29112, this, "h11p"))
		{
			return false;
		}
		if (!Class25.loadFont(1, 29112, this, "h12b"))
		{
			return false;
		}
		if (!Class25.loadFont(2, 29112, this, "h12p"))
		{
			return false;
		}
		if (!Class25.loadFont(3, 29112, this, "h13b"))
		{
			return false;
		}
		if (!Class25.loadFont(4, 29112, this, "h14b"))
		{
			return false;
		}
		if (!Class25.loadFont(5, 29112, this, "h16b"))
		{
			return false;
		}
		if (!Class25.loadFont(6, 29112, this, "h20b"))
		{
			return false;
		}
		if (!Class25.loadFont(7, 29112, this, "h24b"))
		{
			return false;
		}
		return true;
	}

	void method476(final int i)
	{
		anInt730++;
	}

	void method477(final Runnable runnable)
	{
		anInt712++;
		final Thread thread = new Thread(runnable);
		thread.setDaemon(true);
		thread.start();
	}

	void addMouseClick(final int unused, final int unused2, final byte unsued3, final int unused4)
	{
		anInt713++;
	}

	@Override
	public boolean isDisplayable()
	{
		anInt735++;
		if (Class38.gameFrame != null)
		{
			return Class38.gameFrame.getPeer() != null;
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
		if (Class38.gameFrame != null)
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
		if (0 <= exitTimeout)
		{
			exitTimeout = 0;
		}
		anInt717++;
	}

	void method479(final byte i, final int i_23_, final int i_24_, final int i_25_, final int i_26_)
	{
		anInt680++;
		try
		{
			System.out.println("Started applet");
			appletHeight = i_24_;
			appletWidth = i_26_;
			loadingScreen = 1;
			Class47.anURL3 = getCodeBase();
			Class48.anInt579 = i_25_;
			if (GameFrame.aClass32_4 == null)
			{
				Class48.aClass32_3 = GameFrame.aClass32_4 = new Class32(i_23_, null, 0, Class27.anApplet1 != null);
			}
			if (Class27.anApplet1 != null)
			{
				if (Class32.aMethod1 != null)
				{
					Class27.anApplet1.setFocusCycleRoot(true);
				}

				if (Class32.aMethod2 != null)
				{
					Class27.anApplet1.setFocusTraversalKeysEnabled(false);
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
			method477(this);
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, 122, null);
			method463(101, "crash");
		}
	}

	@Override
	public Graphics getGraphics()
	{
		anInt734++;
		if (Class38.gameFrame != null)
		{
			return Class38.gameFrame.getGraphics();
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
		this.lastActionTimeout = 0;
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
			final GameWindow applet_sub1_29_ = this;
			applet_sub1_29_.aString27 = stringbuilder.append(applet_sub1_29_.aString27).append(c).toString();
		}
		if (bool && (80 > this.aString24.length()))
		{
			final StringBuilder stringbuilder = new StringBuilder();
			final GameWindow applet_sub1_30_ = this;
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

	private void close()
	{
		anInt718++;
		exitTimeout = -2;
		System.out.println("Closing program");
		method471(-89);
		Class7.method51(53, 1000L);
		if (Class38.gameFrame != null)
		{
			Class38.gameFrame.dispose();
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

	void method481(final int unused)
	{
		anInt698++;
		for (int i = 0; i < currentTimeArray.length; i++)
		{
			currentTimeArray[i] = 0L;
		}
	}

	@Override
	public void paint(final Graphics graphics)
	{
		anInt714++;
		this.aBool37 = true;
		if ((loadingScreen != 2) || (this.anImage2 == null))
		{
			if (loadingScreen == 0)
			{
				method476(55);
			}
		}
		else
		{
			drawLoadingScreen(anInt733, this.loadingBarText, -148);
		}
	}

	void drawLoadingBarText(final int i, final int i_33_, final String string)
	{
		try
		{
			int i_34_ = (appletWidth - 281) / 2;
			int i_35_ = (appletHeight - 148) / 2;
			i_34_ += 2;
			i_35_ += 90;
			anInt733 = i;
			loadingBarText = string;
			loadingGraphics.setColor(new Color(132, 132, 132));
			final int i_37_ = (i * 277) / 100;
			if (aBool38)
			{
				loadingGraphics.setColor(new Color(220, 0, 0));
			}
			loadingGraphics.fillRect(i_34_, i_35_, i_37_, 20);
			loadingGraphics.setColor(Color.black);
			loadingGraphics.fillRect(i_37_ + i_34_, i_35_, -i_37_ + 277, 20);
			loadingGraphics.setColor(new Color(198, 198, 198));
			if (aBool38)
			{
				loadingGraphics.setColor(new Color(255, 255, 255));
			}
			drawString(i_34_ + 138, true, loadingGraphics, aFont1, string, i_35_ + 10);
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
		this.mouseX = mouseevent.getX() - this.anInt720;
		this.mouseY = mouseevent.getY() - this.anInt694;
		this.mouseDownButton = 0;
	}

	private Image method483(final int i, final byte[] is)
	{
		anInt731++;
		return Class33.method223(this, is, (byte) -118);
	}

	void createWindow(final byte i, final boolean resizable, final int i_38_, final int height, final int port, final int width,
	        final String title, final int i_42_, final String string_43_)
	{
		try
		{
			System.out.println("Started application");
			appletWidth = width;
			appletHeight = height;
			Class38.gameFrame = new GameFrame(this, 800, 600, title, resizable);
			Class38.gameFrame.setFocusTraversalKeysEnabled(false);
			loadingScreen = 1;
			Class48.anInt579 = i_38_;
			Class48.aClass32_3 = GameFrame.aClass32_4 = new Class32(i_42_, string_43_, 0, true);
			try
			{
				Class36.method230(new URL("http", "127.0.0.1", port, ""), this, (byte) 118);
			}
			catch (final IOException ioexception)
			{
				ioexception.printStackTrace(); // modification
				Class9.method61(ioexception, i + -5, null);
			}
			if (i != 113)
			{
				return;
			}
			this.gameWindowThread = new Thread(this);
			this.gameWindowThread.start();
			this.gameWindowThread.setPriority(1);
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
		if (Class38.gameFrame != null)
		{
			return Class38.gameFrame.getSize();
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

	protected GameWindow()
	{
		appletHeight = 384;
		exitTimeout = 0;
		currentTimeArray = new long[10];
		appletWidth = 512;
		anInt710 = 1000;
		anInt726 = 0;
		loadingScreen = 1;
		this.lastActionTimeout = 0;
		this.aString23 = null;
		threadSleepModifier = 20;
		loadingBarText = "Loading";
		anInt733 = 0;
		aBool38 = false;
		this.aFont1 = new Font("TimesRoman", 0, 15);
		this.aFont2 = new Font("Helvetica", 1, 13);
		this.aFont3 = new Font("Helvetica", 0, 12);
		this.mouseY = 0;
		aBool40 = false;
		this.aBool39 = false;
		this.aBool41 = false;
		this.lastMouseDownButton = 0;
		this.mouseDownButton = 0;
		this.aString24 = "";
		this.aString26 = "";
		this.aString25 = "";
		this.aBool42 = false;
		this.aBool43 = false;
		this.aBool44 = false;
		this.aString27 = "";
		this.maybe_threadSleepTime = 1;
		this.mouseX = 0;
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
