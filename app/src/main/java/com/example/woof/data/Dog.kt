package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R


data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)









val dogs = listOf(
    Dog(R.drawable.kwako, R.string.dog_name_1, 3, hobbies = R.string.dog_description_1),
    Dog(R.drawable.wowo, R.string.dog_name_2, 6, hobbies = R.string.dog_description_2),
    Dog(R.drawable.loklu, R.string.dog_name_3, 2, R.string.dog_description_3),
    Dog(R.drawable.yo, R.string.dog_name_4, 4, R.string.dog_description_4),
    Dog(R.drawable.yu, R.string.dog_name_5, 6, R.string.dog_description_5),
    Dog(R.drawable.bel, R.string.dog_name_6, 4, R.string.dog_description_6),
    Dog(R.drawable.yow, R.string.dog_name_7, 12, R.string.dog_description_7),
    Dog(R.drawable.bon, R.string.dog_name_8, 1, R.string.dog_description_8),
    Dog(R.drawable.troy, R.string.dog_name_9, 2, R.string.dog_description_9)
)
