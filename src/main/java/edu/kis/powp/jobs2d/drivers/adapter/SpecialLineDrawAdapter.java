package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SpecialLineDrawAdapter implements Job2dDriver {

    private int startX = 0, startY = 0;
    private final DrawPanelController drawPanelController;

    public SpecialLineDrawAdapter(DrawPanelController drawerController) {
        this.drawPanelController = drawerController;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {

    }

    @Override
    public String toString() {
        return "SpecialLineDrawAdapter";
    }
}