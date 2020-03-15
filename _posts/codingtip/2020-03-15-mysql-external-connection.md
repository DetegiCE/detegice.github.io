---
title: "MySQL(MariaDB) 외부 접속 허용 방법"
date: 2020-03-15 17:37:00
categories: mysql ubuntu
---

내 서버(Ubuntu 18.04)에 설치된 MariaDB 10.4를 기준으로 한다.

MariaDB 설정파일은 ``/etc/mysql/mariadb.conf.d/50-server.cnf``에 존재한다.

(MySQL은 ``/etc/mysql/mysql.conf.d/mysqld.cnf``)

설정파일에 ``bind-address``라 써진 부분이 있는데 주석 처리 해준다.


재시작

```
service mysql restart
```

이제 DB에 접속하여 mysql로 들어간다

```
use mysql;
```

user 테이블에 유저의 정보가 들어있는데 그 중 Host와 User만 건들여준다.

```
insert into user (Host, User) values ('%','ID');
```

``%``는 아무 IP나 허용한다는 뜻이고, ``ID``에는 원하는 아이디를 적는다.

이제 권한 부여를 해야한다.

```
grant all privileges on *.* to 'ID'@'%' identified by 'PASSWORD';
```

``ID``에는 위에서 쓴 ID를 적고, ``PASSWORD``에는 설정할 비밀번호를 넣어준다.

마지막으로 권한 설정 저장을 위해

```
flush privileges;
```

를 해준다.

끝

[참고](https://programist.tistory.com/entry/MySQL-MariaDB-%EC%99%B8%EB%B6%80-%EC%A0%91%EC%86%8D-%ED%97%88%EC%9A%A9-%EB%B0%A9%EB%B2%95)
