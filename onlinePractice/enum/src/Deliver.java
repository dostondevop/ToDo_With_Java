import java.util.UUID;

public class Deliver {
    private UUID id;
    private DeliverType deliverType;
    private String deliverer;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public DeliverType getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(DeliverType deliverType) {
        this.deliverType = deliverType;
    }

    public String getDeliverer() {
        return deliverer;
    }

    public void setDeliverer(String deliverer) {
        this.deliverer = deliverer;
    }
}
