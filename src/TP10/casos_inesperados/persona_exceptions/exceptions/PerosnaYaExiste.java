package TP10.casos_inesperados.persona_exceptions.exceptions;

import TP10.casos_inesperados.persona_exceptions.PersonaException;

public class PerosnaYaExiste extends PersonaException {

    public PerosnaYaExiste(String message) {
        super(message);
    }
}
