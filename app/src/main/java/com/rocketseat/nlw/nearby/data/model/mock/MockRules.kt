package com.rocketseat.nlw.nearby.data.model.mock

import com.rocketseat.nlw.nearby.data.model.Rule

val mockRules = listOf(
    Rule(
        id = "1a2b3c",
        description = "Cupom válido até 31/01/2025.",
        marketId = "012576ea-4441-4b8a-89e5-d5f32104c7c4"
    ),
    Rule(
        id = "4d5e6f",
        description = "Válido apenas para consumo no local.",
        marketId = "237adf45-8c92-4e3b-9c7e-19d76f88a15b"
    )
)