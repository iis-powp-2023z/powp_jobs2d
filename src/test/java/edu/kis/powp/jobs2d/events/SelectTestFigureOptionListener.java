package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import command.CircleFactory;
import command.ComplexCommand;
import command.SquareFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Square":
				ComplexCommand command = SquareFactory.createSquare(driverManager.getCurrentDriver(), -128, 0, 100);
				command.execute();
				break;
			case "Circle":
				ComplexCommand circleCommand = CircleFactory.createCircle(driverManager.getCurrentDriver(), -128, 0, 100);
				circleCommand.execute();
				break;
			default:
			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
		}
	}
}
