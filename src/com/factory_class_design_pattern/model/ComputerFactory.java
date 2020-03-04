package com.factory_class_design_pattern.model;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		Computer computer = null;
		switch (type) {
		case "pc":
			computer = new PC(ram, hdd, cpu);
			break;
		case "server":
			computer = new Server(ram, hdd, cpu);
		}

		return computer;
	}

}
