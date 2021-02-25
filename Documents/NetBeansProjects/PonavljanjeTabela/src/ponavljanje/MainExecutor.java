package ponavljanje;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class MainExecutor extends JFrame {

    private final JComponent component;

    public MainExecutor(String title, JComponent component) {
        super(title);
        this.component = component;
    }

    public void showFrame() {
        add(component);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        ComboBoxPicBySaid comboBox = new ComboBoxPicBySaid();

        MainExecutor main = new MainExecutor("COMBOBOX", comboBox);
        SwingUtilities.invokeLater(main::showFrame);
    }

}
