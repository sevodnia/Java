package com.example.domain.interaction;

import android.util.Log;

import com.example.domain.entity.Girl;
import com.example.domain.interaction.base.UseCaseThis;

import java.util.ArrayList;


/**
 * UseCase, который создает girls
 */

public class GirlsUseCase extends UseCaseThis<ArrayList <Girl>> {
    ArrayList <Girl>  girls;
    @Override
    protected ArrayList <Girl> builtUseCase() {


         girls = new ArrayList<>();


        girls.add(new Girl("Кейт Мосс", "http://www.etoday.ru/uploads/2013/06/21/matchless-kate-moss1.jpg"));
        girls.add(new Girl("Алессандра Амбросио", "http://www.etoday.ru/uploads/2013/05/30/Alessandra-Ambrosio-Terry-Richardson-Harpers-Bazaar-Brazil-04.jpg"));
        girls.add(new Girl("Хилари Рода", "http://www.etoday.ru/uploads/2013/05/27/hilary-rhoda-vogue-shoot6.jpg"));
        girls.add(new Girl("Даутцен Крез", "http://www.etoday.ru/uploads/2013/05/23/doutzen-kroes-terry-richardson_0.jpg"));
        girls.add(new Girl("Лана Дель Рей", "http://omgparty.ru/wp-content/uploads/2012/03/lana-del-rey-01.jpg"));
        girls.add(new Girl("Лана Дель Рей", "http://omgparty.ru/wp-content/uploads/2012/03/lana-del-rey-02.jpg"));
        girls.add(new Girl("Майли Сайрус", "http://www.spletnik.ru/img/2013/08/nastya/2013-08-15-miley.jpg"));
        girls.add(new Girl("ASHLEY SKY", "https://www.portraitsofgirls.com/wp-content/uploads/2014/07/Ashley-Sky-by-Terry-Richardson-3.jpg"));
        girls.add(new Girl("ANOUCHKA ALSIF", "https://www.portraitsofgirls.com/wp-content/uploads/2015/03/Anoushka-Alsif-by-Terry-Richardson-for-Lui-Magazine-3.jpg"));
        girls.add(new Girl("Charlotte Free", "http://3.bp.blogspot.com/-kJCX_w1s894/USNFYC6geEI/AAAAAAAAImU/T-_rCgkLW38/s1600/Charlotte-Free-by-Terry-Richardson-3.jpg"));
        Log.e("AAA",girls.toString());

        return girls;
    }
}
