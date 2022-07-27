package in.jpahibernate.mp.jpahibernate.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class Person {

	@Id
    @Column(columnDefinition = "VARCHAR(32)", nullable = false)
    private String nick;
    public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String nick, String name) {
		super();
		this.nick = nick;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [nick=" + nick + ", name=" + name + "]";
	}
	private String name;
}
