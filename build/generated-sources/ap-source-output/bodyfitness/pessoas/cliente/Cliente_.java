package bodyfitness.pessoas.cliente;

import bodyfitness.administracao.Pagamento;
import bodyfitness.pessoas.cliente.caracteristicas.corporal.CondicionamentoFisico;
import bodyfitness.pessoas.generico.Pessoa_;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T13:28:20")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Pessoa_ {

    public static volatile ListAttribute<Cliente, Pagamento> pagamentos;
    public static volatile SingularAttribute<Cliente, String> situacaoFinanceira;
    public static volatile SingularAttribute<Cliente, CondicionamentoFisico> condicionamentoFisico;

}