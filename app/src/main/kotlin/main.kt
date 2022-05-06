package main

import twitter4j.Twitter
import twitter4j.conf.Configuration
import twitter4j.conf.ConfigurationBuilder
import twitter4j.TwitterFactory

fun main(args: Array<String>) {

    val configuration: Configuration = ConfigurationBuilder().run {
        val env = Env()
        this.setOAuthConsumerKey(env.OAuthConsumerKey)
        this.setOAuthConsumerSecret(env.OAuthConsumerSecret)
        this.setOAuthAccessToken(env.OAuthAccessToken)
        this.setOAuthAccessTokenSecret(env.OAuthAccessTokenSecret)
        this.build()
    }
    val twitter = TwitterFactory(configuration).instance

//    // show timeline
//    twitter.getHomeTimeline().forEach {
//        println("${it.user.name} : ${it.text}")
//    }

    // tweet test
    val status = twitter.updateStatus("test")
    println(status.text)
}

class Env() {
    val OAuthConsumerKey: String
    val OAuthConsumerSecret: String
    val OAuthAccessToken: String
    val OAuthAccessTokenSecret: String
    init {
        OAuthConsumerKey = System.getenv("CONSUMER_KEY")
        OAuthConsumerSecret = System.getenv("CONSUMER_SECRET")
        OAuthAccessToken = System.getenv("ACCESS_TOKEN")
        OAuthAccessTokenSecret = System.getenv("ACCESS_TOKEN_SECRET")
    }
}
