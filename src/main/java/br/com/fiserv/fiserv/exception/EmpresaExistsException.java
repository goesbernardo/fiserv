package br.com.fiserv.fiserv.exception;

import javax.persistence.EntityExistsException;

public class EmpresaExistsException extends EntityExistsException {

    public EmpresaExistsException(String nome){
        super(String.format("este nome já existe na base de dados tente outro", nome));
    }
}
