package com.doschechko.matylionak.wcguide.anekdot;

import com.doschechko.matylionak.domain.interaction.UseCaseGetAndekdot;
import com.doschechko.matylionak.wcguide.base.BaseFragmentViewModel;



public class Activity_AnekdotViewModel  implements BaseFragmentViewModel{
   MyAdaptor adaptor = new MyAdaptor();

    @Override
    public void init() {

     UseCaseGetAndekdot useCaseGetAndekdot = new UseCaseGetAndekdot();
     adaptor.setList(useCaseGetAndekdot.getList());

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void release() {

    }
}
