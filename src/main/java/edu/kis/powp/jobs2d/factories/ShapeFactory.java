package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;

public interface ShapeFactory {
    ComplexCommand createShape(Job2dDriver driver);
}
