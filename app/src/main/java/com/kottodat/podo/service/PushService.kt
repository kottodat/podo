package com.kottodat.podo.service

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson
import timber.log.Timber

/**
 * App static Data
 *
 * @author 고하나
 * @version 1.0
 * @date 14/01/2020
 */
class PushService : FirebaseMessagingService() {
    var token: String? = null

    override fun onNewToken(token: String?) {
        super.onNewToken(token)
        this.token = token
    }

    override fun onMessageReceived(message: RemoteMessage?) {
        super.onMessageReceived(message)
        message?.let {
            Timber.d(Gson().toJson(it.toString()))
        }
    }

}