pipeline{
	agent any 
	stages{
		stage('Deployer Jfrog'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
				
				rtMavenDeployer (
					id: 'DEPLOYADOR',
					serverId: 'artifactory',
					releaseRepo: 'parcial2IS',
					snapshotRepo: '',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'DEPLOYADOR'
				)
			}
		}
        }
}
