--liquibase formatted sql

--changeset marianavorotniak:createtables

CREATE TABLE IF NOT EXISTS `users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `avatar` VARCHAR(255),
  `nickname` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `role` ENUM('ROLE_ADMIN','ROLE_USER'),
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `cities` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `marks` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `mark` INT(1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `posts` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `author_id` INT(11) NOT NULL,
  `mark_id` INT(11) NOT NULL,
  `name` VARCHAR(100),
  `description` VARCHAR(255),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_posts_author`
    FOREIGN KEY (`author_id`)
    REFERENCES `users` (`id`),
  CONSTRAINT `fk_posts_mark`
    FOREIGN KEY (`mark_id`)
    REFERENCES `marks` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mixes` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `post_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_mixes_post`
    FOREIGN KEY (`post_id`)
    REFERENCES `posts` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `places` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `post_id` INT(11) NOT NULL,
  `city_id` INT(11) NOT NULL,
  `address` VARCHAR(100),
  `picture` VARCHAR(255),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_places_post`
    FOREIGN KEY (`post_id`)
    REFERENCES `posts` (`id`),
    CONSTRAINT `fk_places_city`
    FOREIGN KEY (`city_id`)
    REFERENCES `cities` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `tabacos` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `post_id` INT(11) NOT NULL,
  `picture` VARCHAR(255),
  PRIMARY KEY (`id`),
   CONSTRAINT `fk_tabacos_posts`
    FOREIGN KEY (`post_id`)
    REFERENCES `posts` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `comments` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `post_id` INT(11) NOT NULL,
   `text` VARCHAR(255),
  PRIMARY KEY (`id`),
    CONSTRAINT `fk_comments_post`
    FOREIGN KEY (`post_id`)
    REFERENCES `posts` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;