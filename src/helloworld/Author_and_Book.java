package helloworld;

import java.util.Date;

class Book{
	private String ISBN;
	private String title;
	private String Publisher;
	private Date PublishDate;
	private float price;
	private int AuthorID;
	public Book(){
		
	}
	public Book(String ISBN,String title,String Publisher,Date PublishDate,float price,int AuthorID){
		this.ISBN=ISBN;
		this.title=title;
		this.Publisher=Publisher;
		this.PublishDate=PublishDate;
		this.setPrice(price);
		this.AuthorID=AuthorID;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public Date getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(Date publishDate) {
		PublishDate = publishDate;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
class Author{
	private int AuthorID;
	private String Name;
	private int Age;
	private String Country;
	public Author(){
		
	}
	public Author(int AuthorID,String Name,int Age,String Country){
		this.AuthorID=AuthorID;
		this.Name=Name;
		this.Age=Age;
		this.Country=Country;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
}
