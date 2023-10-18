package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;


public class LineDrawerAdapter extends DrawerJob2dDriverAdapter {
	public LineDrawerAdapter(DrawPanelController controller) {
		super(controller);
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getSpecialLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		setPosition(x,y);

		try {
			drawPanelController.drawLine(line);
		} catch (Exception e) {
			throw new RuntimeException("drawPanelController mustn't has null value");
		}
	}

	@Override
	public String toString() {
		return "Dashed line simulator";
	}
}
