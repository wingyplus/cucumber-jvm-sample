package com.wingyplus.groovy.geb.page

import geb.Page;

class GooglePage extends Page {
    static at = {
        $("title").text() == "Google"
    }
}
