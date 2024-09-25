# java 수업 정리 

# 클래스 (class)
클래스는 `객체를 생성하기 위한 설계도`이다. 클래스는 객체의 `속성(필드)과` `동작(메서드)을` 정의하며, 여러 객체들이 공통으로 가져야 할 것들을 미리 정의해 놓은 틀이다. <br/>

**특징**
- 객체의 상태(속성)를 나타내는 필드와 객체의 행동(동작)을 나타내는 `메서드`를 포함한다.
- 실제로 작동하지 않고, `설계도`나 `청사진` 역할을 한다.

**예시**
```
class Car {
    String model; // 필드: 자동차의 모델
    int year; // 필드: 자동차의 생산연도
    
    void start() { // 메서드: 자동차를 시동 거는 동작
        System.out.println(model + " 시동이 걸렸습니다.");
    }
}
```

# 객체 (object)
객체는 `클래스에 의해 생성된 실체`로, 클래스가 설계도라면 객체는 그 설계도를 바탕으로 만들어진 `구체적인 실체`이다. 하나의 클래스에서 여러 객체를 생성할 수 있다. <br/>

**특징**
- 객체는 필드에 저장된 데이터와 메서드를 통해 `행동`을 할 수 있다.
- 객체는 메모리에 할당되며, 실제로 동작하는 단위이다.

**예시**
```
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); //객체 생성
        myCar.model = "Tesla"; // 객체의 필드 값 설정
        myCar.year = 2024;
        myCar.start(); // 메서드 호출
    }
}
```

# 필드 (Field)
필드는 `객체의 상태를 저장하는 변수`로, 클래스 내에 정의된 변수이다. 객체가 가질 데이터를 `저장하는 공간`, 객체가 생성될 때 `각 객체는 고유한 값`을 가질 수 있다.

**특징**
- 클래스의 속성을 정의한다.
- 객체마다 필드에 저장되는 값은 다를 수 있다.

**예시**
```
class Car {
    String model; // 필드: 자동차 모델
    int year;     // 필드: 생산 연도
}
```

# 생성자 (Constructor)
생성자는 `객체를 생성할 때 자동으로 호출되는 메서드`로, 객체의 필드를 `초기화`하는 데 주로 사용된다. `생성자는 클래스 이름과 동일`하며, 반환 타입이 없다.

**특징**
- 클래스와 `동일한 이름`을 가진다.
- `객체가 생성`될 때 호출된다
- 필드를 `초기화`하는 작업을 주로 담당한다.

**예시**
```
class Car {
    String model;
    int year;

    //생성자
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void start() {
        System.out.println(model + "시동이 걸렸습니다.");
    }
}
```
```
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 2024); // 생성자를 통해 필드 값 초기화
        myCar.start();
    }
}
```

# 메서드 (Method)
메서드는 `객체의 동작을 정의하는 함수`이다. 필드를 이용해 작업을 수행하며, 객체의 행동을 구현하는 데 사용된다.

**특징**
- 객체의 `기능`을 담당한다.
- 필드 값을 읽거나 수정할 수 있다.

**예시**
```
class Car {
    String model;
    int year;

    // 메서드: 자동차의 시동을 거는 동작
    void start() {
        System.out.println(model + " 시동이 걸렸습니다.");
    }
}
```

# 인스턴스 (Instance)
인스턴스는 `클래스에서 만들어진 객체를 의미`한다. 즉, `객체는 클래스의 인스턴스`라고 할 수 있다. "인스턴스"라는 용어는 객체가 특정 클래스의 구현체라는 사실을 강조할 때 사용된다.

**특징**
- `인스턴스`와 `객체`는 같은 의미로 사용되지만, 클래스에서 객체가 만들어졌다는 점을 강조할 때 "인스턴스"라는 용어를 사용한다.

**예시**
```
Car myCar = new Car("Tesla", 2024); // muCar는 Car 클래스의 인스턴스
```
<hr/>

**정리 순서:**
1. `클래스`: 객체를 만들기 위한 `설계도`.
2. `필드`: 객체의 상태나 데이터를 저장하는 `변수`.
3. `생성자`: 객체를 생성하고 `초기화하는 메서드`.
4. `메서드`: 객체의 `행동을 정의`하는 함수.
5. `객체`: 클래스에 의해 생성된 `실체`.
6. `인스턴스`: 객체와 동일한 개념으로, 클래스의 실체화된 결과물.
<hr/>

**전체 예시 코드:**
```
class Car {
    String model; // 필드: 모델명
    int year;     // 필드: 생산연도

    // 생성자: 객체 생성 시 호출되어 필드를 초기화
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // 메서드: 자동차의 시동을 거는 동작
    void start() {
        System.out.println(model + " 시동이 걸렸습니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Car 클래스의 객체 생성 (인스턴스)
        Car myCar = new Car("Tesla", 2024);

        // 메서드 호출
        myCar.start();  // "Tesla 시동이 걸렸습니다." 출력
    }
}
```

# 타입 변환 (Type Casting)
자바에서 타입 변환은 `자동 변환`과 `강제 변환`으로 나뉩니다.

1. 자동 타입 변환 (Implicit Casting):
- `작은 타입` -> `큰 타입`으로 변환할 때 자동으로 이루어집니다.
- 데이터 손실이 없기 때문에 안전합니다.
- 예: `int` -> `long`, `int` -> `double`
2. 강제 타입 변환 (Explicit Casting)
- `큰 타입` -> `작은 타입`으로 변환할 때 명시적으로 변환해야 합니다.
- 데이터 손실을 발생할 수 있습니다.
- 캐스팅 연산자 `()`를 사용합니다
- 예: `long` -> `int`, `double` -> `int`

# 코드 예시:
```
int intValue = 44032;
// int → char 강제 변환, 유니코드 '가' 출력
char charValue = (char) intValue;
System.out.println(charValue);  // 출력: '가'

long longValue = 500;
// int → long 자동 변환, long → int 강제 변환
intValue = (int) longValue;
System.out.println(intValue);  // 출력: 500

double doubleValue = 3.14;
// double → int 강제 변환 (소수점 버려짐)
intValue = (int) doubleValue;
System.out.println(intValue);  // 출력: 3
```