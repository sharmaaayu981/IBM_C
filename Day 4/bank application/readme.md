## Bank application

1. Home Loan (ROI=5%)
2. Education Loan (ROI=3%)

**Enter Loan amount:** amount  
**Enter duration for loan(years):** n  

**Enter Personal details:**  
	Name, Gender(Male, Female), age, Address (city, state, country)  

**Enter Education details:**  
Graduate, UnderGraduate, PostGraduate


- User is not from India, say "We dont serve in your country"
- User is Male, Graduate and age is more than 60 years  
	80% of loan amount is approved  
	**Accept/Deny**  
- User is Female, Graduate and age is more than 55 years  
	80% of loan amount is approved  
	**Accept/Deny**  
- User is Male, UnderGraduate and age is more than 35 years  
	60% of loan amount is approved  
	**Accept/Deny**  
- User is Female, UnderGraduate and age is more than 30 years  
	60% of loan amount is approved  
	**Accept/Deny**  
- User is PostGraduate  
	90% of loan amount is approved  
	**Accept/Deny**  

If accepted ->  
show emi chart as give below

	
### EMI Chart example 1:
|	Year	|	Opening Balance	|	EMI			|	Interest paid yearly	|	Principal paid yearly	|	Closing Balance	|
|-----------|-------------------|---------------|---------------------------|---------------------------|-------------------|
|	1		|	25,00,000		|	2,50,932	|	1,98,090				|	52,842					|	24,47,158		|	
|	2		|	24,47,158		|	2,50,932	|	1,93,705				|	57,227					|	23,89,931		|
|	3		|	23,89,931		|	2,50,932	|	1,88,955				|	61,977					|	23,27,954		|
|	4		|	23,27,954		|	2,50,932	|	1,83,811				|	67,121					|	22,60,832		|
|	5		|	22,60,832		|	2,50,932	|	1,78,240				|	72,692					|	21,88,140		|
|	6		|	21,88,140		|	2,50,932	|	1,72,206				|	78,726					|	21,09,414		|
|	7		|	21,09,414		|	2,50,932	|	1,65,672				|	85,260					|	20,24,154		|
|	8		|	20,24,154		|	2,50,932	|	1,58,595				|	92,337					|	19,31,817		|
|	9		|	19,31,817		|	2,50,932	|	1,50,931				|	1,00,001				|	18,31,816		|
|	10		|	18,31,816		|	2,50,932	|	1,42,631				|	1,08,301				|	17,23,516		|
|	11		|	17,23,516		|	2,50,932	|	1,33,643				|	1,17,289				|	16,06,226		|
|	12		|	16,06,226		|	2,50,932	|	1,23,908				|	1,27,024				|	14,79,202		|
|	13		|	14,79,202		|	2,50,932	|	1,13,365				|	1,37,567				|	13,41,634		|
|	14		|	13,41,634		|	2,50,932	|	1,01,947				|	1,48,985				|	11,92,649		|
|	15		|	11,92,649		|	2,50,932	|	89,581					|	1,61,351				|	10,31,298		|
|	16		|	10,31,298		|	2,50,932	|	76,189					|	1,74,743				|	8,56,555		|
|	17		|	8,56,555		|	2,50,932	|	61,685					|	1,89,247				|	6,67,308		|
|	18		|	6,67,308		|	2,50,932	|	45,978					|	2,04,954				|	4,62,354		|
|	19		|	4,62,354		|	2,50,932	|	28,967					|	2,21,965				|	2,40,388		|
|	20		|	2,40,388		|	2,50,932	|	10,544					|	2,40,388				|	0				|




### EMI Chart example 2:
|	Year	|	Opening Balance	|	EMI			|	Interest paid yearly	|	Principal paid yearly	|	Closing Balance	|
|-----------|-------------------|---------------|---------------------------|---------------------------|-------------------|
|	1		|	1,00,000		|	22,645		|	4,590					|	18,056					|	81,944			|	
|	2		|	81,944			|	22,645		|	3,666					|	18,979					|	62,965			|	
|	3		|	62,965			|	22,645		|	2,695					|	19,950					|	43,015			|	
|	4		|	43,015			|	22,645		|	1,674					|	20,971					|	22,044			|	
|	5		|	22,044			|	22,645		|	602						|	22,044					|	0				|	
