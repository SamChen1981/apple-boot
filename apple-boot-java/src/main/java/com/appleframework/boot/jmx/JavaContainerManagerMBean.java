package com.appleframework.boot.jmx;

public interface JavaContainerManagerMBean {

	public String getName();

	public void restart();

	public void start();

	public void stop();

	public boolean isRunning();
}
