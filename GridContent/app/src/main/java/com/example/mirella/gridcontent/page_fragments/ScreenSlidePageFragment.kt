package com.example.mirella.gridcontent.page_fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mirella.gridcontent.R

class ScreenSlidePageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false) as ViewGroup
    }

}
