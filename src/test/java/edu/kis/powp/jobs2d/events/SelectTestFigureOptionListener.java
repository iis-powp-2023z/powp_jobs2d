package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static edu.kis.powp.jobs2d.TestJobs2dPatterns.*;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String optionName = event.getActionCommand();

		switch (optionName)
		{
			case FIGURE_JOE_1_NAME:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2_NAME:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
		}
	}
}
