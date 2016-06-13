package bodyfitness.pessoas.funcionarios;

import bodyfitness.pessoas.caracteristicas.Cargo;
import bodyfitness.pessoas.generico.Pessoa_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-13T13:28:20")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ extends Pessoa_ {

    public static volatile SingularAttribute<Funcionario, String> senha;
    public static volatile SingularAttribute<Funcionario, Double> salario;
    public static volatile SingularAttribute<Funcionario, String> usuario;
    public static volatile SingularAttribute<Funcionario, String> turno;
    public static volatile SingularAttribute<Funcionario, Cargo> cargo;
    public static volatile SingularAttribute<Funcionario, String> permissao;

}