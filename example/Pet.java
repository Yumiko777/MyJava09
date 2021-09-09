package example;

// AnimalクラスとCat,Dogのメソッドの抽象メソッドを一通り定義する。printMessageメソッドは外部から呼び出すことを想定していないので含めない
public interface Pet {
    public void eat();
    public void eat(String food);
    public void playToy();
    public void playToy(String toy);

    // Animalクラスで定義されているメソッド
    public String getName();
    public void setName(String name);
    public int getAge();
    public void setAge(int age);
    public boolean isHungry();
    public void setHungry(boolean hungry);
    public void introduceMyself();
}
