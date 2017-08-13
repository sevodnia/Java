package com.example.domain.interaction;

import com.example.domain.entity.Profile;
import com.example.domain.entity.ProfileId;
import com.example.domain.interaction.base.UseCase;


public class ProfileUseCase extends UseCase<ProfileId, Profile> {
    @Override
    protected Profile builtUseCase() {


        Profile profile = new Profile();
        profile.setAge(20);
        profile.setName("IGNAT");
        profile.setSurname("DOMEIKO");
        return profile;
    }
}
