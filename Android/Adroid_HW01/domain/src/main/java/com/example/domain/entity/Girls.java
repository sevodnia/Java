package com.example.domain.entity;

import java.util.HashMap;

/**
 * Created by Umbra on 13.08.17.
 */

public class Girls {
    HashMap<String, String> babies;

    public HashMap<String, String> getBabies() {
        return babies;
    }

    public Girls() {
        this.babies = new HashMap<>();

        babies.put("Кейт Мосс", "http://www.etoday.ru/uploads/2013/06/21/matchless-kate-moss1.jpg");
        babies.put("Алессандра Амбросио", "http://www.etoday.ru/uploads/2013/05/30/Alessandra-Ambrosio-Terry-Richardson-Harpers-Bazaar-Brazil-04.jpg");
        babies.put("Хилари Рода", "http://www.etoday.ru/uploads/2013/05/27/hilary-rhoda-vogue-shoot6.jpg");
        babies.put("Даутцен Крез", "http://www.etoday.ru/uploads/2013/05/23/doutzen-kroes-terry-richardson_0.jpg");
        babies.put("Лана Дель Рей", "http://omgparty.ru/wp-content/uploads/2012/03/lana-del-rey-01.jpg");
        babies.put("Лана Дель Рей", "http://omgparty.ru/wp-content/uploads/2012/03/lana-del-rey-02.jpg");
        babies.put("Майли Сайрус", "http://www.spletnik.ru/img/2013/08/nastya/2013-08-15-miley.jpg");


    }
}
