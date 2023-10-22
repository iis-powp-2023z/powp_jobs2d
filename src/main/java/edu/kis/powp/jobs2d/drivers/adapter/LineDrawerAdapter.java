package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;

public class LineDrawerAdapter extends BaseAdapter {

    public LineDrawerAdapter(DrawPanelController drawPanelController) {
        super(drawPanelController);
    }

    @Override
    public void operateTo(int x, int y) {
        this.draw(x, y, "special");
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter mode";
    }
}
