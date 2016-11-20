package com.pablo;

import com.pablo.conversores.ConversorUsuarios;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by colo on 20/11/16.
 */

@Configuration
public class Configuracion {
    @Bean(name="ConversorUsuario")
    public ConversorUsuarios getConversorUsuario() {
        return new ConversorUsuarios();
    }
}
