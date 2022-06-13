package model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mydb")
@NamedQueries({

})

public class PersonaVO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String nombre;
    private String paterno;
    private String materno;
    private String login;
    private String password;
    private Integer activo;
    private Integer cveGrupo;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getCveGrupo() {
        return cveGrupo;
    }

    public void setCveGrupo(Integer cveGrupo) {
        this.cveGrupo = cveGrupo;
    }
}
