package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPosition implements DriverCommand{
    private int x;
    private int y;

    public SetPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.setPosition(x,y);
    }
}