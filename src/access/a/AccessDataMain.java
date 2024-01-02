package access.a;

public class AccessDataMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출
        data.publicField = 1;
        data.publicMethod();

        //같은패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }

}
