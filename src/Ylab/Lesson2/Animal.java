package Ylab.Lesson2;

public class Animal {

    private final String name;
    private Boolean sleep;
    private String eat;
    private String voes;

    public void habits(){
    }


    protected void moveEat(){
        if (!sleep){
            System.out.println(getName() + getEat());
        }else {
            System.out.println(getName() + " не может есть, спит");
        }
    }
    protected void moveVoes(){
        if (!sleep){
            System.out.println(getName() + getVoes());
        }else {
            System.out.println(getName() + " не подает голос, спит");
        }
    }

    public Animal(String name, Boolean sleep, String eat, String voes) {
        this.name = name;
        this.sleep = sleep;
        this.eat = eat;
        this.voes = voes;
    }

    public String getName() {
        return name;
    }


    public Boolean getSleep() {
        return sleep;
    }

    public void setSleep(Boolean sleep) {
        this.sleep = sleep;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getVoes() {
        return voes;
    }

    public void setVoes(String voes) {
        this.voes = voes;
    }
}
