package com.lambdaschool.android.organization.application

import android.app.Application
import com.lambdaschool.android.organization.model.Product

class LambdaApplication : Application() {
    // todo: Maybe define a model in this class?
    val product = Product("Hot Pockets", "Pizza Flavor", 2.98,0.75, 0.05)

    override fun onCreate() {
        super.onCreate()

        // Note: You could do all kinds of app-initialization here. Crash-reporting tools,
        // Firebase, Stetho or anything else. You'll learn more about those later in the course.
    }
}