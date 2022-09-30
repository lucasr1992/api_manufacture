insert into tb_unidade_negocio (business, status) values ('PWT - POWERTRAIN', 'ATIVO');
insert into tb_unidade_negocio (business, status) values ('ELS - ELECTRONIC SYSTEMS', 'ATIVO');
insert into tb_unidade_negocio (business, status) values ('IBU - INTERIOR EXPERIENCE', 'ATIVO');
insert into tb_unidade_negocio (business, status) values ('GTS - GREEN TECHNOLOGY SYSTEM', 'ATIVO');
insert into tb_unidade_negocio (business, status) values ('RD - RIDE DYNAMICS', 'ATIVO');
insert into tb_unidade_negocio (business, status) values ('AL - AUTOMOTIVE LIGHTS', 'ATIVO');

insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('HORTOLÂNDIA', 1, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('HORTOLÂNDIA', 2, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('HORTOLÂNDIA', 3, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('AMPARO', 4, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('MAUÁ', 5, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('LAVRAS', 5, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('CONTAGEM', 6, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('RESENDE', 3, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('CABO DE SANTO AGOSTINHO', 4, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('GOIANA', 5, "BRASIL", "SOUTH AMERICA", 'ATIVO');
insert into tb_planta (planta, unidade_id, pais, regiao, status) values ('CORDOBA', 4, "ARGENTINA", "SOUTH AMERICA", 'ATIVO');


insert into tb_especialidade (especialidade, status) values ("MECÂNICO", 'ATIVO');
insert into tb_especialidade (especialidade, status) values ("ELÉTRICO", 'ATIVO');
insert into tb_especialidade (especialidade, status) values ("ELETRÔNICO", 'ATIVO');
insert into tb_especialidade (especialidade, status) values ("SISTEMAS", 'ATIVO');
insert into tb_especialidade (especialidade, status) values ("OPERAÇÃO", 'ATIVO');

insert into tb_turno (turno, status) values ("1º", 'ATIVO');
insert into tb_turno (turno, status) values ("2º", 'ATIVO');
insert into tb_turno (turno, status) values ("3º", 'ATIVO');
insert into tb_turno (turno, status) values ("ADM", 'ATIVO');
insert into tb_turno (turno, status) values ("CENTRAL", 'ATIVO');

insert into tb_area (area, centro_custo, planta_id, status) values ("MANUTENÇÃO FREE-CHOICE", "CC23455F", 1, 'ATIVO');
insert into tb_area (area, centro_custo, planta_id, status) values ("MANUTENÇÃO PLASTICO-PWT", "CC5667YY", 1, 'ATIVO');
insert into tb_area (area, centro_custo, planta_id, status) values ("MANUTENÇÃO", "CC2344N", 4, 'ATIVO');
insert into tb_area (area, centro_custo, planta_id, status) values ("MANUTENÇÃO COLETOR", "CC7830PP", 1, 'ATIVO');
insert into tb_area (area, centro_custo, planta_id, status) values ("PRODUÇÃO FREE-CHOICE", "CC3245FTG", 1, 'ATIVO');
insert into tb_area (area, centro_custo, planta_id, status) values ("PRODUÇÃO PLASTICO-PWT", "CC442HJKK", 1, 'ATIVO');
insert into tb_area (area, centro_custo, planta_id, status) values ("PRODUÇÃO", "CC23WW345", 4, 'ATIVO');









