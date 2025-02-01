package com.rocketseat.nlw.nearby.data.model.mock

import com.rocketseat.nlw.nearby.data.model.Market
import com.rocketseat.nlw.nearby.data.model.Rule

val mockMarkets = listOf(
    Market(
        id = "012576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "146b1a8-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para os amantes de carne.",
        coupons = 10,
        rules = emptyList(),
        latitude = -23.55974230991911,
        longitude = -46.65814845249887,
        address = "Av. Paulista - Bela Vista, São Paulo - SP",
        phone = "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market(
        id = "237adf45-8c92-4e3b-9c7e-19d76f88a15b",
        categoryId = "76b2d3a9-62d7-4e12-9d9c-5c783b1e4ad3",
        name = "Pizzaria Napoli",
        description = "Autêntica pizza italiana feita no forno a lenha com ingredientes selecionados.",
        coupons = 5,
        rules = emptyList(),
        latitude = -23.561110,
        longitude = -46.656222,
        address = "Rua Augusta - Consolação, São Paulo - SP",
        phone = "(11) 97856-3344",
        cover = "https://images.unsplash.com/photo-1542838132-92c53300491e?w=400&h=300"
    )
)