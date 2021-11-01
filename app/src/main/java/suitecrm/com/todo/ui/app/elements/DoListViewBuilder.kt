package suitecrm.com.todo.ui.app.elements

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import suitecrm.com.todo.R


class DoListViewBuilder {
    @SuppressLint("WrongConstant")
    fun createRowChecklistView(context: Context): LinearLayout {
        val row: LinearLayout = LinearLayout(context, null, 0, R.style.TodoLinerRow)
        row.orientation = LinearLayout.HORIZONTAL
        row.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        val checkBox: CheckBox = CheckBox(context, null, 0, R.style.MainCheckBox)
        checkBox.layoutParams = ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)


        checkBox.isChecked = false
        checkBox.setOnClickListener {
            var coreList = (row.parent)
            if (coreList is LinearLayout) {
                coreList.removeViewInLayout(row)
            }
            coreList.requestLayout()
        }

        val textView: TextView = TextView(context, null, 0, R.style.TodoTextViewMain)
        textView.layoutParams = ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        textView.text = "какой то текс созданный программно"
        row.addView(checkBox)
        row.addView(textView)
        return row
    }
}