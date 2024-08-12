# 숫자야구게임

## 피드백 내용

- TDD // 가장 작은 단위의 테스트부터 진행
- 리팩토링

추가로 시도해볼 것
- 객체지향 // 클래스 단위

Ball이 위치값을 가지고 있어야 하는지 이해는 안 된다.
Game이 각 공의 위치를 관리하는거 아닌가?
공은 각자 본인의 값만 관리하고.




## 기능 요구 사항

기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

- [ ] 임의의 수 3개를 지정하는 기능
- [ ] 사용자의 입력을 받는 기능
- [ ] 스트라이크, 볼의 개수를 계산하는 기능
- [ ] 스트라이크, 볼을 판별하는 기능
- [ ] 사용자의 결과를 출력하는 기능
- [ ] 게임을 다시 시작하거나 종료하는 기능

## 커밋 요구사항

커밋은 아래 단위로 기록한다.

- feat (feature)
- fix (bug fix)
- docs (documentation)
- style (formatting, missing semi colons, …)
- refactor
- test (when adding missing tests)
- chore (maintain)

---


## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
