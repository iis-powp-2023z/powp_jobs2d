package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class BasicJob2dDriver implements Job2dDriver {
    private int currentX = 0;
    private int currentY = 0;

    @Override
    public void setPosition(int x, int y) {
        // Implementacja ustawienia pozycji.
        currentX = x;
        currentY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        // Implementacja rysowania linii między bieżącą pozycją a nową pozycją (x, y).
        // Aktualizacja bieżącej pozycji.
        setPosition(x, y);
    }
}
