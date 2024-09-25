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

# 타입 변환 코드 예시:
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

# 정적 멤버 (Static Member)

1. **정적 멤버 (Static Member)란?**
- 정적 `멤버는 클래스 자체에 속하는 변수나 메서드`를 의미합니다.
- 인스턴스(객체)를 생성하지 않고 `클래스 이름으로 직접 접근`할 수 있습니다.
- 여러 객체가 동일한 값을 공유해야 할 때 사용됩니다. <br/>
정적 변수(static 변수):
- `클래스에 한 번만 생성`되며, 모든 객체가 이 변수를 공유합니다.
- 객체마다 개별적인 값을 갖는 인스턴스 변수와 달리 `정적 변수는 클래스 단위로 하나만 존재`합니다. <br/>
정적 메서드(static 메서드):
- `클래스 이름`으로 호출할 수 있는 메서드입니다.
- 정적 메서드 안에서는 `인스턴스 변수나 메서드를 직접 사용할 수 없습니다.` 대신 정적 변수나 `다른 정적 메서드`만 사용할 수 있습니다.

2. `static` 키워드
- `static`은 멤버(변수, 메서드)`를 클래스 수준에서 관리`한다는 것을 의미합니다.
- 객체가 생성되기 전에 `클래스가 메모리에 로드될 때 함께` 로드됩니다.
- 따라서 객체와 상관없이 `클래스 자체로 호출 가능`합니다.

# 정적 멤버 사용 예시:
```
class Calculator {
    // 정적 변수
    static double pi = 3.14159;

    // 정적 메서드
    static int add(int x, int y) {
        return x + y;
    }
}

public class Main {
    public static void main(String[] args) {
        // 정적 변수와 메서드는 클래스 이름으로 호출
        System.out.println(Calculator.pi);  // 출력: 3.14159
        int result = Calculator.add(5, 7);  // 정적 메서드 호출
        System.out.println(result);  // 출력: 12
    }
}
```
**정리**
1. 정적 변수는 `클래스 자체`에 속하며, 모든 객체가 값을 공유.
2. `정적 메서드는 클래스 이름으로 호출`하며, `인스턴스 없이` 사용 가능.
3. `static`은 `클래스 수준`에서 멤버를 정의할 때 사용.

# final 필드와 상수(static final)

1. `final`필드
- `final` 키워드를 사용한 필드는 `초기화된 이후 값을 변경할 수 없는 필드`입니다.
- 한 번 값을 지정하면, 다시는 수정할 수 없습니다.
- `생성자`에서 초기화할 수도 있고, 필드 선언과 동시에 초기화할 수도 있습니다.

**예시**
```
class Car {
    final int maxSpeed;  // final 필드 선언

    // 생성자에서 final 필드 초기화
    Car(int speed) {
        this.maxSpeed = speed;
    }

    void showSpeed() {
        System.out.println("최고 속도: " + maxSpeed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(200);
        car.showSpeed();  // 출력: 최고 속도: 200
        // car.maxSpeed = 250;  // 오류! final 필드는 값을 변경할 수 없음
    }
}
```
- `final` 필드는 `초기화된 이후` 값을 바꿀 수 없기 때문에, 이를 `상수처럼 사용`하거나 `객체의 상태를 불변`하게 유지할 때 유용합니다.
2. `상수(static final)`
- 상수는 `static final`로 선언된 변수로, 클래스에서 `단 한 번만` 초기화되며, 그 값은 절대 변경되지 않습니다.
- `static`: 상수는 `클래스에 속하며`, 모든 객체가 공유하는 값이 됩니다.
- `final`: 값을 변경할 수 없습니다. <br/>
**상수의 특징:**
- `클래스 차원에서 공유`되는 `변경 불가능한 값`.
- 주로 `모든 객체가 공통적으로 사용해야 하는 고정된 값`을 나타낼 때 사용합니다. 예를 들어, 수학 상수(`PI`)나 프로그램에서 자주 사용하는 값들을 상수로 정의합니다.

**예시**
```
class MathConstants {
    // 상수 선언 (static final)
    static final double PI = 3.14159;
}

public class Main {
    public static void main(String[] args) {
        // 클래스 이름으로 상수에 접근
        System.out.println("PI 값: " + MathConstants.PI);  // 출력: PI 값: 3.14159
        // MathConstants.PI = 3.14;  // 오류! 상수는 값을 변경할 수 없음
    }
}
```
- `static final`로 선언된 상수는 `객체를 생성하지 않고도 `클래스 이름으로 직접 접근할 수 있습니다.

**정리:**
1. `final` 필드:

- 한 번 값을 지정하면 `변경할 수 없는 필드`.
- `생성자`나 필드 선언에서 초기화 가능.
- `각 객체마다 고정된 값`을 유지해야 할 때 사용.
2. 상수(static final):
- `클래스 차원에서 공유`되는 `변경 불가능한 값`.
- 객체 없이 `클래스 이름`으로 직접 호출 가능.
- 주로 `변경되지 않는 공통된 값`(예: `PI`)을 나타낼 때 사용.