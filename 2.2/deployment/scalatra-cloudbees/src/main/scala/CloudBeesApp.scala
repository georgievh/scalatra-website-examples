package org.scalatra.example

import org.scalatra._

class CloudBeesApp extends ScalatraServlet {

  get("/") {
    <html>
      <body>
        <h1>This is
          <a href="http://scalatra.org/2.2/guides/deployment/cloudbees.html">
            scalatra-cloudbees
          </a>!
        </h1>
      </body>
    </html>
  }
}
