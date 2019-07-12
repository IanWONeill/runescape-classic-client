package com.classic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method; // NOTE: Used to access sun.net.www.protocol.http.AuthenticationInfo.
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

final class AClass1_Sub1 extends AClass1
{
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();
	static Class47 aClass47_1 = null;
	static int anInt639;
	static int[] anIntArray144;
	static int[] anIntArray145;
	static int anInt642;
	static String[] aStringArray38 = { "Enter number of items to offer and press enter" };

	@Override
	Socket method174(final boolean bool) throws IOException
	{
		final boolean bool_0_ = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool_0_)
		{
			System.setProperty("java.net.useSystemProxies", "true");
		}
		if (bool)
		{
			anIntArray144 = null;
		}
		final boolean bool_1_ = this.port == 443;
		List<Proxy> list;
		List<Proxy> list_2_;
		try
		{
			list = aProxySelector1.select(new URI(new StringBuilder().append(bool_1_ ? "https" : "http").append("://")
			        .append(this.host).toString()));
			list_2_ = aProxySelector1.select(new URI(new StringBuilder().append(bool_1_ ? "http" : "https")
			        .append("://").append(this.host).toString()));
		}
		catch (final URISyntaxException urisyntaxexception)
		{
			return createSocket();
		}
		list.addAll(list_2_);
		final Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		final Object[] objects_3_ = objects;
		for (int i = 0; objects_3_.length > i; i++)
		{
			final Object object = objects_3_[i];
			final Proxy proxy = (Proxy) object;
			Socket socket;
			try
			{
				final Socket socket_4_ = method421(proxy);
				if (socket_4_ == null)
				{
					continue;
				}
				socket = socket_4_;
			}
			catch (final IOException_Sub1 ioexception_sub1_5_)
			{
				ioexception_sub1 = ioexception_sub1_5_;
				continue;
			}
			catch (final IOException ioexception)
			{
				continue;
			}
			return socket;
		}
		if (ioexception_sub1 != null)
		{
			throw ioexception_sub1;
		}
		return createSocket();
	}

	private Socket method420(final int i, final String string, final String string_7_)
	        throws IOException
	{
		final Socket socket = new Socket(string_7_, i);
		socket.setSoTimeout(10000);
		final OutputStream outputstream = socket.getOutputStream();
		if (string != null)
		{
			outputstream.write(new StringBuilder().append("CONNECT ").append(this.host).append(":")
			        .append(this.port).append(" HTTP/1.0\n").append(string).append("\n\n").toString()
			        .getBytes(Charset.forName("ISO-8859-1")));
		}
		else
		{
			outputstream.write(new StringBuilder().append("CONNECT ").append(this.host).append(":")
			        .append(this.port).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		}
		outputstream.flush();
		final BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_8_ = bufferedreader.readLine();
		if (string_8_ != null)
		{
			if (string_8_.startsWith("HTTP/1.0 200") || string_8_.startsWith("HTTP/1.1 200"))
			{
				return socket;
			}
			if (string_8_.startsWith("HTTP/1.0 407") || string_8_.startsWith("HTTP/1.1 407"))
			{
				int i_9_ = 0;
				string_8_ = bufferedreader.readLine();
				final String string_10_ = "proxy-authenticate: ";
				for (/**/; (string_8_ != null) && (50 > i_9_); string_8_ = bufferedreader.readLine())
				{
					if (string_8_.toLowerCase().startsWith(string_10_))
					{
						string_8_ = string_8_.substring(string_10_.length()).trim();
						final int i_11_ = string_8_.indexOf(' ');
						if (i_11_ != -1)
						{
							string_8_ = string_8_.substring(0, i_11_);
						}
						throw new IOException_Sub1(string_8_);
					}
					i_9_++;
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	private Socket method421(final Proxy proxy) throws IOException
	{
		if (proxy.type() == Proxy.Type.DIRECT)
		{
			return createSocket();
		}
		final java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
		{
			return null;
		}
		final InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() != Proxy.Type.HTTP)
		{
			if (proxy.type() == Proxy.Type.SOCKS)
			{
				final Socket socket = new Socket(proxy);
				socket.connect(new InetSocketAddress((this.host), (this.port)));
				return socket;
			}
		}
		else
		{
			String string = null;
			try
			{
				final Class<?> var_class = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				
				final Method method_getProxyAuth = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method_getProxyAuth.setAccessible(true);
				
				final Object object = method_getProxyAuth.invoke(null,
				        (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (object != null)
				{
					final Method method_supportsPreemptiveAuthorization = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_supportsPreemptiveAuthorization.setAccessible(true);
					if (((Boolean) method_supportsPreemptiveAuthorization.invoke(object, new Object[0])).booleanValue())
					{
						final Method method_getHeaderName = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_getHeaderName.setAccessible(true);
						final Method method_getHeaderValue = (var_class.getDeclaredMethod("getHeaderValue",
						        new Class[] { java.net.URL.class, java.lang.String.class }));
						method_getHeaderValue.setAccessible(true);
						final String string_15_ = ((String) method_getHeaderName.invoke(object, new Object[0]));
						final String string_16_ = ((String) (method_getHeaderValue.invoke(object, (new Object[] { new URL(
						        new StringBuilder().append("https://").append(this.host).append("/").toString()),
						        "https" }))));
						string = new StringBuilder().append(string_15_).append(": ").append(string_16_).toString();
					}
				}
			}
			catch (final Exception exception)
			{
				/* empty */
			}
			return method420(inetsocketaddress.getPort(), string, inetsocketaddress.getHostName());
		}
		return null;
	}

	static int storeModel(final String name)
	{
		if (name.equalsIgnoreCase("na"))
		{
			return 0;
		}
		
		for (int index = 0; index < Class4.modelNamesCount; index++)
		{
			if (Class2.modelNames[index].equalsIgnoreCase(name))
			{
				return index;
			}
		}
		Class2.modelNames[Class4.modelNamesCount++] = name;
		return Class4.modelNamesCount - 1;
	}
}
