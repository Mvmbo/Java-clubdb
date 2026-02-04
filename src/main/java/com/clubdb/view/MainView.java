
package com.clubdb.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainView extends JFrame {
    public MainView(List<EntityDescriptor<?>> descriptors) {
        setTitle("ClubDB Manager");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        for (EntityDescriptor<?> descriptor : descriptors) {
            tabs.addTab(descriptor.displayName(), new GenericCrudPanel<>(descriptor));
        }
        add(tabs, BorderLayout.CENTER);
    }
}
