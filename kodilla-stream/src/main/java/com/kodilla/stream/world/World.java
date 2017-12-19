package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class World {

//    private Continent continent;
    private final List<Continent> world = new ArrayList<>();

    public void addWorld(Continent continent) {
        world.add(continent);
    }

    public List<Continent> getWorld(){
        return new ArrayList<Continent>(world);
    }
}

 /*   public List<Continent> getWorld() {
        world.add(continent);
        return world;
    }*/



