package jefr.pokemon.backend.domain.superclasses;

import jefr.pokemon.backend.domain.Type;

public class BaseMove {
    protected Type type1;
    protected Type type2;

    protected int damage;
    protected int percentage;

    public float getPercentageFloat(){
        return (float) percentage / 100;
    }
}
