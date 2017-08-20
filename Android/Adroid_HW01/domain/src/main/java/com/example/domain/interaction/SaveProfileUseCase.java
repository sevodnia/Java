package com.example.domain.interaction;

import com.doschechko.matylionak.data.entity.Profile;
import com.doschechko.matylionak.data.net.RestService;
import com.example.domain.entity.ProfileId;
import com.example.domain.entity.ProfileModel;
import com.example.domain.interaction.base.UseCase;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;


public class SaveProfileUseCase extends UseCase<ProfileModel, Void> {
    @Override
    protected Observable<Void> builtUseCase(ProfileModel param) {


        Profile profileData = new Profile();
        profileData.setName(param.getName());
        profileData.setSurname(param.getSurname());
        profileData.setAge(param.getAge());


        return RestService.getInstance().saveProfile(profileData);

    }
}
