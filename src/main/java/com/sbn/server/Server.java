package com.sbn.server;

import InfoInterface.*;

/**
 * Hello world!
 *
 */
public class Server 
{
	static final byte version = 1;
    public static void main( String[] args )
    {
    	int status = 0;
    	Ice.Communicator ic = null;
    	try {
    		ic = Ice.Util.initialize(args);
    		Ice.ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("SimplePrinterAdapter", "default -p 10000");
    		Ice.Object object = new InfoExchI();
    		adapter.add(object, Ice.Util.stringToIdentity("SimplePrinter"));
    		adapter.activate();
    		ic.waitForShutdown();
    	} catch (Ice.LocalException e) {
    		e.printStackTrace();
    		status = 1;
    	} catch (Exception e) {
    		System.err.println(e.getMessage());
    		status = 1;
    	} finally {
    	if (ic != null)
    		ic.destroy();
    	}
    	System.exit(status);
    }
}
