package com.mechanicshop.challenge.enuns;

public enum PerfilEnum {
    ROLE_NULL(0),
	ROLE_INTEGRACAO(1);


    PerfilEnum(int i) {
    }

    public static PerfilEnum fromInteger(int x) {
        switch(x) {
          
            case 1:
                return PerfilEnum.ROLE_INTEGRACAO;
        }
        return null;
    }
}
