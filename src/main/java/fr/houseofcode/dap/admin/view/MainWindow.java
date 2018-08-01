/**
 * For House Of Code 2018.
 */
package fr.houseofcode.dap.admin.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
        this.setTitle(getDefaultTitle());
        this.setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);

    }

    /**
     * Show this Window.
     */
    public void show() {
        this.setVisible(true);
    }

    /**
     * Hide this window.
     */
    @Override
    public void hide() {
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
