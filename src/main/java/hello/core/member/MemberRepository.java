package hello.core.member;

public interface MemberRepository {

    // 어떤 "역할"을 수행 할 건가
    // 이번 프로젝트에서는 저장과 찾는 기능만 할것이다.

    void save(Member member);

    Member findById(Long memberId);
}
