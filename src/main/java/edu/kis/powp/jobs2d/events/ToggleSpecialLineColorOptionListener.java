package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.adapter.SpecialLineAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleSpecialLineColorOptionListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        SpecialLineAdapter.specialLineColorFlag = !SpecialLineAdapter.specialLineColorFlag;
    }
}
