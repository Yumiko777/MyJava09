package example;

public class Dog extends Animal implements Pet {
    public Dog(String name, int age) {
        super(name, age);
        System.out.println("コンストラクター:Dog(String name, int age) が呼び出された");
        System.out.println("  引数:name =" + name + ", age=" + age);
    }

    @Override
    public void eat() {
        eat("ご飯");
    }

    @Override
    public void eat(String food) {
        printMessage(food + "を食べるよ！おいしいワン");
        printMessage("お腹が一杯になったワン");
        setHungry(false);
    }

    @Override
    public void playToy(String toy) {
        printMessage(toy + "で遊ぶよ。楽しいワン");
        printMessage("遊んでお腹が減ったワン");
        setHungry(true);
    }

    @Override
    public void playToy() {
        playToy("おもちゃ");
    }   

    @Override
    public void introduceMyself() {

        super.introduceMyself();
        
        boolean h = isHungry();
        if (h == true) {
            printMessage("お腹が空いてるワン");
        } else {
            printMessage("お腹は空いてないワン!");
        }
    }
}

