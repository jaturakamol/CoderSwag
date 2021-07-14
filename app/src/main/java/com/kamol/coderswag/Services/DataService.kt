package com.kamol.coderswag.Services

import com.kamol.coderswag.Model.Category
import com.kamol.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Kamol Graphic Beanie", "$18", "hat1"),
        Product("Kamol Hat Black", "$19", "hat2"),
        Product("Kamol Hat White", "$20", "hat3"),
        Product("Kamol Hat Black", "$21", "hat4"),
        Product("Kamol Graphic Beanie", "$18", "hat1"),
        Product("Kamol Hat Black", "$19", "hat2"),
        Product("Kamol Hat White", "$20", "hat3"),
        Product("Kamol Hat Black", "$21", "hat4"),
        Product("Kamol Graphic Beanie", "$18", "hat1"),
        Product("Kamol Hat Black", "$19", "hat2"),
        Product("Kamol Hat White", "$20", "hat3"),
        Product("Kamol Hat Black", "$21", "hat4")
    )

    val hoodies = listOf(
        Product("Kamol Hoodie Gray", "$25", "hoodie1"),
        Product("Kamol Hoodie Red", "$26", "hoodie2"),
        Product("Kamol Hoodie Gray", "$27", "hoodie3"),
        Product("Kamol Hoodie Gray", "$28", "hoodie4"),
        Product("Kamol Hoodie Gray", "$25", "hoodie1"),
        Product("Kamol Hoodie Red", "$26", "hoodie2"),
        Product("Kamol Hoodie Gray", "$27", "hoodie3"),
        Product("Kamol Hoodie Gray", "$28", "hoodie4"),
        Product("Kamol Hoodie Gray", "$25", "hoodie1"),
        Product("Kamol Hoodie Red", "$26", "hoodie2"),
        Product("Kamol Hoodie Gray", "$27", "hoodie3"),
        Product("Kamol Hoodie Gray", "$28", "hoodie4")
    )

    val shirts = listOf(
        Product("Kamol Shirt Black", "$31", "shirt1"),
        Product("Kamol Badge Light Gray", "$32", "shirt2"),
        Product("Kamol Logo Shirt Red", "$33", "shirt3"),
        Product("Kamol Hustle", "$34", "shirt4"),
        Product("Kickflip Studios", "$35", "shirt5"),
        Product("Kamol Shirt Black", "$31", "shirt1"),
        Product("Kamol Badge Light Gray", "$32", "shirt2"),
        Product("Kamol Logo Shirt Red", "$33", "shirt3"),
        Product("Kamol Hustle", "$34", "shirt4"),
        Product("Kickflip Studios", "$35", "shirt5"),
        Product("Kamol Shirt Black", "$31", "shirt1"),
        Product("Kamol Badge Light Gray", "$32", "shirt2"),
        Product("Kamol Logo Shirt Red", "$33", "shirt3"),
        Product("Kamol Hustle", "$34", "shirt4"),
        Product("Kickflip Studios", "$35", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String?) : List<Product> {

        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }

}