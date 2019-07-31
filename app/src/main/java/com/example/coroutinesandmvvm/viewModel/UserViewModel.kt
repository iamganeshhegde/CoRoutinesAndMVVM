package com.example.coroutinesandmvvm.viewModel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.coroutinesandmvvm.BR

import com.example.coroutinesandmvvm.model.User
import java.util.*

class UserViewModel(val user: User) : Observer, BaseObservable() {



    //Register itself as the observer of model
    init {
        user.addObserver(this)
    }


    override fun update(o: Observable?, arg: Any?) {

        if (arg is Any) {
            if (arg == "age") {


              //  notifyPropertyChanged(BR.)
            }
        }


    }


    val name: String
        @Bindable get() {

            return user.firstName + " " + user.lastName
        }

    val age: String
        @Bindable get() {
            return if (user.age < 0) return ""
            else String.format(Locale.ENGLISH, "%d years old", user.age)
        }

    val gender: String
        @Bindable get() {
            return if (user.female) return "Female" else "Male"
        }

    val imageUrl: String
        @Bindable get() {
            return user.imageUrl
        }

    val tagline: String
        @Bindable get() {
            return "Tagline: " + user.tagLine
        }
}