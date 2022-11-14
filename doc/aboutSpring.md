#### # Spring 특징
>+ ##### spring 은 controller 를 만들지 않아도 된다.
>+ ##### properties 파일 은 xml 로 만들어야 한다.
>+ ##### spring 은 framework 이기 때문에 주어진 환경에 맞춰야 한다.

#### # Spring 설치
>+ ##### http://spring.io로 접속
>+ ##### 메뉴 중에서 [PROJECTS] 선택!
>+ ##### [SPRING FRAMEWORK]선택
>+ ##### 나타나는 화면에서 깃허브 아이콘 선택
>+ ##### 화면을 내려서 [Access to Binaries]항목에 있는 [Spring Framework Artifacts]링크를 선택
>+ ##### 나타나는 화면을 내려보면 [Releases]항목이 나타난다. 여기에 명시된 [http://repo.spring.io/release]부분을 복사한다.
>+ ##### 새로운 브라우저 탭을 선택하여 복사한 URL을 붙여넣어 이동한다.
>+ ##### 그리고 다음과 같은 순으로 선택하자!
>+ ##### [org] - [springframework] - [spring] - [4.3.9.RELEASE] 선택
>+ ##### 맨 위에 있는
>+ ##### [spring-framework-4.3.9.RELEASE-dist.zip]를 선택하여 다운 받아 압축을 해제한다.

#### # Spring Core에서 필요한 라이브러리들
>##### - 다운 받은 spring 라이브러리
>>+ ###### spring-beans-4.3.9.RELEASE.jar
>>+ ###### spring-context-4.3.9.RELEASE.jar 
>>+ ###### spring-core-4.3.9.RELEASE.jar
>>+ ###### spring-expression-4.3.9.RELEASE.jar
>##### - apache.org 의 commons 카테고리의
>>+ ###### commons-logging-1.X.X.jar (apache.org로 접속!
>>+ ###### project들 중 commons선택!
>>+ ###### 화면을 아래쪽의 표에서 Logging을 선택한다.
>>+ ###### download메뉴 선택!
>>+ ###### Binaries의
>>+ ###### commons-logging-1.X.X-bin.zip 다운 받고 압축해제)  

#### # eclipse work space 변경
>+ ###### preference -> workspace -> encoding 변경
>+ ###### preference -> server -> runtime environment -> apache 지정
>+ ###### preference -> web -> html javascript jsp -> encoding 변경
>+ ###### file:///C:/study/SpringTest/Util/spring-framework-4.3.9.RELEASE/docs/spring-framework-reference/html/beans.html#beans-factory-metadata
>+ ###### src -> config.xml 작성 한곳에 위 라인 상에 코드 가져다 붙임
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions go here -->

</beans>
```
#### # Spring 관련 용어
>##### - DI ( Dependency Injection )
>>+ ##### 각 class 들 간의 의존성을 정의하는 것! 
>##### - POJO ( Plain Old Java Object )
>>+ ##### 가장 일반적이고 근본적인 Java Object
>##### - spring 환경에서는 jsp 를 기본 지원 하지 않는다.

#### # MyBatis 와 Spring 연동시 필요한 라이브러리
>##### - 위 spring core 에서 언급된 5개 라이브러리
>>+ ###### spring-beans-4.3.9.RELEASE.jar
>>+ ###### spring-context-4.3.9.RELEASE.jar 
>>+ ###### spring-core-4.3.9.RELEASE.jar
>>+ ###### spring-expression-4.3.9.RELEASE.jar
>>+ ###### commons-logging-1.X.X.jar
>##### - apache.org 의 commons 카테고리
>###### :: 하단의 achives 클릭 ( 구버전 )
>>+ ###### commons-dbcp-1.4
>>+ ###### commons-pool-1.6
>##### - mybatis.org
>>+ ###### mybatis-3.x.x
>>+ ###### mybatis-spring-1.x.x
>##### - 다운 받은 spring 라이브러리
>>+ ###### spring-aop-4.3.9.RELEASE
>>+ ###### spring-jdbc-4.3.9.RELEASE
>>+ ###### spring-tx-4.3.9.RELEASE
> ###### .

#### # sevlet vs listener
>>+ ###### servlet 은 request 가 있을때만 실행
>>+ ###### listener 는 항상 실행하며 감지함.