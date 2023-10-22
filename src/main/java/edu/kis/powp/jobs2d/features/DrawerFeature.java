package edu.kis.powp.jobs2d.features;

import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.SelectClearPanelOptionListener;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.powp.jobs2d.events.SelectLineOptionListener;

public class DrawerFeature {

	private static DrawPanelController drawerController;
	private static Boolean specialLineActive = false;

	/**
	 * Setup Drawer Plugin and add to application.
	 * 
	 * @param application Application context.
	 */
	public static void setupDrawerPlugin(Application application) {
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();
		SelectLineOptionListener selectLineOptionListener = new SelectLineOptionListener();

		drawerController = new DrawPanelController();
		application.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
		application.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);
		application.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Special line", selectLineOptionListener, false);

		drawerController.initialize(application.getFreePanel());
	}

	/**
	 * Get controller of application drawing panel.
	 * 
	 * @return drawPanelController.
	 */
	public static DrawPanelController getDrawerController() {
		return drawerController;
	}

	/**
	 * Toggle drawing special line
	 *
	 */
	public static void toggleSpecialLine() {
		specialLineActive = !specialLineActive;
	}

	/**
	 * Check for drawing special line.
	 *
	 * @return true if drawing special line is active, false otherwise.
	 */
	public static Boolean isSpecialLineActive() {
		return specialLineActive;
	}
}
