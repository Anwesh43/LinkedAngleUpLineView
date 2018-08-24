package com.anwesh.uiprojects.linkedangleuplineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.angleuplineview.AngleUpLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : AngleUpLineView = AngleUpLineView.create(this)
    }
}
