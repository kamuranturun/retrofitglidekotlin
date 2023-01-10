package com.kamuran.retrofit100123

import java.security.acl.Owner

data class RecyclerListDataModeli(    val items:ArrayList<RecyclerData>)
data class RecyclerData(val name:String,val description:String, val created_at:String, val owner:com.kamuran.retrofit100123.Owner)
data class  Owner(val avatar_url:String)