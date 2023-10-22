package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SpecialLineAdapter implements Job2dDriver
{
    public static boolean specialLineColorFlag = true;

    private int x, y;
    private DrawPanelController drawPanelController;

    public SpecialLineAdapter(DrawPanelController drawPanelController)
    {
        this.drawPanelController = drawPanelController;
    }

    @Override
    public void setPosition(int i, int i1)
    {
        x = i;
        y = i1;
    }

    @Override
    public void operateTo(int i, int i1)
    {
        ILine line = specialLineColorFlag ? LineFactory.getSpecialLine() : LineFactory.getDottedLine();
        line.setStartCoordinates(x, y);
        line.setEndCoordinates(i, i1);
        setPosition(i, i1);

        drawPanelController.drawLine(line);
    }

    @Override
    public String toString()
    {
        return "SpecialLineAdapter";
    }
}
