module InfoInterface
{
	// Monitor type
	enum MntType
	{
		MNTREQ
	};
	// Monitor Header
	struct MntHeader
	{
		byte version;
		MntType type;
	};
	
	// src-dst MAC pair & speed
	struct MntPair
	{
		long src;
		long dst;
		int speed;
	};
	// Typedef
	sequence<MntPair> SerialPair;
	// Monitor Request
	struct MntRequest
	{
		MntHeader header;
		SerialPair pairs;
	};
	interface InfoExch
	{
		int sendInfo(MntRequest req);
	};
};