package deco;

import boissons.Boisson;

public class Chantilly extends DecoratorBoisson{


    public Chantilly(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Chantilly";
    }

    @Override
    public double cout() {
        return 1.2 + boisson.cout();
    }
}
