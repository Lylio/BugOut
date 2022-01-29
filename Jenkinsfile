node {
	def app
	def image = 'registry.hub.docker.com/lylio/bugout'
	def branch = 'main'

	try {
		stage('Clone repository') {
	    	git branch: branch,
	        	credentialsId: 'Lylio-GitHub',
	        	url: 'https://github.com/Lylio/bugout.git'
	    }

		stage('Build JAR') {
	    	docker.image('maven:3.6.1-jdk-8').inside('-v /root/.m2:/root/.m2') {
	        	sh 'mvn -B clean package'
	        	stash includes: '**/*.jar', name: 'jar'
	    	}
	    }

	    stage('Build Image') {
	    	unstash 'jar'
			app = docker.build image
	    }

	    stage('Push') {
	    	docker.withRegistry('https://registry.hub.docker.com', 'dockerhub_id') {
				app.push("${env.BUILD_NUMBER}")
				app.push("latest")
	        }
	    }
	} catch (e) {
		echo 'Error occurred during build process!'
		echo e.toString()
		currentBuild.result = 'FAILURE'
	}
}