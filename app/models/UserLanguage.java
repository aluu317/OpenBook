package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.*;

@Entity
public class UserLanguage extends Model {
	User user;
	Language language;
}
