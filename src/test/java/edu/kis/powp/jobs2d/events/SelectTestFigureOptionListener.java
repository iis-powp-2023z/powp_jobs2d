package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Factory.GFactory;
import edu.kis.powp.jobs2d.Factory.HouseFactory;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int selectedFigureNumber;

	public SelectTestFigureOptionListener(DriverManager driverManager, int selectedFigureNumber) {
		this.driverManager = driverManager;
		this.selectedFigureNumber = selectedFigureNumber;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (selectedFigureNumber) {
			case 1:
				drawFigure1();
				break;
			case 2:
				drawFigure2();
				break;
			case 3:
				drawHouse();
				break;
			case 4:
				drawG();
				break;
		}
	}

	private void drawFigure1() {
		FiguresJoe.figureScript1(driverManager.getCurrentDriver());
	}

	private void drawFigure2() {
		FiguresJoe.figureScript2(driverManager.getCurrentDriver());
	}

	private void drawHouse() {
		HouseFactory houseFactory = new HouseFactory();
		ComplexCommand complexCommand = houseFactory.createHouse();
		complexCommand.execute(driverManager.getCurrentDriver());
	}

	private void drawG() {
		GFactory gFactory = new GFactory();
		ComplexCommand complexCommand = gFactory.createG();
		complexCommand.execute(driverManager.getCurrentDriver());
	}

}