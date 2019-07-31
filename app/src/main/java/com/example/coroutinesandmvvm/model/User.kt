package com.example.coroutinesandmvvm.model

import java.util.*

class User: Observable() {


    var firstName:String = ""
    set(value) {
        field = value
        setChangedAndNotify("firstName")
    }


    var lastName = ""
    set(value) {
        field = value
        setChangedAndNotify("lastName")
    }


    var age = 0
        set(value) {
            field = value
            setChangedAndNotify("age")
        }

    var imageUrl = ""
        set(value) {
            field = value
            setChangedAndNotify("imageUrl")
        }

    var tagLine = ""
        set(value) {
            field = value
            setChangedAndNotify("tagLine")
        }

    var female = false
        set(value) {
            field = value
            setChangedAndNotify("female")
        }

    private fun setChangedAndNotify(field: Any) {

        setChanged()
        notifyObservers()

    }
}