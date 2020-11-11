package com.hibby.beginnerspringboot.bean

import org.springframework.stereotype.Component

@Component /* this makes this eligible for spring DI */
class ClassInjection {

    String run() {
        return "hi"
    }
}
