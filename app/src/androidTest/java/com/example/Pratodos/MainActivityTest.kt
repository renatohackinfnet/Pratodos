@file:Suppress("DEPRECATION")

package com.example.Pratodos

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import kotlinx.android.synthetic.main.activity_bolo_de_banana.*
import kotlinx.android.synthetic.main.activity_bolo_de_chocolate.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)

class MainActivityTest {

    @get:Rule

    var activityRule = ActivityTestRule(MainActivity::class.java)


    @Test
    fun verificarApp(){

        onView(withId(R.id.email_login)).perform(typeText("renato"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.password_login)).perform(typeText("hack"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.button_login)).perform(click())

        onView(withId(R.id.receita_pao_de_queijo)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.receita_bolo_de_banana)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.receita_bolo_de_chocolate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.receita_pao_de_queijo)).perform(click())
        onView(withId(R.id.go_back_button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.go_back_button)).perform(click())

        onView(withId(R.id.receita_bolo_de_chocolate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.receita_bolo_de_chocolate)).perform(click())
        onView(withId(R.id.go_voltar2_button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.go_voltar2_button)).perform(click())

        onView(withId(R.id.receita_bolo_de_banana)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.receita_bolo_de_banana)).perform(click())
        onView(withId(R.id.button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.button)).perform(click())




    }


}
