package com.kottodat.podo.data.repository

import com.kottodat.podo.data.repository.ConfigRepository.StaticConfig

/**
 *
 * @author 고하나
 * @version 1.0
 * @date 14/01/2020
 */
class ConfigDataRepository : ConfigRepository {
    private val staticConfig: StaticConfig by lazy {
        StaticConfig(0)
    }

    override fun loadStaticConfig(): StaticConfig = staticConfig
    override fun loadRemoteConfig(): String  = "{\"item\":\"1\"}"


}