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

public abstract class Callback_InfoExch_sendInfo extends Ice.TwowayCallback
{
    public abstract void response(int __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        InfoExchPrx __proxy = (InfoExchPrx)__result.getProxy();
        int __ret = 0;
        try
        {
            __ret = __proxy.end_sendInfo(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}