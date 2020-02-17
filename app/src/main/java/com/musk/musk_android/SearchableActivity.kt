package com.musk.musk_android

import android.app.Activity
import android.app.SearchManager
import android.content.Context
import android.view.Menu
import android.widget.SearchView

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.MenuItem

import com.musk.musk_android.R

class SearchableActivity : Activity(), SearchView.OnQueryTextListener {
    override fun onQueryTextChange(newText: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreateOptionsMenu(menu: Menu) :Boolean {
       val inflater =  menuInflater
        inflater.inflate(R.menu.menu_main, menu)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu.findItem(R.id.action_search).actionView as SearchView).apply {

                setSearchableInfo(searchManager.getSearchableInfo(componentName))
        }
        return true

    }


}