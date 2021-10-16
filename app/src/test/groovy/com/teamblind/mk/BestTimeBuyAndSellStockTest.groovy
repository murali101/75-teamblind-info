package com.teamblind.mk

import spock.lang.Specification

class BestTimeBuyAndSellStockTest extends Specification {

    def "BestTimeBuyAndSellStock | 1"() {
        setup:
        int[] nums = new int[]{7,1,5,3,6,4}


        when:
        def result = BestTimeBuyAndSellStock.maxProfit(nums)

        then:
        result == 5
    }

    def "BestTimeBuyAndSellStock | 2"() {
        setup:
        int[] nums = new int[]{7,6,4,3,1}


        when:
        def result = BestTimeBuyAndSellStock.maxProfit(nums)

        then:
        result == 0
    }
}
