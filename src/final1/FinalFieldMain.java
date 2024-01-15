package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInti fieldInti1 = new FieldInti();
        FieldInti fieldInti2 = new FieldInti();
        FieldInti fieldInti3 = new FieldInti();
        System.out.println(fieldInti1.value);
        System.out.println(fieldInti2.value);
        System.out.println(fieldInti3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInti.CONST_VALUE);
    }
}
