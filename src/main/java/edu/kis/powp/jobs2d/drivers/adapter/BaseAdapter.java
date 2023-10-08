package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.Objects;

/**
 * driver adapter to drawer
 */
public class BaseAdapter implements Job2dDriver {
	protected int startX = 0, startY = 0;
	protected DrawPanelController drawPanelController;

	public BaseAdapter(DrawPanelController drawPanelController) {
		this.drawPanelController = drawPanelController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		this.draw(x, y, "basic");
	}
	
	public void draw(int x, int y, String mode) {
		ILine line = null;
		if(Objects.equals(mode, "basic")) {
			line = LineFactory.getBasicLine();
		} else if(Objects.equals(mode, "special")) {
			line = LineFactory.getSpecialLine();
		}
		try {
			line.setStartCoordinates(this.startX, this.startY);
			line.setEndCoordinates(x, y);
			drawPanelController.drawLine(line);
		} catch (Exception e) {
			throw new RuntimeException("drawPanelController can not be null value");
		}
		this.setPosition(x, y);
	}

	@Override
	public String toString() {
		return "BaseAdapter mode";
	}
}
