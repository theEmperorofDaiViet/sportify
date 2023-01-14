package sportify.business;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sportify.business.Product;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-01-14T14:14:01")
@StaticMetamodel(LineItem.class)
public class LineItem_ { 

    public static volatile SingularAttribute<LineItem, Product> product;
    public static volatile SingularAttribute<LineItem, Integer> quantity;
    public static volatile SingularAttribute<LineItem, Long> lineItemId;

}