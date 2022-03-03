ruleset {
    description 'Grails-CodeNarc Project RuleSet'

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/convention.xml') {
        'NoDef' {
            enabled = false
        }
        'MethodReturnTypeRequired' {
            enabled = false
        }
        'FieldTypeRequired' {
            ignoreFieldNames = 'hasMany, belongsTo, mappings, constraints, init, destroy'
        }
        'TrailingComma' {
            checkList = false
            checkMap = false
        }
    }
    ruleset('rulesets/design.xml')
    ruleset('rulesets/dry.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml') {

        'SpaceAroundMapEntryColon' {
            enabled = false
        }
        'ClosureStatementOnOpeningLineOfMultipleLineClosure' {
            enabled = false
        }
    }
    ruleset('rulesets/generic.xml')
    ruleset('rulesets/imports.xml') {
        'NoWildcardImports' {
            enabled = false
        }
    }
    ruleset('rulesets/naming.xml')
    ruleset('rulesets/unnecessary.xml')
    ruleset('rulesets/unused.xml')
    ruleset('rulesets/grails.xml')
}