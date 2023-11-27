package com.example.courseapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val courseName: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageResource: Int
)
