def test() {
    def groovyScriptPath = "${env.WORKSPACE}/${env.project}/test.groovy"
    echo "Groovy script path: ${groovyScriptPath}"

    def groovyScript = load(groovyScriptPath)
    echo "Groovy script content: ${groovyScript}"

    def bobo = "cat"

    return [groovyScript: groovyScript, Bobo: bobo]
}

def sast() {
    echo "Running SAST analysis on code..."
    def script = test()
    echo " script: ${script}"
    script.groovyScript.test()

    def groovyScript = script.groovyScript
    def Bobo = script.Bobo

    sh "echo Groovy script content: \${groovyScript}"
    sh "echo Bobo: \${Bobo}"
}
return this
