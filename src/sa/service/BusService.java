package sa.service;

import sa.domain.PublicTransport;
import sa.service.PublicTransportService;

public class BusService implements PublicTransportService {
    // 버스 정보 조회
    public void printBusInfo(PublicTransport publicTransport) {
        System.out.println("버스 id: " + publicTransport.getId());
        System.out.println("요금 확인: " + publicTransport.getFee());
        System.out.println("버스 상태: " + publicTransport.getStatus());
        System.out.println("주유량: " + publicTransport.getGas());
        System.out.println("탑승 승객: " + publicTransport.getCurPassenger());
        System.out.println("남은 좌석: " + publicTransport.getDiffPassenger());
        System.out.println("속도: " + publicTransport.getSpeed());
        System.out.println();
    }
}