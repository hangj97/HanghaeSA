package sa.service;

import sa.domain.Taxi;
import sa.service.PublicTransportService;

public class TaxiService implements PublicTransportService {
    public long pay(Taxi taxi) {
        long pay = taxi.getBasedFee();
        pay = pay + ((taxi.getDistanceAt() - taxi.getBasedDistance()) * taxi.getDistancePerFee());

        return pay;
    }

    public void fee(Taxi taxi, long fee) {
        taxi.setAccumulatedFee(taxi.getAccumulatedFee() + fee);
    }

}