package com.achojkisoft.languagesapp.languages

import androidx.compose.runtime.Composable

@Composable
fun getStrings(): List<Map<String, String>>{

    val en = mapOf(
        "title" to "Hello Word",
        "subtitle" to "The World is yours"
    )

    val es = mapOf(
        "title" to "Hola Mundo",
        "subtitle" to "El Mundo es tuyo"
    )

    return listOf(en, es)
}