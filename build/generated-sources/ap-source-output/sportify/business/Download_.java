package sportify.business;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sportify.business.User;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-01-14T14:14:01")
@StaticMetamodel(Download.class)
public class Download_ { 

    public static volatile SingularAttribute<Download, String> productCode;
    public static volatile SingularAttribute<Download, Date> downloadDate;
    public static volatile SingularAttribute<Download, Long> downloadId;
    public static volatile SingularAttribute<Download, User> user;

}