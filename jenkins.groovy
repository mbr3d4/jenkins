pipeline {
    agent any
    
    stages {
        stage('Preparação') {
            steps {
                // Aqui você pode adicionar etapas para preparar o ambiente
                echo 'Preparando o ambiente...'
                sh 'ping -c 4 192.168.0.17'
            }
        }
        stage('Build') {
            steps {
                // Aqui você pode adicionar etapas para compilar o seu código
                echo 'Compilando o código...'
            }
        }
        stage('Testes') {
            steps {
                // Aqui você pode adicionar etapas para executar testes automatizados
                echo 'Executando testes...'
            }
        }
        stage('Deploy') {
            steps {
                // Aqui você pode adicionar etapas para implantar sua aplicação
                echo 'Implantando a aplicação...'
            }
        }
    }
    
    post {
        always {
            // Etapa executada sempre, independentemente do resultado das etapas anteriores
            echo 'Finalizando a execução da pipeline...'
        }
        success {
            // Etapa executada apenas se a pipeline for bem-sucedida
            echo 'Pipeline executada com sucesso!'
        }
        failure {
            // Etapa executada apenas se a pipeline falhar
            echo 'A pipeline falhou!'
        }
    }
}
