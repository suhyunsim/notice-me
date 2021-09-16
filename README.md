# notice-me `발ㅈΓ국 남겨요 @~~`

> 21.09.23(목) 에프팀 해커톤 프로젝트

* JPA와 DynamoDB를 활용한 CRUD 게시판 만들기
    * 싸이월드 방명록과 비슷한 형태의 방명록 게시판
    * 익명의 유저가 방명록을 남길 수 있고 해당 방명록에 댓글을 추가할 수 있음

<br>

<p align="center">

<!-- ![Build Status](https://travis-ci.com/SimLeeTag/photo-tag-backend.svg?branch=deploy)](https://travis-ci.com/SimLeeTag/photo-tag-backend) -->
![last commit](https://img.shields.io/github/last-commit/suhyunsim/notice-me?color=5833C1)
![most language](https://img.shields.io/github/languages/top/suhyunsim/notice-me)
<img src="https://img.shields.io/badge/spring_boot-v2.5.4-green?logo=springboot"  alt="spring-boot" />

<!-- <img src="https://img.shields.io/badge/mysql-v8.0.26-blue?logo=mysql" alt="mysql"/> -->

</p>

<br>

---

# 🛠 기술 스택

## BackEnd
* Java 11
* Spring Boot
* Spring Data JPA
* Spring Data DynamoDB
* JUnit5

## Data
* H2
* DynamoDB

## Infra
* AWS EC2
* Jenkins

<br>

---

<br>

# 📢 컨벤션
## Commit
>  Reference: http://karma-runner.github.io/1.0/dev/git-commit-msg.html

| Type | Contents |
|--|--|
|feat| new feature for the user, not a new feature for build script
|fix| bug fix for the user, not a fix to a build script
|docs| changes to the documentation
|refactor| refactoring production code, eg. renaming a variable
|style| formatting, missing semi colons, etc; no production code change
|test| adding missing tests, refactoring tests; no production code change)
|chore| updating grunt tasks etc; no production code change

- Example

    ```
    refactor: Refactor subsystem X for readability 

    {body...}

    Issue #1 or Resolves #1 // reference issues
    ```

## Branch - Git Flow
- default branch : `dev`
- `main`: production-ready state
- `dev`: latest delivered development changes for the next release
- `feat`: develop new features for the upcoming or a distant future release
- `deploy`: support preparation of a new production release
- `hotfix`: act immediately upon an undesired state of a live production version
- `{feat}/{feature}`
- Example

    ```
    feat/create-note
    ```
