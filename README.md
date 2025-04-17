# kotlin-racingcar

## 구현할 기능 목록
1. 인풋으로 첫번째 줄에 자동차 이름들(","로 구분 및 5글자 이하) 두번째 줄에 시도할 횟수가 들어온다.
2. 시도할 횟수에서 각 자동차는 이동 또는 정지를 할 수 있다.(전진 조건은 0~9 중 무작위 숫자가 4이상일 때)
3. 각 횟수 별 자동차들의 이름과 현재 칸을 표출한다. 이후 개행(예시, pobi : -)
4. 경주 완료 이후, 우승자를 출력한다.(다중일 시, ","로 구분 예시, 최종 우승자 : pobi, jun)
5. 예외 발생 시, 그냥 Exception이 아닌, IllegalArgumentException 또는 IllegalStateException등 과 같이, 명확하게 처리해야 한다.
6. 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후, 그 부분 부터 입력을 다시 받는다.

## 참고 사항
1. 커밋 메시지는 Angular JS Git Commit Message Conventions를 참고하여 작성
2. 기 추가된 라이브러리 외 다른 라이브러리 사용 금지
3. Kotlin Coding conventions를 원칙으로 코딩
4. indent depth는 3이 넘지 않도록 구현(while 안에 if가 있으면 2임)
5. 한 함수는 한가지 일만 하도록 최대한 작게 만들기(15라인 넘지 않게)
6. JUnit 5 및 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 확인하는 테스트 코드 작성
7. 가능한 else를 쓰지 않는다.
8. 도메인 로직에 단위 테스트를 구현해야 한다.
9. 빌드 그레들 수정 금지