package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerNotActiveHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u131/8869/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, March 15, 2017 1:25:04 AM PDT
*/

public final class ServerNotActiveHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerNotActive value = null;

  public ServerNotActiveHolder ()
  {
  }

  public ServerNotActiveHolder (ServerNotActive initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerNotActiveHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerNotActiveHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerNotActiveHelper.type ();
  }

}
