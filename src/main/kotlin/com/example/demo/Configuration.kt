package com.example.demo

import com.beust.klaxon.TypeFor
import javax.validation.constraints.Digits
import javax.validation.constraints.Min
import javax.validation.constraints.Size
import kotlin.math.max
import kotlin.math.min

@TypeFor(field = "type", adapter = ConfigurationTypeAdapter::class)
open class Configuration(val type: String)

data class ConfigurationHome(
        val width: Int,
        val height: Int
): Configuration("home")

data class ConfigurationAuto(val radius: Int): Configuration("auto")

