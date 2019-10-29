package com.example.codeswag.Services

import com.example.codeswag.Models.Category
import com.example.codeswag.Models.Products

object DataService {
    val category = listOf(
        Category("Shirts","shirtimage"),
        Category("Hats","hatimage "),
        Category("hoodies ","hoodieimage"),
        Category("digitals","digitalgoodsimage")
    )
    val hat= listOf(
        Products("Devs beinie","18$","hat1"),
        Products("Devs white","12$","hat2"),
        Products("Devs black","20$","hat3"),
        Products("Devs brownie","22$","hat4")

    )
    val shirt= listOf(
        Products("Devs Black","18$","shirt1"),
        Products("Devs Red","12$","shirt2"),
        Products("Devs Grey hoodie","20$","shirt3"),
        Products("Devs Black hoodies","22$","shire4"),
        Products("Devs kick flip","26$","shirt5"))
    val hoodies= listOf(
        Products("Devs beinie","18$","hoodies1"),
        Products("Devs white","12$","hoodies2"),
        Products("Devs black","20$","hoodies3"),
        Products("Devs brownie","22$","hoodies4"))

}