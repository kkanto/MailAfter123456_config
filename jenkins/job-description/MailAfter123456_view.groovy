 
listView('MailAfter123456 Jobs') {
    description('MailAfter123456 Jobs')
    jobs {
        regex('MailAfter123456_.+')
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
