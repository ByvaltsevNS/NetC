package ru.skillbench.tasks.basics.entity;

public class LocationImpl implements Location {
    private String name;
    private Type type;
    private Location parent;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setParent(Location parent) {
        this.parent = parent;
    }

    @Override
    public String getParentName() {
        return this.parent.getName();
    }

    @Override
    public Location getTopLocation() {
        Location topLocation = this;
        if (this.parent != null)
            topLocation = this.getTopLocation();
        return topLocation;
    }

    @Override
    public boolean isCorrect() {
        boolean answer = true;
        if (this.parent != null)
            answer = this.parent.isCorrect();
        return answer;
    }

    @Override
    public String getAddress() {
        String address = this.getName();
        if (address.)
        return null;
    }

    @Override
    public String toString() {
        String result = new String(this.getName() + " (" + this.getType().toString() + ")");
        return result;
    }
}
