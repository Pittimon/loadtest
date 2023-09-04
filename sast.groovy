def test() {
    def groovyScriptPath = "${env.WORKSPACE}/${env.project}/test.groovy"
    echo "Groovy script path: ${groovyScriptPath}"

    def groovyScript = load(groovyScriptPath)
    echo "Groovy script content: ${groovyScript}"

    return groovyScript

}

def sast() {
    echo "Running SAST analysis on code..."
    test()
    groovyScript.test()
}
return this