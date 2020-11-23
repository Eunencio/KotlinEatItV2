package com.example.kotlineatitv2client.ui.comment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlineatitv2client.Common.Common
import com.example.kotlineatitv2client.Model.CommentModel
import com.example.kotlineatitv2client.Model.FoodModel

class CommentViewModel : ViewModel() {

   var mutableLiveDataCommentList:MutableLiveData<List<CommentModel>>?=null
    //private var mutableLiveDataComment:MutableLiveData<CommentModel>?=null

    init {
        mutableLiveDataCommentList = MutableLiveData()
    }

    fun setCommentList(commentList: List<CommentModel>)
    {
        mutableLiveDataCommentList!!.value = commentList
    }


}