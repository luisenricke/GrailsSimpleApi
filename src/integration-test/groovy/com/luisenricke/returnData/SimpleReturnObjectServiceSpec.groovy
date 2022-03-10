package com.luisenricke.returnData

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import org.grails.datastore.mapping.core.Datastore
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
@Rollback
class SimpleReturnObjectServiceSpec extends Specification {

    SimpleReturnObjectService simpleReturnObjectService
    @Autowired Datastore datastore

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new SimpleReturnObject(...).save(flush: true, failOnError: true)
        //new SimpleReturnObject(...).save(flush: true, failOnError: true)
        //SimpleReturnObject simpleReturnObject = new SimpleReturnObject(...).save(flush: true, failOnError: true)
        //new SimpleReturnObject(...).save(flush: true, failOnError: true)
        //new SimpleReturnObject(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //simpleReturnObject.id
    }

    void cleanup() {
        assert false, "TODO: Provide a cleanup implementation if using MongoDB"
    }

    void "test get"() {
        setupData()

        expect:
        simpleReturnObjectService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<SimpleReturnObject> simpleReturnObjectList = simpleReturnObjectService.list(max: 2, offset: 2)

        then:
        simpleReturnObjectList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        simpleReturnObjectService.count() == 5
    }

    void "test delete"() {
        Long simpleReturnObjectId = setupData()

        expect:
        simpleReturnObjectService.count() == 5

        when:
        simpleReturnObjectService.delete(simpleReturnObjectId)
        datastore.currentSession.flush()

        then:
        simpleReturnObjectService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        SimpleReturnObject simpleReturnObject = new SimpleReturnObject()
        simpleReturnObjectService.save(simpleReturnObject)

        then:
        simpleReturnObject.id != null
    }
}
