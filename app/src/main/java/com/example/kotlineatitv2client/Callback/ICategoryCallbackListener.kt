package com.example.kotlineatitv2client.Callback

import com.example.kotlineatitv2client.Model.CategoryModel

interface ICategoryCallbackListener {
    fun onCategoryLoadSucess(categoriesList: List<CategoryModel>)
    fun onCategoryLoadFailed(message:String)
}