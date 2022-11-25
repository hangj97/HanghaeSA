package sa;

import sa.domain.Bus;
import sa.service.BusService;
import sa.service.PublicTransportService;

public class TestBus implements PublicTransportService {

    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        BusService busService = new BusService();

        // 서로 다른 2대의 버스 번호 조회
        System.out.println("bus1, bus2: " + bus1.getId() + ":" + bus2.getId());

        busService.boardPassenger(bus1, 2);
        busService.printBusInfo(bus1);

        busService.checkGas(bus1, -50);
        busService.printBusInfo(bus1);

        busService.changeStatus(bus1, "차고지 행");
        busService.checkGas(bus1, 10);
        busService.printBusInfo(bus1);

        busService.changeStatus(bus1, "운행중");
        busService.boardPassenger(bus1, 45);
        System.out.println();

        busService.boardPassenger(bus1, 5);
        busService.printBusInfo(bus1);
        System.out.println();

        bus1.setGas(bus1.getGas() - 55);
        busService.printBusInfo(bus1);
        busService.checkGas(bus1, 0);

    }

}