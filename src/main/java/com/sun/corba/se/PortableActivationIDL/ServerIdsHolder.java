package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerIdsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u131/8869/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, March 15, 2017 1:25:04 AM PDT
*/


/** Sequence of server Ids, used for queries about servers.
    */
public final class ServerIdsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ServerIdsHolder ()
  {
  }

  public ServerIdsHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerIdsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerIdsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerIdsHelper.type ();
  }

}