package pile.qui.deborde

class Member {
	
	String firstName
	String lastName
	String email
	String bio
	String website
	String photoPath;
	Date dateNaissance;
	Date dateInscription;
	
	static hasMany =  [givenAnswers:Answer, questions:Question]
	
    static constraints = {
		firstName(blank:false)
		lastName(blank:false)
		dateNaissance(blank:false)
		dateInscription(blank:false)
		email(blank:false, unique:true, email:true)
		website(url:true)
    }
}