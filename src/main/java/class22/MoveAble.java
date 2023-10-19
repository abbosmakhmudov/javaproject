package class22;

public interface MoveAble {

    public abstract void move();
}
interface WashAble{
    public abstract void wash();
}

class Dog implements MoveAble,WashAble{

    @Override
    public void move() {
        System.out.println("Dogs can jump runand can move");
    }

    @Override
    public void wash() {
        System.out.println("You can safely wash a Dog");
    }
}
class Car implements MoveAble,WashAble{

    @Override
    public void move() {
        System.out.println("Car can move forward backwards");
    }

    @Override
    public void wash() {
        System.out.println("You can wash a Car");
    }
}
