package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //given
        User andrew = new Millenials("Andrew Scot");
        User alice = new YGeneration("Alice");
        User tom = new ZGeneration("Tom");

        //when
        String andrewSocial = andrew.sharePost();
        System.out.println("Adrew says: " + andrewSocial);
        String aliceSocial = alice.sharePost();
        System.out.println("Alice says: " + aliceSocial);
        String tomSocial = tom.sharePost();
        System.out.println("Tom says: " + tomSocial);

        //then

        Assert.assertEquals("Na codzień korzystam z Twittera", andrewSocial);
        Assert.assertEquals("Korzystam z Fejsa :-)", aliceSocial);
        Assert.assertEquals("Snapchat jest THE BEST!", tomSocial);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //given
        User alice = new YGeneration("Alice");

        //when
        String aliceSocial = alice.sharePost();
        System.out.println("\nAlice says: " + aliceSocial);
        alice.setSocialPublisher(new SnapchatPublisher());
        aliceSocial = alice.sharePost();
        System.out.println("Alice is saying now: " + aliceSocial);

        //then
        Assert.assertEquals("Snapchat jest THE BEST!", aliceSocial);
    }
}
