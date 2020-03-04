package com.abstract_factory_class_design_pattern;

import com.abstract_factory_class_design_pattern.model.PCFactory;
import com.factory_class_design_pattern.model.Computer;
import com.factory_class_design_pattern.model.ComputerFactory;

public class AbstractFactoryClassPatternApplication {
	public static void main(String[] args) {
		Computer pc = com.abstract_factory_class_design_pattern.model.ComputerFactory
				.getComputer(new PCFactory("1", "1", "1"));

		System.out.println("AbstractFactory PC Config::" + pc);

	}
}
