package com.codingwithmitch.openapi.ui.main.account

import android.os.Parcelable
import com.codingwithmitch.openapi.models.AccountProperties
import kotlinx.android.parcel.Parcelize

@Parcelize
class AccountViewState (
    var accountProperties: AccountProperties? = null
) : Parcelable