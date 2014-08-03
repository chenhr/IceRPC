package com.sbn.client;

import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;

import InfoInterface.InfoExchPrx;
import InfoInterface.InfoExchPrxHelper;
import InfoInterface.MntHeader;
import InfoInterface.MntPair;
import InfoInterface.MntRequest;
import InfoInterface.MntType;

public class Client {
	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			ic = Ice.Util.initialize(args);
			Ice.ObjectPrx base = ic.stringToProxy("SimplePrinter:default -h 127.0.0.1 -p 10000");
			InfoExchPrx infoExch = InfoExchPrxHelper.checkedCast(base);
			if (infoExch == null)
				throw new Error("Invalid proxy");
			MntHeader header = new MntHeader((byte)1, MntType.MNTREQ);
			MntPair[] pair = new MntPair[2];
			pair[0] = new MntPair(1L, 2L, 10);
			pair[1] = new MntPair(3L, 4L, 100);

			MntRequest req = new MntRequest(header, pair);
			int ret = infoExch.sendInfo(req);
			System.out.println("Client Result is " + ret);
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
