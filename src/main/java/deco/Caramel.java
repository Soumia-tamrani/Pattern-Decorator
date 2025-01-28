package deco;

import boissons.Boisson;

public class Caramel extends DecoratorBoisson{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Caramel";
    }
}
