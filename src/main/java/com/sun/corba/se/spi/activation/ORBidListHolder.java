package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ORBidListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u201/12317/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, December 15, 2018 11:36:11 AM PST
*/

public final class ORBidListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ORBidListHolder ()
  {
  }

  public ORBidListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ORBidListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ORBidListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ORBidListHelper.type ();
  }

}
