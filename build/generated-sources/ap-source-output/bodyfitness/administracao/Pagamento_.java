package bodyfitness.administracao;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-25T13:17:27")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Double> valor;
    public static volatile SingularAttribute<Pagamento, Boolean> quitado;
    public static volatile SingularAttribute<Pagamento, Long> id;
    public static volatile SingularAttribute<Pagamento, Date> vencimento;

}