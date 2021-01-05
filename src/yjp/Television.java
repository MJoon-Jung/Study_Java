package yjp;

public class Television {
	int channel;
	int volume;
	boolean onOff = false;
	
	public Television() {
		this(0,0,false);
	}
	public String toString() {
		return "channel : " + channel + " volume : " + volume + " onOff : " + onOff;
	}
	public Television(int channel,int volume, boolean onOff){
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}


}