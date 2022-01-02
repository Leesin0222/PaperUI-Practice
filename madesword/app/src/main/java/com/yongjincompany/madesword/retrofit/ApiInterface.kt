package com.yongjincompany.madesword.retrofit

import com.yongjincompany.madesword.model.Login
import com.yongjincompany.madesword.model.Register
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    //회원가입
    @POST("")
    suspend fun register(@Body register: Register) : Call<Register>
    //로그인
    @POST("")
    suspend fun login(@Body login: Login) : Call<Login>

}