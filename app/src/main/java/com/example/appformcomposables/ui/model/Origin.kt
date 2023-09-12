package com.example.appformcomposables.ui.model

data class Origin (
    val name: String
)

val originslist = listOf<Origin>(
    Origin("Site"),
    Origin("Smartphone"),
    Origin("Advertising"),
    Origin("Reference"),
)