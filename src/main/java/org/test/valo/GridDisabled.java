package org.test.valo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.v7.ui.Grid;
import com.vaadin.tests.components.AbstractTestUI;

public class GridDisabled extends AbstractTestUI {

    @Override
    protected void setup(VaadinRequest request) {
        final Grid grid = new Grid();

        grid.addColumn("foo", String.class);
        grid.addRow("Foo");
        grid.select(grid.addRow("Bar"));
        grid.setId("disabled-grid");

        addComponent(grid);

        addButton("Disable", event -> grid.setEnabled(!grid.isEnabled()));
    }
}
