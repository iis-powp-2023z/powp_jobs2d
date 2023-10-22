package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactory {
    private Job2dDriver driver;

    public TriangleFactory(Job2dDriver driver){
        this.driver = driver;
    }

    public ComplexCommand createTriangle(){
        List<DriverCommand> complex = new ArrayList<>();

        SetPositionCommand setPosition = new SetPositionCommand(0, 0);
        complex.add(setPosition);
        OperateToCommand operateTo = new OperateToCommand(100,0);
        complex.add(operateTo);
        operateTo = new OperateToCommand(0,100);
        complex.add(operateTo);
        operateTo = new OperateToCommand(0,0);
        complex.add(operateTo);

        return new ComplexCommand(complex);
    }
}