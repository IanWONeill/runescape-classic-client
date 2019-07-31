package com.classic;

import java.awt.Font;
import java.awt.FontMetrics;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

import org.custom.Custom;

final class Class25 implements Runnable
{
	private final ByteBuffer buffer;
	private Class20 aClass20_2;
	private Class20 aClass20_3;
	private final URL url;
	private Class20 aClass20_4;
	static int maybe_offset;
	private int downloadStage;
	private DataInputStream aDataInputStream1;
	private Class32 class32;

	static boolean loadFont(final int i, final int i_0_, final GameWindow applet_sub1, String string)
	{
		boolean bool = false;
		string = string.toLowerCase();
		boolean bool_1_ = false;
		if (string.startsWith("helvetica"))
		{
			string = string.substring(9);
		}
		if (string.startsWith("h"))
		{
			string = string.substring(1);
		}
		if (string.startsWith("f"))
		{
			string = string.substring(1);
			bool = true;
		}
		if (string.startsWith("d"))
		{
			string = string.substring(1);
			bool_1_ = true;
		}
		if (string.endsWith(".jf"))
		{
			string = string.substring(0, string.length() - 3);
		}
		int i_2_ = 0;
		if (string.endsWith("b"))
		{
			i_2_ = 1;
			string = string.substring(0, string.length() + -1);
		}
		if (i_0_ != 29112)
		{
			return true;
		}
		if (string.endsWith("p"))
		{
			string = string.substring(0, -1 + string.length());
		}
		final int i_3_ = Integer.parseInt(string);
		final Font font = new Font("Helvetica", i_2_, i_3_);
		final FontMetrics fontmetrics = applet_sub1.getFontMetrics(font);
		final String string_4_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		Menu.anInt90 = 855;
		for (int i_5_ = 0; 95 > i_5_; i_5_++)
		{
			if (!Class52.method379(i_5_, bool_1_, i, font, string_4_.charAt(i_5_), applet_sub1, fontmetrics))
			{
				return false;
			}
		}
		PacketConstruction.aByteArrayArray8[i] = new byte[Menu.anInt90];
		for (int i_6_ = 0; i_6_ < Menu.anInt90; i_6_++)
		{
			PacketConstruction.aByteArrayArray8[i][i_6_] = Class22.aByteArray11[i_6_];
		}
		if ((i_2_ == 1) && ByteBuffer.aBoolArray10[i])
		{
			ByteBuffer.aBoolArray10[i] = false;
			if (!loadFont(i, 29112, applet_sub1, new StringBuilder().append("f").append(i_3_).append("p").toString()))
			{
				return false;
			}
		}
		if (bool && !ByteBuffer.aBoolArray10[i])
		{
			ByteBuffer.aBoolArray10[i] = false;
			if (!loadFont(i, i_0_ ^ 0x0, applet_sub1,
			        new StringBuilder().append("d").append(i_3_).append("p").toString()))
			{
				return false;
			}
		}
		return true;
	}

	ByteBuffer getBuffer(final int arg1)
	{
		if ((downloadStage ^ 0xffffffff) == arg1)
		{
			return buffer;
		}
		return null;
	}
	
	synchronized boolean method172()
	{
		if(Custom.LOAD_FROM_DISK)
		{
			try {
				InputStream Input = this.url.openStream();
	
				byte[] Buffer = new byte[4096];
				int Length;
				while((Length = Input.read(Buffer)) != -1)
				{
					System.arraycopy(Buffer, 0, this.buffer.buffer, this.buffer.position, Length);
					this.buffer.position += Length;
				}
				
				Input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			downloadStage = 3;
			return true;
		}
		else
		{
			if (downloadStage >= 2)
			{
				return true;
			}
			if (downloadStage == 0)
			{
				if (aClass20_2 == null)
				{
					aClass20_2 = class32.method216(url, false);
				}
				if (aClass20_2.anInt216 == 0)
				{
					return false;
				}
				if (aClass20_2.anInt216 != 1)
				{
					downloadStage++;
					aClass20_2 = null;
					return false;
				}
			}
			if (downloadStage == 1)
			{
				if (aClass20_4 == null)
				{
					aClass20_4 = class32.method221(url.getHost(), 0, 443);
				}
				if (aClass20_4.anInt216 == 0)
				{
					return false;
				}
				if (aClass20_4.anInt216 != 1)
				{
					aClass20_4 = null;
					downloadStage++;
					return false;
				}
			}
			if (aDataInputStream1 == null)
			{
				try
				{
					if (downloadStage == 0)
					{
						aDataInputStream1 = (DataInputStream) aClass20_2.socket;
					}
					if (downloadStage == 1)
					{
						final Socket socket = (Socket) aClass20_4.socket;
						socket.setSoTimeout(10000);
						final OutputStream outputstream = socket.getOutputStream();
						outputstream.write(17);
						outputstream.write(GameImageMiddleMan.maybe_stringToByteArray("JAGGRAB " + url.getFile() + "\n\n"));
						aDataInputStream1 = new DataInputStream(socket.getInputStream());
					}
					buffer.position = 0;
				}
				catch (final IOException ioexception)
				{
					finalize();
					downloadStage++;
				}
			}
			if (aClass20_3 == null)
			{
				aClass20_3 = class32.method218(5, this);
			}
			if (aClass20_3.anInt216 == 0)
			{
				return false;
			}
			if (aClass20_3.anInt216 != 1)
			{
				finalize();
				downloadStage++;
			}
			return false;
		}
	}

	@Override
	public void run()
	{
		try
		{
			int i;
			for (; (buffer.buffer.length > buffer.position); buffer.position += i)
			{
				i = (aDataInputStream1.read(buffer.buffer, buffer.position,
				        (buffer.buffer.length + -buffer.position)));
				if (0 > i)
				{
					break;
				}
			}
			if (buffer.position == buffer.buffer.length)
			{
				throw new Exception(new StringBuilder().append("HG1: ").append(buffer.buffer.length)
				        .append(" ").append(url).toString());
			}
			synchronized (this)
			{
				finalize();
				downloadStage = 3;
			}
		}
		catch (final Exception exception)
		{
			synchronized (this)
			{
				finalize();
				downloadStage++;
			}
		}
	}

	static boolean isAlphaNumeric(final char c)
	{
		return ((('0' <= c) && (c <= '9')) || ((c >= 'A') && (c <= 'Z')) || (('a' <= c) && (c <= 'z')));
	}

	@Override
	protected void finalize()
	{
		if (aClass20_2 != null)
		{
			if (aClass20_2.socket != null)
			{
				try
				{
					((DataInputStream) aClass20_2.socket).close();
				}
				catch (final Exception exception)
				{
					/* empty */
				}
			}
			aClass20_2 = null;
		}
		if (aClass20_4 != null)
		{
			if (aClass20_4.socket != null)
			{
				try
				{
					((Socket) aClass20_4.socket).close();
				}
				catch (final Exception exception)
				{
					/* empty */
				}
			}
			aClass20_4 = null;
		}
		if (aDataInputStream1 != null)
		{
			try
			{
				aDataInputStream1.close();
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			aDataInputStream1 = null;
		}

	}

	Class25(final Class32 class32, final URL url, final int i)
	{
		this.url = url;
		this.class32 = class32;
		this.buffer = new ByteBuffer(i);
	}
}
