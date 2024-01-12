package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//      instanceValue++; // error
//      instanceMethod; // error
        staticValue++; // 정적변수에 접근
        staticMethod(); // 정벅메서드 접근
    }

    public static void staticCall(DecoData data) {
//      instanceValue++; // error
//      instanceMethod; // error
        data.staticValue++; // 정적변수에 접근
        data.staticMethod(); // 정벅메서드 접근
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++; // 정적변수에 접근
        staticMethod(); // 정벅메서드 접근
    }

    public void instanceMethod() {
        System.out.println("instanceValue " + instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticValue " + staticValue);
    }

}
