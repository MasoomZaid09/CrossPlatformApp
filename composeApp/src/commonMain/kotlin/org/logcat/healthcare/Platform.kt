package org.logcat.healthcare

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform