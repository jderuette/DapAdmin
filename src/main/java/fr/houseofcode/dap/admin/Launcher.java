package fr.houseofcode.dap.admin;
/**
 * Data Access Project Launcher.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.houseofcode.dap.admin.view.MainWindow;

/**
 * Launcher for the DataAccessProject admin tool.
 * @author djer
 */
public final class Launcher {

    /**
     * Logger.
     */
    private static final Logger LOG = LogManager.getLogger();

    /**
     * Utility CLass.
     */
    private Launcher() {
        LOG.error("Cannot instntiate Launcher");
        throw new UnsupportedOperationException("Launcher is an EntryPoint (Utility Class) not a business Class");
    }

    /**
     * Program entry point.
     * @param args command line parameters.
     */
    public static void main(final String[] args) {
        final MainWindow mainWindow = new MainWindow("House of Code - Data Access Project");
        mainWindow.display();
    }
}
