package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPairHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u131/8869/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Wednesday, March 15, 2017 1:25:04 AM PDT
*/

abstract public class NameDynAnyPairHelper
{
  private static String  _id = "IDL:omg.org/DynamicAny/NameDynAnyPair:1.0";

  public static void insert (org.omg.CORBA.Any a, NameDynAnyPair that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NameDynAnyPair extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (FieldNameHelper.id (), "FieldName", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = DynAnyHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (NameDynAnyPairHelper.id (), "NameDynAnyPair", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NameDynAnyPair read (org.omg.CORBA.portable.InputStream istream)
  {
    NameDynAnyPair value = new NameDynAnyPair ();
    value.id = istream.read_string ();
    value.value = DynAnyHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NameDynAnyPair value)
  {
    ostream.write_string (value.id);
    DynAnyHelper.write (ostream, value.value);
  }

}
