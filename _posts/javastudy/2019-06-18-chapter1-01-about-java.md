---
title: "JAVA 01. About JAVA"
date: 2019-06-18
categories: JAVA
---

{% include java.md %}

# About JAVA

## Birth of JAVA
- 1991년 그린 프로젝트
  - 선마이크로시스템즈의 제임스 고슬링에 의하여 시작
  - 1995년에 발표
- 목적
  - 플랫폼 호환성 문제 해결
  - 플랫폼 독립적 언어 개발
  - 메모리 사용량이 적고 다양한 플랫폼을 가지는 제품에 적용

## WORA (Write Once Run Anywhere)
- 한번 작성된 코드는 모든 플랫폼에서 바로 실행됨
- 바이트코드 (byte code)
  - 자바 소스를 컴파일한 목적 코드
  - CPU 종속적이지 않은 중립 코드
  - JVM(Java Virtual Machine : 자바 바이트코드를 실행하는 SW)에 의해 해석되고 실행
  
## JAVA Install

* [자바 설치하기](https://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)

* 환경변수 설정하기
  * 내PC 우클릭 > 설정 > 고급 시스템 설정 > 고급 > 환경변수
  * 시스템변수 새로만들기 > 변수이름 : JAVA_HOME, 변수값 : 자바설치경로(C:\Program Files\Java\jdk버전) > 확인
  * 사용자변수 > Path 선택 > 편집 > 새로만들기 > %JAVA_HOME%\bin
  
* 자바 설치 확인
  * 윈도우+R > cmd > 확인 > *java -version* 입력 > 자바 버전이 뜨면 완료

## IDE : Eclipse

* [이클립스 설치하기](https://eclipse.org)

1. File > New > Java Project > 프로젝트 이름 지정 > Finish
2. 생성한 프로젝트 우클릭 > New > Class > 클래스 이름 입력 > Finish
3. 코드 작성
4. 컴파일&실행 (F11)

{% include support.md %}
