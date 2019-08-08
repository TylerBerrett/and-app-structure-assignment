package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.model.Product
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails()

    }

    val product = Product("Hot Pockets", "Pizza Flavor", 2.98,0.75, 0.05)

    private fun displayProductDetails() {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        productName.setText("Product: ${product.productName}")
        productDescription.setText("About: ${product.productDescription}")
        productDiscount.setText("Discounted: ${TextUtils.formatPercent(product.productDiscount)}")
        productPrice.setText("Price: ${TextUtils.formatCurrency(product.productPrice)}")
        productTax.setText("Tax: ${TextUtils.formatCurrency(product.productTax)}")
        totalProductPrice.setText("Total: ${TextUtils.formatCurrency(product.productPrice + product.productTax)}")
        orderDate.setText("Today is: ${DateUtils.formatDate(Date())}")
    }

}
