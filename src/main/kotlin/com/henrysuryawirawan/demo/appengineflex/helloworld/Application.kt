package com.henrysuryawirawan.demo.appengineflex.helloworld

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.henrysuryawirawan.demo.appengineflex.helloworld")
                .mainClass(Application.javaClass)
                .start()
    }
}