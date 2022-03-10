package com.luisenricke.returnData

import grails.gorm.services.Service

@Service(SimpleReturnObject)
interface SimpleReturnObjectService {

    SimpleReturnObject get(Serializable id)

    List<SimpleReturnObject> list(Map args)

    Long count()

    SimpleReturnObject delete(Serializable id)

    SimpleReturnObject save(SimpleReturnObject simpleReturnObject)

}
