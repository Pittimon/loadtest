def test() {
    def groovyScriptPath = "${env.WORKSPACE}/${env.project}/test.groovy"
    echo "Groovy script path: ${groovyScriptPath}"

    def groovyScript = load(groovyScriptPath)
    echo "Groovy script content: ${groovyScript}"

    def Bobo = "cat"

    return [groovyScript: groovyScript, Bobo: Bobo]
}

}

def sast() {
    echo "Running SAST analysis on code..."
    def script = test()
    script.test()

    def groovyScript = script.groovyScript
    def Bobo = script.Bobo

    sh "echo Groovy script content: \${groovyScript}"
    sh "echo Bobo: \${Bobo}"
}

