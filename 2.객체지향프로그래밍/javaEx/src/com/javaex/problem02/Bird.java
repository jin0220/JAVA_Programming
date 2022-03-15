package com.javaex.problem02;

public abstract class Bird {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sing();

    public abstract void fly();
    
    public abstract void showName();

}
