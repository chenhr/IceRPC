// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `invoke.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package InfoInterface;

public class MntHeader implements java.lang.Cloneable, java.io.Serializable
{
    public byte version;

    public MntType type;

    public MntHeader()
    {
    }

    public MntHeader(byte version, MntType type)
    {
        this.version = version;
        this.type = type;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MntHeader _r = null;
        if(rhs instanceof MntHeader)
        {
            _r = (MntHeader)rhs;
        }

        if(_r != null)
        {
            if(version != _r.version)
            {
                return false;
            }
            if(type != _r.type)
            {
                if(type == null || _r.type == null || !type.equals(_r.type))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::InfoInterface::MntHeader");
        __h = IceInternal.HashUtil.hashAdd(__h, version);
        __h = IceInternal.HashUtil.hashAdd(__h, type);
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeByte(version);
        type.__write(__os);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        version = __is.readByte();
        type = MntType.__read(__is);
    }

    public static final long serialVersionUID = -1727248118L;
}