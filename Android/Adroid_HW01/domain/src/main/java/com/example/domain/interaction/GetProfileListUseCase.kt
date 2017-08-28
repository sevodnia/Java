package com.example.domain.interaction

import com.doschechko.matylionak.data.entity.Profile
import com.doschechko.matylionak.data.net.RestService
import com.example.domain.entity.ProfileId
import com.example.domain.entity.ProfileModel
import com.example.domain.interaction.base.UseCase

import java.util.ArrayList

import io.reactivex.Observable
import io.reactivex.annotations.NonNull
import io.reactivex.functions.Function


class GetProfileListUseCase : UseCase<Void, List<ProfileModel>>() {


    override fun builtUseCase(param: Void?): Observable<List<ProfileModel>> {


        return RestService.getInstance().profiles.map {
            it.map { convert(it) }
        }

    }

    private fun convert(dataModel: Profile): ProfileModel {

        val profileModel = ProfileModel()
        profileModel.name = dataModel.name
        profileModel.surname = dataModel.surname
        profileModel.age = dataModel.age
        return profileModel


    }


}
