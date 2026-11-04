package com.shipsco.lucide_compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform