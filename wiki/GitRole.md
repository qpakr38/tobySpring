>># Git Commit Message 규칙
>>
>>- FEATURE : 새로운 기능의 추가
>>- BUG : 버그 수정
>>- FIX : 비지니스 로직 변경
>>- DOCS: 문서 수정
>>- STYLE: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)
>>- REFACTOR: 리펙토링
>>- TEST: 테스트 코트, 리펙토링 테스트 코드 추가

>># Git Commit 규칙
>>
>>- 각 브런치의 의미
>>    - master :배포Branch
>>    - develop :개발Branch
>>    - feature :기능 구현 및 개선Branch
>>    - fix :버그 수정의Branch
>>- master branch를 제외한 모든 브런치는 develop으로 merge 한다.
>>- develop branch는 master branch로 merge한다.