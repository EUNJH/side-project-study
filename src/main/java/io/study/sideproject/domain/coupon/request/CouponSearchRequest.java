package io.study.sideproject.domain.coupon.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.study.sideproject.domain.coupon.entity.CouponStatus;
import io.study.sideproject.domain.coupon.entity.CouponType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CouponSearchRequest {

    private String couponCode;
    private String couponName;
    private CouponType couponType;
    private CouponStatus couponStatus;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    @Builder
    public CouponSearchRequest(String couponCode, String couponName, CouponType couponType, CouponStatus couponStatus, LocalDateTime startAt, LocalDateTime endAt) {
        this.couponCode = couponCode;
        this.couponName = couponName;
        this.couponType = couponType;
        this.couponStatus = couponStatus;
        this.startAt = startAt;
        this.endAt = endAt;
    }
}
