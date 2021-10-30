package Parser;

import java.util.List;

public class Rot {
    private  String name;
    private List<Children> children;

    public void Root(String name, List<Children> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
