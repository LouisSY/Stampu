package com.example.stampu

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform