package com.example.demo.controllers

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
@AutoConfigureMockMvc
class ExperimentalControllerTest(
    private val webApplicationContext: WebApplicationContext,
) {
   lateinit var mockMvc: MockMvc

   @BeforeEach
   fun setup() {
       this.mockMvc = MockMvcBuilders
           .webAppContextSetup(this.webApplicationContext)
           .build()
   }

    @Test
    fun testReleasedApi() {
        this.mockMvc.perform(get("/released/tasks"))
            .andDo(::print)
            .andExpect(status().isOk)
    }


    @Test
    fun testExperimentalApi() {
        this.mockMvc.perform(get("/experimental/tasks"))
            .andDo(::print)
            .andExpect(status().isNotFound)
    }
}