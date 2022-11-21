 
listView('2211testst Jobs') {
    description('2211testst Jobs')
    jobs {
        regex('2211testst_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
