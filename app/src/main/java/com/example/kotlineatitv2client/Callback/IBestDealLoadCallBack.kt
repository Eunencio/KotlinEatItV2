package com.example.kotlineatitv2client.Callback

import com.example.kotlineatitv2client.Model.BestDealModel
import com.example.kotlineatitv2client.Model.PopularCategoryModel

interface IBestDealLoadCallBack {
    fun onBestDealLoadSucess(bestDealList: List<BestDealModel>)
    fun onBestDealLoadFailed(message:String)
}