---
title: "[Ubuntu] 05. 파일 및 주기(period) 관련 명령어"
date: 2019-11-07
categories: ubuntu
---

# 파일 관련 명령어

리눅스에서 자주 사용하는 압축 확장자는 xz, bz2, gz, zip, Z 등이 있다.

## 파일 압축

### xz

가장 압축률이 뛰어나다

``xz 파일명`` : 기존 파일은 삭제되며, 해당 파일이 압축되어 ``파일명.xz``가 된다. (``abc.txt`` --> ``abc.txt.xz``)

``xz -d 파일명.xz`` : 해당 파일을 압축 해제함. (Decompress)

``xz -l 파일명.xz`` : 압축 파일에 포함된 파일 목록과 압축률 등의 정보 출력 (List)

``xz -k 파일명`` : 기존 파일을 유지한 채 파일 압축 (Keep)

### bzip2

압축 확장자 bz2. 작동 방식은 xz와 유사함. 

``bzip2 파일명``

``bzip2 -d 파일명.bz2``

``bzip2 -k 파일명``

### gzip

압축 확장자 gz. 작동 방식은 xz와 유사함.

``gzip 파일명``

``gzip -d 파일명.gz``

### zip/unzip

Windows OS와 호환

``zip 새파일명.zip 압축할파일명`` : ``압축할파일명``을 ``새파일명.zip``으로 압축

``unzip 압축파일명.zip`` : ``압축파일명.zip``의 압축을 해제

