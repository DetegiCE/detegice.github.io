---
title: "JAVA 42. Date and Calendar Class"
date: 2019-12-07
categories: java
---

# ``Date`` and ``Calendar`` Class

## ``Date`` Class

``Date`` 클래스를 사용하기 위해서는 ``import java.util.Date;``를 해줘야 함.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
    }
}
```

**출력결과** : ``Sat Dec 07 19:47:21 KST 2019``

* 생성자
  * ``Date()`` : 현재의 날짜와 시간을 저장한 객체 생성
  * ``Date(long)`` : 지정한 UNIX 타임(1970.01.01. 00:00:00 부터 msec)을 저장한 객체 생성
  
* 주요 메소드
  * ``boolean after(Date when)`` : ``when``의 날짜가 현재 날짜 이후면 ``true``, 아니면 ``false``를 반환
  * ``boolean before(Date when)`` : 위 반대
  * ``int compareTo(Date anotherDate)`` : 다른 날짜 객체와 비교하여 음수, 양수, 0의 결과 반환
  * ``long getTime()`` : 지정된 시간의 UNIX 타임 반환
  * ``void setTime(long time)`` : 지정한 UNIX time으로 설정
  
## ``Calendar`` Class

``Calendar`` 클래스는 추상 클래스이기 때문에 직접 객체 생성 불가능

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
```

**출력결과**

```
java.util.GregorianCalendar[time=1575718581725,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=7,DAY_OF_YEAR=341,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=36,SECOND=21,MILLISECOND=725,ZONE_OFFSET=32400000,DST_OFFSET=0]
```

* 주요 상수 (모든 상수는 ``int``형)
  * ``YEAR`` : 현재 연도
  * ``MONTH`` : 현재 월 (1월 = 0)
  * ``DATE`` : 현재 날짜
  * ``WEEK_OF_YEAR`` : 현재 연도의 몇째 주
  * ``WEEK_OF_MONTH`` : 현재 월의 몇째 주
  * ``DAY_OF_YEAR`` : 현재 연도의 날짜
  * ``DAY_OF_MONTH`` : ``DATE``와 동일
  * ``DAY_OF_WEEK`` : 현재 요일 (일요일 = 1, 토요일 = 7)
  * ``HOUR`` : 현재 시간 (12시간 기준)
  * ``HOUR_OF_DAY`` : 현재 시간 (24시간 기준)
  * ``MINUTE`` : 현재 분
  * ``SECOND`` : 현재 초
  
* 주요 메소드
  * ``boolean after(Object when)`` : Date 클래스와 동일
  * ``boolean before(Object when)`` : Date 클래스와 동일
  * ``boolean equals(Object obj)`` : 같은 날짜인지 비교
  * ``static Calendar getInstance()`` : 현재 날짜와 시간 정보를 가진 Calendar 객체 생성
  * ``Date getTime()`` : 현재 객체를 Date 클래스로 변환
  * ``long getTimeInMillis()`` : UNIX 타임으로 변환
  * ``void set(int field, int value)`` : 특정 필드 값을 다른 값으로 설정
  * ``void set(int year, int month, int date)``
  * ``void set(int year, int month, int date, int hour, int minute, int second)``
  * ``void setTime(Date date)``
  * ``void setTimeInMillis(long milis)``

