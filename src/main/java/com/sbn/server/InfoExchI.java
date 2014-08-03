package com.sbn.server;

import Ice.Current;
import InfoInterface.*;

public class InfoExchI extends _InfoExchDisp {
	
	public int sendInfo(MntRequest req, Current __current) {

		if (req.header.version == Server.version)
		{
			if (req.header.type == MntType.MNTREQ)
			{
				DataBase db = DataBase.getInstance();
				db.updateInfo(req);
			}
		}
		return 1;
	}
}
