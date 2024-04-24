package id.ac.ui.cs.advprog.balance.model;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Balance {
    private UUID id;
    private Double amount;

    public Balance(){
        this.id = UUID.randomUUID();
        this.amount = 0.0;
    }
    public Balance(Double amount) {
        this.id = UUID.randomUUID();
        this.amount = amount;
    }
}