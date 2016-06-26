package bodyfitness.equipamentos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-26T00:39:47")
@StaticMetamodel(Equipamento.class)
public class Equipamento_ { 

    public static volatile SingularAttribute<Equipamento, String> pesoMinimo;
    public static volatile SingularAttribute<Equipamento, String> pesoMaximo;
    public static volatile SingularAttribute<Equipamento, Date> dataDaUltimaManutencao;
    public static volatile SingularAttribute<Equipamento, String> nome;
    public static volatile SingularAttribute<Equipamento, Long> id;
    public static volatile SingularAttribute<Equipamento, Boolean> habilitado;
    public static volatile SingularAttribute<Equipamento, Date> dataDaProximaManutencao;

}