package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // quero que leve até a execução
@Target(ElementType.TYPE)// para as classes e interfaces
public @interface Tabela {
	
	String nome();
}
