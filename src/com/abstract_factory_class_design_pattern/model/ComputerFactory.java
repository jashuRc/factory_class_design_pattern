package com.abstract_factory_class_design_pattern.model;

import com.factory_class_design_pattern.model.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
