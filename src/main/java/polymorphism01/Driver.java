package polymorphism01;

public class Driver {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showName("초보람보");
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        // Animal에서 정의한 showName()이 아닌 Penguin 클래스에서 재정의한 showName()이 호출된다.
        pingu.showName();
    }
}
