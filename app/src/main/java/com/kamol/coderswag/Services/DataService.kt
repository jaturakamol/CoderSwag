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
        Product("Kamol Graphic Beanie", "$18", "hat01"),
        Product("Kamol Hat Black", "$19", "hat02"),
        Product("Kamol Hat White", "$20", "hat03"),
        Product("Kamol Hat Black", "$21", "hat04")
    )

    val hoodies = listOf(
        Product("Kamol Hoodie Gray", "$25", "hoodie01"),
        Product("Kamol Hoodie Red", "$26", "hoodie02"),
        Product("Kamol Hoodie Gray", "$27", "hoodie03"),
        Product("Kamol Hoodie Gray", "$28", "hoodie04")
    )

    val shirts = listOf(
        Product("Kamol Shirt Black", "$31", "shirt01"),
        Product("Kamol Badge Light Gray", "$32", "shirt02"),
        Product("Kamol Logo Shirt Red", "$33", "shirt03"),
        Product("Kamol Hustle", "$34", "shirt04"),
        Product("Kickflip Studios", "$35", "shirt05")
    )

}