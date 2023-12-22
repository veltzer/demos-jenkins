class Email {

  String personName
  String emailAddress
  Date sendDate
  String description

  String prepareEmail() {
    "Recipient: $personName\nAddress: $emailAddress\nDate: $sendDate\nSummary: $description"
  }

}

Email email = new Email()
email.personName = 'Kavin School'
email.emailAddress = 'kangs@kavinschoo.com'
email.sendDate = new Date()
email.description = 'Make sure to deliver before 5 days of opening the class'

println email.prepareEmail()
