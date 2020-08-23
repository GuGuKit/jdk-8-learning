package org.omg.PortableServer;


/**
* org/omg/PortableServer/ThreadPolicyValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u101/7261/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, June 22, 2016 2:43:37 AM PDT
*/


/**
	 * The ThreadPolicyValue can have the following values.
	 * ORB_CTRL_MODEL - The ORB is responsible for assigning 
	 * requests for an ORB- controlled POA to threads. 
	 * SINGLE_THREAD_MODEL - Requests for a single-threaded 
	 * POA are processed sequentially. 
	 */
public class ThreadPolicyValue implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.omg.PortableServer.ThreadPolicyValue[] __array = new org.omg.PortableServer.ThreadPolicyValue [__size];

  public static final int _ORB_CTRL_MODEL = 0;
  public static final org.omg.PortableServer.ThreadPolicyValue ORB_CTRL_MODEL = new org.omg.PortableServer.ThreadPolicyValue(_ORB_CTRL_MODEL);
  public static final int _SINGLE_THREAD_MODEL = 1;
  public static final org.omg.PortableServer.ThreadPolicyValue SINGLE_THREAD_MODEL = new org.omg.PortableServer.ThreadPolicyValue(_SINGLE_THREAD_MODEL);

  public int value ()
  {
    return __value;
  }

  public static org.omg.PortableServer.ThreadPolicyValue from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ThreadPolicyValue (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ThreadPolicyValue
