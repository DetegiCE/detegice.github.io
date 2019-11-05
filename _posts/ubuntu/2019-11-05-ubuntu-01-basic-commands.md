---
title: "[Ubuntu] 01. 기본 명령어"
date: 2019-11-05
categories: ubuntu
---

리눅스를 다룰 서버를 만드는 내용은 [여기](https://detegice.github.io/aws-01-create-aws-account/)를 참고하시면 됩니다.

이제 자신의 서버에 접속하여 리눅스에서 기본적으로 사용되는 명령어들을 배워보겠습니다.

모든 명령어는 ``man 명령어이름``을 통해 매뉴얼을 확인하실 수 있습니다.

## ls

LiSt의 약자로 해당 디렉토리에 있는 파일의 목록을 보여줍니다.

``ls`` : 현재 디렉토리의 파일 목록

``ls /etc`` : /etc 디렉토리의 파일 목록

``ls -a`` : 현재 디렉토리의 숨김 파일을 포함한 파일 목록

``ls -l`` : 현재 디렉토리의 파일 목록을 자세하게 보여줌

``ls *.txt`` : 확장자가 txt인 파일 목록을 보여줌

## cd

Change Directory의 약자로 디렉토리를 이동하는 명령어입니다.

``cd`` : 현재 사용자의 홈 디렉토리로 이동

``cd ~ubuntu`` : ubuntu 사용자의 홈 디렉토리로 이동

``cd ..`` : 상위 디렉토리로 이동

``cd /etc/python`` : /etc/python 디렉토리로 이동 (절대경로)

``cd ../a`` : 상위 디렉토리의 a 폴더로 이동 (상대경로)

## pwd

Print Working Directory의 약자로 현재 작업중인 디렉토리를 표시

## rm

ReMove의 약자로 특정 파일이나 폴더를 삭제 (단, 해당 파일이나 폴더에 대한 소유 권한 필요)

``rm abc.txt`` : abc.txt를 삭제 (내부적으로 rm -f 로 연결됨)

``rm -i abc.txt`` : 정말로 삭제할 것인지 확인하는 안내문구를 띄움

``rm -f abc.txt`` : 강제로 삭제 (Force)

``rm -r def`` : def라는 디렉토리와 그 하위에 있는 모든 파일/폴더를 삭제 (Recursive)

## cp

CoPy의 약자로 특정 파일이나 폴더를 복사한다 (단, 해당 파일이나 폴더의 읽기 권한 필요)

``cp abc.txt cba.txt`` : abc.txt를 cba.txt라는 이름으로 바꿔서 복사

``cp -r abc cba`` : abc라는 디렉토리를 cba라는 이름의 디렉토리로 복사

## touch

크기가 0인 새로운 파일을 생성하거나, 파일이 존재할 경우 최종 수정 시간을 변경

ex) ``touch abc.txt``

## mv

MoVe의 약자로 파일이나 폴더의 이름을 변경하거나 다른 디렉토리로 이동

``mv abc.txt /etc/python`` : abc.txt라는 파일을 /etc/python으로 이동

``mv a.txt b.txt c.txt d`` : a.txt, b.txt, c.txt라는 파일을 d 디렉토리로 이동

``mv abc.txt def.txt`` : abc.txt라는 파일을 def.txt로 이름 변경

## mkdir

MaKe DIRectory의 약자로 새로운 폴더를 생성

``mkdir abc`` : 현재 디렉토리에 abc라는 폴더 생성

## rmdir

ReMove DIRectory의 약자로 폴더를 삭제

``rmdir abc`` : 현재 디렉토리의 abc 디렉토리를 삭제 (단, abc 디렉토리 아래에 파일이 있는 경우 오류)

``rmdir -r abc`` : 현재 디렉토리에 있는 abc 디렉토리와 그 하위 요소들을 전부삭제

