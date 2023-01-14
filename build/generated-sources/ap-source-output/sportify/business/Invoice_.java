package sportify.business;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sportify.business.LineItem;
import sportify.business.User;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-01-14T14:14:01")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile ListAttribute<Invoice, LineItem> lineItems;
    public static volatile SingularAttribute<Invoice, Long> invoiceNumber;
    public static volatile SingularAttribute<Invoice, Boolean> isProcessed;
    public static volatile SingularAttribute<Invoice, Date> invoiceDate;
    public static volatile SingularAttribute<Invoice, User> user;

}