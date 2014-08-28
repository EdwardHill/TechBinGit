-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 28-Ago-2014 às 02:28
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `techbinweb`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

CREATE TABLE IF NOT EXISTS `contato` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `mensagem` text NOT NULL,
  `status` varchar(8) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=57 ;

--
-- Extraindo dados da tabela `contato`
--

INSERT INTO `contato` (`ID`, `nome`, `email`, `mensagem`, `status`) VALUES
(1, 'Carlos', 'Carlo5_3duardo@hotmai.com', 'Estou Tendo essa coisa', ''),
(5, 'Leão', 'Aviso assim', 'ALUGA_SE', 'ativo'),
(6, 'EITA', 'AASDUASDUSAD', 'sdSDSGA_SE', 'ativo'),
(7, 'Rapouso', 'NADA HAVER', 'XOXIdsdisucoi', 'ativo'),
(8, 'Amarildo', 'Amarildo@htdc.com.br', 'Uma primeira ideia da servlet seria que cada uma delas é responsável por uma página, sendo que ela lê dados da requisição do cliente e responde com outros dados (uma página HTML, uma imagem GIF etc). Como no Java tentamos sempre que possível trabalhar orientado a objetos', 'ativo'),
(40, 'Calma cara', 'ereeefdsd', 'asdasd34343434', 'ativo'),
(41, 'Calma cara', 'ereeefdsd', 'asdasd34343434', 'ativo'),
(42, 'Poleana', 'peloaaga@htoamail.com', 'Oqauasisusdsdsd', 'ativo'),
(43, 'Poleana', 'peloaaga@htoamail.com', 'Oqauasisusdsdsd', 'ativo'),
(44, 'OPA', 'asdasdsd', 'ssssd', 'ativo'),
(45, 'OPA', 'asdasdsd', 'ssssd', 'ativo'),
(46, 'OPA', 'asdasdsd', 'ssssd', 'ativo'),
(47, 'OPA', 'asdasdsd', 'ssssd', 'ativo'),
(48, 'OPASDASD', 'diga la', 'ssdsjiasd', 'ativo'),
(49, 'Carlos Eduardo', 'Diga lÃ¡ cara', 'Ou nÃ£o', 'ativo'),
(50, 'Tatiana', 'Carlos Eduardo Andrade Lima', 'Nada haver', 'ativo'),
(51, 'Clarice  MendenÃ§a', 'asdas', 'Odenhador de vacas', 'ativo'),
(52, 'Tatiana', 'Carlos Eduardo Andrade Lima', 'Nada haver', 'ativo'),
(53, 'Roberta Miranda', 'nada de mais', 'Diga lÃ¡ meu caro', 'ativo'),
(54, 'Fabricia ', 'nada de mais', 'Quase isso Ã© assim', 'ativo'),
(55, 'Roberto', 'cafafadffdfdfd@@fdf', 'NAdadasdisddjaisdjasidjas', 'ativo'),
(56, 'Roberto', 'cafafadffdfdfd@@fdf', 'NAdadasdisddjaisdjasidjas', 'ativo');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
