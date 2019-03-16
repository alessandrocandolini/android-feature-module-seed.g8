package $package$.integration

import $package$.core.*
import $package$.setBodyFromResource
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock

internal class $name;format="Camel"$IntegrationTestWithMockServer {

    @JvmField
    @Rule
    val mockWebServer = MockWebServer()

    @Mock
    lateinit var view: $name;format="Camel"$Contract.View

    lateinit var presenter: $name;format="Camel"$Contract.Presenter

    @Before
    fun setUp() {
        val mockServerUrl = mockWebServer.url("/").toString()
        presenter.bind(view)
    }

    @Test
    fun `TODO`() {

        // given
        val stubResponse = MockResponse().setResponseCode(200).setBodyFromResource("response_200.json")

        val dispatcher = object : Dispatcher() {

            override fun dispatch(request: RecordedRequest): MockResponse = when {
                request.path == "/some_url" -> stubResponse
                else -> MockResponse().setResponseCode(404)
            }
        }
        mockWebServer.setDispatcher(dispatcher)

        // when
        presenter.onViewCreated()

        // then
        TODO()
    }

}
