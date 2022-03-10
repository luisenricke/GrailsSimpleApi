package com.luisenricke.returnData

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY

import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

@ReadOnly
class SimpleReturnObjectController {

    SimpleReturnObjectService simpleReturnObjectService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond simpleReturnObjectService.list(params), model:[simpleReturnObjectCount: simpleReturnObjectService.count()]
    }

    def show(Long id) {
        respond simpleReturnObjectService.get(id)
    }

    @Transactional
    def save(SimpleReturnObject simpleReturnObject) {
        if (simpleReturnObject == null) {
            render status: NOT_FOUND
            return
        }
        if (simpleReturnObject.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond simpleReturnObject.errors
            return
        }

        try {
            simpleReturnObjectService.save(simpleReturnObject)
        } catch (ValidationException e) {
            respond simpleReturnObject.errors
            return
        }

        respond simpleReturnObject, [status: CREATED, view:"show"]
    }

    @Transactional
    def update(SimpleReturnObject simpleReturnObject) {
        if (simpleReturnObject == null) {
            render status: NOT_FOUND
            return
        }
        if (simpleReturnObject.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond simpleReturnObject.errors
            return
        }

        try {
            simpleReturnObjectService.save(simpleReturnObject)
        } catch (ValidationException e) {
            respond simpleReturnObject.errors
            return
        }

        respond simpleReturnObject, [status: OK, view:"show"]
    }

    @Transactional
    def delete(Long id) {
        if (id == null || simpleReturnObjectService.delete(id) == null) {
            render status: NOT_FOUND
            return
        }

        render status: NO_CONTENT
    }
}
