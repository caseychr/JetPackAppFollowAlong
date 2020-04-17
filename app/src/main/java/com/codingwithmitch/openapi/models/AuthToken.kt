package com.codingwithmitch.openapi.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(
    tableName = "auth_token",
    foreignKeys = [
        ForeignKey(
            entity = AccountProperties::class,
            parentColumns = ["pk"],
            childColumns = ["account_pk"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class AuthToken(

    @PrimaryKey
    @ColumnInfo(name = "account_pk")
    var account_pk: Int? = -1,


    @ColumnInfo(name = "token")
    @SerializedName("token")
    @Expose
    var token: String? = null
) : Parcelable