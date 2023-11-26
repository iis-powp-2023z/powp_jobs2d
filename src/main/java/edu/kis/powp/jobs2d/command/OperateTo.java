package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateTo implements DriverCommand{
    private int x;
    private int y;

    public OperateTo(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(x,y);
    }
}