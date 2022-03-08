package com.javaex.classtest;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV() {
		// TODO Auto-generated constructor stub
	}

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		if(channel > 255)
			this.channel = 255;
		else if(channel < 1)
			this.channel = 1;
		else
			this.channel = channel;
	}

	public void channel(boolean up) {
		if(channel > 255 || channel < 1)
			System.out.println("채널오류");
		else {
			if(up)
				this.channel++;
			else
				this.channel--;
		}
	}

	public void volume(int volume) {
		if(volume > 100)
			this.volume = 100;
		else if(volume < 0)
			this.volume = 0;
		else
			this.volume = volume;
	}
	
	public void volume(boolean up) {
		if(up)
			this.volume++;
		else
			this.volume--;
		
		if(volume > 100)
			volume = 100;
		if(volume < 0)
			volume = 0;
	}
	
	public void status() {
		System.out.println("채널: " + channel + ", 볼륨: " + volume + ", 전원: " + power);
	}
}
