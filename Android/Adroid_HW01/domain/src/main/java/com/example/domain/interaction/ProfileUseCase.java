package com.example.domain.interaction;

        import com.doschechko.matylionak.data.entity.Profile;
        import com.doschechko.matylionak.data.net.RestService;
        import com.example.domain.entity.ProfileModel;
        import com.example.domain.entity.ProfileId;
        import com.example.domain.interaction.base.UseCase;

        import java.util.List;
        import java.util.concurrent.TimeUnit;

        import io.reactivex.Observable;
        import io.reactivex.annotations.NonNull;
        import io.reactivex.functions.Function;


public class ProfileUseCase extends UseCase<ProfileId, ProfileModel> {
    @Override
    protected Observable<ProfileModel> builtUseCase(ProfileId param) {


        return RestService.getInstance().getProfiles()
                .map(new Function<List<Profile>, ProfileModel>() {
                    @Override
                    public ProfileModel apply(@NonNull List<Profile> profileList)
                            throws Exception {

                        Profile profileData = profileList.get(0);

                        ProfileModel profileModel = new ProfileModel();
                        profileModel.setName(profileData.getName());
                        profileModel.setSurname(profileData.getSurname());
                        profileModel.setAge(profileData.getAge());

                        return profileModel;
                    }
                });
    }
}
