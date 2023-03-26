
CREATE TABLE IF NOT EXISTS `medico` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `nome` varchar(80) NOT NULL,
    `sobrenome` varchar(80) NOT NULL,
    `sigla_conselho` varchar(80) NOT NULL,
    `cod_conselho` int NOT NULL,
	`especialidades` varchar(100) NOT NULL,
    `email` varchar(100) NOT NULL,
    `dt_cadastro` datetime(6) NOT NULL,
    
    PRIMARY KEY (`id`)
    );

