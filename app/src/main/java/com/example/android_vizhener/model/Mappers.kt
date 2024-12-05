package com.example.android_vizhener.model

import com.example.android_vizhener.mapper.CryptMapper
import com.example.android_vizhener.mapper.KeyMapper
import com.example.android_vizhener.mapper.MessageMapper

/**
 * @author Lapoushko
 */
class Mappers(
    val cryptMapper: CryptMapper,
    val keyMapper: KeyMapper,
    val messageMapper: MessageMapper
)