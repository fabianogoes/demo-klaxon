package com.example.demo

import com.beust.klaxon.Klaxon
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.TreeNode
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer


class CustomDeserializer : JsonDeserializer<Data>() {

    override fun deserialize(jsonParser: JsonParser, ctxt: DeserializationContext?): Data? {
        val json = jsonParser.codec.readTree<TreeNode>(jsonParser).toString()
        return Klaxon().parse<Data>(json)
    }
}