package com.kodilla.good.patterns.fly;

import java.util.HashSet;

public class FlyList {

    public static HashSet<Fly> getList() {
        final HashSet<Fly> flyList = new HashSet<>();
        flyList.add(new Fly("Warszawa","","Kraków"));
        flyList.add(new Fly("Warszawa","Toruń","Gdańsk"));
        flyList.add(new Fly("Kraków","","Wrocław"));
        flyList.add(new Fly("Wrocław","Toruń","Szczecin"));
        flyList.add(new Fly("Warszawa","","Radom"));
        flyList.add(new Fly("Gdańsk","","Olsztyn"));

        return new HashSet<Fly>(flyList);
   }
}
