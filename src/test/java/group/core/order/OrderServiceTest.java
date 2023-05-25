package group.core.order;

import group.core.AppConfig;
import group.core.member.Grade;
import group.core.member.Member;
import group.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "Wood", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "Macbook", 30000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(3000);

    }
}
