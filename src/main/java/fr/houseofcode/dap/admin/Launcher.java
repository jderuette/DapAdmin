package fr.houseofcode.dap.admin;
/**
 * Data Access Project Launcher.
 */

import fr.houseofcode.dap.admin.view.MainWindow;

/**
 * Launcher for the DataAccessProject admin tool.
 * @author djer
 */
public final class Launcher {

    /**
     * Utility CLass.
     */
    private Launcher() {
        throw new UnsupportedOperationException("Launcher is an EntryPoint (Utility Class) not a business Class");
    }

    /**
     * Program entry point.
     * @param args command line parameters.
     */
    public static void main(final String[] args) {
        final MainWindow mainWindow = new MainWindow("House of Code - Data Access Project");
        mainWindow.show();
    }
}
