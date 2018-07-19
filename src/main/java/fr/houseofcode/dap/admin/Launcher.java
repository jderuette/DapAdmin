package fr.houseofcode.dap.admin;
/**
 * Data Access Project Launcher.
 */

/**
 * Launcher for the DataAccessProject admin tool.
 * @author djer
 */
public final class Launcher {

    /**
     * Utility CLass.
     */
    private Launcher() {
        throw new UnsupportedOperationException("Launcher is an EntryPoint (Utility CLass) not a business Class");
    }

    /**
     * Program entry point.
     * @param args command line parameters.
     */
    public static void main(final String[] args) {
        sayHello("le monde");
        sayHello(null);
    }

    /**
     * Say Hello in French.
     * @param who name of user to say Hello.
     */
    private static void sayHello(final String who) {
        System.out.println("Bonjour " + who + " !");
    }

}
