package bodyfitness.aula;

import bodyfitness.aula.CategoriaDeAula;
import bodyfitness.pessoas.cliente.Cliente;
import bodyfitness.pessoas.funcionarios.Funcionario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-26T20:41:14")
@StaticMetamodel(Aula.class)
public class Aula_ { 

    public static volatile SingularAttribute<Aula, Date> horaDeInicio;
    public static volatile SingularAttribute<Aula, Funcionario> professor;
    public static volatile SingularAttribute<Aula, CategoriaDeAula> categoria;
    public static volatile SingularAttribute<Aula, Date> horaDeTermino;
    public static volatile SingularAttribute<Aula, Long> id;
    public static volatile ListAttribute<Aula, Cliente> clientes;
    public static volatile SingularAttribute<Aula, Date> dia;

}