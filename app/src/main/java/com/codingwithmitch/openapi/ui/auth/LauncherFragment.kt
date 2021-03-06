package com.codingwithmitch.openapi.ui.auth.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.codingwithmitch.openapi.R
import com.codingwithmitch.openapi.ui.AuthViewModel
import com.codingwithmitch.openapi.ui.auth.BaseAuthFragment
import com.codingwithmitch.openapi.viewmodels.MainViewModelFactory
import kotlinx.android.synthetic.main.fragment_launcher.*
import javax.inject.Inject


class LauncherFragment
@Inject
constructor(private val viewModelFactory: ViewModelProvider.Factory)
    : Fragment(R.layout.fragment_launcher) {

    val viewModel: AuthViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.cancelActiveJobs()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        register.setOnClickListener {
            navRegistration()
        }

        login.setOnClickListener {
            navLogin()
        }

        forgot_password.setOnClickListener {
            navForgotPassword()
        }

        focusable_view.requestFocus() // reset focus
    }

    fun navLogin(){
        findNavController().navigate(R.id.action_launcherFragment_to_loginFragment)
    }

    fun navRegistration(){
        findNavController().navigate(R.id.action_launcherFragment_to_registerFragment)
    }

    fun navForgotPassword(){
        findNavController().navigate(R.id.action_launcherFragment_to_forgotPasswordFragment)
    }
}
