package example;

public class ExtendsAndImplementsSampleApp {
    public static void main(String[] args) {
        // Petインターフェース型の変数tamaにCatクラスのインスタンスを代入
        Pet tama = new Cat("タマ", 3);

        tama.eat();
        tama.introduceMyself();

        Pet pochi = new Dog("ポチ", 5);

        pochi.eat();
        pochi.introduceMyself();
    }
}
