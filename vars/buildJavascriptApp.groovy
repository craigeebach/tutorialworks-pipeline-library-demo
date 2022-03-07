

def call(Map config=[:], Closure body) {
    //node ("controller") {
	echo("Looking for jenkins-agent")
	//node {
	node ("jenkins-agent") {
        git url: "https://github.com/craigeebach/sample-nodejs"
        stage("Install") {
            sh "npm install"
        }
        stage("Test") {
            sh "npm test"
        }
        stage("Deploy") {
            if (config.deploy) {
                sh "npm publish"
            } else {
				echo "Not deploying"
			}
        }
        body()
    }
}