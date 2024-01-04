package com.v2ray.ang.dto


data class JsonResponse (
    val channel: Channel,
    val type: String,
    val config: String,
    val time: String
)


data class Channel(
    val username: String,
    val title: String,
    val logo: String
)




/*
{
    "channel": {
        "username": "  ",
        "title": " ",
        "logo": "  "
    },
    "type": "  ",
    "config": "  ",
    "time": "2023-11-23 08:49:06"
    }
 */