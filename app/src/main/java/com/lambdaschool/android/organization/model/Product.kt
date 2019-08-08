package com.lambdaschool.android.organization.model

data class Product(
    val productName: String = "",
    val productDescription: String = "",
    val productPrice: Double = 0.00,
    val productTax: Double = 0.00,
    val productDiscount: Double = 0.00
)