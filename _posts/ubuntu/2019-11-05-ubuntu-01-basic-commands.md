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

ReMove의 약자로 특정 파일이나 폴더를 삭제

``rm abc.txt`` : abc.txt를 삭제 (내부적으로 rm -f 로 연결됨)

``rm -i abc.txt`` : 정말로 삭제할 것인지 확인하는 안내문구를 띄움

``rm -f abc.txt`` : 강제로 삭제 (Force)

``rm -r def`` : def라는 디렉토리와 그 하위에 있는 모든 파일/폴더를 삭제 (Recursive)
