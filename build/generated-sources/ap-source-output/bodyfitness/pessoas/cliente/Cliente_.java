package bodyfitness.pessoas.cliente;

import bodyfitness.pessoas.cliente.caracteristicas.corporal.CondicionamentoFisico;
import bodyfitness.pessoas.generico.Pessoa_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-25T20:48:04")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Pessoa_ {

    public static volatile SingularAttribute<Cliente, String> situacaoFinanceira;
    public static volatile SingularAttribute<Cliente, CondicionamentoFisico> condicionamentoFisico;

}