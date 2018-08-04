package com.cg.tvRemote;
//Class for Television Remote Functioning

class Television {
	boolean state; // initially TV is turned off
	int volume;
	int channel;

	// changing the channel by 1 or jump to a channel no.
	public int changeChannel(int channel) {
		if (channel == 1) {
			this.channel += channel;
		} else if (channel == -1) {
			this.channel -= channel;
		} else {
			this.channel = channel;
		}
		return this.channel;

	}

	// to increase volume by one
	public int volumeIncrease(int volume) {
		this.volume += volume;
		return this.volume;
	}

	// to decrease volume by one
	public int volumeDecrease(int volume) {
		this.volume -= volume;
		return this.volume;
	}

	// State == True: TV is on & False: TV is off
	public boolean tvState(boolean state) {
		this.state = state;
		return this.state;

	}

	public boolean getState() {
		return state;
	}

	public int getVolume() {
		return volume;
	}

	public int getChannel() {
		return channel;
	}

}