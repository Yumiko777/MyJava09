package example;

// Animalクラスを継承したCatクラスを定義する
// CatクラスをPetインターフェースを実装したクラスに変更する
public final class Cat extends Animal implements Pet{
    public Cat(String name, int age) {
        // スーパークラスのコンストラクターを呼び出す super(コンストラクターの引数リスト)
        super(name, age);
        System.out.println("コンストラクター:Cat(String name, int age) が呼び出された");
        System.out.println("  引数:name =" + name + ", age=" + age);
    }

    @Override
    public void eat() {
        eat("ご飯");
    }

    @Override
    public void eat(String food) {
        printMessage(food + "を食べるよ！おいしいにゃー");
        printMessage("お腹が一杯になったにゃー");
        setHungry(false);
    }

    @Override
    public void playToy(String toy) {
        printMessage(toy + "で遊ぶよ。楽しいにゃー");
        printMessage("遊んでお腹が減ったにゃー");
        setHungry(true);
    }

    @Override
    public void playToy() {
        playToy("おもちゃ");
    }   

    // メソッドをオーバーライドするとスーパークラス側の同名メソッドの処理は行われなくなる。その分の処理もサブクラス側で書かなければいけない。
    @Override
    public void introduceMyself() {
        
        // AnimalクラスのintroduceMyselfメソッドを呼び出す
        // superが使えるのはサブクラスのメソッド定義内。
        super.introduceMyself();

        boolean h = isHungry();
        if (h == true) {
            printMessage("お腹が空いてるにゃー");
        } else {
            printMessage("お腹は空いてないにゃー!");
        }
    }
}
