package com.epam.texttask.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private GroupType type;
    private List<Component> components = new ArrayList<>();

    public Composite() {
    }

    public boolean add(Component component) {
        return components.add(component);
    }

    public boolean remove(Object o) {
        return components.remove(o);
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    @Override
    public int count() {
        int counter = 0;
        for (Component component:
                components) {
            counter += component.count();
        }
        return counter;
    }
}
