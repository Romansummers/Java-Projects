function validate(form) {
	
	if(!valid) {
		alert('Please correct the errors in the form!');
		return false;
	}
	else {
		return confirm('Are you sure you want to submit?');
	}
}