package group.core.discount;

import group.core.member.Grade;
import group.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? price * discountPercent / 100 : 0;
    }
}
