package com.example.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.data.PratoDatabase
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class MenuItemDetailActivity : AppCompatActivity() {

    private val mPratoButton: MaterialButton by lazy { findViewById(R.id.detail_back) }
    private val mPratoImage: ShapeableImageView by lazy { findViewById(R.id.detail_image)}
    private val mPratoName: MaterialTextView by lazy { findViewById(R.id.detail_name)}
    private val mPratoDescription: MaterialTextView by lazy { findViewById(R.id.detail_description)}
    private val mPratoPrice: MaterialTextView by lazy { findViewById(R.id.detail_price) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val pratoPosition = intent.getIntExtra("prato_position", 0)

        val prato = PratoDatabase.getAll()[pratoPosition]
        mPratoImage.setImageResource(prato.image)
        mPratoName.text = prato.name
        mPratoDescription.text = prato.description
        mPratoPrice.text = prato.price

        mPratoButton.setOnClickListener{
            finish()
        }

    }
}
