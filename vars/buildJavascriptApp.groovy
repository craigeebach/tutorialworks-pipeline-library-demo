

def call(Map config=[:], Closure body) {
	echo("Looking for controller")
	//node {
	//node ("jenkins-agent") {
	node ("controller") {
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