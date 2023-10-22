package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class SpecialLineDrawAdapter implements Job2dDriver {

    private ILine line;
    private int startX = 0, startY = 0;

    private final DrawPanelController drawPanelController;


    public SpecialLineDrawAdapter(DrawPanelController controller) {
        this.drawPanelController = controller;
        this.line = LineFactory.getSpecialLine();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {

            line.setStartCoordinates(this.startX, this.startY);
            line.setEndCoordinates(x, y);

            setPosition(x, y);

            this.drawPanelController.drawLine(line);



    }
    public void setLine(ILine line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "SpecialLineDrawAdapter";
    }
}