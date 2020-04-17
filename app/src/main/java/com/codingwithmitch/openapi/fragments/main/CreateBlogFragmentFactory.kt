package com.codingwithmitch.openapi.fragments.main

import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.codingwithmitch.openapi.di.auth.AuthScope
import com.codingwithmitch.openapi.ui.auth.ui.ForgotPasswordFragment
import com.codingwithmitch.openapi.ui.auth.ui.LauncherFragment
import com.codingwithmitch.openapi.ui.auth.ui.LoginFragment
import com.codingwithmitch.openapi.ui.auth.ui.RegisterFragment
import com.codingwithmitch.openapi.ui.main.create_blog.CreateBlogFragment

import javax.inject.Inject

@AuthScope
class CreateBlogFragmentFactory
@Inject
constructor(
    private val viewModelFactory: ViewModelProvider.Factory,
    private val requestManager: RequestManager
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when (className) {

            CreateBlogFragment::class.java.name -> {
                CreateBlogFragment(viewModelFactory, requestManager)
            }

            else -> {
                CreateBlogFragment(viewModelFactory, requestManager)
            }
        }


}