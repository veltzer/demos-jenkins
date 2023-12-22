try {
    'Kavin School'.toInt()   // this will generate an exception
} catch (e) {
    assert e in NumberFormatException
}

