package sa.domain;

public abstract class PublicTransport {
    private long id;
    private long speed;
    private String status;
    private long gas;
    private long fee;
    private long maxPassenger;
    private long curPassenger;
    private static long sequence = 0L;

    public PublicTransport() {
        setId(++sequence);
        this.gas = 100;
        this.speed = 0;
        this.curPassenger = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getGas() {
        return gas;
    }

    public void setGas(long gas) {
        this.gas = gas;
    }

    public long getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(long maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public long getCurPassenger() {
        return curPassenger;
    }

    public void setCurPassenger(long curPassenger) {
        this.curPassenger = curPassenger;
    }

    public long getDiffPassenger() {
        return getMaxPassenger() - getCurPassenger();
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }
}