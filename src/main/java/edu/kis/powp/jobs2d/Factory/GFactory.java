package edu.kis.powp.jobs2d.Factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

public class GFactory {

    public ComplexCommand createG(){
        List<DriverCommand> complex = new ArrayList<>();
        SetPositionCommand setPosition = new SetPositionCommand(100, -100);
        complex.add(setPosition);

        OperateToCommand operateTo = new OperateToCommand(0,-100);
        complex.add(operateTo);
        operateTo = new OperateToCommand(0,100);
        complex.add(operateTo);
        operateTo = new OperateToCommand(100,100);
        complex.add(operateTo);
        operateTo = new OperateToCommand(100,0);
        complex.add(operateTo);
        operateTo = new OperateToCommand(50,0);
        complex.add(operateTo);


        return new ComplexCommand(complex);
    }
}
