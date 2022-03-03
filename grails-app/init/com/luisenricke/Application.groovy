package com.luisenricke

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Application extends GrailsAutoConfiguration {

    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

}
