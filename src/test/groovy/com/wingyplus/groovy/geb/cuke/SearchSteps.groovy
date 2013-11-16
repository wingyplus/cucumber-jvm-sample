package com.wingyplus.groovy.geb.cuke

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(geb.Browser)

Given(~'^I am on the Google search page$') { ->
    browser.go("http://google.com/")
}

When(~'^I search for "([^"]*)"$') { String keyword ->
    browser.$("input", name: "q").value(keyword)
}

Then(~'^I am at the results page$') { ->
    assert browser.page.title.endsWith("Google") == true
}

Then(~'^I first link should be "([^"]*)"$') { String firstLink ->
    Thread.sleep(3000)
    assert browser.$("#ires a")[0].text() == firstLink
}