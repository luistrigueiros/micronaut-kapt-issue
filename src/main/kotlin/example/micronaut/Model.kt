package example.micronaut

import kotlinx.serialization.Serializable

@Serializable
data class Message(val payload:String)