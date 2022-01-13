package com.sardorbek.mylib

import android.content.Context
import android.widget.Toast


object MyLibrary {
    fun show(context: Context,str:String){
        Toast.makeText(context,str,Toast.LENGTH_LONG).show()
    }
}
/*object MyLibrary {
    fun show(context: Context, str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }
}*/