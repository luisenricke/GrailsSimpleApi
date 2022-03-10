package com.luisenricke.returnData

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SimpleReturnObjectSpec extends Specification implements DomainUnitTest<SimpleReturnObject> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
