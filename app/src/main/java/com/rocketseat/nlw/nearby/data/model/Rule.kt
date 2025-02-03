package com.rocketseat.nlw.nearby.data.model

import kotlinx.serialization.Serializable

@Serializable
class Rule(
    val id: String,
    val description: String,
    val marketId: String,
)