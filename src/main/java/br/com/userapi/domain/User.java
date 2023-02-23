package br.com.userapi.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter // anotação Lombok para criação de get e set
@AllArgsConstructor // anotação Lombok para criação dos construtores
@NoArgsConstructor // anotação Lombok para criação dos construtores
@EqualsAndHashCode(onlyExplicitlyIncluded = true) //anotação Lombok para criação do equals e hashcode
@Entity(name="TB_USER") //anotação para criação de entitade de banco de dados
public class User {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private double hourlyPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
