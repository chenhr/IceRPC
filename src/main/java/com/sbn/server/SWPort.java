package com.sbn.server;

public class SWPort {

	public int _switchID;
	public long _portMAC; // int [6]
	public int _maxSpeed;
	
	public int get_switchID() {
		return _switchID;
	}
	public void set_switchID(int _switchID) {
		this._switchID = _switchID;
	}
	public long get_portMAC() {
		return _portMAC;
	}
	public void set_portMAC(long _portMAC) {
		this._portMAC = _portMAC;
	}
	public int get_maxSpeed() {
		return _maxSpeed;
	}
	public void set_maxSpeed(int _maxSpeed) {
		this._maxSpeed = _maxSpeed;
	}
}

class LinkSpeed {

	public long _localMAC;
	public long _remoteMAC;
	public int _currtSpeed;
	
	public long get_localMAC() {
		return _localMAC;
	}
	public void set_localMAC(long _localMAC) {
		this._localMAC = _localMAC;
	}
	public long get_remoteMAC() {
		return _remoteMAC;
	}
	public void set_remoteMAC(long _remoteMAC) {
		this._remoteMAC = _remoteMAC;
	}
	public int get_currtSpeed() {
		return _currtSpeed;
	}
	public void set_currtSpeed(int _currtSpeed) {
		this._currtSpeed = _currtSpeed;
	}

}

class EdgePair
{
	public long _srcMAC;
	public long _dstMAC;
	
	public EdgePair(long srcMAC, long dstMAC)
	{
		set_srcMAC(srcMAC);
		set_dstMAC(dstMAC);
	}
	
	public long get_srcMAC() {
		return _srcMAC;
	}
	public void set_srcMAC(long _srcMAC) {
		this._srcMAC = _srcMAC;
	}
	public long get_dstMAC() {
		return _dstMAC;
	}
	public void set_dstMAC(long _dstMAC) {
		this._dstMAC = _dstMAC;
	}
}

class SWPair
{
	public SWPort _localPort;
	public SWPort _remotePort;
	public SWPort get_localPort() {
		return _localPort;
	}
	public void set_localPort(SWPort _localPort) {
		this._localPort = _localPort;
	}
	public SWPort get_remotePort() {
		return _remotePort;
	}
	public void set_remotePort(SWPort _remotePort) {
		this._remotePort = _remotePort;
	}
}