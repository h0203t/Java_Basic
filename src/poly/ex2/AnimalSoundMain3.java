package poly.ex2;

public class AnimalSoundMain3 {

    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (Animal animal : animals) {
            extracted(animal);
        }
    }

    //변하지 않는 부분
    private static void extracted(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
