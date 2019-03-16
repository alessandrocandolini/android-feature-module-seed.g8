package $package$

import okhttp3.mockwebserver.MockResponse

internal fun MockResponse.setBodyFromResource(path : String) : MockResponse {
    val fileContent = this.javaClass.classLoader.getResource(path).readText()
    return setBody(fileContent)
}