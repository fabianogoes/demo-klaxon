package com.example.demo

import com.beust.klaxon.TypeFor
import com.fasterxml.jackson.databind.annotation.JsonDeserialize

@JsonDeserialize(using = CustomDeserializer::class)
data class Data (
        @TypeFor(field = "configuration", adapter = ConfigurationTypeAdapter::class)
        val type: String,
        val configuration: Configuration
)