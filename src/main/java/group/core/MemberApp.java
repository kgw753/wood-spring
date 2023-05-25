package group.core;

import group.core.member.Grade;
import group.core.member.Member;
import group.core.member.MemberService;
import group.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService() ;
        Member member = new Member(1L, "Wood", Grade.VIP);
        memberService.join(member);

        Member foundMember = memberService.findMember(1L);
        System.out.println("new member : " + member.getName());
        System.out.println("find member : " + foundMember.getName());
    }
}
