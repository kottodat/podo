package com.kottodat.podo.data.repository

/**
 *
 * @author 고하나
 * @version 1.0
 * @date 14/01/2020
 */
interface ConfigRepository {

    fun loadStaticConfig(): StaticConfig

    fun loadRemoteConfig(): String

    data class StaticConfig(val type: Int)
}