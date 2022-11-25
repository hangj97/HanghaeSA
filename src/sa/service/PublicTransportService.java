package sa.service;

import sa.domain.PublicTransport;

public interface PublicTransportService {

    // 상태 변경
    default void changeStatus(PublicTransport publicTransport, String s) {
        publicTransport.setStatus(s);
    }

    // 속도 변경
    default void changeSpeed(PublicTransport publicTransport, long speed) {
        if (publicTransport.getGas() <= 10) {
            System.out.println("주유가 필요합니다.");
            return;
        }

        publicTransport.setSpeed(speed);
    }

    // 승객 탑승
    default void boardPassenger(PublicTransport publicTransport, long p) {
        if (publicTransport.getMaxPassenger() < publicTransport.getCurPassenger() + p) {
            System.out.println("탑승 인원 초과로 탑승 불가입니다.");
            publicTransport.setCurPassenger(0);
            return;
        }

        publicTransport.setCurPassenger(publicTransport.getCurPassenger() + p);
        publicTransport.setFee(p * 1000);
    }

    // 주유 및 상태 확인
    default void checkGas(PublicTransport publicTransport, long g) {

        if (publicTransport.getGas() + g < 10) {
            publicTransport.setStatus("차고지 행");
            System.out.println("주유가 필요합니다.");
        }

        publicTransport.setGas(publicTransport.getGas() + g);
    }

}