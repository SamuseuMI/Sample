package com.cogniteq.ca.mvvm.sample.data.realm.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class AuthModel : RealmObject() {
    @PrimaryKey
    var id: String? = null
    var login: String? = null
    var password: String? = null
}