package gr.pf.team2.constructionwebapp.domain;

import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Admin" , uniqueConstraints = {@UniqueConstraint(columnNames = {"Email"})})
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Admin_id")
    private Long id;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Password")
    private String password;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("id=").append(id);
        sb.append(",Email='").append(email).append('\'');
        sb.append(",Password='").append(password).append('\'');

        sb.append('}');
        return sb.toString();
    }

}