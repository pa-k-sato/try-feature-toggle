package com.example.demo.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FeatureFlgConfig {
    @Bean
    @ConditionalOnProperty(name = ["features.experimental"], havingValue = "false", matchIfMissing = true)
    fun defaultApi(): ExperimentalApiReleaseToggle {
        return NotReleaseExperimentalApi()
    }

    @Bean
    @ConditionalOnProperty(name = ["features.experimental"])
    fun experimentalApi(): ExperimentalApiReleaseToggle {
        return ReleaseExperimentalApi()
    }
}
