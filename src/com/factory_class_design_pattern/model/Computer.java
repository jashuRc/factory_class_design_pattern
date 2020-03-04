package com.factory_class_design_pattern.model;

public abstract class Computer {

	protected String ram;
	protected String hdd;
	protected String cpu;

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
	}

	public String getRAM() {
		return this.ram;
	}

	public String getHDD() {
		return this.hdd;
	}

	public String getCPU() {
		return this.cpu;
	}
}
