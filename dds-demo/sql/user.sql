CREATE DATABASE master;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
INSERT INTO `master`.`t_user` (`id`, `name`, `age`) VALUES ('1', 'master', '23');

CREATE DATABASE salve;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
INSERT INTO `slave`.`t_user` (`id`, `name`, `age`) VALUES ('1', 'slave', '24');
