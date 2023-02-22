
CREATE TABLE IF NOT EXISTS `paciente` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `nome` varchar(80) NOT NULL,
    `sobrenome` varchar(80) NOT NULL,
    `nascimento` datetime(6) NOT NULL,
    `mae` varchar(100) NOT NULL,
    `pai` varchar(100) NOT NULL,
    `sexo` varchar(10) NOT NULL,
    `cpf` varchar(11) NOT NULL,
    `email` varchar(100) NOT NULL,
    `telefone` int NOT NULL,
    `dt_atualizacao` datetime(6) NOT NULL,

    PRIMARY KEY (`id`)
    );

