package br.com.springkafka.dao.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa_juridica extends  Cliente{

    private String cnpj, razao_social, porte, dt_abertura_emp;

    // Construtor para Cadastrar Cliente Pessoa J�ridica
    public Pessoa_juridica(String telefone01, String telefone02, String tp_cliente, String email, String senha,
                           String cnpj, String razao_social, String porte, String dt_abertura_emp) {
        super(telefone01, telefone02, tp_cliente, email, senha);
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.porte = porte;
        this.dt_abertura_emp = dt_abertura_emp;
    }

    // Construtor para buscar Cliente Pessoa J�ridica


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getDt_abertura_emp() {
        return dt_abertura_emp;
    }

    public void setDt_abertura_emp(String dt_abertura_emp) {
        this.dt_abertura_emp = dt_abertura_emp;
    }


}
