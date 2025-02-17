package com.nextcloud.talk.repositories

import java.util.Locale

enum class SharedItemType {

    AUDIO,
    FILE,
    MEDIA,
    VOICE,
    LOCATION,
    DECKCARD,
    OTHER;

    companion object {
        fun typeFor(name: String) = valueOf(name.uppercase(Locale.ROOT))
    }
}
