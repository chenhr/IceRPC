package com.sbn.server;

import InfoInterface.*;

import java.util.Map;
import java.util.List;

public class DataBase {

	private static DataBase _db = null;
	private Map<SWPort, List<SWPort>> _links;
	//private Map< HostUplink, SWPort> m_edges_; // host <-> Switch link
	private Map< EdgePair, List<SWPort> > _paths; // edge <-> pathlist
	private Map< SWPair, LinkSpeed> _speeds;
	
	public static DataBase getInstance()
	{
		if (_db == null)
		{
			_db = new DataBase();
		}
		return _db;
	}
	private DataBase()
	{};
	
	public void updateInfo(MntRequest req)
	{
		MntPair[] pairs = req.pairs;
		for(MntPair element: pairs){
			EdgePair ePair = new EdgePair(element.src, element.dst);
			System.out.println(ePair._srcMAC + ":" + ePair._dstMAC);
		}
		
	}
}
