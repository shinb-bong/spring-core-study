package hello.core.member;

/**
 * 실제 서비스가 해야할 역할을 명시
 * 여기서는 회원가입, 회원조회
 */
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberID);

}
