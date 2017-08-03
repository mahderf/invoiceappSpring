package basicinvoiceapp.invoiceapp.repositories;

import basicinvoiceapp.invoiceapp.invoiceControllers.Invoiceapp;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Invoiceapp,Long>{

}

