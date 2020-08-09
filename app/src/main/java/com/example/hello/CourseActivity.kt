package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*


data class Courses(val courses_id: Int, val courses_name: String, val courses_code: Int,val instructor: String, val description: String)
class courses() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) :

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        val coursesAdapter = coursesRecyclerViewAdapter(
            coursesList = listOf(
                Courses(1, "Kotlin", 2020202, "Owour", "Trainer"),
                Courses(2, "Javascript", 30303030, "Purity", "Trainer"),
                Courses(3, "Python", 404404, "James", "Trainer"),
                Courses(4, "UI/UX Dev", 29783737, "Muthondu", "Trainer"),
                Courses(5, "Entrepreneurship", 650505, "Gatwir", "Trainer"),
                Courses(6, "UI/UX Design", 54242451, "Kamawe", "Trainer"),
                Courses(7, "PD", 547928408, "Owoo", "Trainer"),
                Courses(8, "Navigating", 90000875, "Thamaini", "Trainer")
            )
        )
        rvCourses.adapter = coursesAdapter


    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<courses> {
        override fun createFromParcel(parcel: Parcel): courses {
            return courses(parcel)
        }

        override fun newArray(size: Int): Array<courses?> {
            return arrayOfNulls(size)
        }
    }

}
    }
}