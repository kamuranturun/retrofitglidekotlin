/*
package com.kamuran.retrofit100123

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL

import com.kamuran.retrofit100123.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val viewModel = makeApiCAll()

        setupBinding(viewModel)
    }

    fun setupBinding(viewModel: MainActivityViewModel) {

        val activityMainBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.setVariable(BR.viewModel, viewModel)
        activityMainBinding.executePendingBindings()
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val decoration = DividerItemDecoration(this@MainActivity, VERTICAL)
            addItemDecoration(decoration)
        }
    }

    fun makeApiCAll(): MainActivityViewModel {
        val viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        viewModel.getRecyclerListDataObserver().observe(this, Observer<RecyclerListDataModeli> {
           progresbar.visibility = GONE
            if (it != null) {
                viewModel.setAdapterData(it.items)
            } else {
                Toast.makeText(this@MainActivity, "error", Toast.LENGTH_LONG).show()
            }
        })
        viewModel.makeAPICall("newyork")

        return viewModel
    }
}
 */