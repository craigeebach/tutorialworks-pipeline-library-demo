

def call(Map config=[:], Closure body) {
	echo("Looking for node with label ${config.label}")
	//node {
	node (config.label) {
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