package main

import twitter4j.Status
import twitter4j.Twitter
import twitter4j.conf.ConfigurationBuilder
import twitter4j.TwitterFactory

fun main(args: Array<String>) {

    val twitter: Twitter = TwitterFactory(
            ConfigurationBuilder().run {
                this.setOAuthConsumerKey(System.getenv("CONSUMER_KEY"))
                this.setOAuthConsumerSecret(System.getenv("CONSUMER_SECRET"))
                this.setOAuthAccessToken(System.getenv("ACCESS_TOKEN"))
                this.setOAuthAccessTokenSecret(System.getenv("ACCESS_TOKEN_SECRET"))
                this.build()
            }
    ).instance

    // show timeline
//    twitter.homeTimeline.forEach {
//        println("${it.user.name} : ${it.text}")
//    }

    // tweet test
    val status: Status = twitter.updateStatus("test")
    println(status.text)
}
