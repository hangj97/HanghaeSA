package sa.domain;

public class Taxi extends PublicTransport {
    private String destination;
    private long distanceAt; // 목적지까지 거리
    private long distancePerFee; // 거리당 요금
    private long basedDistance; // 기본 거리
    private long basedFee; // 기본요금
    private long extraFee; // 추가요금
    private long payFee; // 지불금액
    private long accumulatedFee; // 누적금액

    public Taxi() {
        super();
        this.setMaxPassenger(4);
        this.setStatus("일반");
        this.setBasedDistance(1);
        this.setBasedFee(3000);
        this.setPayFee(0);
        this.setDistancePerFee(1000);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public long getDistanceAt() {
        return distanceAt;
    }

    public void setDistanceAt(long distanceAt) {
        this.distanceAt = distanceAt;
    }

    public long getDistancePerFee() {
        return distancePerFee;
    }

    public void setDistancePerFee(long distancePerFee) {
        this.distancePerFee = distancePerFee;
    }

    public long getBasedDistance() {
        return basedDistance;
    }

    public void setBasedDistance(long basedDistance) {
        this.basedDistance = basedDistance;
    }

    public long getBasedFee() {
        return basedFee;
    }

    public void setBasedFee(long basedFee) {
        this.basedFee = basedFee;
    }

    public long getExtraFee() {
        return extraFee;
    }

    public void setExtraFee(long extraFee) {
        this.extraFee = extraFee;
    }

    public long getPayFee() {
        return payFee;
    }

    public void setPayFee(long payFee) {
        this.payFee = payFee;
    }

    public long getAccumulatedFee() {
        return accumulatedFee;
    }

    public void setAccumulatedFee(long accumulatedFee) {
        this.accumulatedFee = accumulatedFee;
    }
}