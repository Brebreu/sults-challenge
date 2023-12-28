package com.sultschallenge.springbootbackend.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String empresa;
    private String email;
    private String celular;

    @Override
	public String toString() {
		return "Account [codigo=" + id + ", nome=" + name + ", empresa=" + empresa + ", email=" + email + "celular=" +celular
				+ "]";
	}

    @Override
	public int hashCode() {
		return Objects.hash(id, name, empresa, email, celular);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(empresa,other.empresa)
				&& Objects.equals(email, other.email) && Objects.equals(celular, other.celular) ;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
