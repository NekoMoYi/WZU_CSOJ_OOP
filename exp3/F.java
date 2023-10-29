abstract class Cat {

  protected String name;

  public Cat(String name) {
    this.name = name;
  }

  public abstract void move();

  public abstract void sound();

  public abstract void show();
}

class AdultCat extends Cat {

  public AdultCat(String name) {
    super(name);
  }

  @Override
  public void move() {
    System.out.println("I can move quickly.");
  }

  @Override
  public void sound() {
    System.out.println("mie mie!");
  }

  @Override
  public void show() {
    System.out.println("I am " + super.name + ",I am a cat!");
  }
}

class YoungCat extends Cat {

  public YoungCat(String name) {
    super(name);
  }

  @Override
  public void move() {
    System.out.println("I like jumping.");
  }

  @Override
  public void sound() {
    System.out.println("mie mie!");
  }

  @Override
  public void show() {
    System.out.println("I am " + super.name + ",I am a young cat!");
  }
}

class OldCat extends Cat {

  public OldCat(String name) {
    super(name);
  }

  @Override
  public void move() {
    System.out.println("I move slowly.");
  }

  @Override
  public void sound() {
    System.out.println("miem miem!");
  }

  @Override
  public void show() {
    System.out.println("I am " + super.name + ",I am a old cat!");
  }
}

public class F {

  public static void main(String args[]) {
    Cat[] catfamily = new Cat[3];

    catfamily[0] = new OldCat("HuangLao");
    catfamily[1] = new AdultCat("LaoMei");
    catfamily[2] = new YoungCat("XiaoLi");

    for (int i = 0; i < 3; i++) {
      catfamily[i].show();
      catfamily[i].move();
      catfamily[i].sound();

      System.out.println();
    }
  }
}
