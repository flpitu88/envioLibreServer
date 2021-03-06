-- MySQL Script generated by MySQL Workbench
-- vie 27 may 2016 00:06:50 ART
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema EnvioLibreDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema EnvioLibreDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `EnvioLibreDB` DEFAULT CHARACTER SET utf8 ;
USE `EnvioLibreDB` ;

-- -----------------------------------------------------
-- Table `EnvioLibreDB`.`TarjetaCredito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EnvioLibreDB`.`TarjetaCredito` (
  `idTarjetaCredito` INT NOT NULL,
  `entidad` VARCHAR(45) NULL,
  `token` VARCHAR(45) NULL,
  PRIMARY KEY (`idTarjetaCredito`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EnvioLibreDB`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EnvioLibreDB`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `clave` VARCHAR(25) NOT NULL,
  `nombreUsuario` VARCHAR(25) NOT NULL,
  `email` VARCHAR(45) NULL,
  `fechaNac` DATE NULL,
  `provincia` VARCHAR(45) NULL,
  `localidad` VARCHAR(45) NULL,
  `ciudad` VARCHAR(45) NULL,
  `id_tarjeta` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `id_tarjeta_UNIQUE` (`id_tarjeta` ASC),
  CONSTRAINT `fk_Usuario_1`
    FOREIGN KEY (`id_tarjeta`)
    REFERENCES `EnvioLibreDB`.`TarjetaCredito` (`idTarjetaCredito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
