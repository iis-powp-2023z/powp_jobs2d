package edu.kis.powp.jobs2d.Factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class HouseFactory {

    public ComplexCommand createHouse(){
        List<DriverCommand> complex = new ArrayList<>();
        SetPositionCommand setPosition = new SetPositionCommand(0, -200);
        complex.add(setPosition);

        OperateToCommand operateTo = new OperateToCommand(-50,-150);
        complex.add(operateTo);
        operateTo = new OperateToCommand(-50,-50);
        complex.add(operateTo);
        operateTo = new OperateToCommand(50,-50);
        complex.add(operateTo);
        operateTo = new OperateToCommand(50,-150);
        complex.add(operateTo);
        operateTo = new OperateToCommand(0,-200);
        complex.add(operateTo);
        setPosition = new SetPositionCommand(-50,-150);
        complex.add(setPosition);
        operateTo = new OperateToCommand(50,-150);
        complex.add(operateTo);


        return new ComplexCommand(complex);
    }
}