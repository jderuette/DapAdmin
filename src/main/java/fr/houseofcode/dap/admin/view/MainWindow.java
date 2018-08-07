/**
 * For House Of Code 2018.
 */
package fr.houseofcode.dap.admin.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The main GUI entry point.
 * @author djer
 */
public class MainWindow extends JFrame {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 3606250506110105509L;

    /**
     * Logger.
     */
    private static final Logger LOG = LogManager.getLogger();

    /**
     * Default Main Window Height.
     */
    private static final int WINDOW_HEIGHT = 800;
    /**
     * Default Main Window Width.
     */
    private static final int WINDOW_WIDTH = 600;
    /**
     * Panel displayed by default when JFram is loaded.
     */
    private JPanel mainPanel = new JPanel();

    /***
     * Default title. Can be change with constructor.
     */
    private String defaultTitle = "House of Code - DAP Admin";

    /**
     * Create the MainWindow. Will automatically call the "init" method.
     */
    public MainWindow() {
        super();
        init();
    }

    /**
     * Create the MainWindow. Will automatically call the "init" method.
     * @param title the title of this window.
     */
    public MainWindow(final String title) {
        super();
        this.setDefaultTitle(title);
        init();
    }

    /**
     * Initialize the GUI.
     */
    private void init() {
        if (LOG.isDebugEnabled()) {
            LOG.debug(new StringBuilder().append("Init : MainWindow, with title : ").append(getDefaultTitle())
                    .toString());
        }
        this.setTitle(getDefaultTitle());
        this.setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);

    }

    /**
     * Show this Window.
     */
    public void display() {
        this.setVisible(true);
    }

    /**
     * Hide this window.
     */
    public void mask() {
        this.setVisible(false);
    }

    /**
     * @return the defaultTitle
     */
    public String getDefaultTitle() {
        return defaultTitle;
    }

    /**
     * @param title the defaultTitle to set
     */
    public void setDefaultTitle(final String title) {
        this.defaultTitle = title;
    }

}
