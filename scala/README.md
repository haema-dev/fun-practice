# scala
https://www.scala-lang.org/

### install
scala 는 JVM 위에서 동작이 가능하다. Java 의 확장기능처럼 사용된다.<br>
sbt 라는 build tool 을 사용하므로 함께 설치해주어야 한다.<br>
https://codechacha.com/ko/install-scala-in-intellij <br>
https://stackoverflow.com/questions/68150696/idea-cannot-re-import-sbt-project <br>

### 2023-03-27
import object<br>
object 를 가져오기 위해서는 스코프 내에서 import 해야만 사용할 수 있다.<br>
<br>
다음에 시도해볼 것 3가지<br>
만약, import 를 전역으로 사용하고 싶다면 3가지 방법을 사용할 수 있다.<br>
1. object 를 package object 또는 trait 안에 위치시킨 후, import 한다.
2. object 를 trait 안에 위치시킨 후, class 로 상속 받아 ``Class.method()`` 형식으로 호출한다.
3. object 를 class 안에 위치시킨 후, 자바처럼 new 를 통해 인스턴스화 한다.<br>
<br>
※ 참고 : https://docs.scala-lang.org/ko/tour/singleton-objects.html <br>