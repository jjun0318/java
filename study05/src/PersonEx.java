public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "홍길동");
        
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        System.out.println();

//        final 필드이기 때문에 수정이 불가능함
//        p1.nation = "USA";
//        p1.ssn = "1234567-12345678";
        
//        일반 필드이기 때문에 수정 가능
        p1.name = "임꺽정";
        System.out.println(p1.name);
    }
}
