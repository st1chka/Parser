package Ylab.Lesson2;

public abstract class Animal {

    private Boolean sleep = false;


    public abstract void habits();

    protected abstract void moveEat();

    protected abstract void moveVoice();



    public Boolean getSleep() {
        return sleep;
    }

    public void setSleep(Boolean sleep) {
        this.sleep = sleep;
    }

}
