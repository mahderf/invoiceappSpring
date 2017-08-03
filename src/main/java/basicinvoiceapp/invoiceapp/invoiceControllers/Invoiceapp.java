package basicinvoiceapp.invoiceapp.invoiceControllers;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Invoiceapp {

    private String pdsc;
    @NotNull
    @Min(1)
    private long price;
    @NotNull
    @Size(min=2,max=30)
    private String itcd;
    @NotNull
    @Min(1)
    @Id
    private long Id;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }


    public String getPdsc() {
        return pdsc;
    }

    public void setPdsc(String pdsc) {
        this.pdsc = pdsc;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getItcd() {
        return itcd;
    }

    public void setItcd(String itcd) {
        this.itcd = itcd;
    }



}
