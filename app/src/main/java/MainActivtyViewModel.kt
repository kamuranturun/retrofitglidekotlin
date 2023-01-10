/*
package com.kamuran.retrofit100123


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel: ViewModel() {

    lateinit var recyclerListData :MutableLiveData<RecyclerListDataModeli>

    lateinit var recyclerViewAdapter:RecyclerViewAdapter



    init {

        recyclerListData= MutableLiveData()
        recyclerViewAdapter= RecyclerViewAdapter()
    }

    fun getAdapter():RecyclerViewAdapter{
        return recyclerViewAdapter

    }

    fun setAdapterData(data:ArrayList<RecyclerData>){
        recyclerViewAdapter.setDataList(data)
        recyclerViewAdapter.notifyDataSetChanged()

    }

    fun getRecyclerListDataObserver():MutableLiveData<RecyclerListDataModeli>{
        return recyclerListData
    }


    fun makeAPICall(input:String){
        val retroInstance=  RetrofitInstanceOrnegi.getRetroInstance().create(RetroSeviceServisi::class.java)

        val call= retroInstance.getDataFromApi(input)

        call.enqueue(object : Callback<RecyclerListDataModeli>{
            override fun onResponse(
                call: Call<RecyclerListDataModeli>,
                response: Response<RecyclerListDataModeli>
            ) {
                if (response.isSuccessful){

                    recyclerListData.postValue(response.body())
                }else{
                    recyclerListData.postValue(null)
                }
            }

            override fun onFailure(call: Call<RecyclerListDataModeli>, t: Throwable) {
                recyclerListData.postValue(null)
            }

        })
    }

}
 */