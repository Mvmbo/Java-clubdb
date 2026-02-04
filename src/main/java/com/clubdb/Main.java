
package com.clubdb;

import com.clubdb.controller.EntityRegistry;
import com.clubdb.view.MainView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {
            }
            MainView view = new MainView(EntityRegistry.buildDescriptors());
            view.setVisible(true);
        });
    }
}
