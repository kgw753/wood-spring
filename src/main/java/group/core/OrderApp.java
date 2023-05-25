package group.core;

import group.core.member.Grade;
import group.core.member.Member;
import group.core.member.MemberService;
import group.core.order.Order;
import group.core.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "Wood", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "Mac", 50000);

        System.out.println("order : " + order);

    }
}
