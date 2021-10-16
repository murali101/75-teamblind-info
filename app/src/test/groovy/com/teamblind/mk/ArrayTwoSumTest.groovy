package com.teamblind.mk

import spock.lang.Specification

class ArrayTwoSumTest extends Specification {


    def "ArrayTwoSumTest | 1"() {
        setup:
        int[] nums = new int[]{2,7,11,15}
        int target = 9

        when:
        def result = ArrayTwoSum.twoSum(nums, target)

        then:
        result[0] == 1
        result[1] == 0
    }

    def "ArrayTwoSumTest | 2"() {
        setup:
        int[] nums = new int[]{3,2,4}
        int target = 6

        when:
        def result = ArrayTwoSum.twoSum(nums, target)

        then:
        result[0] == 2
        result[1] == 1
    }

    def "ArrayTwoSumTest | 3"() {
        setup:
        int[] nums = new int[]{3,3}
        int target = 6

        when:
        def result = ArrayTwoSum.twoSum(nums, target)

        then:
        result[0] == 1
        result[1] == 0
    }
}
