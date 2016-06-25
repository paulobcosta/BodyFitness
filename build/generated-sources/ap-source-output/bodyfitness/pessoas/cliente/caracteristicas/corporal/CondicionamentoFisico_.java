package bodyfitness.pessoas.cliente.caracteristicas.corporal;

import bodyfitness.pessoas.cliente.caracteristicas.corporal.DobrasCutaneas;
import bodyfitness.pessoas.cliente.caracteristicas.corporal.Indices;
import bodyfitness.pessoas.cliente.caracteristicas.corporal.MembrosInferiores;
import bodyfitness.pessoas.cliente.caracteristicas.corporal.MembrosSuperiores;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-25T13:17:27")
@StaticMetamodel(CondicionamentoFisico.class)
public class CondicionamentoFisico_ { 

    public static volatile SingularAttribute<CondicionamentoFisico, DobrasCutaneas> dobrasCutaneas;
    public static volatile SingularAttribute<CondicionamentoFisico, Indices> composicaoCorporal;
    public static volatile SingularAttribute<CondicionamentoFisico, Long> id;
    public static volatile SingularAttribute<CondicionamentoFisico, MembrosSuperiores> membrosSuperiores;
    public static volatile SingularAttribute<CondicionamentoFisico, MembrosInferiores> membrosInferiores;

}