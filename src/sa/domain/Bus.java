package sa.domain;

public class Bus extends PublicTransport {
    private long fee;


    public Bus() {
        super();
        this.setMaxPassenger(30);
        this.setStatus("운행");
    }

}
