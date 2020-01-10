package com.example.demo

import com.beust.klaxon.TypeAdapter
import kotlin.reflect.KClass

class ConfigurationTypeAdapter: TypeAdapter<Configuration> {
    override fun classFor(type: Any): KClass<out Configuration> = when(type as String) {
        "home" -> ConfigurationHome::class
        "auto" -> ConfigurationAuto::class
        else -> throw IllegalArgumentException("Unknown type: $type")
    }
}