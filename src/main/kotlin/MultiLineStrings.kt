//multi line strings -  java style
fun main() {
    val doc = "<html>" +
            "<head>" +
            "<title>Home</title>" +
            "</head>" +
            "<body>" +
            "</body>" +
            "</html>"
    println(doc)
    val title="google"
    val newDoc = """
       <html>
          <head>
                <title>${title} Home</title>
          </head>
        <body>
            <h1>welcome to Kotlin</h1>
        </body>
    """.trim()
    println(newDoc)
}