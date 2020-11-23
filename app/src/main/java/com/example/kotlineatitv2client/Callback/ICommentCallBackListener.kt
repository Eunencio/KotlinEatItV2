package com.example.kotlineatitv2client.Callback


import com.example.kotlineatitv2client.Model.CommentModel

interface ICommentCallBackListener {
    fun onCommentLoadSucess(commentList: List<CommentModel>)
    fun onCommentLoadFailed(message:String)
}