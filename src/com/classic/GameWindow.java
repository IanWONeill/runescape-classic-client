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
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

import org.custom.Custom;

import netscape.javascript.JSObject;

public class GameWindow extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int appletHeight;
	Thread gameWindowThread = null;
	private int exitTimeout;
	static char[] aCharArray3;
	static int[] anIntArray151 = new int[2048];
	static long aLong16;
	boolean aBool37 = false;
	int anInt694;
	String loadingBarText;
	private int threadSleepModifier;
	private int appletWidth;
	private final int anInt710;
	static int[] anIntArray152;
	long[] currentTimeArray;
	int anInt720;
	Font aFont1;
	int lastActionTimeout;
	private int loadingScreen;
	private int anInt726;
	String aString23;
	private int anInt733;
	private final boolean aBool38;
	Font aFont2;
	Font aFont3;
	int mouseY;
	Image anImage2;
	boolean aBool39;
	int mouseDownButton;
	private boolean aBool40;
	int lastMouseDownButton;
	boolean aBool41;
	String inputMessage;
	int mouseX;
	Graphics loadingGraphics;
	boolean aBool42;
	String enteredMessage;
	String aString26;
	boolean aBool43;
	String aString27;
	boolean aBool44;
	int threadSleepTime;
	
	protected Socket makeSocket(final String host, final int port) throws IOException
	{
		Socket socket;
		if ((Class38.gameFrame != null) || (Class27.anApplet1 == null))
		{
			if (Class38.gameFrame != null)
			{
				socket = new Socket(InetAddress.getByName(host), port);
			}
			else
			{
				socket = new Socket(InetAddress.getByName(getCodeBase().getHost()), port);
			}
		}
		else
		{
			final Class20 class20 = GameFrame.aClass32_4.method221(host, 0, port);
			while (class20.anInt216 == 0)
			{
				Isaac.unknownSleep(58, 50L);
			}
			if (class20.anInt216 != 1)
			{
				throw new IOException();
			}
			socket = (Socket) class20.socket;
			if (socket == null)
			{
				throw new IOException();
			}
		}
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		return socket;
	}

	private void method463(final String string)
	{
		if (!aBool40)
		{
			aBool40 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try
			{
				if (Class27.anApplet1 == null)
				{
					GameWindow.method107("loggedout", this);
				}
				else
				{
					GameWindow.method107("loggedout", Class27.anApplet1);
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
		method472(0, event);
		mouseX = event.getX() - this.anInt720;
		mouseY = event.getY() - this.anInt694;
		mouseDownButton = event.isMetaDown() ? 2 : 1; 
	}

	private void drawLoadingScreen(final int i, final String string)
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
			drawString(i_1_ + 138, loadingGraphics, this.aFont1, string, i_2_ + 10);
			if (!aBool38)
			{
				drawString(i_1_ - -138, loadingGraphics, this.aFont2, "Created by JAGeX - visit www.jagex.com", i_2_ + 30);
				drawString(
				        i_1_ + 138, loadingGraphics, this.aFont2, new StringBuilder().append("\u00a9 2001-")
				                .append(RuntimeException_Sub1.method462()).append(" Jagex Ltd").toString(), i_2_ + 44);
			}
			else
			{
				loadingGraphics.setColor(new Color(132, 132, 152));
				drawString(
				        i_1_ + 138, loadingGraphics, this.aFont3, new StringBuilder().append("\u00a9 2001-")
				                .append(RuntimeException_Sub1.method462()).append(" Jagex Ltd").toString(), appletHeight + -20);
			}
			if (this.aString23 != null)
			{
				loadingGraphics.setColor(Color.white);
				drawString(i_1_ + 138, loadingGraphics, this.aFont2, this.aString23, i_2_ + -120);
			}
		}
		catch (final Exception exception)
		{
			/* empty */
		}
	}

	@Override
	public void run()
	{
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
					Isaac.unknownSleep(95, threadSleepModifier);
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
				if (!loadFonts())
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
				this.currentTimeArray[i_6_] = Class52.method377();
			}
			long l = Class52.method377();
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
				l = Class52.method377();
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
					if (i_4_ < this.threadSleepTime)
					{
						i_4_ = this.threadSleepTime;
					}
				}
				Isaac.unknownSleep(70, i_4_);
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
						method470();
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
				method473();
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
			method463("crash");
		}
	}

	void drawString(final int i, final Graphics graphics, final Font font, final String string, final int i_11_)
	{
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

	@SuppressWarnings("unused") // NOTE: Overridden by mudclient.
	void handleMenuKeyDown(final int i) {}

	void method467(final int i)
	{
		if (i != -6464)
		{
			this.anInt694 = 12;
		}
	}

	@Override
	public synchronized void keyReleased(final KeyEvent keyevent)
	{
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

	byte[] unpackData(final String fileTitle, final int percentage, final int packIndex)
	{
		byte[] data;
		try
		{
			data = Class2.method5(packIndex, percentage, fileTitle);
		}
		catch (final IOException ioexception)
		{
			Class9.method61(ioexception, 118, "Unable to load content pack " + packIndex);
			return null;
		}
		return data;
	}

	@Override
	public void mouseEntered(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
	}

	@Override
	public void mouseClicked(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
	}

	boolean method469(final boolean bool)
	{
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
		drawLoadingScreen(0, "Loading...");
		return true;
	}

	// NOTE: Overridden by mudclient.
	synchronized void method470() {}

	@Override
	public String getParameter(final String string)
	{
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

	void method471() {}

	@Override
	public URL getCodeBase()
	{
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
		method472(0, mouseevent);
		mouseX = mouseevent.getX() - this.anInt720;
		mouseY = mouseevent.getY() - this.anInt694;
		mouseDownButton = 0;
		this.lastActionTimeout = 0;
	}

	private void method472(final int i, final InputEvent inputevent)
	{
		final int i_17_ = inputevent.getModifiers();
		this.aBool44 = (0x2 & i_17_) != 0;
		this.aBool42 = (0x1 & i_17_) != i;
	}

	@Override
	public synchronized void mousePressed(final MouseEvent event)
	{
		method472(0, event);
		mouseX = event.getX() - this.anInt720;
		mouseY = event.getY() - this.anInt694;
		mouseDownButton = event.isMetaDown() ? 2 : 1;
		lastMouseDownButton = mouseDownButton;
		lastActionTimeout = 0;
		addMouseClick(mouseY, mouseX, mouseDownButton);
	}

	// NOTE: Overridden by mudclient.
	synchronized void method473() {}

	void changeThreadSleepModifier(final int i_18_)
	{
		threadSleepModifier = 1000 / i_18_;
	}

	@Override
	public void stop()
	{
		if (exitTimeout >=0)
		{
			exitTimeout = 4000 / threadSleepModifier;
		}
	}

	@Override
	public void destroy()
	{
		exitTimeout = -1;
		Isaac.unknownSleep(91, 5000L);
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

	private boolean loadFonts()
	{
		final byte[] is = unpackData("Jagex library", 0, 3);
		if (is == null)
		{
			return false;
		}
		final byte[] is_19_ = Camera.loadData(is, 0, "logo.tga");
		this.anImage2 = method483(is_19_);
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

	void method477(final Runnable runnable)
	{
		final Thread thread = new Thread(runnable);
		thread.setDaemon(true);
		thread.start();
	}

	@SuppressWarnings("unused") // NOTE: Overridden by mudclient.
	void addMouseClick(final int mouseY, final int mouseX, final int button) {}

	@Override
	public boolean isDisplayable()
	{
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
	}

	void method479(final int i_23_, final int i_24_, final int i_25_, final int i_26_)
	{
		try
		{
			System.out.println("Started applet");
			appletHeight = i_24_;
			appletWidth = i_26_;
			loadingScreen = 1;
			Class47.anURL3 = getCodeBase();
			Class48.clientVersion = i_25_;
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
				Class36.method230(getCodeBase(), this);
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
			method463("crash");
		}
	}

	@Override
	public Graphics getGraphics()
	{
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
		paint(graphics);
	}

	@Override
	public synchronized void keyPressed(final KeyEvent keyevent)
	{
		method472(0, keyevent);
		final char c = keyevent.getKeyChar();
		final int i = keyevent.getKeyCode();
		
		if(Custom.EXISTS)
		{
			Custom.lastKey = i;
		}
		
		handleMenuKeyDown(c);
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
		if (bool && (80 > this.inputMessage.length()))
		{
			final StringBuilder stringbuilder = new StringBuilder();
			final GameWindow applet_sub1_30_ = this;
			applet_sub1_30_.inputMessage = stringbuilder.append(applet_sub1_30_.inputMessage).append(c).toString();
		}
		if ((c == '\010') && (0 < this.aString27.length()))
		{
			this.aString27 = this.aString27.substring(0, -1 + this.aString27.length());
		}
		if ((c == '\010') && (this.inputMessage.length() > 0))
		{
			this.inputMessage = this.inputMessage.substring(0, -1 + this.inputMessage.length());
		}
		if ((c == '\n') || (c == '\r'))
		{
			this.enteredMessage = this.inputMessage;
			this.aString26 = this.aString27;
		}
	}

	private void close()
	{
		exitTimeout = -2;
		System.out.println("Closing program");
		method471();
		Isaac.unknownSleep(53, 1000L);
		if (Class38.gameFrame != null)
		{
			Class38.gameFrame.dispose();
			System.exit(0);
		}
	}

	@Override
	public void keyTyped(final KeyEvent keyevent)
	{
		method472(0, keyevent);
	}

	@Override
	public void mouseExited(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
	}

	void resetCurrentTimeArray()
	{
		for (int i = 0; i < currentTimeArray.length; i++)
		{
			currentTimeArray[i] = 0L;
		}
	}

	@Override
	public void paint(final Graphics graphics)
	{
		this.aBool37 = true;
		if ((loadingScreen != 2) || (this.anImage2 == null))
		{

		}
		else
		{
			drawLoadingScreen(anInt733, this.loadingBarText);
		}
	}

	void drawLoadingBarText(final int i, final String string)
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
			drawString(i_34_ + 138, loadingGraphics, aFont1, string, i_35_ + 10);
		}
		catch (final Exception exception)
		{
			/* empty */
		}
	}

	@Override
	public synchronized void mouseReleased(final MouseEvent mouseevent)
	{
		method472(0, mouseevent);
		this.mouseX = mouseevent.getX() - this.anInt720;
		this.mouseY = mouseevent.getY() - this.anInt694;
		this.mouseDownButton = 0;
	}

	private Image method483(final byte[] is)
	{
		return Class33.method223(this, is, (byte) -118);
	}

	void createWindow(final byte i, final boolean resizable, final int clientVersion, final int height, 
					  final int port, 
					  final int width,
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
			Class48.clientVersion = clientVersion;
			Class48.aClass32_3 = GameFrame.aClass32_4 = new Class32(i_42_, string_43_, 0, true);
			try
			{
				if(Custom.LOAD_FROM_DISK)
				{
					Class36.method230(new File("resources\\cache\\").toURI().toURL(), this);
				}
				else
				{
					Class36.method230(new URL("http", "127.0.0.1", port, ""), this);
				}
			}
			catch (final IOException ioexception)
			{
				Class9.method61(ioexception, i + -5, null);
			}

			this.gameWindowThread = new Thread(this);
			this.gameWindowThread.start();
			this.gameWindowThread.setPriority(1);
		}
		catch (final Exception exception)
		{
			Class9.method61(exception, i ^ 0x25, null);
		}
	}

	@Override
	public Dimension getSize()
	{
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

	static Object method107(final String string, final Applet applet) throws Throwable
	{
		return JSObject.getWindow(applet).call(string, null);
	}

	static int bitwiseOr(final int a, final int b)
	{
		return a | b;
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
		this.inputMessage = "";
		this.aString26 = "";
		this.enteredMessage = "";
		this.aBool42 = false;
		this.aBool43 = false;
		this.aBool44 = false;
		this.aString27 = "";
		this.threadSleepTime = 1;
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
