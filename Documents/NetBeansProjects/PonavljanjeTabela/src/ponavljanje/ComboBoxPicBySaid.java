package ponavljanje;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class ComboBoxPicBySaid extends JPanel {

    private final ImageIcon[] images;
    private final String[] petNames = {"Lion", "Tiger", "Giraffe", "Wolf"};

    public ComboBoxPicBySaid() {
        super(new BorderLayout());
        Integer[] intArray = new Integer[petNames.length];
        images = new ImageIcon[petNames.length];
        for (int i = 0; i < petNames.length; i++) {
            intArray[i] = i;
            System.out.println(intArray[i]);
            images[i] = createImageIcon(petNames[i]);
            JComboBox<Integer> comboBox = new JComboBox<>(intArray);
            ComboBoxRenderer renderer = new ComboBoxRenderer();
            renderer.setPreferredSize(new Dimension(200, 130));
            comboBox.setRenderer(renderer);
            add(comboBox, BorderLayout.PAGE_START);
            renderer.setOpaque(true);
            comboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }

    private ImageIcon createImageIcon(String pictureName) {
        String fileName = pictureName + ".jpg";
        URL picURL = ComboBoxPicBySaid.class.getResource(fileName);
        System.out.println(picURL);
        if (picURL != null) {
            return new ImageIcon(picURL);
        } else {
            System.err.printf("Ne mogu pronaći ikonicu koja se zove '%s' %n", fileName);
        }
        return null;
    }

    private class ComboBoxRenderer extends JLabel implements ListCellRenderer<Integer> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Integer> list, Integer value, int index, boolean isSelected, boolean cellHasFocus) {

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
                list.setCursor(new Cursor(Cursor.HAND_CURSOR));
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }
            ImageIcon image = images[value];
            String itemText = petNames[value];
            if (image != null) {
                setIcon(image);
                setText(itemText);
            } else {
                setText("slika ne postoji..");
            }
            return this;
        }
    }
}