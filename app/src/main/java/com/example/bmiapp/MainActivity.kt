package com.example.bmiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calBMI(view: View){
        var weight: Double = et_wt.text.toString().toDouble()
        var height: Double = et_ht.text.toString().toDouble()
        var ans: Double

        weight *= 0.45
        height *= 0.025
        height *= height
        ans = weight/height

        if(ans < 18.5){
            txt_v_bmi.visibility = View.VISIBLE
            txt_v_bmi.text = resources.getString(R.string.under_wt)
            img_vw.visibility = View.VISIBLE
            img_vw.setImageResource(R.drawable.underweight)
        }
        else if(ans >= 18.5 && ans <= 24.9){
            txt_v_bmi.visibility = View.VISIBLE
            txt_v_bmi.text = resources.getString(R.string.healthy)
            img_vw.visibility = View.VISIBLE
            img_vw.setImageResource(R.drawable.healthy)
        }
        else if(ans >= 25 && ans <=29.9){
            txt_v_bmi.visibility = View.VISIBLE
            txt_v_bmi.text = resources.getString(R.string.over_wt)
            img_vw.visibility = View.VISIBLE
            img_vw.setImageResource(R.drawable.overweight)
        }
        else{
            txt_v_bmi.visibility = View.VISIBLE
            txt_v_bmi.text = resources.getString(R.string.obesity)
            img_vw.visibility = View.VISIBLE
            img_vw.setImageResource(R.drawable.obesity)
        }


    }
}