package sa;


import sa.domain.Taxi;
import sa.service.TaxiService;

public class TestTaxi {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        TaxiService taxiService = new TaxiService();

        System.out.println("taxi1:taxi2 : " + taxi1.getId() + ":" + taxi2.getId());
        System.out.println("주유량: " + taxi1.getGas());
        System.out.println("상태: " + taxi1.getStatus());
        System.out.println();

        taxiService.boardPassenger(taxi1, 2);
        taxi1.setDestination("서울역");
        taxi1.setDistanceAt(2);
        taxi1.setStatus("운행 중");

        System.out.println("탑승 승객 수: " + taxi1.getCurPassenger());
        System.out.println("잔여 좌석 수: " + taxi1.getDiffPassenger());
        System.out.println("기본 요금 확인: " + taxi1.getBasedFee());
        System.out.println("목적지: " + taxi1.getDestination());
        System.out.println("목적지까지의 거리: " + taxi1.getDistanceAt() + "km");
        System.out.println("지불할 요금: " + taxiService.pay(taxi1));
        System.out.println("상태: " + taxi1.getStatus());
        System.out.println();

        taxi1.setGas(taxi1.getGas() - 80);
        taxi1.setAccumulatedFee(4000);
        taxiService.boardPassenger(taxi1, 5);
        System.out.println();

        taxiService.boardPassenger(taxi1, 3);
        taxi1.setDestination("구로디지털단지역");
        taxi1.setDistanceAt(12);

        System.out.println("탑승 승객 수: " + taxi1.getCurPassenger());
        System.out.println("잔여 좌석 수: " + taxi1.getDiffPassenger());
        System.out.println("기본 요금 확인: " + taxi1.getBasedFee());
        System.out.println("목적지: " + taxi1.getDestination());
        System.out.println("목적지까지의 거리: " + taxi1.getDistanceAt() + "km");
        System.out.println("지불할 요금: " + taxiService.pay(taxi1));
        System.out.println();

        taxi1.setGas(taxi1.getGas() - 20);
        taxi1.setAccumulatedFee(taxi1.getAccumulatedFee() + 14000);
        taxi1.setStatus("운행불가");

        System.out.println("주유량: " + taxi1.getGas());
        System.out.println("상태: " + taxi1.getStatus());
        System.out.println("누적 요금: " + taxi1.getAccumulatedFee());
        taxiService.checkGas(taxi1, taxi1.getGas());
    }
}