package step2

import org.junit.Assert
import org.junit.Test

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    TODO("Reimplement without using any if")

    if (client == null || message == null) return

    val personalInfo = client.personalInfo
    if (personalInfo == null) return

    val email = personalInfo.email
    if (email == null) return

    mailer.sendMessage(email, message)
}

class NullabiliyTest{
    fun testSendMessageToClient(
            client: Client?,
            message: String?,
            email: String? = null,
            shouldBeInvoked: Boolean = false
    ) {
        var invoked = false
        sendMessageToClient(client, message, object : Mailer {
            override fun sendMessage(actualEmail: String, actualMessage: String) {
                invoked = true
                Assert.assertEquals("The message is not as expected:",
                                    message, actualMessage)
                Assert.assertEquals("The email is not as expected:",
                                    email, actualEmail)
            }
        })
        Assert.assertEquals("The function 'sendMessage' should${if (shouldBeInvoked) "" else "n't"} be invoked",
                            shouldBeInvoked, invoked)
    }

    @Test fun everythingIsOk() {
        testSendMessageToClient(Client(PersonalInfo("bob@gmail.com")),
                                "Hi Bob! We have an awesome proposition for you...",
                                "bob@gmail.com",
                                true)
    }

    @Test fun noMessage() {
        testSendMessageToClient(Client(PersonalInfo("bob@gmail.com")), null)
    }

    @Test fun noEmail() {
        testSendMessageToClient(Client(PersonalInfo(null)), "Hi Bob! We have an awesome proposition for you...")
    }

    @Test fun noPersonalInfo() {
        testSendMessageToClient(Client(null), "Hi Bob! We have an awesome proposition for you...")
    }

    @Test fun noClient() {
        testSendMessageToClient(null, "Hi Bob! We have an awesome proposition for you...")
    }
}